# Generated from ALang.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,42,158,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,5,0,20,8,0,10,0,12,0,23,9,0,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,35,8,1,10,1,12,1,38,9,1,1,1,3,1,41,
        8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,56,8,
        1,10,1,12,1,59,9,1,1,1,3,1,62,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,
        1,71,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,
        86,8,1,1,1,1,1,5,1,90,8,1,10,1,12,1,93,9,1,1,1,1,1,3,1,97,8,1,1,
        1,5,1,100,8,1,10,1,12,1,103,9,1,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,
        1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,5,5,5,122,8,5,10,5,12,5,125,9,
        5,1,6,5,6,128,8,6,10,6,12,6,131,9,6,1,7,1,7,5,7,135,8,7,10,7,12,
        7,138,9,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,5,8,147,8,8,10,8,12,8,150,
        9,8,1,8,3,8,153,8,8,1,8,1,8,1,8,1,8,0,1,2,9,0,2,4,6,8,10,12,14,16,
        0,4,1,0,18,19,1,0,4,8,1,0,9,14,1,0,15,16,177,0,21,1,0,0,0,2,70,1,
        0,0,0,4,104,1,0,0,0,6,110,1,0,0,0,8,117,1,0,0,0,10,123,1,0,0,0,12,
        129,1,0,0,0,14,132,1,0,0,0,16,141,1,0,0,0,18,20,3,2,1,0,19,18,1,
        0,0,0,20,23,1,0,0,0,21,19,1,0,0,0,21,22,1,0,0,0,22,1,1,0,0,0,23,
        21,1,0,0,0,24,25,6,1,-1,0,25,71,5,32,0,0,26,71,5,34,0,0,27,71,5,
        30,0,0,28,71,5,27,0,0,29,71,5,37,0,0,30,36,5,17,0,0,31,32,3,2,1,
        0,32,33,5,2,0,0,33,35,1,0,0,0,34,31,1,0,0,0,35,38,1,0,0,0,36,34,
        1,0,0,0,36,37,1,0,0,0,37,40,1,0,0,0,38,36,1,0,0,0,39,41,3,2,1,0,
        40,39,1,0,0,0,40,41,1,0,0,0,41,71,1,0,0,0,42,43,7,0,0,0,43,44,5,
        31,0,0,44,45,5,20,0,0,45,71,3,16,8,0,46,47,7,0,0,0,47,48,5,31,0,
        0,48,49,5,20,0,0,49,71,3,2,1,5,50,51,5,31,0,0,51,52,5,20,0,0,52,
        71,3,2,1,4,53,57,3,4,2,0,54,56,3,6,3,0,55,54,1,0,0,0,56,59,1,0,0,
        0,57,55,1,0,0,0,57,58,1,0,0,0,58,61,1,0,0,0,59,57,1,0,0,0,60,62,
        3,8,4,0,61,60,1,0,0,0,61,62,1,0,0,0,62,71,1,0,0,0,63,71,5,31,0,0,
        64,65,5,21,0,0,65,66,5,1,0,0,66,67,3,2,1,0,67,68,5,3,0,0,68,69,3,
        14,7,0,69,71,1,0,0,0,70,24,1,0,0,0,70,26,1,0,0,0,70,27,1,0,0,0,70,
        28,1,0,0,0,70,29,1,0,0,0,70,30,1,0,0,0,70,42,1,0,0,0,70,46,1,0,0,
        0,70,50,1,0,0,0,70,53,1,0,0,0,70,63,1,0,0,0,70,64,1,0,0,0,71,101,
        1,0,0,0,72,73,10,15,0,0,73,74,7,1,0,0,74,100,3,2,1,16,75,76,10,14,
        0,0,76,77,7,2,0,0,77,100,3,2,1,15,78,79,10,13,0,0,79,80,7,3,0,0,
        80,100,3,2,1,14,81,82,10,16,0,0,82,91,5,1,0,0,83,86,3,2,1,0,84,86,
        3,16,8,0,85,83,1,0,0,0,85,84,1,0,0,0,86,87,1,0,0,0,87,88,5,2,0,0,
        88,90,1,0,0,0,89,85,1,0,0,0,90,93,1,0,0,0,91,89,1,0,0,0,91,92,1,
        0,0,0,92,96,1,0,0,0,93,91,1,0,0,0,94,97,3,2,1,0,95,97,3,16,8,0,96,
        94,1,0,0,0,96,95,1,0,0,0,96,97,1,0,0,0,97,98,1,0,0,0,98,100,5,3,
        0,0,99,72,1,0,0,0,99,75,1,0,0,0,99,78,1,0,0,0,99,81,1,0,0,0,100,
        103,1,0,0,0,101,99,1,0,0,0,101,102,1,0,0,0,102,3,1,0,0,0,103,101,
        1,0,0,0,104,105,5,22,0,0,105,106,5,1,0,0,106,107,3,2,1,0,107,108,
        5,3,0,0,108,109,3,14,7,0,109,5,1,0,0,0,110,111,5,23,0,0,111,112,
        5,22,0,0,112,113,5,1,0,0,113,114,3,2,1,0,114,115,5,3,0,0,115,116,
        3,14,7,0,116,7,1,0,0,0,117,118,5,23,0,0,118,119,3,14,7,0,119,9,1,
        0,0,0,120,122,3,2,1,0,121,120,1,0,0,0,122,125,1,0,0,0,123,121,1,
        0,0,0,123,124,1,0,0,0,124,11,1,0,0,0,125,123,1,0,0,0,126,128,3,2,
        1,0,127,126,1,0,0,0,128,131,1,0,0,0,129,127,1,0,0,0,129,130,1,0,
        0,0,130,13,1,0,0,0,131,129,1,0,0,0,132,136,5,24,0,0,133,135,3,2,
        1,0,134,133,1,0,0,0,135,138,1,0,0,0,136,134,1,0,0,0,136,137,1,0,
        0,0,137,139,1,0,0,0,138,136,1,0,0,0,139,140,5,25,0,0,140,15,1,0,
        0,0,141,142,5,26,0,0,142,148,5,1,0,0,143,144,3,2,1,0,144,145,5,2,
        0,0,145,147,1,0,0,0,146,143,1,0,0,0,147,150,1,0,0,0,148,146,1,0,
        0,0,148,149,1,0,0,0,149,152,1,0,0,0,150,148,1,0,0,0,151,153,3,2,
        1,0,152,151,1,0,0,0,152,153,1,0,0,0,153,154,1,0,0,0,154,155,5,3,
        0,0,155,156,3,14,7,0,156,17,1,0,0,0,16,21,36,40,57,61,70,85,91,96,
        99,101,123,129,136,148,152
    ]

class ALangParser ( Parser ):

    grammarFileName = "ALang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "','", "')'", "'+'", "'-'", "'*'", 
                     "'/'", "'%'", "'<'", "'>'", "'=='", "'!='", "'>='", 
                     "'<='", "'or'", "'and'", "'return'", "'var'", "'const'", 
                     "'='", "'while'", "'if'", "'else'", "'{'", "'}'", "'function'", 
                     "'null'", "'this'", "'class'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "NULL", "THIS", 
                      "CLASS", "BOOL", "VAR", "LABEL", "BITNUM", "INT", 
                      "ExponentPart", "FLOAT", "STRING", "NORMALSTRING", 
                      "CHARSTRING", "LONGSTRING", "SPACE", "COMMENT" ]

    RULE_start = 0
    RULE_expression = 1
    RULE_if_expression = 2
    RULE_elseif_expression = 3
    RULE_else_expression = 4
    RULE_then = 5
    RULE_otherwise = 6
    RULE_block = 7
    RULE_function = 8

    ruleNames =  [ "start", "expression", "if_expression", "elseif_expression", 
                   "else_expression", "then", "otherwise", "block", "function" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    NULL=27
    THIS=28
    CLASS=29
    BOOL=30
    VAR=31
    LABEL=32
    BITNUM=33
    INT=34
    ExponentPart=35
    FLOAT=36
    STRING=37
    NORMALSTRING=38
    CHARSTRING=39
    LONGSTRING=40
    SPACE=41
    COMMENT=42

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def getRuleIndex(self):
            return ALangParser.RULE_start

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart" ):
                return visitor.visitStart(self)
            else:
                return visitor.visitChildren(self)




    def start(self):

        localctx = ALangParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 162276442112) != 0):
                self.state = 18
                self.expression(0)
                self.state = 23
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ALangParser.RULE_expression

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class LabelExpressionReturnContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionReturn" ):
                return visitor.visitLabelExpressionReturn(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionLiteralStringContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(ALangParser.STRING, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionLiteralString" ):
                return visitor.visitLabelExpressionLiteralString(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionAssignContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def VAR(self):
            return self.getToken(ALangParser.VAR, 0)
        def expression(self):
            return self.getTypedRuleContext(ALangParser.ExpressionContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionAssign" ):
                return visitor.visitLabelExpressionAssign(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionLabelContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LABEL(self):
            return self.getToken(ALangParser.LABEL, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionLabel" ):
                return visitor.visitLabelExpressionLabel(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionArithmeticCompareContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionArithmeticCompare" ):
                return visitor.visitLabelExpressionArithmeticCompare(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionIfContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def if_expression(self):
            return self.getTypedRuleContext(ALangParser.If_expressionContext,0)

        def elseif_expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.Elseif_expressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.Elseif_expressionContext,i)

        def else_expression(self):
            return self.getTypedRuleContext(ALangParser.Else_expressionContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionIf" ):
                return visitor.visitLabelExpressionIf(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionFunctionDefinitionContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def VAR(self):
            return self.getToken(ALangParser.VAR, 0)
        def function(self):
            return self.getTypedRuleContext(ALangParser.FunctionContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionFunctionDefinition" ):
                return visitor.visitLabelExpressionFunctionDefinition(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionCallContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)

        def function(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.FunctionContext)
            else:
                return self.getTypedRuleContext(ALangParser.FunctionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionCall" ):
                return visitor.visitLabelExpressionCall(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionArithmeticContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionArithmetic" ):
                return visitor.visitLabelExpressionArithmetic(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionLiteralNullContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NULL(self):
            return self.getToken(ALangParser.NULL, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionLiteralNull" ):
                return visitor.visitLabelExpressionLiteralNull(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionLiteralIntContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(ALangParser.INT, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionLiteralInt" ):
                return visitor.visitLabelExpressionLiteralInt(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionDefinitionContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def VAR(self):
            return self.getToken(ALangParser.VAR, 0)
        def expression(self):
            return self.getTypedRuleContext(ALangParser.ExpressionContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionDefinition" ):
                return visitor.visitLabelExpressionDefinition(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionVariableContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def VAR(self):
            return self.getToken(ALangParser.VAR, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionVariable" ):
                return visitor.visitLabelExpressionVariable(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionArithmeticLogicalContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionArithmeticLogical" ):
                return visitor.visitLabelExpressionArithmeticLogical(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionWhileContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ALangParser.ExpressionContext,0)

        def block(self):
            return self.getTypedRuleContext(ALangParser.BlockContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionWhile" ):
                return visitor.visitLabelExpressionWhile(self)
            else:
                return visitor.visitChildren(self)


    class LabelExpressionLiteralBoolContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BOOL(self):
            return self.getToken(ALangParser.BOOL, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelExpressionLiteralBool" ):
                return visitor.visitLabelExpressionLiteralBool(self)
            else:
                return visitor.visitChildren(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ALangParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                localctx = ALangParser.LabelExpressionLabelContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 25
                self.match(ALangParser.LABEL)
                pass

            elif la_ == 2:
                localctx = ALangParser.LabelExpressionLiteralIntContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 26
                self.match(ALangParser.INT)
                pass

            elif la_ == 3:
                localctx = ALangParser.LabelExpressionLiteralBoolContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 27
                self.match(ALangParser.BOOL)
                pass

            elif la_ == 4:
                localctx = ALangParser.LabelExpressionLiteralNullContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 28
                self.match(ALangParser.NULL)
                pass

            elif la_ == 5:
                localctx = ALangParser.LabelExpressionLiteralStringContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 29
                self.match(ALangParser.STRING)
                pass

            elif la_ == 6:
                localctx = ALangParser.LabelExpressionReturnContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 30
                self.match(ALangParser.T__16)
                self.state = 36
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,1,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 31
                        self.expression(0)
                        self.state = 32
                        self.match(ALangParser.T__1) 
                    self.state = 38
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,1,self._ctx)

                self.state = 40
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                if la_ == 1:
                    self.state = 39
                    self.expression(0)


                pass

            elif la_ == 7:
                localctx = ALangParser.LabelExpressionFunctionDefinitionContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 42
                _la = self._input.LA(1)
                if not(_la==18 or _la==19):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 43
                self.match(ALangParser.VAR)
                self.state = 44
                self.match(ALangParser.T__19)
                self.state = 45
                self.function()
                pass

            elif la_ == 8:
                localctx = ALangParser.LabelExpressionDefinitionContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 46
                _la = self._input.LA(1)
                if not(_la==18 or _la==19):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 47
                self.match(ALangParser.VAR)
                self.state = 48
                self.match(ALangParser.T__19)
                self.state = 49
                self.expression(5)
                pass

            elif la_ == 9:
                localctx = ALangParser.LabelExpressionAssignContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 50
                self.match(ALangParser.VAR)
                self.state = 51
                self.match(ALangParser.T__19)
                self.state = 52
                self.expression(4)
                pass

            elif la_ == 10:
                localctx = ALangParser.LabelExpressionIfContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 53
                self.if_expression()
                self.state = 57
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 54
                        self.elseif_expression() 
                    self.state = 59
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

                self.state = 61
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
                if la_ == 1:
                    self.state = 60
                    self.else_expression()


                pass

            elif la_ == 11:
                localctx = ALangParser.LabelExpressionVariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 63
                self.match(ALangParser.VAR)
                pass

            elif la_ == 12:
                localctx = ALangParser.LabelExpressionWhileContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 64
                self.match(ALangParser.T__20)
                self.state = 65
                self.match(ALangParser.T__0)
                self.state = 66
                self.expression(0)
                self.state = 67
                self.match(ALangParser.T__2)
                self.state = 68
                self.block()
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 101
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,10,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 99
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
                    if la_ == 1:
                        localctx = ALangParser.LabelExpressionArithmeticContext(self, ALangParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 72
                        if not self.precpred(self._ctx, 15):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 15)")
                        self.state = 73
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 496) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 74
                        self.expression(16)
                        pass

                    elif la_ == 2:
                        localctx = ALangParser.LabelExpressionArithmeticCompareContext(self, ALangParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 75
                        if not self.precpred(self._ctx, 14):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 14)")
                        self.state = 76
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 32256) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 77
                        self.expression(15)
                        pass

                    elif la_ == 3:
                        localctx = ALangParser.LabelExpressionArithmeticLogicalContext(self, ALangParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 78
                        if not self.precpred(self._ctx, 13):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 13)")
                        self.state = 79
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==15 or _la==16):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 80
                        self.expression(14)
                        pass

                    elif la_ == 4:
                        localctx = ALangParser.LabelExpressionCallContext(self, ALangParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 81
                        if not self.precpred(self._ctx, 16):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 16)")
                        self.state = 82
                        self.match(ALangParser.T__0)
                        self.state = 91
                        self._errHandler.sync(self)
                        _alt = self._interp.adaptivePredict(self._input,7,self._ctx)
                        while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                            if _alt==1:
                                self.state = 85
                                self._errHandler.sync(self)
                                token = self._input.LA(1)
                                if token in [17, 18, 19, 21, 22, 27, 30, 31, 32, 34, 37]:
                                    self.state = 83
                                    self.expression(0)
                                    pass
                                elif token in [26]:
                                    self.state = 84
                                    self.function()
                                    pass
                                else:
                                    raise NoViableAltException(self)

                                self.state = 87
                                self.match(ALangParser.T__1) 
                            self.state = 93
                            self._errHandler.sync(self)
                            _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

                        self.state = 96
                        self._errHandler.sync(self)
                        token = self._input.LA(1)
                        if token in [17, 18, 19, 21, 22, 27, 30, 31, 32, 34, 37]:
                            self.state = 94
                            self.expression(0)
                            pass
                        elif token in [26]:
                            self.state = 95
                            self.function()
                            pass
                        elif token in [3]:
                            pass
                        else:
                            pass
                        self.state = 98
                        self.match(ALangParser.T__2)
                        pass

             
                self.state = 103
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,10,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class If_expressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(ALangParser.ExpressionContext,0)


        def block(self):
            return self.getTypedRuleContext(ALangParser.BlockContext,0)


        def getRuleIndex(self):
            return ALangParser.RULE_if_expression

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf_expression" ):
                return visitor.visitIf_expression(self)
            else:
                return visitor.visitChildren(self)




    def if_expression(self):

        localctx = ALangParser.If_expressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_if_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 104
            self.match(ALangParser.T__21)
            self.state = 105
            self.match(ALangParser.T__0)
            self.state = 106
            self.expression(0)
            self.state = 107
            self.match(ALangParser.T__2)
            self.state = 108
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Elseif_expressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(ALangParser.ExpressionContext,0)


        def block(self):
            return self.getTypedRuleContext(ALangParser.BlockContext,0)


        def getRuleIndex(self):
            return ALangParser.RULE_elseif_expression

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElseif_expression" ):
                return visitor.visitElseif_expression(self)
            else:
                return visitor.visitChildren(self)




    def elseif_expression(self):

        localctx = ALangParser.Elseif_expressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_elseif_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 110
            self.match(ALangParser.T__22)
            self.state = 111
            self.match(ALangParser.T__21)
            self.state = 112
            self.match(ALangParser.T__0)
            self.state = 113
            self.expression(0)
            self.state = 114
            self.match(ALangParser.T__2)
            self.state = 115
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Else_expressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def block(self):
            return self.getTypedRuleContext(ALangParser.BlockContext,0)


        def getRuleIndex(self):
            return ALangParser.RULE_else_expression

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElse_expression" ):
                return visitor.visitElse_expression(self)
            else:
                return visitor.visitChildren(self)




    def else_expression(self):

        localctx = ALangParser.Else_expressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_else_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 117
            self.match(ALangParser.T__22)
            self.state = 118
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ThenContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def getRuleIndex(self):
            return ALangParser.RULE_then

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitThen" ):
                return visitor.visitThen(self)
            else:
                return visitor.visitChildren(self)




    def then(self):

        localctx = ALangParser.ThenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_then)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 123
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 162276442112) != 0):
                self.state = 120
                self.expression(0)
                self.state = 125
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OtherwiseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def getRuleIndex(self):
            return ALangParser.RULE_otherwise

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOtherwise" ):
                return visitor.visitOtherwise(self)
            else:
                return visitor.visitChildren(self)




    def otherwise(self):

        localctx = ALangParser.OtherwiseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_otherwise)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 129
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 162276442112) != 0):
                self.state = 126
                self.expression(0)
                self.state = 131
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ALangParser.RULE_block

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class LabelBlockContext(BlockContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.BlockContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelBlock" ):
                return visitor.visitLabelBlock(self)
            else:
                return visitor.visitChildren(self)



    def block(self):

        localctx = ALangParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_block)
        self._la = 0 # Token type
        try:
            localctx = ALangParser.LabelBlockContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 132
            self.match(ALangParser.T__23)
            self.state = 136
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 162276442112) != 0):
                self.state = 133
                self.expression(0)
                self.state = 138
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 139
            self.match(ALangParser.T__24)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ALangParser.RULE_function

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class LabelFunctionContext(FunctionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ALangParser.FunctionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def block(self):
            return self.getTypedRuleContext(ALangParser.BlockContext,0)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ALangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ALangParser.ExpressionContext,i)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLabelFunction" ):
                return visitor.visitLabelFunction(self)
            else:
                return visitor.visitChildren(self)



    def function(self):

        localctx = ALangParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_function)
        self._la = 0 # Token type
        try:
            localctx = ALangParser.LabelFunctionContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 141
            self.match(ALangParser.T__25)
            self.state = 142
            self.match(ALangParser.T__0)
            self.state = 148
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,14,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 143
                    self.expression(0)
                    self.state = 144
                    self.match(ALangParser.T__1) 
                self.state = 150
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,14,self._ctx)

            self.state = 152
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 162276442112) != 0):
                self.state = 151
                self.expression(0)


            self.state = 154
            self.match(ALangParser.T__2)
            self.state = 155
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 15)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 14)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 13)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 16)
         




