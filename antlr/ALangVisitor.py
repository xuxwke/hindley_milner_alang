# Generated from ALang.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ALangParser import ALangParser
else:
    from ALangParser import ALangParser

# This class defines a complete generic visitor for a parse tree produced by ALangParser.

class ALangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ALangParser#start.
    def visitStart(self, ctx:ALangParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionReturn.
    def visitLabelExpressionReturn(self, ctx:ALangParser.LabelExpressionReturnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionLiteralString.
    def visitLabelExpressionLiteralString(self, ctx:ALangParser.LabelExpressionLiteralStringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionAssign.
    def visitLabelExpressionAssign(self, ctx:ALangParser.LabelExpressionAssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionLabel.
    def visitLabelExpressionLabel(self, ctx:ALangParser.LabelExpressionLabelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionArithmeticCompare.
    def visitLabelExpressionArithmeticCompare(self, ctx:ALangParser.LabelExpressionArithmeticCompareContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionIf.
    def visitLabelExpressionIf(self, ctx:ALangParser.LabelExpressionIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionFunctionDefinition.
    def visitLabelExpressionFunctionDefinition(self, ctx:ALangParser.LabelExpressionFunctionDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionCall.
    def visitLabelExpressionCall(self, ctx:ALangParser.LabelExpressionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionArithmetic.
    def visitLabelExpressionArithmetic(self, ctx:ALangParser.LabelExpressionArithmeticContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionLiteralNull.
    def visitLabelExpressionLiteralNull(self, ctx:ALangParser.LabelExpressionLiteralNullContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionLiteralInt.
    def visitLabelExpressionLiteralInt(self, ctx:ALangParser.LabelExpressionLiteralIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionDefinition.
    def visitLabelExpressionDefinition(self, ctx:ALangParser.LabelExpressionDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionVariable.
    def visitLabelExpressionVariable(self, ctx:ALangParser.LabelExpressionVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionArithmeticLogical.
    def visitLabelExpressionArithmeticLogical(self, ctx:ALangParser.LabelExpressionArithmeticLogicalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionWhile.
    def visitLabelExpressionWhile(self, ctx:ALangParser.LabelExpressionWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelExpressionLiteralBool.
    def visitLabelExpressionLiteralBool(self, ctx:ALangParser.LabelExpressionLiteralBoolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#if_expression.
    def visitIf_expression(self, ctx:ALangParser.If_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#elseif_expression.
    def visitElseif_expression(self, ctx:ALangParser.Elseif_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#else_expression.
    def visitElse_expression(self, ctx:ALangParser.Else_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#then.
    def visitThen(self, ctx:ALangParser.ThenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#otherwise.
    def visitOtherwise(self, ctx:ALangParser.OtherwiseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelBlock.
    def visitLabelBlock(self, ctx:ALangParser.LabelBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ALangParser#LabelFunction.
    def visitLabelFunction(self, ctx:ALangParser.LabelFunctionContext):
        return self.visitChildren(ctx)



del ALangParser