// Generated from /mnt/c/Users/user/Desktop/4IF/COMP/pld_compilateur/compiler/ifcc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ifccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, RETURN=8, TYPE=9, 
		DIVIDE=10, MULTIPLY=11, MINUS=12, PLUS=13, EGAL=14, AND=15, OR=16, XOR=17, 
		NUMBER=18, CHAR=19, VAR=20, COMMENT=21, DIRECTIVE=22, WS=23;
	public static final int
		RULE_axiom = 0, RULE_prog = 1, RULE_bloc = 2, RULE_instructionsList = 3, 
		RULE_instruction = 4, RULE_declaration = 5, RULE_affectation = 6, RULE_expr = 7, 
		RULE_sumoper = 8, RULE_prodoper = 9, RULE_binoper = 10, RULE_constante = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"axiom", "prog", "bloc", "instructionsList", "instruction", "declaration", 
			"affectation", "expr", "sumoper", "prodoper", "binoper", "constante"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'('", "')'", "'{'", "'}'", "';'", "','", "'return'", 
			null, "'/'", "'*'", "'-'", "'+'", "'='", "'&'", "'|'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "RETURN", "TYPE", "DIVIDE", 
			"MULTIPLY", "MINUS", "PLUS", "EGAL", "AND", "OR", "XOR", "NUMBER", "CHAR", 
			"VAR", "COMMENT", "DIRECTIVE", "WS"
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
	public String getGrammarFileName() { return "ifcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ifccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AxiomContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public AxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axiom; }
	}

	public final AxiomContext axiom() throws RecognitionException {
		AxiomContext _localctx = new AxiomContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_axiom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			prog();
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ifccParser.TYPE, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(TYPE);
			setState(27);
			match(T__0);
			setState(28);
			match(T__1);
			setState(29);
			match(T__2);
			setState(30);
			bloc();
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

	public static class BlocContext extends ParserRuleContext {
		public InstructionsListContext instructionsList() {
			return getRuleContext(InstructionsListContext.class,0);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__3);
			setState(33);
			instructionsList();
			setState(34);
			match(T__4);
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

	public static class InstructionsListContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionsListContext instructionsList() {
			return getRuleContext(InstructionsListContext.class,0);
		}
		public InstructionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionsList; }
	}

	public final InstructionsListContext instructionsList() throws RecognitionException {
		InstructionsListContext _localctx = new InstructionsListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instructionsList);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				instruction();
				setState(37);
				instructionsList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				instruction();
				}
				break;
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

	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ifccParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				declaration();
				setState(43);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				affectation();
				setState(46);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(RETURN);
				setState(49);
				expr(0);
				setState(50);
				match(T__5);
				}
				break;
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ifccParser.TYPE, 0); }
		public List<TerminalNode> VAR() { return getTokens(ifccParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ifccParser.VAR, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TYPE);
			setState(55);
			match(VAR);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(56);
				match(T__6);
				setState(57);
				match(VAR);
				}
				}
				setState(62);
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

	public static class AffectationContext extends ParserRuleContext {
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
	 
		public AffectationContext() { }
		public void copyFrom(AffectationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AffectationSimpleContext extends AffectationContext {
		public TerminalNode VAR() { return getToken(ifccParser.VAR, 0); }
		public TerminalNode EGAL() { return getToken(ifccParser.EGAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AffectationSimpleContext(AffectationContext ctx) { copyFrom(ctx); }
	}
	public static class AffectationDeclarationContext extends AffectationContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode EGAL() { return getToken(ifccParser.EGAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AffectationDeclarationContext(AffectationContext ctx) { copyFrom(ctx); }
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_affectation);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new AffectationSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(VAR);
				setState(64);
				match(EGAL);
				setState(65);
				expr(0);
				}
				break;
			case TYPE:
				_localctx = new AffectationDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				declaration();
				setState(67);
				match(EGAL);
				setState(68);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(ifccParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ProdopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProdoperContext prodoper() {
			return getRuleContext(ProdoperContext.class,0);
		}
		public ProdopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConstContext extends ExprContext {
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(ifccParser.VAR, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SumopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumoperContext sumoper() {
			return getRuleContext(SumoperContext.class,0);
		}
		public SumopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegConstContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(ifccParser.MINUS, 0); }
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public NegConstContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BinopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinoperContext binoper() {
			return getRuleContext(BinoperContext.class,0);
		}
		public BinopContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new NegConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73);
				match(MINUS);
				setState(74);
				constante();
				}
				break;
			case 2:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(MINUS);
				setState(76);
				expr(4);
				}
				break;
			case 3:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				constante();
				}
				break;
			case 4:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(VAR);
				}
				break;
			case 5:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(T__1);
				setState(80);
				expr(0);
				setState(81);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ProdopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(86);
						prodoper();
						setState(87);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new SumopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(90);
						sumoper();
						setState(91);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new BinopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						binoper();
						setState(95);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class SumoperContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ifccParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ifccParser.PLUS, 0); }
		public SumoperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumoper; }
	}

	public final SumoperContext sumoper() throws RecognitionException {
		SumoperContext _localctx = new SumoperContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sumoper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ProdoperContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(ifccParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(ifccParser.DIVIDE, 0); }
		public ProdoperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prodoper; }
	}

	public final ProdoperContext prodoper() throws RecognitionException {
		ProdoperContext _localctx = new ProdoperContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prodoper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==DIVIDE || _la==MULTIPLY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BinoperContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ifccParser.AND, 0); }
		public TerminalNode OR() { return getToken(ifccParser.OR, 0); }
		public TerminalNode XOR() { return getToken(ifccParser.XOR, 0); }
		public BinoperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binoper; }
	}

	public final BinoperContext binoper() throws RecognitionException {
		BinoperContext _localctx = new BinoperContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binoper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ConstanteContext extends ParserRuleContext {
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
	 
		public ConstanteContext() { }
		public void copyFrom(ConstanteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumContext extends ConstanteContext {
		public TerminalNode NUMBER() { return getToken(ifccParser.NUMBER, 0); }
		public NumContext(ConstanteContext ctx) { copyFrom(ctx); }
	}
	public static class CharContext extends ConstanteContext {
		public TerminalNode CHAR() { return getToken(ifccParser.CHAR, 0); }
		public CharContext(ConstanteContext ctx) { copyFrom(ctx); }
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constante);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(NUMBER);
				}
				break;
			case CHAR:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31s\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\67\n\6\3"+
		"\7\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"I\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tV\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\td\n\t\f\t\16\tg\13\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\5\rq\n\r\3\r\2\3\20\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\5\3\2\16\17\3\2\f\r\3\2\21\23\2s\2\32\3\2\2\2\4\34\3\2\2\2\6"+
		"\"\3\2\2\2\b*\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16H\3\2\2\2\20U\3\2\2\2"+
		"\22h\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2\30p\3\2\2\2\32\33\5\4\3\2\33\3\3"+
		"\2\2\2\34\35\7\13\2\2\35\36\7\3\2\2\36\37\7\4\2\2\37 \7\5\2\2 !\5\6\4"+
		"\2!\5\3\2\2\2\"#\7\6\2\2#$\5\b\5\2$%\7\7\2\2%\7\3\2\2\2&\'\5\n\6\2\'("+
		"\5\b\5\2(+\3\2\2\2)+\5\n\6\2*&\3\2\2\2*)\3\2\2\2+\t\3\2\2\2,-\5\f\7\2"+
		"-.\7\b\2\2.\67\3\2\2\2/\60\5\16\b\2\60\61\7\b\2\2\61\67\3\2\2\2\62\63"+
		"\7\n\2\2\63\64\5\20\t\2\64\65\7\b\2\2\65\67\3\2\2\2\66,\3\2\2\2\66/\3"+
		"\2\2\2\66\62\3\2\2\2\67\13\3\2\2\289\7\13\2\29>\7\26\2\2:;\7\t\2\2;=\7"+
		"\26\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\r\3\2\2\2@>\3\2\2\2A"+
		"B\7\26\2\2BC\7\20\2\2CI\5\20\t\2DE\5\f\7\2EF\7\20\2\2FG\5\20\t\2GI\3\2"+
		"\2\2HA\3\2\2\2HD\3\2\2\2I\17\3\2\2\2JK\b\t\1\2KL\7\16\2\2LV\5\30\r\2M"+
		"N\7\16\2\2NV\5\20\t\6OV\5\30\r\2PV\7\26\2\2QR\7\4\2\2RS\5\20\t\2ST\7\5"+
		"\2\2TV\3\2\2\2UJ\3\2\2\2UM\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2Ve\3\2"+
		"\2\2WX\f\n\2\2XY\5\24\13\2YZ\5\20\t\13Zd\3\2\2\2[\\\f\t\2\2\\]\5\22\n"+
		"\2]^\5\20\t\n^d\3\2\2\2_`\f\b\2\2`a\5\26\f\2ab\5\20\t\tbd\3\2\2\2cW\3"+
		"\2\2\2c[\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\21\3\2\2\2g"+
		"e\3\2\2\2hi\t\2\2\2i\23\3\2\2\2jk\t\3\2\2k\25\3\2\2\2lm\t\4\2\2m\27\3"+
		"\2\2\2nq\7\24\2\2oq\7\25\2\2pn\3\2\2\2po\3\2\2\2q\31\3\2\2\2\n*\66>HU"+
		"cep";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}