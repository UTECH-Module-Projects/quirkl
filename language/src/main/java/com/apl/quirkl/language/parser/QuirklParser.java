// Generated from ./src/main/antlr4/Quirkl.g4 by ANTLR 4.13.1
package com.apl.quirkl.language.parser;

import com.apl.quirkl.language.semantics.visitor.QuirklVisitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QuirklParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0=1, STRING=2, BOOLEAN=3, LETTER=4, DIGIT=5, BOOL_TYPE=6, NUMBER_TYPE=7,
			DECIMAL_TYPE=8, STRING_TYPE=9, VOID_TYPE=10, FUNCTION_TYPE=11, ERROR_TYPE=12,
			PLUS=13, MINUS=14, MULT=15, DIV=16, MOD=17, INC=18, DEC=19, EXP=20, SUMM=21,
			PRODSUMM=22, ROOT=23, ASSIGN=24, EQ=25, NEQ=26, GT=27, LT=28, GTE=29,
			LTE=30, AND=31, OR=32, NOT=33, NAND=34, NOR=35, XOR=36, XNOR=37, LPAREN=38,
			RPAREN=39, LBRACE=40, RBRACE=41, COMMA=42, COLON=43, SEMICOLON=44, QUESTMARK=45,
			ARROW=46, PASS=47, GIVE=48, RUN=49, CATCH=50, CHECK=51, MATCH=52, TO=53,
			IF=54, ELSE=55, IS=56, PRINT=57, WS=58, COMMENT=59, BLOCK_COMMENT=60;
	public static final int
			RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3,
			RULE_functionCall = 4, RULE_ifCondition = 5, RULE_switchCase = 6, RULE_expression = 7,
			RULE_toBool = 8, RULE_catchBody = 9, RULE_function = 10, RULE_functionWithBody = 11,
			RULE_functionWithLambda = 12, RULE_parameters = 13, RULE_parameter = 14,
			RULE_all_data_types = 15, RULE_variable_data_type = 16, RULE_id = 17,
			RULE_number = 18, RULE_decimal = 19, RULE_keywords = 20;
	private static String[] makeRuleNames() {
		return new String[] {
				"program", "statement", "declaration", "assignment", "functionCall",
				"ifCondition", "switchCase", "expression", "toBool", "catchBody", "function",
				"functionWithBody", "functionWithLambda", "parameters", "parameter",
				"all_data_types", "variable_data_type", "id", "number", "decimal", "keywords"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'.'", null, null, null, null, "'bool'", "'num'", "'dec'", "'str'",
				"'void'", "'func'", "'err'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'",
				"'--'", "'/\\'", "'~'", "'~*'", "'\\/'", "'='", "'=='", "'!='", "'>'",
				"'<'", "'>='", "'<='", "'&'", "'|'", "'!'", "'!&'", "'!|'", "'^'", "'!^'",
				"'('", "')'", "'{'", "'}'", "','", "':'", "';'", "'?'", "'->'", "'pass'",
				"'give'", "'run'", "'catch'", "'check'", "'match'", "'to'", "'if'", "'else'",
				"'is'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, "STRING", "BOOLEAN", "LETTER", "DIGIT", "BOOL_TYPE", "NUMBER_TYPE",
				"DECIMAL_TYPE", "STRING_TYPE", "VOID_TYPE", "FUNCTION_TYPE", "ERROR_TYPE",
				"PLUS", "MINUS", "MULT", "DIV", "MOD", "INC", "DEC", "EXP", "SUMM", "PRODSUMM",
				"ROOT", "ASSIGN", "EQ", "NEQ", "GT", "LT", "GTE", "LTE", "AND", "OR",
				"NOT", "NAND", "NOR", "XOR", "XNOR", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
				"COMMA", "COLON", "SEMICOLON", "QUESTMARK", "ARROW", "PASS", "GIVE",
				"RUN", "CATCH", "CHECK", "MATCH", "TO", "IF", "ELSE", "IS", "PRINT",
				"WS", "COMMENT", "BLOCK_COMMENT"
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0) );
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
	public static class ErrorStatementContext extends StatementContext {
		public TerminalNode ERROR_TYPE() { return getToken(QuirklParser.ERROR_TYPE, 0); }
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public ErrorStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitErrorStatement(this);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					_localctx = new ErrorStatementContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(49);
					match(ERROR_TYPE);
					setState(50);
					match(COLON);
					setState(51);
					expression(0);
					setState(52);
					match(SEMICOLON);
				}
				break;
				case 2:
					_localctx = new PrintStatementContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(54);
					match(PRINT);
					setState(55);
					match(LPAREN);
					setState(56);
					expression(0);
					setState(57);
					match(RPAREN);
					setState(58);
					match(SEMICOLON);
				}
				break;
				case 3:
					_localctx = new IfStatementContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(60);
					ifCondition();
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								{
									setState(61);
									match(ELSE);
									setState(62);
									ifCondition();
								}
							}
						}
						setState(67);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
						{
							setState(68);
							match(ELSE);
							setState(69);
							match(LBRACE);
							setState(73);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
								{
									{
										setState(70);
										statement();
									}
								}
								setState(75);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(76);
							match(RBRACE);
						}
						break;
					}
				}
				break;
				case 4:
					_localctx = new ForLoopContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(79);
					match(RUN);
					setState(80);
					match(LPAREN);
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
						{
							setState(81);
							declaration();
						}
						break;
						case 2:
						{
							setState(82);
							expression(0);
						}
						break;
					}
					setState(85);
					match(SEMICOLON);
					setState(86);
					toBool();
					setState(87);
					match(SEMICOLON);
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
						{
							setState(88);
							assignment();
						}
						break;
						case 2:
						{
							setState(89);
							expression(0);
						}
						break;
					}
					setState(92);
					match(RPAREN);
					setState(93);
					match(LBRACE);
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
						{
							{
								setState(94);
								statement();
							}
						}
						setState(99);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(100);
					match(RBRACE);
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
						{
							setState(101);
							catchBody();
						}
						break;
					}
				}
				break;
				case 5:
					_localctx = new WhileLoopContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(104);
					match(RUN);
					setState(105);
					match(CHECK);
					setState(106);
					toBool();
					setState(107);
					match(LBRACE);
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
						{
							{
								setState(108);
								statement();
							}
						}
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(114);
					match(RBRACE);
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
						{
							setState(115);
							catchBody();
						}
						break;
					}
				}
				break;
				case 6:
					_localctx = new DoWhileLoopContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(118);
					match(RUN);
					setState(119);
					match(LBRACE);
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
						{
							{
								setState(120);
								statement();
							}
						}
						setState(125);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(126);
					match(RBRACE);
					setState(127);
					match(CHECK);
					setState(128);
					toBool();
					setState(131);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case SEMICOLON:
						{
							setState(129);
							match(SEMICOLON);
						}
						break;
						case CATCH:
						{
							setState(130);
							catchBody();
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
				}
				break;
				case 7:
					_localctx = new SwitchContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(133);
					match(MATCH);
					setState(134);
					match(LPAREN);
					setState(135);
					expression(0);
					setState(136);
					match(RPAREN);
					setState(137);
					match(LBRACE);
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(138);
								match(IS);
								setState(139);
								match(LPAREN);
								setState(140);
								expression(0);
								setState(141);
								match(RPAREN);
								setState(142);
								switchCase();
							}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==IS );
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ELSE) {
						{
							setState(148);
							match(ELSE);
							setState(149);
							switchCase();
						}
					}

					setState(152);
					match(RBRACE);
				}
				break;
				case 8:
					_localctx = new RunCatchContext(_localctx);
					enterOuterAlt(_localctx, 8);
				{
					setState(154);
					match(RUN);
					setState(155);
					match(LBRACE);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
						{
							{
								setState(156);
								statement();
							}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(162);
					match(RBRACE);
					setState(163);
					catchBody();
				}
				break;
				case 9:
					_localctx = new DeclarationStatementContext(_localctx);
					enterOuterAlt(_localctx, 9);
				{
					setState(164);
					declaration();
					setState(165);
					match(SEMICOLON);
				}
				break;
				case 10:
					_localctx = new AssignmentStatementContext(_localctx);
					enterOuterAlt(_localctx, 10);
				{
					setState(167);
					assignment();
					setState(168);
					match(SEMICOLON);
				}
				break;
				case 11:
					_localctx = new FunctionCallStatementContext(_localctx);
					enterOuterAlt(_localctx, 11);
				{
					setState(170);
					functionCall();
					setState(171);
					match(SEMICOLON);
				}
				break;
				case 12:
					_localctx = new FunctionWithBodyStatementContext(_localctx);
					enterOuterAlt(_localctx, 12);
				{
					setState(173);
					functionWithBody();
				}
				break;
				case 13:
					_localctx = new FunctionWithLambdaStatementContext(_localctx);
					enterOuterAlt(_localctx, 13);
				{
					setState(174);
					functionWithLambda();
					setState(175);
					match(SEMICOLON);
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
	public static class VariableDeclarationContext extends DeclarationContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QuirklParser.COLON, 0); }
		public Variable_data_typeContext variable_data_type() {
			return getRuleContext(Variable_data_typeContext.class,0);
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
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
				setState(179);
				id();
				setState(180);
				match(COLON);
				setState(181);
				variable_data_type();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
						setState(182);
						match(ASSIGN);
						setState(183);
						expression(0);
					}
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
				setState(186);
				id();
				setState(187);
				match(ASSIGN);
				setState(188);
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
				setState(190);
				id();
				setState(191);
				match(LPAREN);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288125106504097788L) != 0)) {
					{
						setState(192);
						expression(0);
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
								{
									setState(193);
									match(COMMA);
									setState(194);
									expression(0);
								}
							}
							setState(199);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(202);
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
				setState(204);
				match(IF);
				setState(205);
				toBool();
				setState(206);
				match(LBRACE);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
					{
						{
							setState(207);
							statement();
						}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					_localctx = new SwitchCaseWithBodyContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(215);
					match(LBRACE);
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
						{
							{
								setState(216);
								statement();
							}
						}
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(222);
					match(RBRACE);
				}
				break;
				case ARROW:
					_localctx = new SwitchCaseWithLambdaContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(223);
					match(ARROW);
					setState(224);
					statement();
					setState(225);
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
		public TerminalNode STRING() { return getToken(QuirklParser.STRING, 0); }
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
		public TerminalNode BOOLEAN() { return getToken(QuirklParser.BOOLEAN, 0); }
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
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
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
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
					{
						_localctx = new BracketExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUS) {
							{
								setState(230);
								match(MINUS);
							}
						}

						setState(233);
						match(LPAREN);
						setState(234);
						expression(0);
						setState(235);
						match(RPAREN);
					}
					break;
					case 2:
					{
						_localctx = new IncrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(237);
						match(INC);
						setState(238);
						expression(36);
					}
					break;
					case 3:
					{
						_localctx = new DecrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(239);
						match(DEC);
						setState(240);
						expression(35);
					}
					break;
					case 4:
					{
						_localctx = new SummationExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(243);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(241);
								number();
							}
							break;
							case LETTER:
							case BOOL_TYPE:
							case NUMBER_TYPE:
							case DECIMAL_TYPE:
							case STRING_TYPE:
							case VOID_TYPE:
							case FUNCTION_TYPE:
							case ERROR_TYPE:
							case PASS:
							case GIVE:
							case RUN:
							case CATCH:
							case CHECK:
							case MATCH:
							case TO:
							case IF:
							case ELSE:
							case IS:
							case PRINT:
							{
								setState(242);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(245);
						match(SUMM);
						setState(248);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(246);
								number();
							}
							break;
							case LETTER:
							case BOOL_TYPE:
							case NUMBER_TYPE:
							case DECIMAL_TYPE:
							case STRING_TYPE:
							case VOID_TYPE:
							case FUNCTION_TYPE:
							case ERROR_TYPE:
							case PASS:
							case GIVE:
							case RUN:
							case CATCH:
							case CHECK:
							case MATCH:
							case TO:
							case IF:
							case ELSE:
							case IS:
							case PRINT:
							{
								setState(247);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(250);
						match(LPAREN);
						setState(253);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
							case 1:
							{
								setState(251);
								function();
							}
							break;
							case 2:
							{
								setState(252);
								id();
							}
							break;
						}
						setState(255);
						match(RPAREN);
					}
					break;
					case 5:
					{
						_localctx = new ProdSummationExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(259);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(257);
								number();
							}
							break;
							case LETTER:
							case BOOL_TYPE:
							case NUMBER_TYPE:
							case DECIMAL_TYPE:
							case STRING_TYPE:
							case VOID_TYPE:
							case FUNCTION_TYPE:
							case ERROR_TYPE:
							case PASS:
							case GIVE:
							case RUN:
							case CATCH:
							case CHECK:
							case MATCH:
							case TO:
							case IF:
							case ELSE:
							case IS:
							case PRINT:
							{
								setState(258);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(261);
						match(PRODSUMM);
						setState(264);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(262);
								number();
							}
							break;
							case LETTER:
							case BOOL_TYPE:
							case NUMBER_TYPE:
							case DECIMAL_TYPE:
							case STRING_TYPE:
							case VOID_TYPE:
							case FUNCTION_TYPE:
							case ERROR_TYPE:
							case PASS:
							case GIVE:
							case RUN:
							case CATCH:
							case CHECK:
							case MATCH:
							case TO:
							case IF:
							case ELSE:
							case IS:
							case PRINT:
							{
								setState(263);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(266);
						match(LPAREN);
						setState(269);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
							case 1:
							{
								setState(267);
								function();
							}
							break;
							case 2:
							{
								setState(268);
								id();
							}
							break;
						}
						setState(271);
						match(RPAREN);
					}
					break;
					case 6:
					{
						_localctx = new NotBooleanExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(273);
						match(NOT);
						setState(274);
						expression(25);
					}
					break;
					case 7:
					{
						_localctx = new ToBoolExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(275);
						toBool();
					}
					break;
					case 8:
					{
						_localctx = new TernaryOperatorExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(276);
						toBool();
						setState(277);
						match(ARROW);
						setState(278);
						expression(0);
						setState(279);
						match(COLON);
						setState(280);
						expression(11);
					}
					break;
					case 9:
					{
						_localctx = new FunctionWithBodyExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(282);
						functionWithBody();
					}
					break;
					case 10:
					{
						_localctx = new FunctionWithLambdaExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(283);
						functionWithLambda();
					}
					break;
					case 11:
					{
						_localctx = new FunctionCallExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(284);
						functionCall();
					}
					break;
					case 12:
					{
						_localctx = new VariableExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUS) {
							{
								setState(285);
								match(MINUS);
							}
						}

						setState(288);
						id();
					}
					break;
					case 13:
					{
						_localctx = new NumberLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(289);
						number();
					}
					break;
					case 14:
					{
						_localctx = new DecimalLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(290);
						decimal();
					}
					break;
					case 15:
					{
						_localctx = new BooleanLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(291);
						match(BOOLEAN);
					}
					break;
					case 16:
					{
						_localctx = new StringLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(292);
						match(STRING);
					}
					break;
					case 17:
					{
						_localctx = new LateIncrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(293);
						id();
						setState(294);
						match(INC);
					}
					break;
					case 18:
					{
						_localctx = new LateDecrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(296);
						id();
						setState(297);
						match(DEC);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(358);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
								case 1:
								{
									_localctx = new ExponentExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(301);
									if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
									setState(302);
									match(EXP);
									setState(303);
									expression(35);
								}
								break;
								case 2:
								{
									_localctx = new RootExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(304);
									if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
									setState(305);
									match(ROOT);
									setState(306);
									expression(34);
								}
								break;
								case 3:
								{
									_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(307);
									if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
									setState(308);
									match(MULT);
									setState(309);
									expression(33);
								}
								break;
								case 4:
								{
									_localctx = new DivisionExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(310);
									if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
									setState(311);
									match(DIV);
									setState(312);
									expression(32);
								}
								break;
								case 5:
								{
									_localctx = new ModulusExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(313);
									if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
									setState(314);
									match(MOD);
									setState(315);
									expression(31);
								}
								break;
								case 6:
								{
									_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(316);
									if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
									setState(317);
									match(PLUS);
									setState(318);
									expression(30);
								}
								break;
								case 7:
								{
									_localctx = new SubtractionExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(319);
									if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
									setState(320);
									match(MINUS);
									setState(321);
									expression(29);
								}
								break;
								case 8:
								{
									_localctx = new EqualsBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(322);
									if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
									setState(323);
									match(EQ);
									setState(324);
									expression(25);
								}
								break;
								case 9:
								{
									_localctx = new NotEqualsBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(325);
									if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
									setState(326);
									match(NEQ);
									setState(327);
									expression(24);
								}
								break;
								case 10:
								{
									_localctx = new GreaterThanBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(328);
									if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
									setState(329);
									match(GT);
									setState(330);
									expression(23);
								}
								break;
								case 11:
								{
									_localctx = new LessThanBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(331);
									if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
									setState(332);
									match(LT);
									setState(333);
									expression(22);
								}
								break;
								case 12:
								{
									_localctx = new GreaterThanOrEqualsBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(334);
									if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
									setState(335);
									match(GTE);
									setState(336);
									expression(21);
								}
								break;
								case 13:
								{
									_localctx = new LessThanOrEqualsBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(337);
									if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
									setState(338);
									match(LTE);
									setState(339);
									expression(20);
								}
								break;
								case 14:
								{
									_localctx = new AndBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(340);
									if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
									setState(341);
									match(AND);
									setState(342);
									expression(19);
								}
								break;
								case 15:
								{
									_localctx = new OrBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(343);
									if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
									setState(344);
									match(OR);
									setState(345);
									expression(18);
								}
								break;
								case 16:
								{
									_localctx = new XorBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(346);
									if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
									setState(347);
									match(XOR);
									setState(348);
									expression(17);
								}
								break;
								case 17:
								{
									_localctx = new NandBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(349);
									if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
									setState(350);
									match(NAND);
									setState(351);
									expression(16);
								}
								break;
								case 18:
								{
									_localctx = new NorBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(352);
									if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
									setState(353);
									match(NOR);
									setState(354);
									expression(15);
								}
								break;
								case 19:
								{
									_localctx = new XnorBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(355);
									if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
									setState(356);
									match(XNOR);
									setState(357);
									expression(14);
								}
								break;
							}
						}
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
				setState(363);
				match(QUESTMARK);
				setState(364);
				match(LPAREN);
				setState(365);
				expression(0);
				setState(366);
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
				setState(368);
				match(CATCH);
				setState(369);
				match(LPAREN);
				setState(370);
				id();
				setState(371);
				match(RPAREN);
				setState(372);
				match(LBRACE);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
					{
						{
							setState(373);
							statement();
						}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
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
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(381);
					functionWithBody();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(382);
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
		public All_data_typesContext all_data_types() {
			return getRuleContext(All_data_typesContext.class,0);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(385);
				match(PASS);
				setState(386);
				match(LPAREN);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
					{
						setState(387);
						parameters();
					}
				}

				setState(390);
				match(RPAREN);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
						setState(391);
						match(TO);
						setState(392);
						id();
					}
				}

				setState(395);
				match(COLON);
				setState(396);
				all_data_types();
				setState(397);
				match(LBRACE);
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(398);
								statement();
							}
						}
					}
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GIVE) {
					{
						setState(404);
						match(GIVE);
						setState(405);
						expression(0);
						setState(406);
						match(SEMICOLON);
					}
				}

				setState(410);
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
		public All_data_typesContext all_data_types() {
			return getRuleContext(All_data_typesContext.class,0);
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
				setState(412);
				match(PASS);
				setState(413);
				match(LPAREN);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288089638663364560L) != 0)) {
					{
						setState(414);
						parameters();
					}
				}

				setState(417);
				match(RPAREN);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
						setState(418);
						match(TO);
						setState(419);
						id();
					}
				}

				setState(422);
				match(COLON);
				setState(423);
				all_data_types();
				setState(424);
				match(ARROW);
				setState(425);
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
				setState(427);
				parameter();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(428);
							match(COMMA);
							setState(429);
							parameter();
						}
					}
					setState(434);
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
		public Variable_data_typeContext variable_data_type() {
			return getRuleContext(Variable_data_typeContext.class,0);
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
				setState(435);
				id();
				setState(436);
				match(COLON);
				setState(437);
				variable_data_type();
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
	public static class All_data_typesContext extends ParserRuleContext {
		public Variable_data_typeContext variable_data_type() {
			return getRuleContext(Variable_data_typeContext.class,0);
		}
		public TerminalNode VOID_TYPE() { return getToken(QuirklParser.VOID_TYPE, 0); }
		public All_data_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_data_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitAll_data_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_data_typesContext all_data_types() throws RecognitionException {
		All_data_typesContext _localctx = new All_data_typesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_all_data_types);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOL_TYPE:
				case NUMBER_TYPE:
				case DECIMAL_TYPE:
				case STRING_TYPE:
				case FUNCTION_TYPE:
					enterOuterAlt(_localctx, 1);
				{
					setState(439);
					variable_data_type();
				}
				break;
				case VOID_TYPE:
					enterOuterAlt(_localctx, 2);
				{
					setState(440);
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
	public static class Variable_data_typeContext extends ParserRuleContext {
		public TerminalNode BOOL_TYPE() { return getToken(QuirklParser.BOOL_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(QuirklParser.NUMBER_TYPE, 0); }
		public TerminalNode DECIMAL_TYPE() { return getToken(QuirklParser.DECIMAL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(QuirklParser.STRING_TYPE, 0); }
		public TerminalNode FUNCTION_TYPE() { return getToken(QuirklParser.FUNCTION_TYPE, 0); }
		public Variable_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitVariable_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_data_typeContext variable_data_type() throws RecognitionException {
		Variable_data_typeContext _localctx = new Variable_data_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(443);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3008L) != 0)) ) {
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
		public List<KeywordsContext> keywords() {
			return getRuleContexts(KeywordsContext.class);
		}
		public KeywordsContext keywords(int i) {
			return getRuleContext(KeywordsContext.class,i);
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
				setState(449);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LETTER:
					{
						setState(445);
						match(LETTER);
					}
					break;
					case BOOL_TYPE:
					case NUMBER_TYPE:
					case DECIMAL_TYPE:
					case STRING_TYPE:
					case VOID_TYPE:
					case FUNCTION_TYPE:
					case ERROR_TYPE:
					case PASS:
					case GIVE:
					case RUN:
					case CATCH:
					case CHECK:
					case MATCH:
					case TO:
					case IF:
					case ELSE:
					case IS:
					case PRINT:
					{
						{
							setState(446);
							keywords();
							setState(447);
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
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							setState(454);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
								case BOOL_TYPE:
								case NUMBER_TYPE:
								case DECIMAL_TYPE:
								case STRING_TYPE:
								case VOID_TYPE:
								case FUNCTION_TYPE:
								case ERROR_TYPE:
								case PASS:
								case GIVE:
								case RUN:
								case CATCH:
								case CHECK:
								case MATCH:
								case TO:
								case IF:
								case ELSE:
								case IS:
								case PRINT:
								{
									setState(451);
									keywords();
								}
								break;
								case LETTER:
								{
									setState(452);
									match(LETTER);
								}
								break;
								case DIGIT:
								{
									setState(453);
									match(DIGIT);
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
						}
					}
					setState(458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
						setState(459);
						match(MINUS);
					}
				}

				setState(463);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1:
						{
							{
								setState(462);
								match(DIGIT);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(465);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(QuirklParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(QuirklParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirklParser.DIGIT, i);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decimal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
						setState(467);
						match(MINUS);
					}
				}

				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(470);
							match(DIGIT);
						}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(475);
				match(T__0);
				setState(477);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1:
						{
							{
								setState(476);
								match(DIGIT);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(479);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
	public static class KeywordsContext extends ParserRuleContext {
		public All_data_typesContext all_data_types() {
			return getRuleContext(All_data_typesContext.class,0);
		}
		public TerminalNode PASS() { return getToken(QuirklParser.PASS, 0); }
		public TerminalNode GIVE() { return getToken(QuirklParser.GIVE, 0); }
		public TerminalNode RUN() { return getToken(QuirklParser.RUN, 0); }
		public TerminalNode CATCH() { return getToken(QuirklParser.CATCH, 0); }
		public TerminalNode CHECK() { return getToken(QuirklParser.CHECK, 0); }
		public TerminalNode MATCH() { return getToken(QuirklParser.MATCH, 0); }
		public TerminalNode TO() { return getToken(QuirklParser.TO, 0); }
		public TerminalNode IF() { return getToken(QuirklParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(QuirklParser.ELSE, 0); }
		public TerminalNode IS() { return getToken(QuirklParser.IS, 0); }
		public TerminalNode PRINT() { return getToken(QuirklParser.PRINT, 0); }
		public TerminalNode ERROR_TYPE() { return getToken(QuirklParser.ERROR_TYPE, 0); }
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitKeywords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_keywords);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOL_TYPE:
				case NUMBER_TYPE:
				case DECIMAL_TYPE:
				case STRING_TYPE:
				case VOID_TYPE:
				case FUNCTION_TYPE:
					enterOuterAlt(_localctx, 1);
				{
					setState(481);
					all_data_types();
				}
				break;
				case PASS:
					enterOuterAlt(_localctx, 2);
				{
					setState(482);
					match(PASS);
				}
				break;
				case GIVE:
					enterOuterAlt(_localctx, 3);
				{
					setState(483);
					match(GIVE);
				}
				break;
				case RUN:
					enterOuterAlt(_localctx, 4);
				{
					setState(484);
					match(RUN);
				}
				break;
				case CATCH:
					enterOuterAlt(_localctx, 5);
				{
					setState(485);
					match(CATCH);
				}
				break;
				case CHECK:
					enterOuterAlt(_localctx, 6);
				{
					setState(486);
					match(CHECK);
				}
				break;
				case MATCH:
					enterOuterAlt(_localctx, 7);
				{
					setState(487);
					match(MATCH);
				}
				break;
				case TO:
					enterOuterAlt(_localctx, 8);
				{
					setState(488);
					match(TO);
				}
				break;
				case IF:
					enterOuterAlt(_localctx, 9);
				{
					setState(489);
					match(IF);
				}
				break;
				case ELSE:
					enterOuterAlt(_localctx, 10);
				{
					setState(490);
					match(ELSE);
				}
				break;
				case IS:
					enterOuterAlt(_localctx, 11);
				{
					setState(491);
					match(IS);
				}
				break;
				case PRINT:
					enterOuterAlt(_localctx, 12);
				{
					setState(492);
					match(PRINT);
				}
				break;
				case ERROR_TYPE:
					enterOuterAlt(_localctx, 13);
				{
					setState(493);
					match(ERROR_TYPE);
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
			"\u0004\u0001<\u01f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
					"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
					"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
					"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
					"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
					"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004\u0000"+
					",\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0005\u0001H\b\u0001\n\u0001\f\u0001K\t\u0001\u0001"+
					"\u0001\u0003\u0001N\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0003\u0001T\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0005\u0001`\b\u0001\n\u0001\f\u0001c\t\u0001\u0001\u0001\u0001"+
					"\u0001\u0003\u0001g\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0005\u0001n\b\u0001\n\u0001\f\u0001q\t\u0001\u0001"+
					"\u0001\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0005\u0001z\b\u0001\n\u0001\f\u0001}\t\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0084\b\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0091"+
					"\b\u0001\u000b\u0001\f\u0001\u0092\u0001\u0001\u0001\u0001\u0003\u0001"+
					"\u0097\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0005\u0001\u009e\b\u0001\n\u0001\f\u0001\u00a1\t\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0003\u0001\u00b2\b\u0001\u0001\u0002\u0001\u0002\u0001"+
					"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b9\b\u0002\u0001\u0003\u0001"+
					"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
					"\u0004\u0001\u0004\u0005\u0004\u00c4\b\u0004\n\u0004\f\u0004\u00c7\t\u0004"+
					"\u0003\u0004\u00c9\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
					"\u0001\u0005\u0001\u0005\u0005\u0005\u00d1\b\u0005\n\u0005\f\u0005\u00d4"+
					"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u00da"+
					"\b\u0006\n\u0006\f\u0006\u00dd\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
					"\u0001\u0006\u0001\u0006\u0003\u0006\u00e4\b\u0006\u0001\u0007\u0001\u0007"+
					"\u0003\u0007\u00e8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0003\u0007\u00f4\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
					"\u00f9\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00fe\b"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0104"+
					"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0109\b\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010e\b\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0003\u0007\u011f\b\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u012c\b\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0005\u0007\u0167\b\u0007\n\u0007\f\u0007\u016a"+
					"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
					"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0177\b\t\n\t\f\t\u017a\t\t\u0001\t"+
					"\u0001\t\u0001\n\u0001\n\u0003\n\u0180\b\n\u0001\u000b\u0001\u000b\u0001"+
					"\u000b\u0003\u000b\u0185\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
					"\u000b\u018a\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
					"\u000b\u0190\b\u000b\n\u000b\f\u000b\u0193\t\u000b\u0001\u000b\u0001\u000b"+
					"\u0001\u000b\u0001\u000b\u0003\u000b\u0199\b\u000b\u0001\u000b\u0001\u000b"+
					"\u0001\f\u0001\f\u0001\f\u0003\f\u01a0\b\f\u0001\f\u0001\f\u0001\f\u0003"+
					"\f\u01a5\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
					"\r\u0005\r\u01af\b\r\n\r\f\r\u01b2\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
					"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u01ba\b\u000f\u0001\u0010"+
					"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
					"\u01c2\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01c7\b"+
					"\u0011\n\u0011\f\u0011\u01ca\t\u0011\u0001\u0012\u0003\u0012\u01cd\b\u0012"+
					"\u0001\u0012\u0004\u0012\u01d0\b\u0012\u000b\u0012\f\u0012\u01d1\u0001"+
					"\u0013\u0003\u0013\u01d5\b\u0013\u0001\u0013\u0004\u0013\u01d8\b\u0013"+
					"\u000b\u0013\f\u0013\u01d9\u0001\u0013\u0001\u0013\u0004\u0013\u01de\b"+
					"\u0013\u000b\u0013\f\u0013\u01df\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
					"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
					"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01ef\b\u0014\u0001"+
					"\u0014\u0000\u0001\u000e\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
					"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0002\u0002\u0000"+
					"\u0006\t\u000b\u000b\u0001\u0000\u0004\u0005\u0249\u0000+\u0001\u0000"+
					"\u0000\u0000\u0002\u00b1\u0001\u0000\u0000\u0000\u0004\u00b3\u0001\u0000"+
					"\u0000\u0000\u0006\u00ba\u0001\u0000\u0000\u0000\b\u00be\u0001\u0000\u0000"+
					"\u0000\n\u00cc\u0001\u0000\u0000\u0000\f\u00e3\u0001\u0000\u0000\u0000"+
					"\u000e\u012b\u0001\u0000\u0000\u0000\u0010\u016b\u0001\u0000\u0000\u0000"+
					"\u0012\u0170\u0001\u0000\u0000\u0000\u0014\u017f\u0001\u0000\u0000\u0000"+
					"\u0016\u0181\u0001\u0000\u0000\u0000\u0018\u019c\u0001\u0000\u0000\u0000"+
					"\u001a\u01ab\u0001\u0000\u0000\u0000\u001c\u01b3\u0001\u0000\u0000\u0000"+
					"\u001e\u01b9\u0001\u0000\u0000\u0000 \u01bb\u0001\u0000\u0000\u0000\""+
					"\u01c1\u0001\u0000\u0000\u0000$\u01cc\u0001\u0000\u0000\u0000&\u01d4\u0001"+
					"\u0000\u0000\u0000(\u01ee\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001"+
					"\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000"+
					"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005"+
					"\u0000\u0000\u00010\u0001\u0001\u0000\u0000\u000012\u0005\f\u0000\u0000"+
					"23\u0005+\u0000\u000034\u0003\u000e\u0007\u000045\u0005,\u0000\u00005"+
					"\u00b2\u0001\u0000\u0000\u000067\u00059\u0000\u000078\u0005&\u0000\u0000"+
					"89\u0003\u000e\u0007\u00009:\u0005\'\u0000\u0000:;\u0005,\u0000\u0000"+
					";\u00b2\u0001\u0000\u0000\u0000<A\u0003\n\u0005\u0000=>\u00057\u0000\u0000"+
					">@\u0003\n\u0005\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
					"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BM\u0001\u0000\u0000"+
					"\u0000CA\u0001\u0000\u0000\u0000DE\u00057\u0000\u0000EI\u0005(\u0000\u0000"+
					"FH\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
					"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000"+
					"\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0005)\u0000\u0000MD\u0001\u0000"+
					"\u0000\u0000MN\u0001\u0000\u0000\u0000N\u00b2\u0001\u0000\u0000\u0000"+
					"OP\u00051\u0000\u0000PS\u0005&\u0000\u0000QT\u0003\u0004\u0002\u0000R"+
					"T\u0003\u000e\u0007\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000"+
					"\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005,\u0000"+
					"\u0000VW\u0003\u0010\b\u0000WZ\u0005,\u0000\u0000X[\u0003\u0006\u0003"+
					"\u0000Y[\u0003\u000e\u0007\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000"+
					"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005"+
					"\'\u0000\u0000]a\u0005(\u0000\u0000^`\u0003\u0002\u0001\u0000_^\u0001"+
					"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
					"ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
					"\u0000df\u0005)\u0000\u0000eg\u0003\u0012\t\u0000fe\u0001\u0000\u0000"+
					"\u0000fg\u0001\u0000\u0000\u0000g\u00b2\u0001\u0000\u0000\u0000hi\u0005"+
					"1\u0000\u0000ij\u00053\u0000\u0000jk\u0003\u0010\b\u0000ko\u0005(\u0000"+
					"\u0000ln\u0003\u0002\u0001\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000"+
					"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001"+
					"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0005)\u0000\u0000su\u0003"+
					"\u0012\t\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u00b2"+
					"\u0001\u0000\u0000\u0000vw\u00051\u0000\u0000w{\u0005(\u0000\u0000xz\u0003"+
					"\u0002\u0001\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
					"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
					"\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005)\u0000\u0000\u007f\u0080"+
					"\u00053\u0000\u0000\u0080\u0083\u0003\u0010\b\u0000\u0081\u0084\u0005"+
					",\u0000\u0000\u0082\u0084\u0003\u0012\t\u0000\u0083\u0081\u0001\u0000"+
					"\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u00b2\u0001\u0000"+
					"\u0000\u0000\u0085\u0086\u00054\u0000\u0000\u0086\u0087\u0005&\u0000\u0000"+
					"\u0087\u0088\u0003\u000e\u0007\u0000\u0088\u0089\u0005\'\u0000\u0000\u0089"+
					"\u0090\u0005(\u0000\u0000\u008a\u008b\u00058\u0000\u0000\u008b\u008c\u0005"+
					"&\u0000\u0000\u008c\u008d\u0003\u000e\u0007\u0000\u008d\u008e\u0005\'"+
					"\u0000\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f\u0091\u0001\u0000\u0000"+
					"\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
					"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
					"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0095\u00057\u0000\u0000"+
					"\u0095\u0097\u0003\f\u0006\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
					"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
					"\u0099\u0005)\u0000\u0000\u0099\u00b2\u0001\u0000\u0000\u0000\u009a\u009b"+
					"\u00051\u0000\u0000\u009b\u009f\u0005(\u0000\u0000\u009c\u009e\u0003\u0002"+
					"\u0001\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000"+
					"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
					"\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
					"\u0000\u0000\u00a2\u00a3\u0005)\u0000\u0000\u00a3\u00b2\u0003\u0012\t"+
					"\u0000\u00a4\u00a5\u0003\u0004\u0002\u0000\u00a5\u00a6\u0005,\u0000\u0000"+
					"\u00a6\u00b2\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\u0006\u0003\u0000"+
					"\u00a8\u00a9\u0005,\u0000\u0000\u00a9\u00b2\u0001\u0000\u0000\u0000\u00aa"+
					"\u00ab\u0003\b\u0004\u0000\u00ab\u00ac\u0005,\u0000\u0000\u00ac\u00b2"+
					"\u0001\u0000\u0000\u0000\u00ad\u00b2\u0003\u0016\u000b\u0000\u00ae\u00af"+
					"\u0003\u0018\f\u0000\u00af\u00b0\u0005,\u0000\u0000\u00b0\u00b2\u0001"+
					"\u0000\u0000\u0000\u00b11\u0001\u0000\u0000\u0000\u00b16\u0001\u0000\u0000"+
					"\u0000\u00b1<\u0001\u0000\u0000\u0000\u00b1O\u0001\u0000\u0000\u0000\u00b1"+
					"h\u0001\u0000\u0000\u0000\u00b1v\u0001\u0000\u0000\u0000\u00b1\u0085\u0001"+
					"\u0000\u0000\u0000\u00b1\u009a\u0001\u0000\u0000\u0000\u00b1\u00a4\u0001"+
					"\u0000\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000\u0000\u00b1\u00aa\u0001"+
					"\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001"+
					"\u0000\u0000\u0000\u00b2\u0003\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003"+
					"\"\u0011\u0000\u00b4\u00b5\u0005+\u0000\u0000\u00b5\u00b8\u0003 \u0010"+
					"\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7\u00b9\u0003\u000e\u0007"+
					"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
					"\u0000\u00b9\u0005\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\"\u0011\u0000"+
					"\u00bb\u00bc\u0005\u0018\u0000\u0000\u00bc\u00bd\u0003\u000e\u0007\u0000"+
					"\u00bd\u0007\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\"\u0011\u0000\u00bf"+
					"\u00c8\u0005&\u0000\u0000\u00c0\u00c5\u0003\u000e\u0007\u0000\u00c1\u00c2"+
					"\u0005*\u0000\u0000\u00c2\u00c4\u0003\u000e\u0007\u0000\u00c3\u00c1\u0001"+
					"\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
					"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001"+
					"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c0\u0001"+
					"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
					"\u0000\u0000\u0000\u00ca\u00cb\u0005\'\u0000\u0000\u00cb\t\u0001\u0000"+
					"\u0000\u0000\u00cc\u00cd\u00056\u0000\u0000\u00cd\u00ce\u0003\u0010\b"+
					"\u0000\u00ce\u00d2\u0005(\u0000\u0000\u00cf\u00d1\u0003\u0002\u0001\u0000"+
					"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000"+
					"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
					"\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
					"\u00d5\u00d6\u0005)\u0000\u0000\u00d6\u000b\u0001\u0000\u0000\u0000\u00d7"+
					"\u00db\u0005(\u0000\u0000\u00d8\u00da\u0003\u0002\u0001\u0000\u00d9\u00d8"+
					"\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9"+
					"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de"+
					"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e4"+
					"\u0005)\u0000\u0000\u00df\u00e0\u0005.\u0000\u0000\u00e0\u00e1\u0003\u0002"+
					"\u0001\u0000\u00e1\u00e2\u0005,\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000"+
					"\u0000\u00e3\u00d7\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000\u0000"+
					"\u0000\u00e4\r\u0001\u0000\u0000\u0000\u00e5\u00e7\u0006\u0007\uffff\uffff"+
					"\u0000\u00e6\u00e8\u0005\u000e\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000"+
					"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
					"\u0000\u00e9\u00ea\u0005&\u0000\u0000\u00ea\u00eb\u0003\u000e\u0007\u0000"+
					"\u00eb\u00ec\u0005\'\u0000\u0000\u00ec\u012c\u0001\u0000\u0000\u0000\u00ed"+
					"\u00ee\u0005\u0012\u0000\u0000\u00ee\u012c\u0003\u000e\u0007$\u00ef\u00f0"+
					"\u0005\u0013\u0000\u0000\u00f0\u012c\u0003\u000e\u0007#\u00f1\u00f4\u0003"+
					"$\u0012\u0000\u00f2\u00f4\u0003\"\u0011\u0000\u00f3\u00f1\u0001\u0000"+
					"\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
					"\u0000\u0000\u00f5\u00f8\u0005\u0015\u0000\u0000\u00f6\u00f9\u0003$\u0012"+
					"\u0000\u00f7\u00f9\u0003\"\u0011\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
					"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
					"\u00fa\u00fd\u0005&\u0000\u0000\u00fb\u00fe\u0003\u0014\n\u0000\u00fc"+
					"\u00fe\u0003\"\u0011\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc"+
					"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
					"\u0005\'\u0000\u0000\u0100\u012c\u0001\u0000\u0000\u0000\u0101\u0104\u0003"+
					"$\u0012\u0000\u0102\u0104\u0003\"\u0011\u0000\u0103\u0101\u0001\u0000"+
					"\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
					"\u0000\u0000\u0105\u0108\u0005\u0016\u0000\u0000\u0106\u0109\u0003$\u0012"+
					"\u0000\u0107\u0109\u0003\"\u0011\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
					"\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
					"\u010a\u010d\u0005&\u0000\u0000\u010b\u010e\u0003\u0014\n\u0000\u010c"+
					"\u010e\u0003\"\u0011\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c"+
					"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110"+
					"\u0005\'\u0000\u0000\u0110\u012c\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
					"!\u0000\u0000\u0112\u012c\u0003\u000e\u0007\u0019\u0113\u012c\u0003\u0010"+
					"\b\u0000\u0114\u0115\u0003\u0010\b\u0000\u0115\u0116\u0005.\u0000\u0000"+
					"\u0116\u0117\u0003\u000e\u0007\u0000\u0117\u0118\u0005+\u0000\u0000\u0118"+
					"\u0119\u0003\u000e\u0007\u000b\u0119\u012c\u0001\u0000\u0000\u0000\u011a"+
					"\u012c\u0003\u0016\u000b\u0000\u011b\u012c\u0003\u0018\f\u0000\u011c\u012c"+
					"\u0003\b\u0004\u0000\u011d\u011f\u0005\u000e\u0000\u0000\u011e\u011d\u0001"+
					"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
					"\u0000\u0000\u0000\u0120\u012c\u0003\"\u0011\u0000\u0121\u012c\u0003$"+
					"\u0012\u0000\u0122\u012c\u0003&\u0013\u0000\u0123\u012c\u0005\u0003\u0000"+
					"\u0000\u0124\u012c\u0005\u0002\u0000\u0000\u0125\u0126\u0003\"\u0011\u0000"+
					"\u0126\u0127\u0005\u0012\u0000\u0000\u0127\u012c\u0001\u0000\u0000\u0000"+
					"\u0128\u0129\u0003\"\u0011\u0000\u0129\u012a\u0005\u0013\u0000\u0000\u012a"+
					"\u012c\u0001\u0000\u0000\u0000\u012b\u00e5\u0001\u0000\u0000\u0000\u012b"+
					"\u00ed\u0001\u0000\u0000\u0000\u012b\u00ef\u0001\u0000\u0000\u0000\u012b"+
					"\u00f3\u0001\u0000\u0000\u0000\u012b\u0103\u0001\u0000\u0000\u0000\u012b"+
					"\u0111\u0001\u0000\u0000\u0000\u012b\u0113\u0001\u0000\u0000\u0000\u012b"+
					"\u0114\u0001\u0000\u0000\u0000\u012b\u011a\u0001\u0000\u0000\u0000\u012b"+
					"\u011b\u0001\u0000\u0000\u0000\u012b\u011c\u0001\u0000\u0000\u0000\u012b"+
					"\u011e\u0001\u0000\u0000\u0000\u012b\u0121\u0001\u0000\u0000\u0000\u012b"+
					"\u0122\u0001\u0000\u0000\u0000\u012b\u0123\u0001\u0000\u0000\u0000\u012b"+
					"\u0124\u0001\u0000\u0000\u0000\u012b\u0125\u0001\u0000\u0000\u0000\u012b"+
					"\u0128\u0001\u0000\u0000\u0000\u012c\u0168\u0001\u0000\u0000\u0000\u012d"+
					"\u012e\n\"\u0000\u0000\u012e\u012f\u0005\u0014\u0000\u0000\u012f\u0167"+
					"\u0003\u000e\u0007#\u0130\u0131\n!\u0000\u0000\u0131\u0132\u0005\u0017"+
					"\u0000\u0000\u0132\u0167\u0003\u000e\u0007\"\u0133\u0134\n \u0000\u0000"+
					"\u0134\u0135\u0005\u000f\u0000\u0000\u0135\u0167\u0003\u000e\u0007!\u0136"+
					"\u0137\n\u001f\u0000\u0000\u0137\u0138\u0005\u0010\u0000\u0000\u0138\u0167"+
					"\u0003\u000e\u0007 \u0139\u013a\n\u001e\u0000\u0000\u013a\u013b\u0005"+
					"\u0011\u0000\u0000\u013b\u0167\u0003\u000e\u0007\u001f\u013c\u013d\n\u001d"+
					"\u0000\u0000\u013d\u013e\u0005\r\u0000\u0000\u013e\u0167\u0003\u000e\u0007"+
					"\u001e\u013f\u0140\n\u001c\u0000\u0000\u0140\u0141\u0005\u000e\u0000\u0000"+
					"\u0141\u0167\u0003\u000e\u0007\u001d\u0142\u0143\n\u0018\u0000\u0000\u0143"+
					"\u0144\u0005\u0019\u0000\u0000\u0144\u0167\u0003\u000e\u0007\u0019\u0145"+
					"\u0146\n\u0017\u0000\u0000\u0146\u0147\u0005\u001a\u0000\u0000\u0147\u0167"+
					"\u0003\u000e\u0007\u0018\u0148\u0149\n\u0016\u0000\u0000\u0149\u014a\u0005"+
					"\u001b\u0000\u0000\u014a\u0167\u0003\u000e\u0007\u0017\u014b\u014c\n\u0015"+
					"\u0000\u0000\u014c\u014d\u0005\u001c\u0000\u0000\u014d\u0167\u0003\u000e"+
					"\u0007\u0016\u014e\u014f\n\u0014\u0000\u0000\u014f\u0150\u0005\u001d\u0000"+
					"\u0000\u0150\u0167\u0003\u000e\u0007\u0015\u0151\u0152\n\u0013\u0000\u0000"+
					"\u0152\u0153\u0005\u001e\u0000\u0000\u0153\u0167\u0003\u000e\u0007\u0014"+
					"\u0154\u0155\n\u0012\u0000\u0000\u0155\u0156\u0005\u001f\u0000\u0000\u0156"+
					"\u0167\u0003\u000e\u0007\u0013\u0157\u0158\n\u0011\u0000\u0000\u0158\u0159"+
					"\u0005 \u0000\u0000\u0159\u0167\u0003\u000e\u0007\u0012\u015a\u015b\n"+
					"\u0010\u0000\u0000\u015b\u015c\u0005$\u0000\u0000\u015c\u0167\u0003\u000e"+
					"\u0007\u0011\u015d\u015e\n\u000f\u0000\u0000\u015e\u015f\u0005\"\u0000"+
					"\u0000\u015f\u0167\u0003\u000e\u0007\u0010\u0160\u0161\n\u000e\u0000\u0000"+
					"\u0161\u0162\u0005#\u0000\u0000\u0162\u0167\u0003\u000e\u0007\u000f\u0163"+
					"\u0164\n\r\u0000\u0000\u0164\u0165\u0005%\u0000\u0000\u0165\u0167\u0003"+
					"\u000e\u0007\u000e\u0166\u012d\u0001\u0000\u0000\u0000\u0166\u0130\u0001"+
					"\u0000\u0000\u0000\u0166\u0133\u0001\u0000\u0000\u0000\u0166\u0136\u0001"+
					"\u0000\u0000\u0000\u0166\u0139\u0001\u0000\u0000\u0000\u0166\u013c\u0001"+
					"\u0000\u0000\u0000\u0166\u013f\u0001\u0000\u0000\u0000\u0166\u0142\u0001"+
					"\u0000\u0000\u0000\u0166\u0145\u0001\u0000\u0000\u0000\u0166\u0148\u0001"+
					"\u0000\u0000\u0000\u0166\u014b\u0001\u0000\u0000\u0000\u0166\u014e\u0001"+
					"\u0000\u0000\u0000\u0166\u0151\u0001\u0000\u0000\u0000\u0166\u0154\u0001"+
					"\u0000\u0000\u0000\u0166\u0157\u0001\u0000\u0000\u0000\u0166\u015a\u0001"+
					"\u0000\u0000\u0000\u0166\u015d\u0001\u0000\u0000\u0000\u0166\u0160\u0001"+
					"\u0000\u0000\u0000\u0166\u0163\u0001\u0000\u0000\u0000\u0167\u016a\u0001"+
					"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
					"\u0000\u0000\u0000\u0169\u000f\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
					"\u0000\u0000\u0000\u016b\u016c\u0005-\u0000\u0000\u016c\u016d\u0005&\u0000"+
					"\u0000\u016d\u016e\u0003\u000e\u0007\u0000\u016e\u016f\u0005\'\u0000\u0000"+
					"\u016f\u0011\u0001\u0000\u0000\u0000\u0170\u0171\u00052\u0000\u0000\u0171"+
					"\u0172\u0005&\u0000\u0000\u0172\u0173\u0003\"\u0011\u0000\u0173\u0174"+
					"\u0005\'\u0000\u0000\u0174\u0178\u0005(\u0000\u0000\u0175\u0177\u0003"+
					"\u0002\u0001\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u017a\u0001"+
					"\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
					"\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u0178\u0001"+
					"\u0000\u0000\u0000\u017b\u017c\u0005)\u0000\u0000\u017c\u0013\u0001\u0000"+
					"\u0000\u0000\u017d\u0180\u0003\u0016\u000b\u0000\u017e\u0180\u0003\u0018"+
					"\f\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
					"\u0000\u0180\u0015\u0001\u0000\u0000\u0000\u0181\u0182\u0005/\u0000\u0000"+
					"\u0182\u0184\u0005&\u0000\u0000\u0183\u0185\u0003\u001a\r\u0000\u0184"+
					"\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
					"\u0186\u0001\u0000\u0000\u0000\u0186\u0189\u0005\'\u0000\u0000\u0187\u0188"+
					"\u00055\u0000\u0000\u0188\u018a\u0003\"\u0011\u0000\u0189\u0187\u0001"+
					"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0001"+
					"\u0000\u0000\u0000\u018b\u018c\u0005+\u0000\u0000\u018c\u018d\u0003\u001e"+
					"\u000f\u0000\u018d\u0191\u0005(\u0000\u0000\u018e\u0190\u0003\u0002\u0001"+
					"\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000"+
					"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
					"\u0000\u0192\u0198\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
					"\u0000\u0194\u0195\u00050\u0000\u0000\u0195\u0196\u0003\u000e\u0007\u0000"+
					"\u0196\u0197\u0005,\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198"+
					"\u0194\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
					"\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0005)\u0000\u0000\u019b\u0017"+
					"\u0001\u0000\u0000\u0000\u019c\u019d\u0005/\u0000\u0000\u019d\u019f\u0005"+
					"&\u0000\u0000\u019e\u01a0\u0003\u001a\r\u0000\u019f\u019e\u0001\u0000"+
					"\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
					"\u0000\u0000\u01a1\u01a4\u0005\'\u0000\u0000\u01a2\u01a3\u00055\u0000"+
					"\u0000\u01a3\u01a5\u0003\"\u0011\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000"+
					"\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000"+
					"\u01a6\u01a7\u0005+\u0000\u0000\u01a7\u01a8\u0003\u001e\u000f\u0000\u01a8"+
					"\u01a9\u0005.\u0000\u0000\u01a9\u01aa\u0003\u000e\u0007\u0000\u01aa\u0019"+
					"\u0001\u0000\u0000\u0000\u01ab\u01b0\u0003\u001c\u000e\u0000\u01ac\u01ad"+
					"\u0005*\u0000\u0000\u01ad\u01af\u0003\u001c\u000e\u0000\u01ae\u01ac\u0001"+
					"\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001"+
					"\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u001b\u0001"+
					"\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003"+
					"\"\u0011\u0000\u01b4\u01b5\u0005+\u0000\u0000\u01b5\u01b6\u0003 \u0010"+
					"\u0000\u01b6\u001d\u0001\u0000\u0000\u0000\u01b7\u01ba\u0003 \u0010\u0000"+
					"\u01b8\u01ba\u0005\n\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9"+
					"\u01b8\u0001\u0000\u0000\u0000\u01ba\u001f\u0001\u0000\u0000\u0000\u01bb"+
					"\u01bc\u0007\u0000\u0000\u0000\u01bc!\u0001\u0000\u0000\u0000\u01bd\u01c2"+
					"\u0005\u0004\u0000\u0000\u01be\u01bf\u0003(\u0014\u0000\u01bf\u01c0\u0007"+
					"\u0001\u0000\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bd\u0001"+
					"\u0000\u0000\u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c2\u01c8\u0001"+
					"\u0000\u0000\u0000\u01c3\u01c7\u0003(\u0014\u0000\u01c4\u01c7\u0005\u0004"+
					"\u0000\u0000\u01c5\u01c7\u0005\u0005\u0000\u0000\u01c6\u01c3\u0001\u0000"+
					"\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000"+
					"\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
					"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9#\u0001\u0000\u0000"+
					"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cd\u0005\u000e\u0000"+
					"\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000"+
					"\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01d0\u0005\u0005\u0000"+
					"\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
					"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
					"\u0000\u01d2%\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005\u000e\u0000\u0000"+
					"\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000"+
					"\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005\u0005\u0000\u0000"+
					"\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000"+
					"\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000"+
					"\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dd\u0005\u0001\u0000\u0000"+
					"\u01dc\u01de\u0005\u0005\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000"+
					"\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
					"\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\'\u0001\u0000\u0000\u0000\u01e1"+
					"\u01ef\u0003\u001e\u000f\u0000\u01e2\u01ef\u0005/\u0000\u0000\u01e3\u01ef"+
					"\u00050\u0000\u0000\u01e4\u01ef\u00051\u0000\u0000\u01e5\u01ef\u00052"+
					"\u0000\u0000\u01e6\u01ef\u00053\u0000\u0000\u01e7\u01ef\u00054\u0000\u0000"+
					"\u01e8\u01ef\u00055\u0000\u0000\u01e9\u01ef\u00056\u0000\u0000\u01ea\u01ef"+
					"\u00057\u0000\u0000\u01eb\u01ef\u00058\u0000\u0000\u01ec\u01ef\u00059"+
					"\u0000\u0000\u01ed\u01ef\u0005\f\u0000\u0000\u01ee\u01e1\u0001\u0000\u0000"+
					"\u0000\u01ee\u01e2\u0001\u0000\u0000\u0000\u01ee\u01e3\u0001\u0000\u0000"+
					"\u0000\u01ee\u01e4\u0001\u0000\u0000\u0000\u01ee\u01e5\u0001\u0000\u0000"+
					"\u0000\u01ee\u01e6\u0001\u0000\u0000\u0000\u01ee\u01e7\u0001\u0000\u0000"+
					"\u0000\u01ee\u01e8\u0001\u0000\u0000\u0000\u01ee\u01e9\u0001\u0000\u0000"+
					"\u0000\u01ee\u01ea\u0001\u0000\u0000\u0000\u01ee\u01eb\u0001\u0000\u0000"+
					"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000"+
					"\u0000\u01ef)\u0001\u0000\u0000\u00004-AIMSZafot{\u0083\u0092\u0096\u009f"+
					"\u00b1\u00b8\u00c5\u00c8\u00d2\u00db\u00e3\u00e7\u00f3\u00f8\u00fd\u0103"+
					"\u0108\u010d\u011e\u012b\u0166\u0168\u0178\u017f\u0184\u0189\u0191\u0198"+
					"\u019f\u01a4\u01b0\u01b9\u01c1\u01c6\u01c8\u01cc\u01d1\u01d4\u01d9\u01df"+
					"\u01ee";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}