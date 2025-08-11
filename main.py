import antlr4 as ant
from antlr.ALangLexer import ALangLexer
from antlr.ALangParser import ALangParser
from antlr.ALangVisitor import ALangVisitor

from hms import Lambda, Identifier, Apply, Integer, Bool, analyse, TypeOperator

log = print


class TypeInferVisitor(ALangVisitor):
    """
    所有 visit 只返回 hms 的 ast node: Identifier Lambda Apply Integer Bool
    visitor 不做任何类型推导, 推导由后面的 analyse 完成
    """
    def __init__(self):
        super().__init__()
        self._symbolType: dict = {}
    
    def symbolTypeAdd(self, symbolName: str, line: int, col: int, varType: TypeOperator):
        self._symbolType[f"{symbolName}_{line}_{col}"] = str(varType)

    def symbolTypeJson(self):
        import json
        return json.dumps(self._symbolType, ensure_ascii=False, indent=2)

    def visitStart(self, ctx):
        return super().visitStart(ctx)

    def visitLabelExpressionDefinition(self, ctx:ALangParser.LabelExpressionDefinitionContext):
        # 推导变量类型
        self.visit(ctx.expression())
        ctx.VAR()
    
    def visitLabelExpressionLiteralInt(self, ctx: ALangParser.LabelExpressionLiteralIntContext):
        # int 类型
        return Identifier(ctx.INT().getText())
    
    def visitLabelExpressionVariable(self, ctx: ALangParser.LabelExpressionVariableContext):
        # int 类型
        return Identifier(ctx.VAR().getText())
    
    def visitLabelExpressionFunctionDefinition(self, ctx: ALangParser.LabelExpressionFunctionDefinitionContext):
        # 函数定义
        log('visit 函数定义', ctx.VAR().getText())
        self.visit(ctx.function())

    def visitLabelFunction(self, ctx: ALangParser.LabelFunctionContext):
        # 函数调用
        log('visit 函数')
        # 函数参数
        for exp in ctx.expression():
            log('函数参数', self.visit(exp))
        # body
        self.visit(ctx.block())

    def visitLabelBlock(self, ctx: ALangParser.LabelBlockContext):
        log('vist block')

        # 收集并返回一个 Block
        for exp in ctx.expression():
            self.visit(exp)

    
    def visitLabelExpressionReturn(self, ctx: ALangParser.LabelExpressionReturnContext):
        log('visit return')
        self.visit(ctx.expression(0))


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
    # 读取 visitor 中的类型信息, json 格式输出
    log(visitor.symbolTypeJson())

if __name__ == "__main__":
    main()