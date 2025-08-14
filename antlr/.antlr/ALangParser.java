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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
				setState(31);
				expression(7);
				}
				break;
			case 7:
				{
				_localctx = new LabelExpressionFunctionDefinitionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(33);
				match(VAR);
				setState(34);
				match(T__19);
				setState(35);
				function();
				}
				break;
			case 8:
				{
				_localctx = new LabelExpressionDefinitionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(37);
				match(VAR);
				setState(38);
				match(T__19);
				setState(39);
				expression(5);
				}
				break;
			case 9:
				{
				_localctx = new LabelExpressionAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(VAR);
				setState(41);
				match(T__19);
				setState(42);
				expression(4);
				}
				break;
			case 10:
				{
				_localctx = new LabelExpressionIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				if_expression();
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(44);
						elseif_expression();
						}
						} 
					}
					setState(49);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(50);
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
				setState(53);
				match(VAR);
				}
				break;
			case 12:
				{
				_localctx = new LabelExpressionWhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(T__20);
				setState(55);
				match(T__0);
				setState(56);
				expression(0);
				setState(57);
				match(T__2);
				setState(58);
				block();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new LabelExpressionArithmeticContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(62);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(63);
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
						setState(64);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new LabelExpressionArithmeticCompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(66);
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
						setState(67);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new LabelExpressionArithmeticLogicalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(69);
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
						setState(70);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new LabelExpressionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(72);
						match(T__0);
						setState(81);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(75);
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
									setState(73);
									expression(0);
									}
									break;
								case T__25:
									{
									setState(74);
									function();
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(77);
								match(T__1);
								}
								} 
							}
							setState(83);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
						}
						setState(86);
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
							setState(84);
							expression(0);
							}
							break;
						case T__25:
							{
							setState(85);
							function();
							}
							break;
						case T__2:
							break;
						default:
							break;
						}
						setState(88);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(94);
			match(T__21);
			setState(95);
			match(T__0);
			setState(96);
			expression(0);
			setState(97);
			match(T__2);
			setState(98);
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
			setState(100);
			match(T__22);
			setState(101);
			match(T__21);
			setState(102);
			match(T__0);
			setState(103);
			expression(0);
			setState(104);
			match(T__2);
			setState(105);
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
			setState(107);
			match(T__22);
			setState(108);
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162276442112L) != 0)) {
				{
				{
				setState(110);
				expression(0);
				}
				}
				setState(115);
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162276442112L) != 0)) {
				{
				{
				setState(116);
				expression(0);
				}
				}
				setState(121);
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
			setState(122);
			match(T__23);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 162276442112L) != 0)) {
				{
				{
				setState(123);
				expression(0);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
		public List<TerminalNode> VAR() { return getTokens(ALangParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ALangParser.VAR, i);
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
			setState(131);
			match(T__25);
			setState(132);
			match(T__0);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(VAR);
					setState(134);
					match(T__1);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(140);
				match(VAR);
				}
			}

			setState(143);
			match(T__2);
			setState(144);
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
		"\u0004\u0001*\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001.\b\u0001\n\u0001"+
		"\f\u00011\t\u0001\u0001\u0001\u0003\u00014\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"=\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001L\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001P\b\u0001\n\u0001\f\u0001S\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001W\b\u0001\u0001\u0001\u0005\u0001Z\b\u0001\n\u0001\f\u0001"+
		"]\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0005\u0005p\b\u0005\n\u0005\f\u0005s\t\u0005\u0001\u0006\u0005\u0006"+
		"v\b\u0006\n\u0006\f\u0006y\t\u0006\u0001\u0007\u0001\u0007\u0005\u0007"+
		"}\b\u0007\n\u0007\f\u0007\u0080\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0088\b\b\n\b\f\b\u008b\t\b\u0001\b"+
		"\u0003\b\u008e\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0000\u0001\u0002\t"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0004\u0001\u0000\u0012"+
		"\u0013\u0001\u0000\u0004\b\u0001\u0000\t\u000e\u0001\u0000\u000f\u0010"+
		"\u00a4\u0000\u0015\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000"+
		"\u0004^\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bk\u0001"+
		"\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000"+
		"\u000ez\u0001\u0000\u0000\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012"+
		"\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0006\u0001\uffff\uffff\u0000"+
		"\u0019=\u0005 \u0000\u0000\u001a=\u0005\"\u0000\u0000\u001b=\u0005\u001e"+
		"\u0000\u0000\u001c=\u0005\u001b\u0000\u0000\u001d=\u0005%\u0000\u0000"+
		"\u001e\u001f\u0005\u0011\u0000\u0000\u001f=\u0003\u0002\u0001\u0007 !"+
		"\u0007\u0000\u0000\u0000!\"\u0005\u001f\u0000\u0000\"#\u0005\u0014\u0000"+
		"\u0000#=\u0003\u0010\b\u0000$%\u0007\u0000\u0000\u0000%&\u0005\u001f\u0000"+
		"\u0000&\'\u0005\u0014\u0000\u0000\'=\u0003\u0002\u0001\u0005()\u0005\u001f"+
		"\u0000\u0000)*\u0005\u0014\u0000\u0000*=\u0003\u0002\u0001\u0004+/\u0003"+
		"\u0004\u0002\u0000,.\u0003\u0006\u0003\u0000-,\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000024\u0003\b\u0004"+
		"\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004=\u0001\u0000"+
		"\u0000\u00005=\u0005\u001f\u0000\u000067\u0005\u0015\u0000\u000078\u0005"+
		"\u0001\u0000\u000089\u0003\u0002\u0001\u00009:\u0005\u0003\u0000\u0000"+
		":;\u0003\u000e\u0007\u0000;=\u0001\u0000\u0000\u0000<\u0018\u0001\u0000"+
		"\u0000\u0000<\u001a\u0001\u0000\u0000\u0000<\u001b\u0001\u0000\u0000\u0000"+
		"<\u001c\u0001\u0000\u0000\u0000<\u001d\u0001\u0000\u0000\u0000<\u001e"+
		"\u0001\u0000\u0000\u0000< \u0001\u0000\u0000\u0000<$\u0001\u0000\u0000"+
		"\u0000<(\u0001\u0000\u0000\u0000<+\u0001\u0000\u0000\u0000<5\u0001\u0000"+
		"\u0000\u0000<6\u0001\u0000\u0000\u0000=[\u0001\u0000\u0000\u0000>?\n\u000f"+
		"\u0000\u0000?@\u0007\u0001\u0000\u0000@Z\u0003\u0002\u0001\u0010AB\n\u000e"+
		"\u0000\u0000BC\u0007\u0002\u0000\u0000CZ\u0003\u0002\u0001\u000fDE\n\r"+
		"\u0000\u0000EF\u0007\u0003\u0000\u0000FZ\u0003\u0002\u0001\u000eGH\n\u0010"+
		"\u0000\u0000HQ\u0005\u0001\u0000\u0000IL\u0003\u0002\u0001\u0000JL\u0003"+
		"\u0010\b\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MN\u0005\u0002\u0000\u0000NP\u0001\u0000\u0000\u0000"+
		"OK\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RV\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000TW\u0003\u0002\u0001\u0000UW\u0003\u0010\b\u0000VT\u0001\u0000"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XZ\u0005\u0003\u0000\u0000Y>\u0001\u0000\u0000\u0000"+
		"YA\u0001\u0000\u0000\u0000YD\u0001\u0000\u0000\u0000YG\u0001\u0000\u0000"+
		"\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0016\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0003\u0002\u0001"+
		"\u0000ab\u0005\u0003\u0000\u0000bc\u0003\u000e\u0007\u0000c\u0005\u0001"+
		"\u0000\u0000\u0000de\u0005\u0017\u0000\u0000ef\u0005\u0016\u0000\u0000"+
		"fg\u0005\u0001\u0000\u0000gh\u0003\u0002\u0001\u0000hi\u0005\u0003\u0000"+
		"\u0000ij\u0003\u000e\u0007\u0000j\u0007\u0001\u0000\u0000\u0000kl\u0005"+
		"\u0017\u0000\u0000lm\u0003\u000e\u0007\u0000m\t\u0001\u0000\u0000\u0000"+
		"np\u0003\u0002\u0001\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u000b\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0003\u0002\u0001\u0000"+
		"ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\r\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z~\u0005\u0018\u0000\u0000{}\u0003\u0002\u0001\u0000|{\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0019\u0000\u0000\u0082"+
		"\u000f\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u001a\u0000\u0000\u0084"+
		"\u0089\u0005\u0001\u0000\u0000\u0085\u0086\u0005\u001f\u0000\u0000\u0086"+
		"\u0088\u0005\u0002\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0005\u001f\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0003\u0000\u0000\u0090"+
		"\u0091\u0003\u000e\u0007\u0000\u0091\u0011\u0001\u0000\u0000\u0000\u000e"+
		"\u0015/3<KQVY[qw~\u0089\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}