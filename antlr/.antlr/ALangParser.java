// Generated from /home/hy/code/haiyou/hindley_milner_in_alang/type_infer/antlr/ALang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ALangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NULL=27, THIS=28, CLASS=29, BOOL=30, VAR=31, LABEL=32, 
		BITNUM=33, INT=34, ExponentPart=35, FLOAT=36, STRING=37, NORMALSTRING=38, 
		CHARSTRING=39, LONGSTRING=40, SPACE=41, COMMENT=42;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_if_expression = 2, RULE_elseif_expression = 3, 
		RULE_else_expression = 4, RULE_then = 5, RULE_otherwise = 6, RULE_block = 7, 
		RULE_function = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "if_expression", "elseif_expression", "else_expression", 
			"then", "otherwise", "block", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
			"'>'", "'=='", "'!='", "'>='", "'<='", "'or'", "'and'", "'return'", "'var'", 
			"'const'", "'='", "'while'", "'if'", "'else'", "'{'", "'}'", "'function'", 
			"'null'", "'this'", "'class'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NULL", "THIS", "CLASS", "BOOL", "VAR", "LABEL", "BITNUM", 
			"INT", "ExponentPart", "FLOAT", "STRING", "NORMALSTRING", "CHARSTRING", 
			"LONGSTRING", "SPACE", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ALang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ALangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162276442112L) != 0)) {
				{
				{
				setState(18);
				expression(0);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionReturnContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LabelExpressionReturnContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionLiteralStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(ALangParser.STRING, 0); }
		public LabelExpressionLiteralStringContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionAssignContext extends ExpressionContext {
		public TerminalNode VAR() { return getToken(ALangParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelExpressionAssignContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionLabelContext extends ExpressionContext {
		public TerminalNode LABEL() { return getToken(ALangParser.LABEL, 0); }
		public LabelExpressionLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionArithmeticCompareContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LabelExpressionArithmeticCompareContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionIfContext extends ExpressionContext {
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public List<Elseif_expressionContext> elseif_expression() {
			return getRuleContexts(Elseif_expressionContext.class);
		}
		public Elseif_expressionContext elseif_expression(int i) {
			return getRuleContext(Elseif_expressionContext.class,i);
		}
		public Else_expressionContext else_expression() {
			return getRuleContext(Else_expressionContext.class,0);
		}
		public LabelExpressionIfContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionFunctionDefinitionContext extends ExpressionContext {
		public TerminalNode VAR() { return getToken(ALangParser.VAR, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public LabelExpressionFunctionDefinitionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionCallContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public LabelExpressionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionArithmeticContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LabelExpressionArithmeticContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionLiteralNullContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(ALangParser.NULL, 0); }
		public LabelExpressionLiteralNullContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionLiteralIntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ALangParser.INT, 0); }
		public LabelExpressionLiteralIntContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionDefinitionContext extends ExpressionContext {
		public TerminalNode VAR() { return getToken(ALangParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelExpressionDefinitionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionVariableContext extends ExpressionContext {
		public TerminalNode VAR() { return getToken(ALangParser.VAR, 0); }
		public LabelExpressionVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionArithmeticLogicalContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LabelExpressionArithmeticLogicalContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionWhileContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LabelExpressionWhileContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelExpressionLiteralBoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(ALangParser.BOOL, 0); }
		public LabelExpressionLiteralBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new LabelExpressionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				match(LABEL);
				}
				break;
			case 2:
				{
				_localctx = new LabelExpressionLiteralIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new LabelExpressionLiteralBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(BOOL);
				}
				break;
			case 4:
				{
				_localctx = new LabelExpressionLiteralNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(NULL);
				}
				break;
			case 5:
				{
				_localctx = new LabelExpressionLiteralStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new LabelExpressionReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(T__16);
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(31);
						expression(0);
						}
						setState(32);
						match(T__1);
						}
						} 
					}
					setState(38);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(39);
					expression(0);
					}
					break;
				}
				}
				}
				break;
			case 7:
				{
				_localctx = new LabelExpressionFunctionDefinitionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				match(VAR);
				setState(44);
				match(T__19);
				setState(45);
				function();
				}
				break;
			case 8:
				{
				_localctx = new LabelExpressionDefinitionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				match(VAR);
				setState(48);
				match(T__19);
				setState(49);
				expression(5);
				}
				break;
			case 9:
				{
				_localctx = new LabelExpressionAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(VAR);
				setState(51);
				match(T__19);
				setState(52);
				expression(4);
				}
				break;
			case 10:
				{
				_localctx = new LabelExpressionIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				if_expression();
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(54);
						elseif_expression();
						}
						} 
					}
					setState(59);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(60);
					else_expression();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new LabelExpressionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(VAR);
				}
				break;
			case 12:
				{
				_localctx = new LabelExpressionWhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(T__20);
				setState(65);
				match(T__0);
				setState(66);
				expression(0);
				setState(67);
				match(T__2);
				setState(68);
				block();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new LabelExpressionArithmeticContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(73);
						((LabelExpressionArithmeticContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) ) {
							((LabelExpressionArithmeticContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(74);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new LabelExpressionArithmeticCompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(76);
						((LabelExpressionArithmeticCompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
							((LabelExpressionArithmeticCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new LabelExpressionArithmeticLogicalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(79);
						((LabelExpressionArithmeticLogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((LabelExpressionArithmeticLogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new LabelExpressionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(82);
						match(T__0);
						setState(91);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(85);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case T__16:
								case T__17:
								case T__18:
								case T__20:
								case T__21:
								case NULL:
								case BOOL:
								case VAR:
								case LABEL:
								case INT:
								case STRING:
									{
									setState(83);
									expression(0);
									}
									break;
								case T__25:
									{
									setState(84);
									function();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(87);
								match(T__1);
								}
								} 
							}
							setState(93);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						}
						setState(96);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__16:
						case T__17:
						case T__18:
						case T__20:
						case T__21:
						case NULL:
						case BOOL:
						case VAR:
						case LABEL:
						case INT:
						case STRING:
							{
							setState(94);
							expression(0);
							}
							break;
						case T__25:
							{
							setState(95);
							function();
							}
							break;
						case T__2:
							break;
						default:
							break;
						}
						setState(98);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__21);
			setState(105);
			match(T__0);
			setState(106);
			expression(0);
			setState(107);
			match(T__2);
			setState(108);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elseif_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_expression; }
	}

	public final Elseif_expressionContext elseif_expression() throws RecognitionException {
		Elseif_expressionContext _localctx = new Elseif_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elseif_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110);
			match(T__22);
			setState(111);
			match(T__21);
			setState(112);
			match(T__0);
			setState(113);
			expression(0);
			setState(114);
			match(T__2);
			setState(115);
			block();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_expressionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_expression; }
	}

	public final Else_expressionContext else_expression() throws RecognitionException {
		Else_expressionContext _localctx = new Else_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(117);
			match(T__22);
			setState(118);
			block();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThenContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_then);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162276442112L) != 0)) {
				{
				{
				setState(120);
				expression(0);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OtherwiseContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OtherwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwise; }
	}

	public final OtherwiseContext otherwise() throws RecognitionException {
		OtherwiseContext _localctx = new OtherwiseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_otherwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162276442112L) != 0)) {
				{
				{
				setState(126);
				expression(0);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelBlockContext extends BlockContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LabelBlockContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			_localctx = new LabelBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__23);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162276442112L) != 0)) {
				{
				{
				setState(133);
				expression(0);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelFunctionContext extends FunctionContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LabelFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			int _alt;
			_localctx = new LabelFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__25);
			setState(142);
			match(T__0);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					expression(0);
					setState(144);
					match(T__1);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162276442112L) != 0)) {
				{
				setState(151);
				expression(0);
				}
			}

			setState(154);
			match(T__2);
			setState(155);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u009e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001#\b"+
		"\u0001\n\u0001\f\u0001&\t\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u00018\b\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0003"+
		"\u0001>\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001V\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001Z\b\u0001\n\u0001\f"+
		"\u0001]\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0001"+
		"\u0005\u0001d\b\u0001\n\u0001\f\u0001g\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005z\b\u0005\n\u0005\f\u0005"+
		"}\t\u0005\u0001\u0006\u0005\u0006\u0080\b\u0006\n\u0006\f\u0006\u0083"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u0087\b\u0007\n\u0007\f\u0007"+
		"\u008a\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u0093\b\b\n\b\f\b\u0096\t\b\u0001\b\u0003\b\u0099\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0000\u0001\u0002\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0004\u0001\u0000\u0012\u0013\u0001\u0000"+
		"\u0004\b\u0001\u0000\t\u000e\u0001\u0000\u000f\u0010\u00b1\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004h\u0001\u0000"+
		"\u0000\u0000\u0006n\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000"+
		"\n{\u0001\u0000\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u0084"+
		"\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000\u0012\u0014"+
		"\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017"+
		"\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0006\u0001\uffff\uffff\u0000\u0019"+
		"G\u0005 \u0000\u0000\u001aG\u0005\"\u0000\u0000\u001bG\u0005\u001e\u0000"+
		"\u0000\u001cG\u0005\u001b\u0000\u0000\u001dG\u0005%\u0000\u0000\u001e"+
		"$\u0005\u0011\u0000\u0000\u001f \u0003\u0002\u0001\u0000 !\u0005\u0002"+
		"\u0000\u0000!#\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000"+
		"#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\')\u0003\u0002"+
		"\u0001\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)G\u0001"+
		"\u0000\u0000\u0000*+\u0007\u0000\u0000\u0000+,\u0005\u001f\u0000\u0000"+
		",-\u0005\u0014\u0000\u0000-G\u0003\u0010\b\u0000./\u0007\u0000\u0000\u0000"+
		"/0\u0005\u001f\u0000\u000001\u0005\u0014\u0000\u00001G\u0003\u0002\u0001"+
		"\u000523\u0005\u001f\u0000\u000034\u0005\u0014\u0000\u00004G\u0003\u0002"+
		"\u0001\u000459\u0003\u0004\u0002\u000068\u0003\u0006\u0003\u000076\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<>\u0003\b\u0004\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>G\u0001\u0000\u0000\u0000?G\u0005\u001f\u0000\u0000@A\u0005\u0015"+
		"\u0000\u0000AB\u0005\u0001\u0000\u0000BC\u0003\u0002\u0001\u0000CD\u0005"+
		"\u0003\u0000\u0000DE\u0003\u000e\u0007\u0000EG\u0001\u0000\u0000\u0000"+
		"F\u0018\u0001\u0000\u0000\u0000F\u001a\u0001\u0000\u0000\u0000F\u001b"+
		"\u0001\u0000\u0000\u0000F\u001c\u0001\u0000\u0000\u0000F\u001d\u0001\u0000"+
		"\u0000\u0000F\u001e\u0001\u0000\u0000\u0000F*\u0001\u0000\u0000\u0000"+
		"F.\u0001\u0000\u0000\u0000F2\u0001\u0000\u0000\u0000F5\u0001\u0000\u0000"+
		"\u0000F?\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000Ge\u0001\u0000"+
		"\u0000\u0000HI\n\u000f\u0000\u0000IJ\u0007\u0001\u0000\u0000Jd\u0003\u0002"+
		"\u0001\u0010KL\n\u000e\u0000\u0000LM\u0007\u0002\u0000\u0000Md\u0003\u0002"+
		"\u0001\u000fNO\n\r\u0000\u0000OP\u0007\u0003\u0000\u0000Pd\u0003\u0002"+
		"\u0001\u000eQR\n\u0010\u0000\u0000R[\u0005\u0001\u0000\u0000SV\u0003\u0002"+
		"\u0001\u0000TV\u0003\u0010\b\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0005\u0002\u0000\u0000XZ\u0001"+
		"\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\`\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^a\u0003\u0002\u0001\u0000_a\u0003\u0010"+
		"\b\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0005\u0003\u0000\u0000cH\u0001"+
		"\u0000\u0000\u0000cK\u0001\u0000\u0000\u0000cN\u0001\u0000\u0000\u0000"+
		"cQ\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000f\u0003\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0016\u0000\u0000ij\u0005\u0001\u0000\u0000"+
		"jk\u0003\u0002\u0001\u0000kl\u0005\u0003\u0000\u0000lm\u0003\u000e\u0007"+
		"\u0000m\u0005\u0001\u0000\u0000\u0000no\u0005\u0017\u0000\u0000op\u0005"+
		"\u0016\u0000\u0000pq\u0005\u0001\u0000\u0000qr\u0003\u0002\u0001\u0000"+
		"rs\u0005\u0003\u0000\u0000st\u0003\u000e\u0007\u0000t\u0007\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0017\u0000\u0000vw\u0003\u000e\u0007\u0000w\t\u0001"+
		"\u0000\u0000\u0000xz\u0003\u0002\u0001\u0000yx\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\u000b\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080"+
		"\u0003\u0002\u0001\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0084\u0088\u0005\u0018\u0000\u0000\u0085\u0087\u0003\u0002"+
		"\u0001\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u0019\u0000\u0000\u008c\u000f\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\u001a\u0000\u0000\u008e\u0094\u0005\u0001"+
		"\u0000\u0000\u008f\u0090\u0003\u0002\u0001\u0000\u0090\u0091\u0005\u0002"+
		"\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000"+
		"\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0099\u0003\u0002"+
		"\u0001\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0003"+
		"\u0000\u0000\u009b\u009c\u0003\u000e\u0007\u0000\u009c\u0011\u0001\u0000"+
		"\u0000\u0000\u0010\u0015$(9=FU[`ce{\u0081\u0088\u0094\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}