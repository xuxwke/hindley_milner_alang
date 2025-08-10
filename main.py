import antlr4 as ant
from antlr.ALangLexer import ALangLexer
from antlr.ALangParser import ALangParser
from antlr.ALangVisitor import ALangVisitor

from hms import Lambda, Identifier, Apply, Integer, Bool, analyse, TypeOperator

log = print


class TypeInferVisitor(ALangVisitor):
    """
    所有 visit 只返回 Identifier Lambda Apply
    """
    def __init__(self):
        super().__init__()
        self._env = {}
        self._symbolType: dict = {}
    
    def getEnv(self):
        return self._env
    
    def envSet(self, var: ant.TerminalNode, varType: TypeOperator):
        self.getEnv()[var.getText()] = varType
        self.symbolTypeAdd(var.getText(), var.symbol.line, var.symbol.column, varType)
    
    def symbolTypeAdd(self, symbolName: str, line: int, col: int, varType: TypeOperator):
        self._symbolType[f"{symbolName}_{line}_{col}"] = str(varType)

    def symbolTypeJson(self):
        import json
        return json.dumps(self._symbolType, ensure_ascii=False, indent=2)

    def visitStart(self, ctx):
        return super().visitStart(ctx)

    def visitLabelExpressionDefinition(self, ctx:ALangParser.LabelExpressionDefinitionContext):
        # 推导变量类型
        t = analyse(self.visit(ctx.expression()), self.getEnv())
        self.envSet(ctx.VAR(), t)
        return super().visitLabelExpressionDefinition(ctx)
    
    def visitLabelExpressionLiteralInt(self, ctx: ALangParser.LabelExpressionLiteralIntContext):
        # int 类型
        return Identifier(ctx.INT().getText())


def main():
    import os
    input_stream = ant.FileStream(os.path.dirname(__file__)+"/examples/1_var.al")
    lexer = ALangLexer(input_stream)
    stream = ant.CommonTokenStream(lexer)
    tree = ALangParser(stream).start()
    visitor = TypeInferVisitor()
    # 在 visit 的过程中完成类型推导
    # 并且记录类型在实例变量中
    visitor.visit(tree)
    # 读取 visitor 中的类型信息, json 格式输出
    log(visitor.symbolTypeJson())

if __name__ == "__main__":
    main()