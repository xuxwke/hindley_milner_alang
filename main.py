import antlr4 as ant
from antlr.ALangLexer import ALangLexer
from antlr.ALangParser import ALangParser
from antlr.ALangVisitor import ALangVisitor

from hms_ast import *
from hms import analyse

log = print


class TypeInferVisitor(ALangVisitor):
    """
    所有 visit 只返回 hms 的 ast node: Identifier Lambda Apply Integer Bool
    visitor 不做任何类型推导, 推导由后面的 analyse 完成
    """
    def __init__(self):
        super().__init__()

    def visitStart(self, ctx):
        return super().visitStart(ctx)

    def visitLabelExpressionDefinition(self, ctx:ALangParser.LabelExpressionDefinitionContext):
        # 推导变量类型
        log('visit 变量定义')
        return VarDefine(Identifier(ctx.VAR().getText()), self.visit(ctx.expression()), ctx.VAR().getSymbol())

    
    def visitLabelExpressionLiteralInt(self, ctx: ALangParser.LabelExpressionLiteralIntContext):
        # int 类型
        log('visit int')
        return Identifier(ctx.INT().getText(), ctx.INT().getSymbol())
    
    def visitLabelExpressionVariable(self, ctx: ALangParser.LabelExpressionVariableContext):
        # int 类型
        log('visit 变量')
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
    input_stream = ant.FileStream(os.path.dirname(__file__)+"/examples/1_var.al")
    # input_stream = ant.FileStream(os.path.dirname(__file__)+"/examples/2_function.al")
    lexer = ALangLexer(input_stream)
    stream = ant.CommonTokenStream(lexer)
    tree = ALangParser(stream).start()
    visitor = TypeInferVisitor()
    # 在 visit 的过程中完成类型推导
    # 并且记录类型在实例变量中
    hmAst = visitor.visit(tree)
    log('hmAst:', hmAst, type(hmAst))

    ti = analyse(hmAst)
    log(ti.symbolTypeJson())

if __name__ == "__main__":
    main()