import antlr4 as ant
from antlr.ALangLexer import ALangLexer
from antlr.ALangParser import ALangParser
from antlr.ALangVisitor import ALangVisitor

from hms import fresh, is_integer_literal, Integer, ParseError, TypeOperator, Identifier, TypeVariable, Function

log = print


class TypeInferVisitor(ALangVisitor):
    """
    visit 返回 node 的类型
    """
    returnVarName = "__return__"

    def __init__(self):
        super().__init__()
        self._env = {}
        self._symbolType: dict = {}

    def symbolTypeAdd(self, symbolName: str, line: int, col: int, varType: TypeOperator):
        self._symbolType[f"{symbolName}_{line}_{col}"] = str(varType)

    def symbolTypeJson(self):
        import json
        return json.dumps(self._symbolType, ensure_ascii=False, indent=2)

    def envSetType(self, name: str, hmsType: TypeOperator|TypeVariable):
        self._env[name] = hmsType

    def _getTypeFromEnv(self, name: str):
        return self._env.get(name, None)

    def getType(self, name: str, non_generic: set) -> TypeOperator:
        if self._getTypeFromEnv(name) is not None:
            return fresh(self._getTypeFromEnv(name), non_generic)
        elif is_integer_literal(name):
            return Integer
        else:
            raise ParseError("Undefined symbol {0}".format(name))


    def visitStart(self, ctx):
        return super().visitStart(ctx)

    def visitLabelExpressionDefinition(self, ctx:ALangParser.LabelExpressionDefinitionContext):
        # 推导变量类型
        log('visit 变量定义')
        exprType = self.visit(ctx.expression())
        self.symbolTypeAdd(ctx.VAR().getText(), ctx.VAR().getSymbol().line, ctx.VAR().getSymbol().column, exprType)
        self.envSetType(ctx.VAR().getText(), exprType)
        return None

    
    def visitLabelExpressionLiteralInt(self, ctx: ALangParser.LabelExpressionLiteralIntContext):
        # 返回 int 类型
        # 记录 symbol 和类型
        self.symbolTypeAdd(ctx.INT().getText(), ctx.INT().getSymbol().line, ctx.INT().getSymbol().column, Integer)
        return Integer
    
    def visitLabelExpressionVariable(self, ctx: ALangParser.LabelExpressionVariableContext):
        # int 类型
        log('visit 变量')
        return Identifier(ctx.VAR().getText())
    
    def visitLabelExpressionFunctionDefinition(self, ctx: ALangParser.LabelExpressionFunctionDefinitionContext):
        # 函数定义
        log('visit 函数定义', ctx.VAR().getText())
        funType = self.visit(ctx.function())
        self.symbolTypeAdd(ctx.VAR().getText(), ctx.VAR().getSymbol().line, ctx.VAR().getSymbol().column, funType)
        self.envSetType(ctx.VAR().getText(), funType)
        return None

    def visitLabelFunction(self, ctx: ALangParser.LabelFunctionContext):
        # 返回函数类型
        # 作用域加入参数的类型
        non_generic = set()
        for exp in ctx.VAR():
            t = TypeVariable()
            non_generic.add(t)
            self.envSetType(exp.getText(), t)
        # body
        self.visit(ctx.block())
        
        return Function(self.getType(exp.getText(), non_generic), self.getType(self.returnVarName, non_generic))

    def visitLabelBlock(self, ctx: ALangParser.LabelBlockContext):
        # 收集并返回一个 Block
        for exp in ctx.expression():
            self.visit(exp)

    
    def visitLabelExpressionReturn(self, ctx: ALangParser.LabelExpressionReturnContext):
        # 记录返回的类型
        retType = self.visit(ctx.expression())
        self.envSetType(TypeInferVisitor.returnVarName, retType)
        return None


def main():
    import os
    # input_stream = ant.FileStream(os.path.dirname(__file__)+"/examples/1_var.al")
    input_stream = ant.FileStream(os.path.dirname(__file__)+"/examples/2_function.al")
    lexer = ALangLexer(input_stream)
    stream = ant.CommonTokenStream(lexer)
    tree = ALangParser(stream).start()
    visitor = TypeInferVisitor()
    # 在 visit 的过程中完成类型推导
    # 并且记录类型在实例变量中
    visitor.visit(tree)
    log(visitor.symbolTypeJson())

if __name__ == "__main__":
    main()