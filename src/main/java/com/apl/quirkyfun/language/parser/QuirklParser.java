// Generated from Quirkl.g4 by ANTLR 4.13.1
package com.apl.quirkyfun.language.parser;
import com.apl.quirkyfun.language.semantics.visitor.QuirklVisitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QuirklParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0=1, T__1=2, T__2=3, T__3=4, LETTER=5, DIGIT=6, OTHER_SYMBOL=7, QUOTE=8,
			BOOL_TYPE=9, NUMBER_TYPE=10, DECIMAL_TYPE=11, STRING_TYPE=12, VOID_TYPE=13,
			FUNCTION_TYPE=14, PLUS=15, MINUS=16, MULT=17, DIV=18, MOD=19, INC=20,
			DEC=21, EXP=22, SUMM=23, PRODSUMM=24, ROOT=25, ASSIGN=26, EQ=27, NEQ=28,
			GT=29, LT=30, GTE=31, LTE=32, AND=33, OR=34, NOT=35, NAND=36, NOR=37,
			XOR=38, XNOR=39, LPAREN=40, RPAREN=41, LBRACE=42, RBRACE=43, COMMA=44,
			COLON=45, SEMICOLON=46, QUESTMARK=47, ARROW=48, PASS=49, GIVE=50, RUN=51,
			CATCH=52, CHECK=53, MATCH=54, IS=55, TO=56, IF=57, ELSE=58, PRINT=59,
			WS=60, COMMENT=61, BLOCK_COMMENT=62;
	public static final int
			RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3,
			RULE_functionCall = 4, RULE_ifCondition = 5, RULE_switchCase = 6, RULE_expression = 7,
			RULE_toBool = 8, RULE_catchBody = 9, RULE_function = 10, RULE_functionWithBody = 11,
			RULE_functionWithLambda = 12, RULE_parameters = 13, RULE_parameter = 14,
			RULE_functionDataType = 15, RULE_variableDataType = 16, RULE_id = 17,
			RULE_boolean = 18, RULE_number = 19, RULE_anychar = 20;
	private static String[] makeRuleNames() {
		return new String[] {
				"program", "statement", "declaration", "assignment", "functionCall",
				"ifCondition", "switchCase", "expression", "toBool", "catchBody", "function",
				"functionWithBody", "functionWithLambda", "parameters", "parameter",
				"functionDataType", "variableDataType", "id", "boolean", "number", "anychar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'.'", "'true'", "'false'", "'\\\"'", null, null, null, "'\"'",
				"'bool'", "'num'", "'dec'", "'str'", "'void'", "'func'", "'+'", "'-'",
				"'*'", "'/'", "'%'", "'++'", "'--'", "'/\\'", "'~'", "'~*'", "'\\/'",
				"'='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&'", "'|'", "'!'",
				"'!&'", "'!|'", "'^'", "'!^'", "'('", "')'", "'{'", "'}'", "','", "':'",
				"';'", "'?'", "'->'", "'pass'", "'give'", "'run'", "'catch'", "'check'",
				"'match'", "'is'", "'to'", "'if'", "'else'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, "LETTER", "DIGIT", "OTHER_SYMBOL", "QUOTE",
				"BOOL_TYPE", "NUMBER_TYPE", "DECIMAL_TYPE", "STRING_TYPE", "VOID_TYPE",
				"FUNCTION_TYPE", "PLUS", "MINUS", "MULT", "DIV", "MOD", "INC", "DEC",
				"EXP", "SUMM", "PRODSUMM", "ROOT", "ASSIGN", "EQ", "NEQ", "GT", "LT",
				"GTE", "LTE", "AND", "OR", "NOT", "NAND", "NOR", "XOR", "XNOR", "LPAREN",
				"RPAREN", "LBRACE", "RBRACE", "COMMA", "COLON", "SEMICOLON", "QUESTMARK",
				"ARROW", "PASS", "GIVE", "RUN", "CATCH", "CHECK", "MATCH", "IS", "TO",
				"IF", "ELSE", "PRINT", "WS", "COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "Quirkl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuirklParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QuirklParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(42);
							statement();
						}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0) );
				setState(47);
				match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }

		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionWithLambdaStatementContext extends StatementContext {
		public FunctionWithLambdaContext functionWithLambda() {
			return getRuleContext(FunctionWithLambdaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public FunctionWithLambdaStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionWithLambdaStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(QuirklParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(QuirklParser.ELSE, i);
		}
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchContext extends StatementContext {
		public TerminalNode MATCH() { return getToken(QuirklParser.MATCH, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(QuirklParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(QuirklParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(QuirklParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(QuirklParser.RPAREN, i);
		}
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public List<TerminalNode> IS() { return getTokens(QuirklParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(QuirklParser.IS, i);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(QuirklParser.ELSE, 0); }
		public SwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionWithBodyStatementContext extends StatementContext {
		public FunctionWithBodyContext functionWithBody() {
			return getRuleContext(FunctionWithBodyContext.class,0);
		}
		public FunctionWithBodyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionWithBodyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends StatementContext {
		public TerminalNode RUN() { return getToken(QuirklParser.RUN, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(QuirklParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(QuirklParser.SEMICOLON, i);
		}
		public ToBoolContext toBool() {
			return getRuleContext(ToBoolContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CatchBodyContext catchBody() {
			return getRuleContext(CatchBodyContext.class,0);
		}
		public ForLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public FunctionCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(QuirklParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileLoopContext extends StatementContext {
		public TerminalNode RUN() { return getToken(QuirklParser.RUN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public TerminalNode CHECK() { return getToken(QuirklParser.CHECK, 0); }
		public ToBoolContext toBool() {
			return getRuleContext(ToBoolContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public CatchBodyContext catchBody() {
			return getRuleContext(CatchBodyContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends StatementContext {
		public TerminalNode RUN() { return getToken(QuirklParser.RUN, 0); }
		public TerminalNode CHECK() { return getToken(QuirklParser.CHECK, 0); }
		public ToBoolContext toBool() {
			return getRuleContext(ToBoolContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CatchBodyContext catchBody() {
			return getRuleContext(CatchBodyContext.class,0);
		}
		public WhileLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RunCatchContext extends StatementContext {
		public TerminalNode RUN() { return getToken(QuirklParser.RUN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public CatchBodyContext catchBody() {
			return getRuleContext(CatchBodyContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RunCatchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitRunCatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					_localctx = new DeclarationStatementContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(49);
					declaration();
					setState(50);
					match(SEMICOLON);
				}
				break;
				case 2:
					_localctx = new AssignmentStatementContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(52);
					assignment();
					setState(53);
					match(SEMICOLON);
				}
				break;
				case 3:
					_localctx = new FunctionCallStatementContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(55);
					functionCall();
					setState(56);
					match(SEMICOLON);
				}
				break;
				case 4:
					_localctx = new PrintStatementContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(58);
					match(PRINT);
					setState(59);
					match(LPAREN);
					setState(60);
					expression(0);
					setState(61);
					match(RPAREN);
					setState(62);
					match(SEMICOLON);
				}
				break;
				case 5:
					_localctx = new FunctionWithBodyStatementContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(64);
					functionWithBody();
				}
				break;
				case 6:
					_localctx = new FunctionWithLambdaStatementContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(65);
					functionWithLambda();
					setState(66);
					match(SEMICOLON);
				}
				break;
				case 7:
					_localctx = new IfStatementContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(68);
					ifCondition();
					setState(73);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								{
									setState(69);
									match(ELSE);
									setState(70);
									ifCondition();
								}
							}
						}
						setState(75);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ELSE) {
						{
							setState(76);
							match(ELSE);
							setState(77);
							match(LBRACE);
							setState(81);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
								{
									{
										setState(78);
										statement();
									}
								}
								setState(83);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(84);
							match(RBRACE);
						}
					}

				}
				break;
				case 8:
					_localctx = new ForLoopContext(_localctx);
					enterOuterAlt(_localctx, 8);
				{
					setState(87);
					match(RUN);
					setState(88);
					match(LPAREN);
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
						{
							setState(89);
							declaration();
						}
						break;
						case 2:
						{
							setState(90);
							expression(0);
						}
						break;
					}
					setState(93);
					match(SEMICOLON);
					setState(94);
					toBool();
					setState(95);
					match(SEMICOLON);
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
						{
							setState(96);
							assignment();
						}
						break;
						case 2:
						{
							setState(97);
							expression(0);
						}
						break;
					}
					setState(100);
					match(RPAREN);
					setState(101);
					match(LBRACE);
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
						{
							{
								setState(102);
								statement();
							}
						}
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(108);
					match(RBRACE);
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CATCH) {
						{
							setState(109);
							catchBody();
						}
					}

				}
				break;
				case 9:
					_localctx = new WhileLoopContext(_localctx);
					enterOuterAlt(_localctx, 9);
				{
					setState(112);
					match(RUN);
					setState(113);
					match(CHECK);
					setState(114);
					toBool();
					setState(115);
					match(LBRACE);
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
						{
							{
								setState(116);
								statement();
							}
						}
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(122);
					match(RBRACE);
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CATCH) {
						{
							setState(123);
							catchBody();
						}
					}

				}
				break;
				case 10:
					_localctx = new DoWhileLoopContext(_localctx);
					enterOuterAlt(_localctx, 10);
				{
					setState(126);
					match(RUN);
					setState(127);
					match(LBRACE);
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
						{
							{
								setState(128);
								statement();
							}
						}
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(134);
					match(RBRACE);
					setState(135);
					match(CHECK);
					setState(136);
					toBool();
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case SEMICOLON:
						{
							setState(137);
							match(SEMICOLON);
						}
						break;
						case CATCH:
						{
							setState(138);
							catchBody();
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
				}
				break;
				case 11:
					_localctx = new SwitchContext(_localctx);
					enterOuterAlt(_localctx, 11);
				{
					setState(141);
					match(MATCH);
					setState(142);
					match(LPAREN);
					setState(143);
					expression(0);
					setState(144);
					match(RPAREN);
					setState(145);
					match(LBRACE);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(146);
								match(IS);
								setState(147);
								match(LPAREN);
								setState(148);
								expression(0);
								setState(149);
								match(RPAREN);
								setState(150);
								switchCase();
							}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==IS );
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ELSE) {
						{
							setState(156);
							match(ELSE);
							setState(157);
							switchCase();
						}
					}

					setState(160);
					match(RBRACE);
				}
				break;
				case 12:
					_localctx = new RunCatchContext(_localctx);
					enterOuterAlt(_localctx, 12);
				{
					setState(162);
					match(RUN);
					setState(163);
					match(LBRACE);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
						{
							{
								setState(164);
								statement();
							}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(170);
					match(RBRACE);
					setState(171);
					catchBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }

		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends DeclarationContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public TerminalNode FUNCTION_TYPE() { return getToken(QuirklParser.FUNCTION_TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(QuirklParser.ASSIGN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends DeclarationContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public VariableDataTypeContext variableDataType() {
			return getRuleContext(VariableDataTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(QuirklParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					_localctx = new VariableDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(174);
					id();
					setState(175);
					match(COLON);
					setState(176);
					variableDataType();
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
							setState(177);
							match(ASSIGN);
							setState(178);
							expression(0);
						}
					}

				}
				break;
				case 2:
					_localctx = new FunctionDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(181);
					id();
					setState(182);
					match(COLON);
					setState(183);
					match(FUNCTION_TYPE);
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
							setState(184);
							match(ASSIGN);
							setState(185);
							function();
						}
					}

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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(QuirklParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(190);
				id();
				setState(191);
				match(ASSIGN);
				setState(192);
				expression(0);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QuirklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QuirklParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(194);
				id();
				setState(195);
				match(LPAREN);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 704821316354412L) != 0)) {
					{
						setState(196);
						expression(0);
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
								{
									setState(197);
									match(COMMA);
									setState(198);
									expression(0);
								}
							}
							setState(203);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(206);
				match(RPAREN);
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
	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(QuirklParser.IF, 0); }
		public ToBoolContext toBool() {
			return getRuleContext(ToBoolContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(208);
				match(IF);
				setState(209);
				toBool();
				setState(210);
				match(LBRACE);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
					{
						{
							setState(211);
							statement();
						}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(RBRACE);
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
	public static class SwitchCaseContext extends ParserRuleContext {
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }

		public SwitchCaseContext() { }
		public void copyFrom(SwitchCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCaseWithLambdaContext extends SwitchCaseContext {
		public TerminalNode ARROW() { return getToken(QuirklParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public SwitchCaseWithLambdaContext(SwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitSwitchCaseWithLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCaseWithBodyContext extends SwitchCaseContext {
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchCaseWithBodyContext(SwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitSwitchCaseWithBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_switchCase);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					_localctx = new SwitchCaseWithBodyContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(219);
					match(LBRACE);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
						{
							{
								setState(220);
								statement();
							}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(226);
					match(RBRACE);
				}
				break;
				case ARROW:
					_localctx = new SwitchCaseWithLambdaContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(227);
					match(ARROW);
					setState(228);
					expression(0);
					setState(229);
					match(SEMICOLON);
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
	public static class DecrementExpressionContext extends ExpressionContext {
		public TerminalNode DEC() { return getToken(QuirklParser.DEC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(QuirklParser.OR, 0); }
		public OrBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitOrBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralExpressionContext extends ExpressionContext {
		public List<TerminalNode> QUOTE() { return getTokens(QuirklParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(QuirklParser.QUOTE, i);
		}
		public List<AnycharContext> anychar() {
			return getRuleContexts(AnycharContext.class);
		}
		public AnycharContext anychar(int i) {
			return getRuleContext(AnycharContext.class,i);
		}
		public StringLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(QuirklParser.LT, 0); }
		public LessThanBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitLessThanBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryOperatorExpressionContext extends ExpressionContext {
		public ToBoolContext toBool() {
			return getRuleContext(ToBoolContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(QuirklParser.ARROW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public TernaryOperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitTernaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionWithBodyExpressionContext extends ExpressionContext {
		public FunctionWithBodyContext functionWithBody() {
			return getRuleContext(FunctionWithBodyContext.class,0);
		}
		public FunctionWithBodyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionWithBodyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOrEqualsBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LTE() { return getToken(QuirklParser.LTE, 0); }
		public LessThanOrEqualsBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitLessThanOrEqualsBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToBoolExpressionContext extends ExpressionContext {
		public ToBoolContext toBool() {
			return getRuleContext(ToBoolContext.class,0);
		}
		public ToBoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitToBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualsBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(QuirklParser.NEQ, 0); }
		public NotEqualsBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitNotEqualsBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NorBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOR() { return getToken(QuirklParser.NOR, 0); }
		public NorBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitNorBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementExpressionContext extends ExpressionContext {
		public TerminalNode INC() { return getToken(QuirklParser.INC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SummationExpressionContext extends ExpressionContext {
		public TerminalNode SUMM() { return getToken(QuirklParser.SUMM, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SummationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitSummationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(QuirklParser.DIV, 0); }
		public DivisionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitDivisionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(QuirklParser.EQ, 0); }
		public EqualsBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitEqualsBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionWithLambdaExpressionContext extends ExpressionContext {
		public FunctionWithLambdaContext functionWithLambda() {
			return getRuleContext(FunctionWithLambdaContext.class,0);
		}
		public FunctionWithLambdaExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionWithLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralExpressionContext extends ExpressionContext {
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public BooleanLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitBooleanLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProdSummationExpressionContext extends ExpressionContext {
		public TerminalNode PRODSUMM() { return getToken(QuirklParser.PRODSUMM, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProdSummationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitProdSummationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LateDecrementExpressionContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DEC() { return getToken(QuirklParser.DEC, 0); }
		public LateDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitLateDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralExpressionContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitNumberLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXP() { return getToken(QuirklParser.EXP, 0); }
		public ExponentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitExponentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(QuirklParser.PLUS, 0); }
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XnorBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XNOR() { return getToken(QuirklParser.XNOR, 0); }
		public XnorBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitXnorBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(QuirklParser.MOD, 0); }
		public ModulusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitModulusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NandBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NAND() { return getToken(QuirklParser.NAND, 0); }
		public NandBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitNandBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(QuirklParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(QuirklParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirklParser.DIGIT, i);
		}
		public DecimalLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitDecimalLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExpressionContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(QuirklParser.MINUS, 0); }
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LateIncrementExpressionContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INC() { return getToken(QuirklParser.INC, 0); }
		public LateIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitLateIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(QuirklParser.XOR, 0); }
		public XorBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitXorBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode MINUS() { return getToken(QuirklParser.MINUS, 0); }
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(QuirklParser.MINUS, 0); }
		public SubtractionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitSubtractionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotBooleanExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(QuirklParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitNotBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(QuirklParser.AND, 0); }
		public AndBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitAndBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROOT() { return getToken(QuirklParser.ROOT, 0); }
		public RootExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitRootExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(QuirklParser.GT, 0); }
		public GreaterThanBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitGreaterThanBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(QuirklParser.MULT, 0); }
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOrEqualsBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(QuirklParser.GTE, 0); }
		public GreaterThanOrEqualsBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitGreaterThanOrEqualsBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
					{
						_localctx = new BracketExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUS) {
							{
								setState(234);
								match(MINUS);
							}
						}

						setState(237);
						match(LPAREN);
						setState(238);
						expression(0);
						setState(239);
						match(RPAREN);
					}
					break;
					case 2:
					{
						_localctx = new IncrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(241);
						match(INC);
						setState(242);
						expression(36);
					}
					break;
					case 3:
					{
						_localctx = new DecrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(243);
						match(DEC);
						setState(244);
						expression(35);
					}
					break;
					case 4:
					{
						_localctx = new SummationExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(247);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(245);
								number();
							}
							break;
							case LETTER:
							{
								setState(246);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(249);
						match(SUMM);
						setState(252);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(250);
								number();
							}
							break;
							case LETTER:
							{
								setState(251);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(254);
						match(LPAREN);
						setState(257);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case PASS:
							{
								setState(255);
								function();
							}
							break;
							case LETTER:
							{
								setState(256);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(259);
						match(RPAREN);
					}
					break;
					case 5:
					{
						_localctx = new ProdSummationExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(263);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(261);
								number();
							}
							break;
							case LETTER:
							{
								setState(262);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(265);
						match(PRODSUMM);
						setState(268);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(266);
								number();
							}
							break;
							case LETTER:
							{
								setState(267);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(270);
						match(LPAREN);
						setState(273);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case PASS:
							{
								setState(271);
								function();
							}
							break;
							case LETTER:
							{
								setState(272);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(275);
						match(RPAREN);
					}
					break;
					case 6:
					{
						_localctx = new NotBooleanExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(277);
						match(NOT);
						setState(278);
						expression(25);
					}
					break;
					case 7:
					{
						_localctx = new ToBoolExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(279);
						toBool();
					}
					break;
					case 8:
					{
						_localctx = new TernaryOperatorExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(280);
						toBool();
						setState(281);
						match(ARROW);
						setState(282);
						expression(0);
						setState(283);
						match(COLON);
						setState(284);
						expression(11);
					}
					break;
					case 9:
					{
						_localctx = new FunctionWithBodyExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(286);
						functionWithBody();
					}
					break;
					case 10:
					{
						_localctx = new FunctionWithLambdaExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(287);
						functionWithLambda();
					}
					break;
					case 11:
					{
						_localctx = new FunctionCallExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(288);
						functionCall();
					}
					break;
					case 12:
					{
						_localctx = new VariableExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(290);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUS) {
							{
								setState(289);
								match(MINUS);
							}
						}

						setState(292);
						id();
					}
					break;
					case 13:
					{
						_localctx = new NumberLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(293);
						number();
					}
					break;
					case 14:
					{
						_localctx = new DecimalLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(295);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUS) {
							{
								setState(294);
								match(MINUS);
							}
						}

						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(297);
									match(DIGIT);
								}
							}
							setState(300);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==DIGIT );
						setState(302);
						match(T__0);
						setState(304);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
								case 1:
								{
									{
										setState(303);
										match(DIGIT);
									}
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
							setState(306);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
					case 15:
					{
						_localctx = new BooleanLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(308);
						boolean_();
					}
					break;
					case 16:
					{
						_localctx = new StringLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(309);
						match(QUOTE);
						setState(313);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
									{
										setState(310);
										anychar();
									}
								}
							}
							setState(315);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
						}
						setState(316);
						match(QUOTE);
					}
					break;
					case 17:
					{
						_localctx = new LateIncrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(317);
						id();
						setState(318);
						match(INC);
					}
					break;
					case 18:
					{
						_localctx = new LateDecrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(320);
						id();
						setState(321);
						match(DEC);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(382);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
								case 1:
								{
									_localctx = new ExponentExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(325);
									if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
									setState(326);
									match(EXP);
									setState(327);
									expression(35);
								}
								break;
								case 2:
								{
									_localctx = new RootExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(328);
									if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
									setState(329);
									match(ROOT);
									setState(330);
									expression(34);
								}
								break;
								case 3:
								{
									_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(331);
									if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
									setState(332);
									match(MULT);
									setState(333);
									expression(33);
								}
								break;
								case 4:
								{
									_localctx = new DivisionExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(334);
									if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
									setState(335);
									match(DIV);
									setState(336);
									expression(32);
								}
								break;
								case 5:
								{
									_localctx = new ModulusExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(337);
									if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
									setState(338);
									match(MOD);
									setState(339);
									expression(31);
								}
								break;
								case 6:
								{
									_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(340);
									if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
									setState(341);
									match(PLUS);
									setState(342);
									expression(30);
								}
								break;
								case 7:
								{
									_localctx = new SubtractionExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(343);
									if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
									setState(344);
									match(MINUS);
									setState(345);
									expression(29);
								}
								break;
								case 8:
								{
									_localctx = new EqualsBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(346);
									if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
									setState(347);
									match(EQ);
									setState(348);
									expression(25);
								}
								break;
								case 9:
								{
									_localctx = new NotEqualsBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(349);
									if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
									setState(350);
									match(NEQ);
									setState(351);
									expression(24);
								}
								break;
								case 10:
								{
									_localctx = new GreaterThanBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(352);
									if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
									setState(353);
									match(GT);
									setState(354);
									expression(23);
								}
								break;
								case 11:
								{
									_localctx = new LessThanBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(355);
									if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
									setState(356);
									match(LT);
									setState(357);
									expression(22);
								}
								break;
								case 12:
								{
									_localctx = new GreaterThanOrEqualsBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(358);
									if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
									setState(359);
									match(GTE);
									setState(360);
									expression(21);
								}
								break;
								case 13:
								{
									_localctx = new LessThanOrEqualsBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(361);
									if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
									setState(362);
									match(LTE);
									setState(363);
									expression(20);
								}
								break;
								case 14:
								{
									_localctx = new AndBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(364);
									if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
									setState(365);
									match(AND);
									setState(366);
									expression(19);
								}
								break;
								case 15:
								{
									_localctx = new OrBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(367);
									if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
									setState(368);
									match(OR);
									setState(369);
									expression(18);
								}
								break;
								case 16:
								{
									_localctx = new XorBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(370);
									if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
									setState(371);
									match(XOR);
									setState(372);
									expression(17);
								}
								break;
								case 17:
								{
									_localctx = new NandBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(373);
									if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
									setState(374);
									match(NAND);
									setState(375);
									expression(16);
								}
								break;
								case 18:
								{
									_localctx = new NorBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(376);
									if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
									setState(377);
									match(NOR);
									setState(378);
									expression(15);
								}
								break;
								case 19:
								{
									_localctx = new XnorBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(379);
									if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
									setState(380);
									match(XNOR);
									setState(381);
									expression(14);
								}
								break;
							}
						}
					}
					setState(386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
	public static class ToBoolContext extends ParserRuleContext {
		public TerminalNode QUESTMARK() { return getToken(QuirklParser.QUESTMARK, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public ToBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitToBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToBoolContext toBool() throws RecognitionException {
		ToBoolContext _localctx = new ToBoolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_toBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(387);
				match(QUESTMARK);
				setState(388);
				match(LPAREN);
				setState(389);
				expression(0);
				setState(390);
				match(RPAREN);
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
	public static class CatchBodyContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(QuirklParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CatchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitCatchBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBodyContext catchBody() throws RecognitionException {
		CatchBodyContext _localctx = new CatchBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_catchBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(392);
				match(CATCH);
				setState(393);
				match(LPAREN);
				setState(394);
				id();
				setState(395);
				match(RPAREN);
				setState(396);
				match(LBRACE);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
					{
						{
							setState(397);
							statement();
						}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(RBRACE);
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
		public FunctionWithBodyContext functionWithBody() {
			return getRuleContext(FunctionWithBodyContext.class,0);
		}
		public FunctionWithLambdaContext functionWithLambda() {
			return getRuleContext(FunctionWithLambdaContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(405);
					functionWithBody();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(406);
					functionWithLambda();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionWithBodyContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(QuirklParser.PASS, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public FunctionDataTypeContext functionDataType() {
			return getRuleContext(FunctionDataTypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode TO() { return getToken(QuirklParser.TO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode GIVE() { return getToken(QuirklParser.GIVE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public FunctionWithBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionWithBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionWithBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionWithBodyContext functionWithBody() throws RecognitionException {
		FunctionWithBodyContext _localctx = new FunctionWithBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionWithBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(409);
				match(PASS);
				setState(410);
				match(LPAREN);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LETTER) {
					{
						setState(411);
						parameters();
					}
				}

				setState(414);
				match(RPAREN);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
						setState(415);
						match(TO);
						setState(416);
						id();
					}
				}

				setState(419);
				match(COLON);
				setState(420);
				functionDataType();
				setState(421);
				match(LBRACE);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
					{
						{
							setState(422);
							statement();
						}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GIVE) {
					{
						setState(428);
						match(GIVE);
						setState(429);
						expression(0);
						setState(430);
						match(SEMICOLON);
					}
				}

				setState(434);
				match(RBRACE);
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
	public static class FunctionWithLambdaContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(QuirklParser.PASS, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public FunctionDataTypeContext functionDataType() {
			return getRuleContext(FunctionDataTypeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(QuirklParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode TO() { return getToken(QuirklParser.TO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FunctionWithLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionWithLambda; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionWithLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionWithLambdaContext functionWithLambda() throws RecognitionException {
		FunctionWithLambdaContext _localctx = new FunctionWithLambdaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionWithLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(436);
				match(PASS);
				setState(437);
				match(LPAREN);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LETTER) {
					{
						setState(438);
						parameters();
					}
				}

				setState(441);
				match(RPAREN);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
						setState(442);
						match(TO);
						setState(443);
						id();
					}
				}

				setState(446);
				match(COLON);
				setState(447);
				functionDataType();
				setState(448);
				match(ARROW);
				setState(449);
				expression(0);
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
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QuirklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QuirklParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(451);
				parameter();
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(452);
							match(COMMA);
							setState(453);
							parameter();
						}
					}
					setState(458);
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
	public static class ParameterContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public VariableDataTypeContext variableDataType() {
			return getRuleContext(VariableDataTypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(459);
				id();
				setState(460);
				match(COLON);
				setState(461);
				variableDataType();
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
	public static class FunctionDataTypeContext extends ParserRuleContext {
		public VariableDataTypeContext variableDataType() {
			return getRuleContext(VariableDataTypeContext.class,0);
		}
		public TerminalNode FUNCTION_TYPE() { return getToken(QuirklParser.FUNCTION_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(QuirklParser.VOID_TYPE, 0); }
		public FunctionDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitFunctionDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDataTypeContext functionDataType() throws RecognitionException {
		FunctionDataTypeContext _localctx = new FunctionDataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDataType);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOL_TYPE:
				case NUMBER_TYPE:
				case DECIMAL_TYPE:
				case STRING_TYPE:
					enterOuterAlt(_localctx, 1);
				{
					setState(463);
					variableDataType();
				}
				break;
				case FUNCTION_TYPE:
					enterOuterAlt(_localctx, 2);
				{
					setState(464);
					match(FUNCTION_TYPE);
				}
				break;
				case VOID_TYPE:
					enterOuterAlt(_localctx, 3);
				{
					setState(465);
					match(VOID_TYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDataTypeContext extends ParserRuleContext {
		public TerminalNode BOOL_TYPE() { return getToken(QuirklParser.BOOL_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(QuirklParser.NUMBER_TYPE, 0); }
		public TerminalNode DECIMAL_TYPE() { return getToken(QuirklParser.DECIMAL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(QuirklParser.STRING_TYPE, 0); }
		public VariableDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitVariableDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDataTypeContext variableDataType() throws RecognitionException {
		VariableDataTypeContext _localctx = new VariableDataTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(468);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(QuirklParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(QuirklParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(QuirklParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirklParser.DIGIT, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(470);
				match(LETTER);
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(471);
								_la = _input.LA(1);
								if ( !(_la==LETTER || _la==DIGIT) ) {
									_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
							}
						}
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	public static class BooleanContext extends ParserRuleContext {
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(QuirklParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(QuirklParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirklParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
						setState(479);
						match(MINUS);
					}
				}

				setState(483);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1:
						{
							{
								setState(482);
								match(DIGIT);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(485);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class AnycharContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(QuirklParser.LETTER, 0); }
		public TerminalNode DIGIT() { return getToken(QuirklParser.DIGIT, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirklParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirklParser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(QuirklParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public TerminalNode QUESTMARK() { return getToken(QuirklParser.QUESTMARK, 0); }
		public TerminalNode NOT() { return getToken(QuirklParser.NOT, 0); }
		public TerminalNode OR() { return getToken(QuirklParser.OR, 0); }
		public TerminalNode AND() { return getToken(QuirklParser.AND, 0); }
		public TerminalNode XOR() { return getToken(QuirklParser.XOR, 0); }
		public TerminalNode PLUS() { return getToken(QuirklParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(QuirklParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(QuirklParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(QuirklParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(QuirklParser.MOD, 0); }
		public TerminalNode SUMM() { return getToken(QuirklParser.SUMM, 0); }
		public TerminalNode OTHER_SYMBOL() { return getToken(QuirklParser.OTHER_SYMBOL, 0); }
		public AnycharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anychar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitAnychar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_anychar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(487);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 280710481936624L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 7:
				return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 34);
			case 1:
				return precpred(_ctx, 33);
			case 2:
				return precpred(_ctx, 32);
			case 3:
				return precpred(_ctx, 31);
			case 4:
				return precpred(_ctx, 30);
			case 5:
				return precpred(_ctx, 29);
			case 6:
				return precpred(_ctx, 28);
			case 7:
				return precpred(_ctx, 24);
			case 8:
				return precpred(_ctx, 23);
			case 9:
				return precpred(_ctx, 22);
			case 10:
				return precpred(_ctx, 21);
			case 11:
				return precpred(_ctx, 20);
			case 12:
				return precpred(_ctx, 19);
			case 13:
				return precpred(_ctx, 18);
			case 14:
				return precpred(_ctx, 17);
			case 15:
				return precpred(_ctx, 16);
			case 16:
				return precpred(_ctx, 15);
			case 17:
				return precpred(_ctx, 14);
			case 18:
				return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
			"\u0004\u0001>\u01ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
					"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
					"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
					"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
					"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
					"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004\u0000"+
					",\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0005\u0001H\b\u0001\n\u0001\f\u0001K\t"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001P\b\u0001\n\u0001"+
					"\f\u0001S\t\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0005\u0001h\b\u0001\n\u0001\f\u0001k\t\u0001"+
					"\u0001\u0001\u0001\u0001\u0003\u0001o\b\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001v\b\u0001\n\u0001\f\u0001"+
					"y\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001}\b\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0005\u0001\u0082\b\u0001\n\u0001\f\u0001\u0085\t\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
					"\u008c\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0004\u0001\u0099\b\u0001\u000b\u0001\f\u0001\u009a\u0001\u0001\u0001"+
					"\u0001\u0003\u0001\u009f\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0005\u0001\u00a6\b\u0001\n\u0001\f\u0001\u00a9\t\u0001"+
					"\u0001\u0001\u0001\u0001\u0003\u0001\u00ad\b\u0001\u0001\u0002\u0001\u0002"+
					"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b4\b\u0002\u0001\u0002"+
					"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00bb\b\u0002"+
					"\u0003\u0002\u00bd\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
					"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
					"\u00c8\b\u0004\n\u0004\f\u0004\u00cb\t\u0004\u0003\u0004\u00cd\b\u0004"+
					"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
					"\u0005\u0005\u00d5\b\u0005\n\u0005\f\u0005\u00d8\t\u0005\u0001\u0005\u0001"+
					"\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u00de\b\u0006\n\u0006\f\u0006"+
					"\u00e1\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
					"\u0003\u0006\u00e8\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00ec\b"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f8"+
					"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00fd\b\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0102\b\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0108\b\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0003\u0007\u010d\b\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0003\u0007\u0112\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0003\u0007\u0123\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
					"\u0128\b\u0007\u0001\u0007\u0004\u0007\u012b\b\u0007\u000b\u0007\f\u0007"+
					"\u012c\u0001\u0007\u0001\u0007\u0004\u0007\u0131\b\u0007\u000b\u0007\f"+
					"\u0007\u0132\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0138\b\u0007"+
					"\n\u0007\f\u0007\u013b\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0144\b\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u017f\b\u0007\n\u0007\f\u0007"+
					"\u0182\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
					"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u018f\b\t\n\t\f\t\u0192\t\t\u0001"+
					"\t\u0001\t\u0001\n\u0001\n\u0003\n\u0198\b\n\u0001\u000b\u0001\u000b\u0001"+
					"\u000b\u0003\u000b\u019d\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
					"\u000b\u01a2\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
					"\u000b\u01a8\b\u000b\n\u000b\f\u000b\u01ab\t\u000b\u0001\u000b\u0001\u000b"+
					"\u0001\u000b\u0001\u000b\u0003\u000b\u01b1\b\u000b\u0001\u000b\u0001\u000b"+
					"\u0001\f\u0001\f\u0001\f\u0003\f\u01b8\b\f\u0001\f\u0001\f\u0001\f\u0003"+
					"\f\u01bd\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
					"\r\u0005\r\u01c7\b\r\n\r\f\r\u01ca\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
					"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01d3\b\u000f"+
					"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u01d9\b\u0011"+
					"\n\u0011\f\u0011\u01dc\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0003"+
					"\u0013\u01e1\b\u0013\u0001\u0013\u0004\u0013\u01e4\b\u0013\u000b\u0013"+
					"\f\u0013\u01e5\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0139\u0001\u000e"+
					"\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
					"\u001a\u001c\u001e \"$&(\u0000\u0004\u0001\u0000\t\f\u0001\u0000\u0005"+
					"\u0006\u0001\u0000\u0002\u0003\u0006\u0000\u0004\u0007\u000f\u0013\u0017"+
					"\u0017!#&&(/\u0236\u0000+\u0001\u0000\u0000\u0000\u0002\u00ac\u0001\u0000"+
					"\u0000\u0000\u0004\u00bc\u0001\u0000\u0000\u0000\u0006\u00be\u0001\u0000"+
					"\u0000\u0000\b\u00c2\u0001\u0000\u0000\u0000\n\u00d0\u0001\u0000\u0000"+
					"\u0000\f\u00e7\u0001\u0000\u0000\u0000\u000e\u0143\u0001\u0000\u0000\u0000"+
					"\u0010\u0183\u0001\u0000\u0000\u0000\u0012\u0188\u0001\u0000\u0000\u0000"+
					"\u0014\u0197\u0001\u0000\u0000\u0000\u0016\u0199\u0001\u0000\u0000\u0000"+
					"\u0018\u01b4\u0001\u0000\u0000\u0000\u001a\u01c3\u0001\u0000\u0000\u0000"+
					"\u001c\u01cb\u0001\u0000\u0000\u0000\u001e\u01d2\u0001\u0000\u0000\u0000"+
					" \u01d4\u0001\u0000\u0000\u0000\"\u01d6\u0001\u0000\u0000\u0000$\u01dd"+
					"\u0001\u0000\u0000\u0000&\u01e0\u0001\u0000\u0000\u0000(\u01e7\u0001\u0000"+
					"\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,-\u0001"+
					"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
					"./\u0001\u0000\u0000\u0000/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000"+
					"\u0000\u000012\u0003\u0004\u0002\u000023\u0005.\u0000\u00003\u00ad\u0001"+
					"\u0000\u0000\u000045\u0003\u0006\u0003\u000056\u0005.\u0000\u00006\u00ad"+
					"\u0001\u0000\u0000\u000078\u0003\b\u0004\u000089\u0005.\u0000\u00009\u00ad"+
					"\u0001\u0000\u0000\u0000:;\u0005;\u0000\u0000;<\u0005(\u0000\u0000<=\u0003"+
					"\u000e\u0007\u0000=>\u0005)\u0000\u0000>?\u0005.\u0000\u0000?\u00ad\u0001"+
					"\u0000\u0000\u0000@\u00ad\u0003\u0016\u000b\u0000AB\u0003\u0018\f\u0000"+
					"BC\u0005.\u0000\u0000C\u00ad\u0001\u0000\u0000\u0000DI\u0003\n\u0005\u0000"+
					"EF\u0005:\u0000\u0000FH\u0003\n\u0005\u0000GE\u0001\u0000\u0000\u0000"+
					"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
					"\u0000JU\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005:\u0000"+
					"\u0000MQ\u0005*\u0000\u0000NP\u0003\u0002\u0001\u0000ON\u0001\u0000\u0000"+
					"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
					"\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TV\u0005"+
					"+\u0000\u0000UL\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u00ad"+
					"\u0001\u0000\u0000\u0000WX\u00053\u0000\u0000X[\u0005(\u0000\u0000Y\\"+
					"\u0003\u0004\u0002\u0000Z\\\u0003\u000e\u0007\u0000[Y\u0001\u0000\u0000"+
					"\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
					"\u0000\u0000]^\u0005.\u0000\u0000^_\u0003\u0010\b\u0000_b\u0005.\u0000"+
					"\u0000`c\u0003\u0006\u0003\u0000ac\u0003\u000e\u0007\u0000b`\u0001\u0000"+
					"\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001"+
					"\u0000\u0000\u0000de\u0005)\u0000\u0000ei\u0005*\u0000\u0000fh\u0003\u0002"+
					"\u0001\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
					"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000"+
					"ki\u0001\u0000\u0000\u0000ln\u0005+\u0000\u0000mo\u0003\u0012\t\u0000"+
					"nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u00ad\u0001\u0000"+
					"\u0000\u0000pq\u00053\u0000\u0000qr\u00055\u0000\u0000rs\u0003\u0010\b"+
					"\u0000sw\u0005*\u0000\u0000tv\u0003\u0002\u0001\u0000ut\u0001\u0000\u0000"+
					"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
					"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0005"+
					"+\u0000\u0000{}\u0003\u0012\t\u0000|{\u0001\u0000\u0000\u0000|}\u0001"+
					"\u0000\u0000\u0000}\u00ad\u0001\u0000\u0000\u0000~\u007f\u00053\u0000"+
					"\u0000\u007f\u0083\u0005*\u0000\u0000\u0080\u0082\u0003\u0002\u0001\u0000"+
					"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000"+
					"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
					"\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
					"\u0086\u0087\u0005+\u0000\u0000\u0087\u0088\u00055\u0000\u0000\u0088\u008b"+
					"\u0003\u0010\b\u0000\u0089\u008c\u0005.\u0000\u0000\u008a\u008c\u0003"+
					"\u0012\t\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000"+
					"\u0000\u0000\u008c\u00ad\u0001\u0000\u0000\u0000\u008d\u008e\u00056\u0000"+
					"\u0000\u008e\u008f\u0005(\u0000\u0000\u008f\u0090\u0003\u000e\u0007\u0000"+
					"\u0090\u0091\u0005)\u0000\u0000\u0091\u0098\u0005*\u0000\u0000\u0092\u0093"+
					"\u00057\u0000\u0000\u0093\u0094\u0005(\u0000\u0000\u0094\u0095\u0003\u000e"+
					"\u0007\u0000\u0095\u0096\u0005)\u0000\u0000\u0096\u0097\u0003\f\u0006"+
					"\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000"+
					"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
					"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
					"\u0000\u009c\u009d\u0005:\u0000\u0000\u009d\u009f\u0003\f\u0006\u0000"+
					"\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
					"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005+\u0000\u0000\u00a1"+
					"\u00ad\u0001\u0000\u0000\u0000\u00a2\u00a3\u00053\u0000\u0000\u00a3\u00a7"+
					"\u0005*\u0000\u0000\u00a4\u00a6\u0003\u0002\u0001\u0000\u00a5\u00a4\u0001"+
					"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
					"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001"+
					"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
					"+\u0000\u0000\u00ab\u00ad\u0003\u0012\t\u0000\u00ac1\u0001\u0000\u0000"+
					"\u0000\u00ac4\u0001\u0000\u0000\u0000\u00ac7\u0001\u0000\u0000\u0000\u00ac"+
					":\u0001\u0000\u0000\u0000\u00ac@\u0001\u0000\u0000\u0000\u00acA\u0001"+
					"\u0000\u0000\u0000\u00acD\u0001\u0000\u0000\u0000\u00acW\u0001\u0000\u0000"+
					"\u0000\u00acp\u0001\u0000\u0000\u0000\u00ac~\u0001\u0000\u0000\u0000\u00ac"+
					"\u008d\u0001\u0000\u0000\u0000\u00ac\u00a2\u0001\u0000\u0000\u0000\u00ad"+
					"\u0003\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\"\u0011\u0000\u00af\u00b0"+
					"\u0005-\u0000\u0000\u00b0\u00b3\u0003 \u0010\u0000\u00b1\u00b2\u0005\u001a"+
					"\u0000\u0000\u00b2\u00b4\u0003\u000e\u0007\u0000\u00b3\u00b1\u0001\u0000"+
					"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00bd\u0001\u0000"+
					"\u0000\u0000\u00b5\u00b6\u0003\"\u0011\u0000\u00b6\u00b7\u0005-\u0000"+
					"\u0000\u00b7\u00ba\u0005\u000e\u0000\u0000\u00b8\u00b9\u0005\u001a\u0000"+
					"\u0000\u00b9\u00bb\u0003\u0014\n\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
					"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
					"\u00bc\u00ae\u0001\u0000\u0000\u0000\u00bc\u00b5\u0001\u0000\u0000\u0000"+
					"\u00bd\u0005\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\"\u0011\u0000\u00bf"+
					"\u00c0\u0005\u001a\u0000\u0000\u00c0\u00c1\u0003\u000e\u0007\u0000\u00c1"+
					"\u0007\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\"\u0011\u0000\u00c3\u00cc"+
					"\u0005(\u0000\u0000\u00c4\u00c9\u0003\u000e\u0007\u0000\u00c5\u00c6\u0005"+
					",\u0000\u0000\u00c6\u00c8\u0003\u000e\u0007\u0000\u00c7\u00c5\u0001\u0000"+
					"\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
					"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000"+
					"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00c4\u0001\u0000"+
					"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
					"\u0000\u0000\u00ce\u00cf\u0005)\u0000\u0000\u00cf\t\u0001\u0000\u0000"+
					"\u0000\u00d0\u00d1\u00059\u0000\u0000\u00d1\u00d2\u0003\u0010\b\u0000"+
					"\u00d2\u00d6\u0005*\u0000\u0000\u00d3\u00d5\u0003\u0002\u0001\u0000\u00d4"+
					"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6"+
					"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
					"\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
					"\u00da\u0005+\u0000\u0000\u00da\u000b\u0001\u0000\u0000\u0000\u00db\u00df"+
					"\u0005*\u0000\u0000\u00dc\u00de\u0003\u0002\u0001\u0000\u00dd\u00dc\u0001"+
					"\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
					"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001"+
					"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e8\u0005"+
					"+\u0000\u0000\u00e3\u00e4\u00050\u0000\u0000\u00e4\u00e5\u0003\u000e\u0007"+
					"\u0000\u00e5\u00e6\u0005.\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000"+
					"\u00e7\u00db\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000\u0000"+
					"\u00e8\r\u0001\u0000\u0000\u0000\u00e9\u00eb\u0006\u0007\uffff\uffff\u0000"+
					"\u00ea\u00ec\u0005\u0010\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
					"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
					"\u00ed\u00ee\u0005(\u0000\u0000\u00ee\u00ef\u0003\u000e\u0007\u0000\u00ef"+
					"\u00f0\u0005)\u0000\u0000\u00f0\u0144\u0001\u0000\u0000\u0000\u00f1\u00f2"+
					"\u0005\u0014\u0000\u0000\u00f2\u0144\u0003\u000e\u0007$\u00f3\u00f4\u0005"+
					"\u0015\u0000\u0000\u00f4\u0144\u0003\u000e\u0007#\u00f5\u00f8\u0003&\u0013"+
					"\u0000\u00f6\u00f8\u0003\"\u0011\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
					"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
					"\u00f9\u00fc\u0005\u0017\u0000\u0000\u00fa\u00fd\u0003&\u0013\u0000\u00fb"+
					"\u00fd\u0003\"\u0011\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb"+
					"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0101"+
					"\u0005(\u0000\u0000\u00ff\u0102\u0003\u0014\n\u0000\u0100\u0102\u0003"+
					"\"\u0011\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000"+
					"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0005)\u0000"+
					"\u0000\u0104\u0144\u0001\u0000\u0000\u0000\u0105\u0108\u0003&\u0013\u0000"+
					"\u0106\u0108\u0003\"\u0011\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
					"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
					"\u010c\u0005\u0018\u0000\u0000\u010a\u010d\u0003&\u0013\u0000\u010b\u010d"+
					"\u0003\"\u0011\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010b\u0001"+
					"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0111\u0005"+
					"(\u0000\u0000\u010f\u0112\u0003\u0014\n\u0000\u0110\u0112\u0003\"\u0011"+
					"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
					"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0005)\u0000\u0000"+
					"\u0114\u0144\u0001\u0000\u0000\u0000\u0115\u0116\u0005#\u0000\u0000\u0116"+
					"\u0144\u0003\u000e\u0007\u0019\u0117\u0144\u0003\u0010\b\u0000\u0118\u0119"+
					"\u0003\u0010\b\u0000\u0119\u011a\u00050\u0000\u0000\u011a\u011b\u0003"+
					"\u000e\u0007\u0000\u011b\u011c\u0005-\u0000\u0000\u011c\u011d\u0003\u000e"+
					"\u0007\u000b\u011d\u0144\u0001\u0000\u0000\u0000\u011e\u0144\u0003\u0016"+
					"\u000b\u0000\u011f\u0144\u0003\u0018\f\u0000\u0120\u0144\u0003\b\u0004"+
					"\u0000\u0121\u0123\u0005\u0010\u0000\u0000\u0122\u0121\u0001\u0000\u0000"+
					"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
					"\u0000\u0124\u0144\u0003\"\u0011\u0000\u0125\u0144\u0003&\u0013\u0000"+
					"\u0126\u0128\u0005\u0010\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
					"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000"+
					"\u0129\u012b\u0005\u0006\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
					"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
					"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
					"\u012e\u0130\u0005\u0001\u0000\u0000\u012f\u0131\u0005\u0006\u0000\u0000"+
					"\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
					"\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
					"\u0133\u0144\u0001\u0000\u0000\u0000\u0134\u0144\u0003$\u0012\u0000\u0135"+
					"\u0139\u0005\b\u0000\u0000\u0136\u0138\u0003(\u0014\u0000\u0137\u0136"+
					"\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u013a"+
					"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013c"+
					"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0144"+
					"\u0005\b\u0000\u0000\u013d\u013e\u0003\"\u0011\u0000\u013e\u013f\u0005"+
					"\u0014\u0000\u0000\u013f\u0144\u0001\u0000\u0000\u0000\u0140\u0141\u0003"+
					"\"\u0011\u0000\u0141\u0142\u0005\u0015\u0000\u0000\u0142\u0144\u0001\u0000"+
					"\u0000\u0000\u0143\u00e9\u0001\u0000\u0000\u0000\u0143\u00f1\u0001\u0000"+
					"\u0000\u0000\u0143\u00f3\u0001\u0000\u0000\u0000\u0143\u00f7\u0001\u0000"+
					"\u0000\u0000\u0143\u0107\u0001\u0000\u0000\u0000\u0143\u0115\u0001\u0000"+
					"\u0000\u0000\u0143\u0117\u0001\u0000\u0000\u0000\u0143\u0118\u0001\u0000"+
					"\u0000\u0000\u0143\u011e\u0001\u0000\u0000\u0000\u0143\u011f\u0001\u0000"+
					"\u0000\u0000\u0143\u0120\u0001\u0000\u0000\u0000\u0143\u0122\u0001\u0000"+
					"\u0000\u0000\u0143\u0125\u0001\u0000\u0000\u0000\u0143\u0127\u0001\u0000"+
					"\u0000\u0000\u0143\u0134\u0001\u0000\u0000\u0000\u0143\u0135\u0001\u0000"+
					"\u0000\u0000\u0143\u013d\u0001\u0000\u0000\u0000\u0143\u0140\u0001\u0000"+
					"\u0000\u0000\u0144\u0180\u0001\u0000\u0000\u0000\u0145\u0146\n\"\u0000"+
					"\u0000\u0146\u0147\u0005\u0016\u0000\u0000\u0147\u017f\u0003\u000e\u0007"+
					"#\u0148\u0149\n!\u0000\u0000\u0149\u014a\u0005\u0019\u0000\u0000\u014a"+
					"\u017f\u0003\u000e\u0007\"\u014b\u014c\n \u0000\u0000\u014c\u014d\u0005"+
					"\u0011\u0000\u0000\u014d\u017f\u0003\u000e\u0007!\u014e\u014f\n\u001f"+
					"\u0000\u0000\u014f\u0150\u0005\u0012\u0000\u0000\u0150\u017f\u0003\u000e"+
					"\u0007 \u0151\u0152\n\u001e\u0000\u0000\u0152\u0153\u0005\u0013\u0000"+
					"\u0000\u0153\u017f\u0003\u000e\u0007\u001f\u0154\u0155\n\u001d\u0000\u0000"+
					"\u0155\u0156\u0005\u000f\u0000\u0000\u0156\u017f\u0003\u000e\u0007\u001e"+
					"\u0157\u0158\n\u001c\u0000\u0000\u0158\u0159\u0005\u0010\u0000\u0000\u0159"+
					"\u017f\u0003\u000e\u0007\u001d\u015a\u015b\n\u0018\u0000\u0000\u015b\u015c"+
					"\u0005\u001b\u0000\u0000\u015c\u017f\u0003\u000e\u0007\u0019\u015d\u015e"+
					"\n\u0017\u0000\u0000\u015e\u015f\u0005\u001c\u0000\u0000\u015f\u017f\u0003"+
					"\u000e\u0007\u0018\u0160\u0161\n\u0016\u0000\u0000\u0161\u0162\u0005\u001d"+
					"\u0000\u0000\u0162\u017f\u0003\u000e\u0007\u0017\u0163\u0164\n\u0015\u0000"+
					"\u0000\u0164\u0165\u0005\u001e\u0000\u0000\u0165\u017f\u0003\u000e\u0007"+
					"\u0016\u0166\u0167\n\u0014\u0000\u0000\u0167\u0168\u0005\u001f\u0000\u0000"+
					"\u0168\u017f\u0003\u000e\u0007\u0015\u0169\u016a\n\u0013\u0000\u0000\u016a"+
					"\u016b\u0005 \u0000\u0000\u016b\u017f\u0003\u000e\u0007\u0014\u016c\u016d"+
					"\n\u0012\u0000\u0000\u016d\u016e\u0005!\u0000\u0000\u016e\u017f\u0003"+
					"\u000e\u0007\u0013\u016f\u0170\n\u0011\u0000\u0000\u0170\u0171\u0005\""+
					"\u0000\u0000\u0171\u017f\u0003\u000e\u0007\u0012\u0172\u0173\n\u0010\u0000"+
					"\u0000\u0173\u0174\u0005&\u0000\u0000\u0174\u017f\u0003\u000e\u0007\u0011"+
					"\u0175\u0176\n\u000f\u0000\u0000\u0176\u0177\u0005$\u0000\u0000\u0177"+
					"\u017f\u0003\u000e\u0007\u0010\u0178\u0179\n\u000e\u0000\u0000\u0179\u017a"+
					"\u0005%\u0000\u0000\u017a\u017f\u0003\u000e\u0007\u000f\u017b\u017c\n"+
					"\r\u0000\u0000\u017c\u017d\u0005\'\u0000\u0000\u017d\u017f\u0003\u000e"+
					"\u0007\u000e\u017e\u0145\u0001\u0000\u0000\u0000\u017e\u0148\u0001\u0000"+
					"\u0000\u0000\u017e\u014b\u0001\u0000\u0000\u0000\u017e\u014e\u0001\u0000"+
					"\u0000\u0000\u017e\u0151\u0001\u0000\u0000\u0000\u017e\u0154\u0001\u0000"+
					"\u0000\u0000\u017e\u0157\u0001\u0000\u0000\u0000\u017e\u015a\u0001\u0000"+
					"\u0000\u0000\u017e\u015d\u0001\u0000\u0000\u0000\u017e\u0160\u0001\u0000"+
					"\u0000\u0000\u017e\u0163\u0001\u0000\u0000\u0000\u017e\u0166\u0001\u0000"+
					"\u0000\u0000\u017e\u0169\u0001\u0000\u0000\u0000\u017e\u016c\u0001\u0000"+
					"\u0000\u0000\u017e\u016f\u0001\u0000\u0000\u0000\u017e\u0172\u0001\u0000"+
					"\u0000\u0000\u017e\u0175\u0001\u0000\u0000\u0000\u017e\u0178\u0001\u0000"+
					"\u0000\u0000\u017e\u017b\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000"+
					"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
					"\u0000\u0000\u0181\u000f\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000"+
					"\u0000\u0000\u0183\u0184\u0005/\u0000\u0000\u0184\u0185\u0005(\u0000\u0000"+
					"\u0185\u0186\u0003\u000e\u0007\u0000\u0186\u0187\u0005)\u0000\u0000\u0187"+
					"\u0011\u0001\u0000\u0000\u0000\u0188\u0189\u00054\u0000\u0000\u0189\u018a"+
					"\u0005(\u0000\u0000\u018a\u018b\u0003\"\u0011\u0000\u018b\u018c\u0005"+
					")\u0000\u0000\u018c\u0190\u0005*\u0000\u0000\u018d\u018f\u0003\u0002\u0001"+
					"\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000"+
					"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
					"\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000"+
					"\u0000\u0193\u0194\u0005+\u0000\u0000\u0194\u0013\u0001\u0000\u0000\u0000"+
					"\u0195\u0198\u0003\u0016\u000b\u0000\u0196\u0198\u0003\u0018\f\u0000\u0197"+
					"\u0195\u0001\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198"+
					"\u0015\u0001\u0000\u0000\u0000\u0199\u019a\u00051\u0000\u0000\u019a\u019c"+
					"\u0005(\u0000\u0000\u019b\u019d\u0003\u001a\r\u0000\u019c\u019b\u0001"+
					"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
					"\u0000\u0000\u0000\u019e\u01a1\u0005)\u0000\u0000\u019f\u01a0\u00058\u0000"+
					"\u0000\u01a0\u01a2\u0003\"\u0011\u0000\u01a1\u019f\u0001\u0000\u0000\u0000"+
					"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
					"\u01a3\u01a4\u0005-\u0000\u0000\u01a4\u01a5\u0003\u001e\u000f\u0000\u01a5"+
					"\u01a9\u0005*\u0000\u0000\u01a6\u01a8\u0003\u0002\u0001\u0000\u01a7\u01a6"+
					"\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7"+
					"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01b0"+
					"\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad"+
					"\u00052\u0000\u0000\u01ad\u01ae\u0003\u000e\u0007\u0000\u01ae\u01af\u0005"+
					".\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ac\u0001\u0000"+
					"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
					"\u0000\u0000\u01b2\u01b3\u0005+\u0000\u0000\u01b3\u0017\u0001\u0000\u0000"+
					"\u0000\u01b4\u01b5\u00051\u0000\u0000\u01b5\u01b7\u0005(\u0000\u0000\u01b6"+
					"\u01b8\u0003\u001a\r\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8"+
					"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bc"+
					"\u0005)\u0000\u0000\u01ba\u01bb\u00058\u0000\u0000\u01bb\u01bd\u0003\""+
					"\u0011\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000"+
					"\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0005-\u0000"+
					"\u0000\u01bf\u01c0\u0003\u001e\u000f\u0000\u01c0\u01c1\u00050\u0000\u0000"+
					"\u01c1\u01c2\u0003\u000e\u0007\u0000\u01c2\u0019\u0001\u0000\u0000\u0000"+
					"\u01c3\u01c8\u0003\u001c\u000e\u0000\u01c4\u01c5\u0005,\u0000\u0000\u01c5"+
					"\u01c7\u0003\u001c\u000e\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7"+
					"\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8"+
					"\u01c9\u0001\u0000\u0000\u0000\u01c9\u001b\u0001\u0000\u0000\u0000\u01ca"+
					"\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0003\"\u0011\u0000\u01cc\u01cd"+
					"\u0005-\u0000\u0000\u01cd\u01ce\u0003 \u0010\u0000\u01ce\u001d\u0001\u0000"+
					"\u0000\u0000\u01cf\u01d3\u0003 \u0010\u0000\u01d0\u01d3\u0005\u000e\u0000"+
					"\u0000\u01d1\u01d3\u0005\r\u0000\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000"+
					"\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000"+
					"\u01d3\u001f\u0001\u0000\u0000\u0000\u01d4\u01d5\u0007\u0000\u0000\u0000"+
					"\u01d5!\u0001\u0000\u0000\u0000\u01d6\u01da\u0005\u0005\u0000\u0000\u01d7"+
					"\u01d9\u0007\u0001\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9"+
					"\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da"+
					"\u01db\u0001\u0000\u0000\u0000\u01db#\u0001\u0000\u0000\u0000\u01dc\u01da"+
					"\u0001\u0000\u0000\u0000\u01dd\u01de\u0007\u0002\u0000\u0000\u01de%\u0001"+
					"\u0000\u0000\u0000\u01df\u01e1\u0005\u0010\u0000\u0000\u01e0\u01df\u0001"+
					"\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e3\u0001"+
					"\u0000\u0000\u0000\u01e2\u01e4\u0005\u0006\u0000\u0000\u01e3\u01e2\u0001"+
					"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
					"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\'\u0001\u0000"+
					"\u0000\u0000\u01e7\u01e8\u0007\u0003\u0000\u0000\u01e8)\u0001\u0000\u0000"+
					"\u00004-IQU[binw|\u0083\u008b\u009a\u009e\u00a7\u00ac\u00b3\u00ba\u00bc"+
					"\u00c9\u00cc\u00d6\u00df\u00e7\u00eb\u00f7\u00fc\u0101\u0107\u010c\u0111"+
					"\u0122\u0127\u012c\u0132\u0139\u0143\u017e\u0180\u0190\u0197\u019c\u01a1"+
					"\u01a9\u01b0\u01b7\u01bc\u01c8\u01d2\u01da\u01e0\u01e5";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}