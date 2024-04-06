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
			IF=54, ELSE=55, IS=56, PRINT=57, INPUT=58, WS=59, COMMENT=60, BLOCK_COMMENT=61;
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
				"'is'", "'print'", "'input'"
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
				"INPUT", "WS", "COMMENT", "BLOCK_COMMENT"
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0) );
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
	public static class DecrementStatementContext extends StatementContext {
		public TerminalNode DEC() { return getToken(QuirklParser.DEC, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public DecrementStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitDecrementStatement(this);
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
	public static class IncrementStatementContext extends StatementContext {
		public TerminalNode INC() { return getToken(QuirklParser.INC, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public IncrementStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitIncrementStatement(this);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(QuirklParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QuirklParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QuirklParser.COMMA, i);
		}
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
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
					_localctx = new IncrementStatementContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(54);
					match(INC);
					setState(55);
					id();
					setState(56);
					match(SEMICOLON);
				}
				break;
				case 3:
					_localctx = new DecrementStatementContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(58);
					match(DEC);
					setState(59);
					id();
					setState(60);
					match(SEMICOLON);
				}
				break;
				case 4:
					_localctx = new PrintStatementContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(62);
					match(PRINT);
					setState(63);
					match(LPAREN);
					setState(64);
					expression(0);
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
							{
								setState(65);
								match(COMMA);
								setState(66);
								expression(0);
							}
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(72);
					match(RPAREN);
					setState(73);
					match(SEMICOLON);
				}
				break;
				case 5:
					_localctx = new IfStatementContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(75);
					ifCondition();
					setState(80);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								{
									setState(76);
									match(ELSE);
									setState(77);
									ifCondition();
								}
							}
						}
						setState(82);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
						{
							setState(83);
							match(ELSE);
							setState(84);
							match(LBRACE);
							setState(88);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0)) {
								{
									{
										setState(85);
										statement();
									}
								}
								setState(90);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(91);
							match(RBRACE);
						}
						break;
					}
				}
				break;
				case 6:
					_localctx = new ForLoopContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(94);
					match(RUN);
					setState(95);
					match(LPAREN);
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
						{
							setState(96);
							declaration();
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
					match(SEMICOLON);
					setState(101);
					toBool();
					setState(102);
					match(SEMICOLON);
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
						{
							setState(103);
							assignment();
						}
						break;
						case 2:
						{
							setState(104);
							expression(0);
						}
						break;
					}
					setState(107);
					match(RPAREN);
					setState(108);
					match(LBRACE);
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0)) {
						{
							{
								setState(109);
								statement();
							}
						}
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(115);
					match(RBRACE);
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
						{
							setState(116);
							catchBody();
						}
						break;
					}
				}
				break;
				case 7:
					_localctx = new WhileLoopContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(119);
					match(RUN);
					setState(120);
					match(CHECK);
					setState(121);
					toBool();
					setState(122);
					match(LBRACE);
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0)) {
						{
							{
								setState(123);
								statement();
							}
						}
						setState(128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(129);
					match(RBRACE);
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
						{
							setState(130);
							catchBody();
						}
						break;
					}
				}
				break;
				case 8:
					_localctx = new DoWhileLoopContext(_localctx);
					enterOuterAlt(_localctx, 8);
				{
					setState(133);
					match(RUN);
					setState(134);
					match(LBRACE);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0)) {
						{
							{
								setState(135);
								statement();
							}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(141);
					match(RBRACE);
					setState(142);
					match(CHECK);
					setState(143);
					toBool();
					setState(146);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case SEMICOLON:
						{
							setState(144);
							match(SEMICOLON);
						}
						break;
						case CATCH:
						{
							setState(145);
							catchBody();
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
				}
				break;
				case 9:
					_localctx = new SwitchContext(_localctx);
					enterOuterAlt(_localctx, 9);
				{
					setState(148);
					match(MATCH);
					setState(149);
					match(LPAREN);
					setState(150);
					expression(0);
					setState(151);
					match(RPAREN);
					setState(152);
					match(LBRACE);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(153);
								match(IS);
								setState(154);
								match(LPAREN);
								setState(155);
								expression(0);
								setState(156);
								match(RPAREN);
								setState(157);
								switchCase();
							}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==IS );
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ELSE) {
						{
							setState(163);
							match(ELSE);
							setState(164);
							switchCase();
						}
					}

					setState(167);
					match(RBRACE);
				}
				break;
				case 10:
					_localctx = new RunCatchContext(_localctx);
					enterOuterAlt(_localctx, 10);
				{
					setState(169);
					match(RUN);
					setState(170);
					match(LBRACE);
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0)) {
						{
							{
								setState(171);
								statement();
							}
						}
						setState(176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(177);
					match(RBRACE);
					setState(178);
					catchBody();
				}
				break;
				case 11:
					_localctx = new DeclarationStatementContext(_localctx);
					enterOuterAlt(_localctx, 11);
				{
					setState(179);
					declaration();
					setState(180);
					match(SEMICOLON);
				}
				break;
				case 12:
					_localctx = new AssignmentStatementContext(_localctx);
					enterOuterAlt(_localctx, 12);
				{
					setState(182);
					assignment();
					setState(183);
					match(SEMICOLON);
				}
				break;
				case 13:
					_localctx = new FunctionCallStatementContext(_localctx);
					enterOuterAlt(_localctx, 13);
				{
					setState(185);
					functionCall();
					setState(186);
					match(SEMICOLON);
				}
				break;
				case 14:
					_localctx = new FunctionWithBodyStatementContext(_localctx);
					enterOuterAlt(_localctx, 14);
				{
					setState(188);
					functionWithBody();
				}
				break;
				case 15:
					_localctx = new FunctionWithLambdaStatementContext(_localctx);
					enterOuterAlt(_localctx, 15);
				{
					setState(189);
					functionWithLambda();
					setState(190);
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
				setState(194);
				id();
				setState(195);
				match(COLON);
				setState(196);
				variable_data_type();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
						setState(197);
						match(ASSIGN);
						setState(198);
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
				setState(201);
				id();
				setState(202);
				match(ASSIGN);
				setState(203);
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
				setState(205);
				id();
				setState(206);
				match(LPAREN);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576355482655809532L) != 0)) {
					{
						setState(207);
						expression(0);
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
								{
									setState(208);
									match(COMMA);
									setState(209);
									expression(0);
								}
							}
							setState(214);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(217);
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
				setState(219);
				match(IF);
				setState(220);
				toBool();
				setState(221);
				match(LBRACE);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0)) {
					{
						{
							setState(222);
							statement();
						}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					_localctx = new SwitchCaseWithBodyContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(230);
					match(LBRACE);
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0)) {
						{
							{
								setState(231);
								statement();
							}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(237);
					match(RBRACE);
				}
				break;
				case ARROW:
					_localctx = new SwitchCaseWithLambdaContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(238);
					match(ARROW);
					setState(239);
					statement();
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
	public static class TypeCastExpressionContext extends ExpressionContext {
		public Variable_data_typeContext variable_data_type() {
			return getRuleContext(Variable_data_typeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TypeCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitTypeCastExpression(this);
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
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode INPUT() { return getToken(QuirklParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(QuirklParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirklParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(QuirklParser.STRING, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirklVisitor ) return ((QuirklVisitor<? extends T>)visitor).visitInputExpression(this);
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
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
					{
						_localctx = new InputExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(243);
						match(INPUT);
						setState(244);
						match(LPAREN);
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==STRING) {
							{
								setState(245);
								match(STRING);
							}
						}

						setState(248);
						match(RPAREN);
					}
					break;
					case 2:
					{
						_localctx = new TypeCastExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(249);
						variable_data_type();
						setState(250);
						match(LPAREN);
						setState(251);
						expression(0);
						setState(252);
						match(RPAREN);
					}
					break;
					case 3:
					{
						_localctx = new BracketExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUS) {
							{
								setState(254);
								match(MINUS);
							}
						}

						setState(257);
						match(LPAREN);
						setState(258);
						expression(0);
						setState(259);
						match(RPAREN);
					}
					break;
					case 4:
					{
						_localctx = new IncrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(261);
						match(INC);
						setState(262);
						expression(36);
					}
					break;
					case 5:
					{
						_localctx = new DecrementExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(263);
						match(DEC);
						setState(264);
						expression(35);
					}
					break;
					case 6:
					{
						_localctx = new SummationExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(267);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(265);
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
							case INPUT:
							{
								setState(266);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(269);
						match(SUMM);
						setState(272);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(270);
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
							case INPUT:
							{
								setState(271);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(274);
						match(LPAREN);
						setState(277);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
							case 1:
							{
								setState(275);
								function();
							}
							break;
							case 2:
							{
								setState(276);
								id();
							}
							break;
						}
						setState(279);
						match(RPAREN);
					}
					break;
					case 7:
					{
						_localctx = new ProdSummationExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(283);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(281);
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
							case INPUT:
							{
								setState(282);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(285);
						match(PRODSUMM);
						setState(288);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case DIGIT:
							case MINUS:
							{
								setState(286);
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
							case INPUT:
							{
								setState(287);
								id();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(290);
						match(LPAREN);
						setState(293);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
							case 1:
							{
								setState(291);
								function();
							}
							break;
							case 2:
							{
								setState(292);
								id();
							}
							break;
						}
						setState(295);
						match(RPAREN);
					}
					break;
					case 8:
					{
						_localctx = new NotBooleanExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(297);
						match(NOT);
						setState(298);
						expression(25);
					}
					break;
					case 9:
					{
						_localctx = new ToBoolExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(299);
						toBool();
					}
					break;
					case 10:
					{
						_localctx = new TernaryOperatorExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(300);
						toBool();
						setState(301);
						match(ARROW);
						setState(302);
						expression(0);
						setState(303);
						match(COLON);
						setState(304);
						expression(11);
					}
					break;
					case 11:
					{
						_localctx = new FunctionWithBodyExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(306);
						functionWithBody();
					}
					break;
					case 12:
					{
						_localctx = new FunctionWithLambdaExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(307);
						functionWithLambda();
					}
					break;
					case 13:
					{
						_localctx = new FunctionCallExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(308);
						functionCall();
					}
					break;
					case 14:
					{
						_localctx = new VariableExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUS) {
							{
								setState(309);
								match(MINUS);
							}
						}

						setState(312);
						id();
					}
					break;
					case 15:
					{
						_localctx = new NumberLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(313);
						number();
					}
					break;
					case 16:
					{
						_localctx = new DecimalLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(314);
						decimal();
					}
					break;
					case 17:
					{
						_localctx = new BooleanLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(315);
						match(BOOLEAN);
					}
					break;
					case 18:
					{
						_localctx = new StringLiteralExpressionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(316);
						match(STRING);
					}
					break;
					case 19:
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
					case 20:
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
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(382);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
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
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815862736L) != 0)) {
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
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
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
				setState(409);
				match(PASS);
				setState(410);
				match(LPAREN);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815076304L) != 0)) {
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
				all_data_types();
				setState(421);
				match(LBRACE);
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(422);
								statement();
							}
						}
					}
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
				setState(436);
				match(PASS);
				setState(437);
				match(LPAREN);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576320014815076304L) != 0)) {
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
				all_data_types();
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
				setState(459);
				id();
				setState(460);
				match(COLON);
				setState(461);
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
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOL_TYPE:
				case NUMBER_TYPE:
				case DECIMAL_TYPE:
				case STRING_TYPE:
				case FUNCTION_TYPE:
					enterOuterAlt(_localctx, 1);
				{
					setState(463);
					variable_data_type();
				}
				break;
				case VOID_TYPE:
					enterOuterAlt(_localctx, 2);
				{
					setState(464);
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
				setState(467);
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
				setState(473);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case LETTER:
					{
						setState(469);
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
					case INPUT:
					{
						{
							setState(470);
							keywords();
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
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							setState(478);
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
								case INPUT:
								{
									setState(475);
									keywords();
								}
								break;
								case LETTER:
								{
									setState(476);
									match(LETTER);
								}
								break;
								case DIGIT:
								{
									setState(477);
									match(DIGIT);
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
						}
					}
					setState(482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
						setState(483);
						match(MINUS);
					}
				}

				setState(487);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1:
						{
							{
								setState(486);
								match(DIGIT);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
						setState(491);
						match(MINUS);
					}
				}

				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(494);
							match(DIGIT);
						}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(499);
				match(T__0);
				setState(501);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1:
						{
							{
								setState(500);
								match(DIGIT);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(503);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public TerminalNode INPUT() { return getToken(QuirklParser.INPUT, 0); }
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
			setState(519);
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
					setState(505);
					all_data_types();
				}
				break;
				case PASS:
					enterOuterAlt(_localctx, 2);
				{
					setState(506);
					match(PASS);
				}
				break;
				case GIVE:
					enterOuterAlt(_localctx, 3);
				{
					setState(507);
					match(GIVE);
				}
				break;
				case RUN:
					enterOuterAlt(_localctx, 4);
				{
					setState(508);
					match(RUN);
				}
				break;
				case CATCH:
					enterOuterAlt(_localctx, 5);
				{
					setState(509);
					match(CATCH);
				}
				break;
				case CHECK:
					enterOuterAlt(_localctx, 6);
				{
					setState(510);
					match(CHECK);
				}
				break;
				case MATCH:
					enterOuterAlt(_localctx, 7);
				{
					setState(511);
					match(MATCH);
				}
				break;
				case TO:
					enterOuterAlt(_localctx, 8);
				{
					setState(512);
					match(TO);
				}
				break;
				case IF:
					enterOuterAlt(_localctx, 9);
				{
					setState(513);
					match(IF);
				}
				break;
				case ELSE:
					enterOuterAlt(_localctx, 10);
				{
					setState(514);
					match(ELSE);
				}
				break;
				case IS:
					enterOuterAlt(_localctx, 11);
				{
					setState(515);
					match(IS);
				}
				break;
				case PRINT:
					enterOuterAlt(_localctx, 12);
				{
					setState(516);
					match(PRINT);
				}
				break;
				case ERROR_TYPE:
					enterOuterAlt(_localctx, 13);
				{
					setState(517);
					match(ERROR_TYPE);
				}
				break;
				case INPUT:
					enterOuterAlt(_localctx, 14);
				{
					setState(518);
					match(INPUT);
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
			"\u0004\u0001=\u020a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
					"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
					"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
					"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
					"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
					"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0004\u0000"+
					",\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001D\b"+
					"\u0001\n\u0001\f\u0001G\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0005\u0001O\b\u0001\n\u0001\f\u0001R\t"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001W\b\u0001\n\u0001"+
					"\f\u0001Z\t\u0001\u0001\u0001\u0003\u0001]\b\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001j\b\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0005\u0001o\b\u0001\n\u0001\f\u0001r\t\u0001"+
					"\u0001\u0001\u0001\u0001\u0003\u0001v\b\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001}\b\u0001\n\u0001\f\u0001"+
					"\u0080\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0084\b\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0089\b\u0001\n\u0001\f\u0001"+
					"\u008c\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0003\u0001\u0093\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0004\u0001\u00a0\b\u0001\u000b\u0001\f\u0001\u00a1\u0001"+
					"\u0001\u0001\u0001\u0003\u0001\u00a6\b\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00ad\b\u0001\n\u0001\f\u0001"+
					"\u00b0\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00c1\b\u0001"+
					"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
					"\u00c8\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
					"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00d3\b\u0004"+
					"\n\u0004\f\u0004\u00d6\t\u0004\u0003\u0004\u00d8\b\u0004\u0001\u0004\u0001"+
					"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00e0"+
					"\b\u0005\n\u0005\f\u0005\u00e3\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
					"\u0001\u0006\u0005\u0006\u00e9\b\u0006\n\u0006\f\u0006\u00ec\t\u0006\u0001"+
					"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f1\b\u0006\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f7\b\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
					"\u0007\u0100\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
					"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
					"\u0007\u010c\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0111"+
					"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0116\b\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u011c\b\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0121\b\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0003\u0007\u0126\b\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0003\u0007\u0137\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0003\u0007\u0144\b\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0005\u0007\u017f\b\u0007\n\u0007\f\u0007\u0182\t\u0007\u0001"+
					"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
					"\t\u0001\t\u0005\t\u018f\b\t\n\t\f\t\u0192\t\t\u0001\t\u0001\t\u0001\n"+
					"\u0001\n\u0003\n\u0198\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
					"\u019d\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01a2\b"+
					"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u01a8"+
					"\b\u000b\n\u000b\f\u000b\u01ab\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
					"\u0001\u000b\u0003\u000b\u01b1\b\u000b\u0001\u000b\u0001\u000b\u0001\f"+
					"\u0001\f\u0001\f\u0003\f\u01b8\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u01bd"+
					"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
					"\r\u01c7\b\r\n\r\f\r\u01ca\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
					"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u01d2\b\u000f\u0001\u0010\u0001"+
					"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01da"+
					"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01df\b\u0011"+
					"\n\u0011\f\u0011\u01e2\t\u0011\u0001\u0012\u0003\u0012\u01e5\b\u0012\u0001"+
					"\u0012\u0004\u0012\u01e8\b\u0012\u000b\u0012\f\u0012\u01e9\u0001\u0013"+
					"\u0003\u0013\u01ed\b\u0013\u0001\u0013\u0004\u0013\u01f0\b\u0013\u000b"+
					"\u0013\f\u0013\u01f1\u0001\u0013\u0001\u0013\u0004\u0013\u01f6\b\u0013"+
					"\u000b\u0013\f\u0013\u01f7\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
					"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
					"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0208\b\u0014"+
					"\u0001\u0014\u0000\u0001\u000e\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e"+
					"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0002\u0002"+
					"\u0000\u0006\t\u000b\u000b\u0001\u0000\u0004\u0005\u0269\u0000+\u0001"+
					"\u0000\u0000\u0000\u0002\u00c0\u0001\u0000\u0000\u0000\u0004\u00c2\u0001"+
					"\u0000\u0000\u0000\u0006\u00c9\u0001\u0000\u0000\u0000\b\u00cd\u0001\u0000"+
					"\u0000\u0000\n\u00db\u0001\u0000\u0000\u0000\f\u00f0\u0001\u0000\u0000"+
					"\u0000\u000e\u0143\u0001\u0000\u0000\u0000\u0010\u0183\u0001\u0000\u0000"+
					"\u0000\u0012\u0188\u0001\u0000\u0000\u0000\u0014\u0197\u0001\u0000\u0000"+
					"\u0000\u0016\u0199\u0001\u0000\u0000\u0000\u0018\u01b4\u0001\u0000\u0000"+
					"\u0000\u001a\u01c3\u0001\u0000\u0000\u0000\u001c\u01cb\u0001\u0000\u0000"+
					"\u0000\u001e\u01d1\u0001\u0000\u0000\u0000 \u01d3\u0001\u0000\u0000\u0000"+
					"\"\u01d9\u0001\u0000\u0000\u0000$\u01e4\u0001\u0000\u0000\u0000&\u01ec"+
					"\u0001\u0000\u0000\u0000(\u0207\u0001\u0000\u0000\u0000*,\u0003\u0002"+
					"\u0001\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001"+
					"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
					"/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000\u0000\u000012\u0005\f\u0000"+
					"\u000023\u0005+\u0000\u000034\u0003\u000e\u0007\u000045\u0005,\u0000\u0000"+
					"5\u00c1\u0001\u0000\u0000\u000067\u0005\u0012\u0000\u000078\u0003\"\u0011"+
					"\u000089\u0005,\u0000\u00009\u00c1\u0001\u0000\u0000\u0000:;\u0005\u0013"+
					"\u0000\u0000;<\u0003\"\u0011\u0000<=\u0005,\u0000\u0000=\u00c1\u0001\u0000"+
					"\u0000\u0000>?\u00059\u0000\u0000?@\u0005&\u0000\u0000@E\u0003\u000e\u0007"+
					"\u0000AB\u0005*\u0000\u0000BD\u0003\u000e\u0007\u0000CA\u0001\u0000\u0000"+
					"\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
					"\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005"+
					"\'\u0000\u0000IJ\u0005,\u0000\u0000J\u00c1\u0001\u0000\u0000\u0000KP\u0003"+
					"\n\u0005\u0000LM\u00057\u0000\u0000MO\u0003\n\u0005\u0000NL\u0001\u0000"+
					"\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
					"\u0000\u0000\u0000Q\\\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
					"ST\u00057\u0000\u0000TX\u0005(\u0000\u0000UW\u0003\u0002\u0001\u0000V"+
					"U\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
					"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
					"\u0000\u0000[]\u0005)\u0000\u0000\\S\u0001\u0000\u0000\u0000\\]\u0001"+
					"\u0000\u0000\u0000]\u00c1\u0001\u0000\u0000\u0000^_\u00051\u0000\u0000"+
					"_b\u0005&\u0000\u0000`c\u0003\u0004\u0002\u0000ac\u0003\u000e\u0007\u0000"+
					"b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
					"\u0000cd\u0001\u0000\u0000\u0000de\u0005,\u0000\u0000ef\u0003\u0010\b"+
					"\u0000fi\u0005,\u0000\u0000gj\u0003\u0006\u0003\u0000hj\u0003\u000e\u0007"+
					"\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000"+
					"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0005\'\u0000\u0000lp\u0005("+
					"\u0000\u0000mo\u0003\u0002\u0001\u0000nm\u0001\u0000\u0000\u0000or\u0001"+
					"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
					"qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0005)\u0000\u0000"+
					"tv\u0003\u0012\t\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
					"v\u00c1\u0001\u0000\u0000\u0000wx\u00051\u0000\u0000xy\u00053\u0000\u0000"+
					"yz\u0003\u0010\b\u0000z~\u0005(\u0000\u0000{}\u0003\u0002\u0001\u0000"+
					"|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
					"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000"+
					"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0083\u0005)\u0000\u0000\u0082"+
					"\u0084\u0003\u0012\t\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
					"\u0001\u0000\u0000\u0000\u0084\u00c1\u0001\u0000\u0000\u0000\u0085\u0086"+
					"\u00051\u0000\u0000\u0086\u008a\u0005(\u0000\u0000\u0087\u0089\u0003\u0002"+
					"\u0001\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
					"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
					"\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
					"\u0000\u0000\u008d\u008e\u0005)\u0000\u0000\u008e\u008f\u00053\u0000\u0000"+
					"\u008f\u0092\u0003\u0010\b\u0000\u0090\u0093\u0005,\u0000\u0000\u0091"+
					"\u0093\u0003\u0012\t\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091"+
					"\u0001\u0000\u0000\u0000\u0093\u00c1\u0001\u0000\u0000\u0000\u0094\u0095"+
					"\u00054\u0000\u0000\u0095\u0096\u0005&\u0000\u0000\u0096\u0097\u0003\u000e"+
					"\u0007\u0000\u0097\u0098\u0005\'\u0000\u0000\u0098\u009f\u0005(\u0000"+
					"\u0000\u0099\u009a\u00058\u0000\u0000\u009a\u009b\u0005&\u0000\u0000\u009b"+
					"\u009c\u0003\u000e\u0007\u0000\u009c\u009d\u0005\'\u0000\u0000\u009d\u009e"+
					"\u0003\f\u0006\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0099\u0001"+
					"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
					"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
					"\u0000\u0000\u0000\u00a3\u00a4\u00057\u0000\u0000\u00a4\u00a6\u0003\f"+
					"\u0006\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
					"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005)\u0000"+
					"\u0000\u00a8\u00c1\u0001\u0000\u0000\u0000\u00a9\u00aa\u00051\u0000\u0000"+
					"\u00aa\u00ae\u0005(\u0000\u0000\u00ab\u00ad\u0003\u0002\u0001\u0000\u00ac"+
					"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae"+
					"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
					"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
					"\u00b2\u0005)\u0000\u0000\u00b2\u00c1\u0003\u0012\t\u0000\u00b3\u00b4"+
					"\u0003\u0004\u0002\u0000\u00b4\u00b5\u0005,\u0000\u0000\u00b5\u00c1\u0001"+
					"\u0000\u0000\u0000\u00b6\u00b7\u0003\u0006\u0003\u0000\u00b7\u00b8\u0005"+
					",\u0000\u0000\u00b8\u00c1\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\b"+
					"\u0004\u0000\u00ba\u00bb\u0005,\u0000\u0000\u00bb\u00c1\u0001\u0000\u0000"+
					"\u0000\u00bc\u00c1\u0003\u0016\u000b\u0000\u00bd\u00be\u0003\u0018\f\u0000"+
					"\u00be\u00bf\u0005,\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
					"1\u0001\u0000\u0000\u0000\u00c06\u0001\u0000\u0000\u0000\u00c0:\u0001"+
					"\u0000\u0000\u0000\u00c0>\u0001\u0000\u0000\u0000\u00c0K\u0001\u0000\u0000"+
					"\u0000\u00c0^\u0001\u0000\u0000\u0000\u00c0w\u0001\u0000\u0000\u0000\u00c0"+
					"\u0085\u0001\u0000\u0000\u0000\u00c0\u0094\u0001\u0000\u0000\u0000\u00c0"+
					"\u00a9\u0001\u0000\u0000\u0000\u00c0\u00b3\u0001\u0000\u0000\u0000\u00c0"+
					"\u00b6\u0001\u0000\u0000\u0000\u00c0\u00b9\u0001\u0000\u0000\u0000\u00c0"+
					"\u00bc\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c1"+
					"\u0003\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\"\u0011\u0000\u00c3\u00c4"+
					"\u0005+\u0000\u0000\u00c4\u00c7\u0003 \u0010\u0000\u00c5\u00c6\u0005\u0018"+
					"\u0000\u0000\u00c6\u00c8\u0003\u000e\u0007\u0000\u00c7\u00c5\u0001\u0000"+
					"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u0005\u0001\u0000"+
					"\u0000\u0000\u00c9\u00ca\u0003\"\u0011\u0000\u00ca\u00cb\u0005\u0018\u0000"+
					"\u0000\u00cb\u00cc\u0003\u000e\u0007\u0000\u00cc\u0007\u0001\u0000\u0000"+
					"\u0000\u00cd\u00ce\u0003\"\u0011\u0000\u00ce\u00d7\u0005&\u0000\u0000"+
					"\u00cf\u00d4\u0003\u000e\u0007\u0000\u00d0\u00d1\u0005*\u0000\u0000\u00d1"+
					"\u00d3\u0003\u000e\u0007\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
					"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
					"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6"+
					"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001\u0000\u0000\u0000\u00d7"+
					"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
					"\u00da\u0005\'\u0000\u0000\u00da\t\u0001\u0000\u0000\u0000\u00db\u00dc"+
					"\u00056\u0000\u0000\u00dc\u00dd\u0003\u0010\b\u0000\u00dd\u00e1\u0005"+
					"(\u0000\u0000\u00de\u00e0\u0003\u0002\u0001\u0000\u00df\u00de\u0001\u0000"+
					"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
					"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000"+
					"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005)\u0000"+
					"\u0000\u00e5\u000b\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005(\u0000\u0000"+
					"\u00e7\u00e9\u0003\u0002\u0001\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
					"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
					"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
					"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f1\u0005)\u0000\u0000\u00ee"+
					"\u00ef\u0005.\u0000\u0000\u00ef\u00f1\u0003\u0002\u0001\u0000\u00f0\u00e6"+
					"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\r\u0001"+
					"\u0000\u0000\u0000\u00f2\u00f3\u0006\u0007\uffff\uffff\u0000\u00f3\u00f4"+
					"\u0005:\u0000\u0000\u00f4\u00f6\u0005&\u0000\u0000\u00f5\u00f7\u0005\u0002"+
					"\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
					"\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u0144\u0005\'\u0000"+
					"\u0000\u00f9\u00fa\u0003 \u0010\u0000\u00fa\u00fb\u0005&\u0000\u0000\u00fb"+
					"\u00fc\u0003\u000e\u0007\u0000\u00fc\u00fd\u0005\'\u0000\u0000\u00fd\u0144"+
					"\u0001\u0000\u0000\u0000\u00fe\u0100\u0005\u000e\u0000\u0000\u00ff\u00fe"+
					"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101"+
					"\u0001\u0000\u0000\u0000\u0101\u0102\u0005&\u0000\u0000\u0102\u0103\u0003"+
					"\u000e\u0007\u0000\u0103\u0104\u0005\'\u0000\u0000\u0104\u0144\u0001\u0000"+
					"\u0000\u0000\u0105\u0106\u0005\u0012\u0000\u0000\u0106\u0144\u0003\u000e"+
					"\u0007$\u0107\u0108\u0005\u0013\u0000\u0000\u0108\u0144\u0003\u000e\u0007"+
					"#\u0109\u010c\u0003$\u0012\u0000\u010a\u010c\u0003\"\u0011\u0000\u010b"+
					"\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
					"\u010d\u0001\u0000\u0000\u0000\u010d\u0110\u0005\u0015\u0000\u0000\u010e"+
					"\u0111\u0003$\u0012\u0000\u010f\u0111\u0003\"\u0011\u0000\u0110\u010e"+
					"\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112"+
					"\u0001\u0000\u0000\u0000\u0112\u0115\u0005&\u0000\u0000\u0113\u0116\u0003"+
					"\u0014\n\u0000\u0114\u0116\u0003\"\u0011\u0000\u0115\u0113\u0001\u0000"+
					"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
					"\u0000\u0000\u0117\u0118\u0005\'\u0000\u0000\u0118\u0144\u0001\u0000\u0000"+
					"\u0000\u0119\u011c\u0003$\u0012\u0000\u011a\u011c\u0003\"\u0011\u0000"+
					"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000"+
					"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0120\u0005\u0016\u0000\u0000"+
					"\u011e\u0121\u0003$\u0012\u0000\u011f\u0121\u0003\"\u0011\u0000\u0120"+
					"\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121"+
					"\u0122\u0001\u0000\u0000\u0000\u0122\u0125\u0005&\u0000\u0000\u0123\u0126"+
					"\u0003\u0014\n\u0000\u0124\u0126\u0003\"\u0011\u0000\u0125\u0123\u0001"+
					"\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
					"\u0000\u0000\u0000\u0127\u0128\u0005\'\u0000\u0000\u0128\u0144\u0001\u0000"+
					"\u0000\u0000\u0129\u012a\u0005!\u0000\u0000\u012a\u0144\u0003\u000e\u0007"+
					"\u0019\u012b\u0144\u0003\u0010\b\u0000\u012c\u012d\u0003\u0010\b\u0000"+
					"\u012d\u012e\u0005.\u0000\u0000\u012e\u012f\u0003\u000e\u0007\u0000\u012f"+
					"\u0130\u0005+\u0000\u0000\u0130\u0131\u0003\u000e\u0007\u000b\u0131\u0144"+
					"\u0001\u0000\u0000\u0000\u0132\u0144\u0003\u0016\u000b\u0000\u0133\u0144"+
					"\u0003\u0018\f\u0000\u0134\u0144\u0003\b\u0004\u0000\u0135\u0137\u0005"+
					"\u000e\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
					"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0144\u0003"+
					"\"\u0011\u0000\u0139\u0144\u0003$\u0012\u0000\u013a\u0144\u0003&\u0013"+
					"\u0000\u013b\u0144\u0005\u0003\u0000\u0000\u013c\u0144\u0005\u0002\u0000"+
					"\u0000\u013d\u013e\u0003\"\u0011\u0000\u013e\u013f\u0005\u0012\u0000\u0000"+
					"\u013f\u0144\u0001\u0000\u0000\u0000\u0140\u0141\u0003\"\u0011\u0000\u0141"+
					"\u0142\u0005\u0013\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143"+
					"\u00f2\u0001\u0000\u0000\u0000\u0143\u00f9\u0001\u0000\u0000\u0000\u0143"+
					"\u00ff\u0001\u0000\u0000\u0000\u0143\u0105\u0001\u0000\u0000\u0000\u0143"+
					"\u0107\u0001\u0000\u0000\u0000\u0143\u010b\u0001\u0000\u0000\u0000\u0143"+
					"\u011b\u0001\u0000\u0000\u0000\u0143\u0129\u0001\u0000\u0000\u0000\u0143"+
					"\u012b\u0001\u0000\u0000\u0000\u0143\u012c\u0001\u0000\u0000\u0000\u0143"+
					"\u0132\u0001\u0000\u0000\u0000\u0143\u0133\u0001\u0000\u0000\u0000\u0143"+
					"\u0134\u0001\u0000\u0000\u0000\u0143\u0136\u0001\u0000\u0000\u0000\u0143"+
					"\u0139\u0001\u0000\u0000\u0000\u0143\u013a\u0001\u0000\u0000\u0000\u0143"+
					"\u013b\u0001\u0000\u0000\u0000\u0143\u013c\u0001\u0000\u0000\u0000\u0143"+
					"\u013d\u0001\u0000\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0144"+
					"\u0180\u0001\u0000\u0000\u0000\u0145\u0146\n\"\u0000\u0000\u0146\u0147"+
					"\u0005\u0014\u0000\u0000\u0147\u017f\u0003\u000e\u0007#\u0148\u0149\n"+
					"!\u0000\u0000\u0149\u014a\u0005\u0017\u0000\u0000\u014a\u017f\u0003\u000e"+
					"\u0007\"\u014b\u014c\n \u0000\u0000\u014c\u014d\u0005\u000f\u0000\u0000"+
					"\u014d\u017f\u0003\u000e\u0007!\u014e\u014f\n\u001f\u0000\u0000\u014f"+
					"\u0150\u0005\u0010\u0000\u0000\u0150\u017f\u0003\u000e\u0007 \u0151\u0152"+
					"\n\u001e\u0000\u0000\u0152\u0153\u0005\u0011\u0000\u0000\u0153\u017f\u0003"+
					"\u000e\u0007\u001f\u0154\u0155\n\u001d\u0000\u0000\u0155\u0156\u0005\r"+
					"\u0000\u0000\u0156\u017f\u0003\u000e\u0007\u001e\u0157\u0158\n\u001c\u0000"+
					"\u0000\u0158\u0159\u0005\u000e\u0000\u0000\u0159\u017f\u0003\u000e\u0007"+
					"\u001d\u015a\u015b\n\u0018\u0000\u0000\u015b\u015c\u0005\u0019\u0000\u0000"+
					"\u015c\u017f\u0003\u000e\u0007\u0019\u015d\u015e\n\u0017\u0000\u0000\u015e"+
					"\u015f\u0005\u001a\u0000\u0000\u015f\u017f\u0003\u000e\u0007\u0018\u0160"+
					"\u0161\n\u0016\u0000\u0000\u0161\u0162\u0005\u001b\u0000\u0000\u0162\u017f"+
					"\u0003\u000e\u0007\u0017\u0163\u0164\n\u0015\u0000\u0000\u0164\u0165\u0005"+
					"\u001c\u0000\u0000\u0165\u017f\u0003\u000e\u0007\u0016\u0166\u0167\n\u0014"+
					"\u0000\u0000\u0167\u0168\u0005\u001d\u0000\u0000\u0168\u017f\u0003\u000e"+
					"\u0007\u0015\u0169\u016a\n\u0013\u0000\u0000\u016a\u016b\u0005\u001e\u0000"+
					"\u0000\u016b\u017f\u0003\u000e\u0007\u0014\u016c\u016d\n\u0012\u0000\u0000"+
					"\u016d\u016e\u0005\u001f\u0000\u0000\u016e\u017f\u0003\u000e\u0007\u0013"+
					"\u016f\u0170\n\u0011\u0000\u0000\u0170\u0171\u0005 \u0000\u0000\u0171"+
					"\u017f\u0003\u000e\u0007\u0012\u0172\u0173\n\u0010\u0000\u0000\u0173\u0174"+
					"\u0005$\u0000\u0000\u0174\u017f\u0003\u000e\u0007\u0011\u0175\u0176\n"+
					"\u000f\u0000\u0000\u0176\u0177\u0005\"\u0000\u0000\u0177\u017f\u0003\u000e"+
					"\u0007\u0010\u0178\u0179\n\u000e\u0000\u0000\u0179\u017a\u0005#\u0000"+
					"\u0000\u017a\u017f\u0003\u000e\u0007\u000f\u017b\u017c\n\r\u0000\u0000"+
					"\u017c\u017d\u0005%\u0000\u0000\u017d\u017f\u0003\u000e\u0007\u000e\u017e"+
					"\u0145\u0001\u0000\u0000\u0000\u017e\u0148\u0001\u0000\u0000\u0000\u017e"+
					"\u014b\u0001\u0000\u0000\u0000\u017e\u014e\u0001\u0000\u0000\u0000\u017e"+
					"\u0151\u0001\u0000\u0000\u0000\u017e\u0154\u0001\u0000\u0000\u0000\u017e"+
					"\u0157\u0001\u0000\u0000\u0000\u017e\u015a\u0001\u0000\u0000\u0000\u017e"+
					"\u015d\u0001\u0000\u0000\u0000\u017e\u0160\u0001\u0000\u0000\u0000\u017e"+
					"\u0163\u0001\u0000\u0000\u0000\u017e\u0166\u0001\u0000\u0000\u0000\u017e"+
					"\u0169\u0001\u0000\u0000\u0000\u017e\u016c\u0001\u0000\u0000\u0000\u017e"+
					"\u016f\u0001\u0000\u0000\u0000\u017e\u0172\u0001\u0000\u0000\u0000\u017e"+
					"\u0175\u0001\u0000\u0000\u0000\u017e\u0178\u0001\u0000\u0000\u0000\u017e"+
					"\u017b\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180"+
					"\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
					"\u000f\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183"+
					"\u0184\u0005-\u0000\u0000\u0184\u0185\u0005&\u0000\u0000\u0185\u0186\u0003"+
					"\u000e\u0007\u0000\u0186\u0187\u0005\'\u0000\u0000\u0187\u0011\u0001\u0000"+
					"\u0000\u0000\u0188\u0189\u00052\u0000\u0000\u0189\u018a\u0005&\u0000\u0000"+
					"\u018a\u018b\u0003\"\u0011\u0000\u018b\u018c\u0005\'\u0000\u0000\u018c"+
					"\u0190\u0005(\u0000\u0000\u018d\u018f\u0003\u0002\u0001\u0000\u018e\u018d"+
					"\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e"+
					"\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193"+
					"\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0194"+
					"\u0005)\u0000\u0000\u0194\u0013\u0001\u0000\u0000\u0000\u0195\u0198\u0003"+
					"\u0016\u000b\u0000\u0196\u0198\u0003\u0018\f\u0000\u0197\u0195\u0001\u0000"+
					"\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198\u0015\u0001\u0000"+
					"\u0000\u0000\u0199\u019a\u0005/\u0000\u0000\u019a\u019c\u0005&\u0000\u0000"+
					"\u019b\u019d\u0003\u001a\r\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c"+
					"\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
					"\u01a1\u0005\'\u0000\u0000\u019f\u01a0\u00055\u0000\u0000\u01a0\u01a2"+
					"\u0003\"\u0011\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001"+
					"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005"+
					"+\u0000\u0000\u01a4\u01a5\u0003\u001e\u000f\u0000\u01a5\u01a9\u0005(\u0000"+
					"\u0000\u01a6\u01a8\u0003\u0002\u0001\u0000\u01a7\u01a6\u0001\u0000\u0000"+
					"\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
					"\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01b0\u0001\u0000\u0000"+
					"\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u00050\u0000\u0000"+
					"\u01ad\u01ae\u0003\u000e\u0007\u0000\u01ae\u01af\u0005,\u0000\u0000\u01af"+
					"\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ac\u0001\u0000\u0000\u0000\u01b0"+
					"\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
					"\u01b3\u0005)\u0000\u0000\u01b3\u0017\u0001\u0000\u0000\u0000\u01b4\u01b5"+
					"\u0005/\u0000\u0000\u01b5\u01b7\u0005&\u0000\u0000\u01b6\u01b8\u0003\u001a"+
					"\r\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
					"\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bc\u0005\'\u0000\u0000"+
					"\u01ba\u01bb\u00055\u0000\u0000\u01bb\u01bd\u0003\"\u0011\u0000\u01bc"+
					"\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd"+
					"\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0005+\u0000\u0000\u01bf\u01c0"+
					"\u0003\u001e\u000f\u0000\u01c0\u01c1\u0005.\u0000\u0000\u01c1\u01c2\u0003"+
					"\u000e\u0007\u0000\u01c2\u0019\u0001\u0000\u0000\u0000\u01c3\u01c8\u0003"+
					"\u001c\u000e\u0000\u01c4\u01c5\u0005*\u0000\u0000\u01c5\u01c7\u0003\u001c"+
					"\u000e\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000"+
					"\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
					"\u0000\u0000\u01c9\u001b\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000"+
					"\u0000\u0000\u01cb\u01cc\u0003\"\u0011\u0000\u01cc\u01cd\u0005+\u0000"+
					"\u0000\u01cd\u01ce\u0003 \u0010\u0000\u01ce\u001d\u0001\u0000\u0000\u0000"+
					"\u01cf\u01d2\u0003 \u0010\u0000\u01d0\u01d2\u0005\n\u0000\u0000\u01d1"+
					"\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2"+
					"\u001f\u0001\u0000\u0000\u0000\u01d3\u01d4\u0007\u0000\u0000\u0000\u01d4"+
					"!\u0001\u0000\u0000\u0000\u01d5\u01da\u0005\u0004\u0000\u0000\u01d6\u01d7"+
					"\u0003(\u0014\u0000\u01d7\u01d8\u0007\u0001\u0000\u0000\u01d8\u01da\u0001"+
					"\u0000\u0000\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000\u01d9\u01d6\u0001"+
					"\u0000\u0000\u0000\u01da\u01e0\u0001\u0000\u0000\u0000\u01db\u01df\u0003"+
					"(\u0014\u0000\u01dc\u01df\u0005\u0004\u0000\u0000\u01dd\u01df\u0005\u0005"+
					"\u0000\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000"+
					"\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000"+
					"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
					"\u0000\u0000\u01e1#\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000"+
					"\u0000\u01e3\u01e5\u0005\u000e\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000"+
					"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000"+
					"\u0000\u01e6\u01e8\u0005\u0005\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000"+
					"\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000"+
					"\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea%\u0001\u0000\u0000\u0000"+
					"\u01eb\u01ed\u0005\u000e\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000"+
					"\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000"+
					"\u01ee\u01f0\u0005\u0005\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000"+
					"\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000"+
					"\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
					"\u01f3\u01f5\u0005\u0001\u0000\u0000\u01f4\u01f6\u0005\u0005\u0000\u0000"+
					"\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000"+
					"\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000"+
					"\u01f8\'\u0001\u0000\u0000\u0000\u01f9\u0208\u0003\u001e\u000f\u0000\u01fa"+
					"\u0208\u0005/\u0000\u0000\u01fb\u0208\u00050\u0000\u0000\u01fc\u0208\u0005"+
					"1\u0000\u0000\u01fd\u0208\u00052\u0000\u0000\u01fe\u0208\u00053\u0000"+
					"\u0000\u01ff\u0208\u00054\u0000\u0000\u0200\u0208\u00055\u0000\u0000\u0201"+
					"\u0208\u00056\u0000\u0000\u0202\u0208\u00057\u0000\u0000\u0203\u0208\u0005"+
					"8\u0000\u0000\u0204\u0208\u00059\u0000\u0000\u0205\u0208\u0005\f\u0000"+
					"\u0000\u0206\u0208\u0005:\u0000\u0000\u0207\u01f9\u0001\u0000\u0000\u0000"+
					"\u0207\u01fa\u0001\u0000\u0000\u0000\u0207\u01fb\u0001\u0000\u0000\u0000"+
					"\u0207\u01fc\u0001\u0000\u0000\u0000\u0207\u01fd\u0001\u0000\u0000\u0000"+
					"\u0207\u01fe\u0001\u0000\u0000\u0000\u0207\u01ff\u0001\u0000\u0000\u0000"+
					"\u0207\u0200\u0001\u0000\u0000\u0000\u0207\u0201\u0001\u0000\u0000\u0000"+
					"\u0207\u0202\u0001\u0000\u0000\u0000\u0207\u0203\u0001\u0000\u0000\u0000"+
					"\u0207\u0204\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000"+
					"\u0207\u0206\u0001\u0000\u0000\u0000\u0208)\u0001\u0000\u0000\u00006-"+
					"EPX\\bipu~\u0083\u008a\u0092\u00a1\u00a5\u00ae\u00c0\u00c7\u00d4\u00d7"+
					"\u00e1\u00ea\u00f0\u00f6\u00ff\u010b\u0110\u0115\u011b\u0120\u0125\u0136"+
					"\u0143\u017e\u0180\u0190\u0197\u019c\u01a1\u01a9\u01b0\u01b7\u01bc\u01c8"+
					"\u01d1\u01d9\u01de\u01e0\u01e4\u01e9\u01ec\u01f1\u01f7\u0207";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}