import antlr4 as ant
from antlr.ALangLexer import ALangLexer
from antlr.ALangParser import ALangParser
from antlr.ALangVisitor import ALangVisitor

from hms import fresh, is_integer_literal, Integer, ParseError, TypeOperator, Identifier, TypeVariable, Function, unify

log = print


class TypeInferVisitor(ALangVisitor):
    """
    visit 返回 node 的类型
    """
    returnVarName = "__return__"

    def __init__(self):
        super().__init__()
        self._envs = [{}]
        self._symbolType: dict = {}

    def symbolTypeAdd(self, astTokenNode, varType: TypeOperator):
        key = f"{astTokenNode.getText()}_{astTokenNode.getSymbol().line}_{astTokenNode.getSymbol().column}"
        self._symbolType[key] = str(varType)

    def symbolTypeJson(self):
        import json
        return json.dumps(self._symbolType, ensure_ascii=False, indent=2)
    
    def enter(self):
        self._envs.append({})

    def leave(self):
        self._envs.pop()

    def getCurrentEnv(self):
        return self._envs[-1]

    def envSetType(self, name: str, hmsType: TypeOperator|TypeVariable):
        self.getCurrentEnv()[name] = hmsType

    def getNonNenericSet(self) -> set:
        """
        返回非泛型的类型集合
        """
        non_generic = set()
        for _, env in enumerate(self._envs):
            for _, t in env.items():
                if isinstance(t, TypeVariable):
                    non_generic.add(t)
        return non_generic

    def _getTypeFromEnv(self, name: str):
        for env in reversed(self._envs):
            if name in env:
                return env[name]
        # 如果没有找到，返回 None
        return None

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
        log('visit 变量定义', ctx.VAR().getText())
        exprType = self.visit(ctx.expression())
        self.symbolTypeAdd(ctx.VAR(), exprType)
        self.envSetType(ctx.VAR().getText(), exprType)
        return None

    
    def visitLabelExpressionLiteralInt(self, ctx: ALangParser.LabelExpressionLiteralIntContext):
        # 返回 int 类型
        # 记录 symbol 和类型
        self.symbolTypeAdd(ctx.INT(), Integer)
        return Integer
    
    def visitLabelExpressionVariable(self, ctx: ALangParser.LabelExpressionVariableContext):
        # 返回变量的类型
        non_generic = self.getNonNenericSet()
        log('non_generic')
        for e in non_generic:
            log('  ', str(e))
        t = self.getType(ctx.VAR().getText(), non_generic)
        self.symbolTypeAdd(ctx.VAR(), t)
        log('visit 变量', ctx.VAR().getText(), '类型', str(t))
        return t

    
    def visitLabelExpressionFunctionDefinition(self, ctx: ALangParser.LabelExpressionFunctionDefinitionContext):
        # 函数定义
        log('visit 函数定义', ctx.VAR().getText())
        funType = self.visit(ctx.function())
        log('定义', str(funType))
        self.symbolTypeAdd(ctx.VAR(), funType)
        self.envSetType(ctx.VAR().getText(), funType)
        return None

    def visitLabelFunction(self, ctx: ALangParser.LabelFunctionContext):
        # 返回函数类型
        self.enter()
        # 作用域加入参数的类型
        for exp in ctx.VAR():
            t = TypeVariable()
            self.envSetType(exp.getText(), t)
            self.symbolTypeAdd(exp, t)
        # body
        self.visit(ctx.block())
        
        non_generic = self.getNonNenericSet()
        # fixme: 支持多个入参
        res =  Function(
            [self.getType(v.getText(), non_generic) for v in ctx.VAR()],
            [self.getType(self.returnVarName, non_generic)],
            )
        self.leave()
        return res


    def visitLabelBlock(self, ctx: ALangParser.LabelBlockContext):
        # 收集并返回一个 Block
        for exp in ctx.expression():
            self.visit(exp)

    
    def visitLabelExpressionReturn(self, ctx: ALangParser.LabelExpressionReturnContext):
        # 记录返回的类型
        retType = self.visit(ctx.expression())
        self.envSetType(TypeInferVisitor.returnVarName, retType)
        return None
    
    def visitLabelExpressionCall(self, ctx: ALangParser.LabelExpressionCallContext):
        # 函数调用
        funType = self.visit(ctx.expression(0))
        argTypes = []
        for i, expr in enumerate(ctx.expression()[1:]):
            argType = self.visit(expr)
            argTypes.append(argType)
        
        resultType = TypeVariable()
        log('调用的函数', str(funType))
        unify(Function(argTypes, [resultType]), funType)
        return resultType


def main():
    import os
    filePath = "/examples/1_var.al"
    filePath = "/examples/2_function.al"
    filePath = "/examples/3_function_retx.al"
    filePath = "/examples/tmp.al"
    filePath = "/examples/4_apply_int.al"
    filePath = "/examples/5_apply_args.al"
    input_stream = ant.FileStream(os.path.dirname(__file__)+filePath)
    
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