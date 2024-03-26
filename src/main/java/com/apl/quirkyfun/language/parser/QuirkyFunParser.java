// Generated from QuirkyFun.g4 by ANTLR 4.13.1
package com.apl.quirkyfun.language.parser;
import com.apl.quirkyfun.language.listener.QuirkyFunListener;
import com.apl.quirkyfun.language.visitor.QuirkyFunVisitor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QuirkyFunParser extends Parser {
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
		RULE_function_call = 4, RULE_if_statement = 5, RULE_for_loop = 6, RULE_while_loop = 7, 
		RULE_switch_case = 8, RULE_run_catch = 9, RULE_variable_data_type = 10, 
		RULE_expression = 11, RULE_arguments = 12, RULE_to_bool = 13, RULE_catch_statement = 14, 
		RULE_return_lambda = 15, RULE_ternary_operator = 16, RULE_function = 17, 
		RULE_function_data_type = 18, RULE_parameter = 19, RULE_id = 20, RULE_boolean = 21, 
		RULE_number = 22, RULE_decimal = 23, RULE_string = 24, RULE_anychar = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "assignment", "function_call", 
			"if_statement", "for_loop", "while_loop", "switch_case", "run_catch", 
			"variable_data_type", "expression", "arguments", "to_bool", "catch_statement", 
			"return_lambda", "ternary_operator", "function", "function_data_type", 
			"parameter", "id", "boolean", "number", "decimal", "string", "anychar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'.'", "'\\\"'", null, null, null, "'\"'", 
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
	public String getGrammarFileName() { return "QuirkyFun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuirkyFunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QuirkyFunParser.EOF, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0) );
			setState(57);
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
	public static class FunctionStatementContext extends StatementContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCaseContext extends StatementContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public SwitchCaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends StatementContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ForLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStatementContext extends StatementContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public FunctionCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(QuirkyFunParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends StatementContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public WhileLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RunCatchContext extends StatementContext {
		public Run_catchContext run_catch() {
			return getRuleContext(Run_catchContext.class,0);
		}
		public RunCatchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterRunCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitRunCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitRunCatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				declaration();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(60);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				assignment();
				setState(64);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new FunctionCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				function_call();
				setState(67);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(PRINT);
				setState(70);
				match(LPAREN);
				setState(71);
				expression(0);
				setState(72);
				match(RPAREN);
				setState(73);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				function();
				}
				break;
			case 6:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				if_statement();
				}
				break;
			case 7:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				for_loop();
				}
				break;
			case 8:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				while_loop();
				}
				break;
			case 9:
				_localctx = new SwitchCaseContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				switch_case();
				}
				break;
			case 10:
				_localctx = new RunCatchContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(80);
				run_catch();
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
		public TerminalNode COLON() { return getToken(QuirkyFunParser.COLON, 0); }
		public TerminalNode FUNCTION_TYPE() { return getToken(QuirkyFunParser.FUNCTION_TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(QuirkyFunParser.ASSIGN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends DeclarationContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QuirkyFunParser.COLON, 0); }
		public Variable_data_typeContext variable_data_type() {
			return getRuleContext(Variable_data_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(QuirkyFunParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				id();
				setState(84);
				match(COLON);
				setState(85);
				variable_data_type();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(86);
					match(ASSIGN);
					setState(87);
					expression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				id();
				setState(91);
				match(COLON);
				setState(92);
				match(FUNCTION_TYPE);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(93);
					match(ASSIGN);
					setState(94);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentContext extends AssignmentContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(QuirkyFunParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			_localctx = new VariableAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			id();
			setState(100);
			match(ASSIGN);
			setState(101);
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
	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends Function_callContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			id();
			setState(104);
			match(LPAREN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 704821316288870L) != 0)) {
				{
				setState(105);
				arguments();
				}
			}

			setState(108);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(QuirkyFunParser.IF, 0); }
		public To_boolContext to_bool() {
			return getRuleContext(To_boolContext.class,0);
		}
		public List<TerminalNode> LBRACE() { return getTokens(QuirkyFunParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(QuirkyFunParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(QuirkyFunParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(QuirkyFunParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(QuirkyFunParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(QuirkyFunParser.ELSE, i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			to_bool();
			setState(112);
			match(LBRACE);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
				{
				{
				setState(113);
				statement();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(RBRACE);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(ELSE);
					setState(121);
					if_statement();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(127);
				match(ELSE);
				setState(128);
				match(LBRACE);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
					{
					{
					setState(129);
					statement();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(RBRACE);
				}
				break;
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
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(QuirkyFunParser.RUN, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(QuirkyFunParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(QuirkyFunParser.SEMICOLON, i);
		}
		public To_boolContext to_bool() {
			return getRuleContext(To_boolContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
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
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(RUN);
			setState(139);
			match(LPAREN);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(140);
				declaration();
				}
				break;
			case 2:
				{
				setState(141);
				expression(0);
				}
				break;
			}
			setState(144);
			match(SEMICOLON);
			setState(145);
			to_bool();
			setState(146);
			match(SEMICOLON);
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(147);
				assignment();
				}
				break;
			case 2:
				{
				setState(148);
				expression(0);
				}
				break;
			}
			setState(151);
			match(RPAREN);
			setState(152);
			match(LBRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
				{
				{
				setState(153);
				statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(RBRACE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(160);
				catch_statement();
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
	public static class While_loopContext extends ParserRuleContext {
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	 
		public While_loopContext() { }
		public void copyFrom(While_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileLoopCaseContext extends While_loopContext {
		public TerminalNode RUN() { return getToken(QuirkyFunParser.RUN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
		public TerminalNode CHECK() { return getToken(QuirkyFunParser.CHECK, 0); }
		public To_boolContext to_bool() {
			return getRuleContext(To_boolContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileLoopCaseContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterDoWhileLoopCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitDoWhileLoopCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitDoWhileLoopCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopCaseContext extends While_loopContext {
		public TerminalNode RUN() { return getToken(QuirkyFunParser.RUN, 0); }
		public TerminalNode CHECK() { return getToken(QuirkyFunParser.CHECK, 0); }
		public To_boolContext to_bool() {
			return getRuleContext(To_boolContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public WhileLoopCaseContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterWhileLoopCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitWhileLoopCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitWhileLoopCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_loop);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new WhileLoopCaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(RUN);
				setState(164);
				match(CHECK);
				setState(165);
				to_bool();
				setState(166);
				match(LBRACE);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
					{
					{
					setState(167);
					statement();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(RBRACE);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(174);
					catch_statement();
					}
				}

				}
				break;
			case 2:
				_localctx = new DoWhileLoopCaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(RUN);
				setState(178);
				match(LBRACE);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
					{
					{
					setState(179);
					statement();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(RBRACE);
				setState(186);
				match(CHECK);
				setState(187);
				to_bool();
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMICOLON:
					{
					setState(188);
					match(SEMICOLON);
					}
					break;
				case CATCH:
					{
					setState(189);
					catch_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(QuirkyFunParser.MATCH, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(QuirkyFunParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(QuirkyFunParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(QuirkyFunParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(QuirkyFunParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(QuirkyFunParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(QuirkyFunParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(QuirkyFunParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(QuirkyFunParser.RBRACE, i);
		}
		public List<TerminalNode> IS() { return getTokens(QuirkyFunParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(QuirkyFunParser.IS, i);
		}
		public TerminalNode ELSE() { return getToken(QuirkyFunParser.ELSE, 0); }
		public List<Return_lambdaContext> return_lambda() {
			return getRuleContexts(Return_lambdaContext.class);
		}
		public Return_lambdaContext return_lambda(int i) {
			return getRuleContext(Return_lambdaContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(QuirkyFunParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(QuirkyFunParser.SEMICOLON, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(MATCH);
			setState(195);
			match(LPAREN);
			setState(196);
			expression(0);
			setState(197);
			match(RPAREN);
			setState(198);
			match(LBRACE);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				match(IS);
				setState(200);
				match(LPAREN);
				setState(201);
				expression(0);
				setState(202);
				match(RPAREN);
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					{
					setState(203);
					match(LBRACE);
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
						{
						{
						setState(204);
						statement();
						}
						}
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(210);
					match(RBRACE);
					}
					}
					break;
				case ARROW:
					{
					{
					setState(211);
					return_lambda();
					setState(212);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IS );
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(220);
				match(ELSE);
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					{
					setState(221);
					match(LBRACE);
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
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
					break;
				case ARROW:
					{
					{
					setState(229);
					return_lambda();
					setState(230);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(236);
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
	public static class Run_catchContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(QuirkyFunParser.RUN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Run_catchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run_catch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterRun_catch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitRun_catch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitRun_catch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Run_catchContext run_catch() throws RecognitionException {
		Run_catchContext _localctx = new Run_catchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_run_catch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(RUN);
			setState(239);
			match(LBRACE);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
				{
				{
				setState(240);
				statement();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			match(RBRACE);
			setState(247);
			catch_statement();
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
		public Variable_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_data_type; }
	 
		public Variable_data_typeContext() { }
		public void copyFrom(Variable_data_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringDataTypeContext extends Variable_data_typeContext {
		public TerminalNode STRING_TYPE() { return getToken(QuirkyFunParser.STRING_TYPE, 0); }
		public StringDataTypeContext(Variable_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterStringDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitStringDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitStringDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalDataTypeContext extends Variable_data_typeContext {
		public TerminalNode DECIMAL_TYPE() { return getToken(QuirkyFunParser.DECIMAL_TYPE, 0); }
		public DecimalDataTypeContext(Variable_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterDecimalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitDecimalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitDecimalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberDataTypeContext extends Variable_data_typeContext {
		public TerminalNode NUMBER_TYPE() { return getToken(QuirkyFunParser.NUMBER_TYPE, 0); }
		public NumberDataTypeContext(Variable_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterNumberDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitNumberDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitNumberDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanDataTypeContext extends Variable_data_typeContext {
		public TerminalNode BOOL_TYPE() { return getToken(QuirkyFunParser.BOOL_TYPE, 0); }
		public BooleanDataTypeContext(Variable_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterBooleanDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitBooleanDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitBooleanDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_data_typeContext variable_data_type() throws RecognitionException {
		Variable_data_typeContext _localctx = new Variable_data_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_data_type);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TYPE:
				_localctx = new BooleanDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(BOOL_TYPE);
				}
				break;
			case NUMBER_TYPE:
				_localctx = new NumberDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(NUMBER_TYPE);
				}
				break;
			case DECIMAL_TYPE:
				_localctx = new DecimalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(DECIMAL_TYPE);
				}
				break;
			case STRING_TYPE:
				_localctx = new StringDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(STRING_TYPE);
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
		public TerminalNode DEC() { return getToken(QuirkyFunParser.DEC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XnorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XNOR() { return getToken(QuirkyFunParser.XNOR, 0); }
		public XnorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterXnorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitXnorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitXnorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ExpressionContext {
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public BooleanLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualsExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(QuirkyFunParser.NEQ, 0); }
		public NotEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterNotEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitNotEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitNotEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(QuirkyFunParser.XOR, 0); }
		public XorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(QuirkyFunParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryOperatorExpressionContext extends ExpressionContext {
		public Ternary_operatorContext ternary_operator() {
			return getRuleContext(Ternary_operatorContext.class,0);
		}
		public TernaryOperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterTernaryOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitTernaryOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitTernaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(QuirkyFunParser.GT, 0); }
		public GreaterThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterGreaterThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitGreaterThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitGreaterThanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(QuirkyFunParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ToBoolExpressionContext extends ExpressionContext {
		public To_boolContext to_bool() {
			return getRuleContext(To_boolContext.class,0);
		}
		public ToBoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterToBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitToBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitToBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ExpressionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(QuirkyFunParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementExpressionContext extends ExpressionContext {
		public TerminalNode INC() { return getToken(QuirkyFunParser.INC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ExpressionContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public DecimalLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SummationExpressionContext extends ExpressionContext {
		public TerminalNode SUMM() { return getToken(QuirkyFunParser.SUMM, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterSummationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitSummationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitSummationExpression(this);
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
		public TerminalNode DIV() { return getToken(QuirkyFunParser.DIV, 0); }
		public DivisionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterDivisionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitDivisionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitDivisionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProdSummationExpressionContext extends ExpressionContext {
		public TerminalNode PRODSUMM() { return getToken(QuirkyFunParser.PRODSUMM, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterProdSummationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitProdSummationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitProdSummationExpression(this);
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
		public TerminalNode PLUS() { return getToken(QuirkyFunParser.PLUS, 0); }
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitAdditionExpression(this);
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
		public TerminalNode EXP() { return getToken(QuirkyFunParser.EXP, 0); }
		public ExponentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterExponentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitExponentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitExponentExpression(this);
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
		public TerminalNode MOD() { return getToken(QuirkyFunParser.MOD, 0); }
		public ModulusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterModulusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitModulusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitModulusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitBracketExpression(this);
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
		public TerminalNode MINUS() { return getToken(QuirkyFunParser.MINUS, 0); }
		public SubtractionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterSubtractionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitSubtractionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitSubtractionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NandExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NAND() { return getToken(QuirkyFunParser.NAND, 0); }
		public NandExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterNandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitNandExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitNandExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOrEqualsExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(QuirkyFunParser.GTE, 0); }
		public GreaterThanOrEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterGreaterThanOrEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitGreaterThanOrEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitGreaterThanOrEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitStringLiteral(this);
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
		public TerminalNode ROOT() { return getToken(QuirkyFunParser.ROOT, 0); }
		public RootExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterRootExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitRootExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitRootExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOrEqualsExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LTE() { return getToken(QuirkyFunParser.LTE, 0); }
		public LessThanOrEqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterLessThanOrEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitLessThanOrEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitLessThanOrEqualsExpression(this);
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
		public TerminalNode MULT() { return getToken(QuirkyFunParser.MULT, 0); }
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOR() { return getToken(QuirkyFunParser.NOR, 0); }
		public NorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterNorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitNorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitNorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(QuirkyFunParser.EQ, 0); }
		public EqualsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(QuirkyFunParser.LT, 0); }
		public LessThanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterLessThanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitLessThanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitLessThanExpression(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				_localctx = new IncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(256);
				match(INC);
				setState(257);
				expression(34);
				}
				break;
			case 2:
				{
				_localctx = new DecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(DEC);
				setState(259);
				expression(33);
				}
				break;
			case 3:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(NOT);
				setState(261);
				expression(13);
				}
				break;
			case 4:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(LPAREN);
				setState(263);
				expression(0);
				setState(264);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ToBoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				to_bool();
				}
				break;
			case 6:
				{
				_localctx = new TernaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				ternary_operator();
				}
				break;
			case 7:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				function();
				}
				break;
			case 8:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				function_call();
				}
				break;
			case 9:
				{
				_localctx = new SummationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(270);
					number();
					}
					break;
				case LETTER:
					{
					setState(271);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(274);
				match(SUMM);
				setState(277);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(275);
					number();
					}
					break;
				case LETTER:
					{
					setState(276);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(279);
				match(LPAREN);
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PASS:
					{
					setState(280);
					function();
					}
					break;
				case LETTER:
					{
					setState(281);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(284);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ProdSummationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(286);
					number();
					}
					break;
				case LETTER:
					{
					setState(287);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(290);
				match(PRODSUMM);
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(291);
					number();
					}
					break;
				case LETTER:
					{
					setState(292);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295);
				match(LPAREN);
				setState(298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PASS:
					{
					setState(296);
					function();
					}
					break;
				case LETTER:
					{
					setState(297);
					id();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300);
				match(RPAREN);
				}
				break;
			case 11:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				id();
				}
				break;
			case 12:
				{
				_localctx = new NumberLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				number();
				}
				break;
			case 13:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				decimal();
				}
				break;
			case 14:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				boolean_();
				}
				break;
			case 15:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				string();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(310);
						match(PLUS);
						setState(311);
						expression(33);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(313);
						match(MINUS);
						setState(314);
						expression(32);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(316);
						match(MULT);
						setState(317);
						expression(31);
						}
						break;
					case 4:
						{
						_localctx = new DivisionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(319);
						match(DIV);
						setState(320);
						expression(30);
						}
						break;
					case 5:
						{
						_localctx = new ModulusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(322);
						match(MOD);
						setState(323);
						expression(29);
						}
						break;
					case 6:
						{
						_localctx = new ExponentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(325);
						match(EXP);
						setState(326);
						expression(28);
						}
						break;
					case 7:
						{
						_localctx = new RootExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(328);
						match(ROOT);
						setState(329);
						expression(27);
						}
						break;
					case 8:
						{
						_localctx = new EqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(331);
						match(EQ);
						setState(332);
						expression(26);
						}
						break;
					case 9:
						{
						_localctx = new NotEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(334);
						match(NEQ);
						setState(335);
						expression(25);
						}
						break;
					case 10:
						{
						_localctx = new GreaterThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(337);
						match(GT);
						setState(338);
						expression(24);
						}
						break;
					case 11:
						{
						_localctx = new LessThanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(340);
						match(LT);
						setState(341);
						expression(23);
						}
						break;
					case 12:
						{
						_localctx = new GreaterThanOrEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(343);
						match(GTE);
						setState(344);
						expression(22);
						}
						break;
					case 13:
						{
						_localctx = new LessThanOrEqualsExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(346);
						match(LTE);
						setState(347);
						expression(21);
						}
						break;
					case 14:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(349);
						match(AND);
						setState(350);
						expression(20);
						}
						break;
					case 15:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(351);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(352);
						match(OR);
						setState(353);
						expression(19);
						}
						break;
					case 16:
						{
						_localctx = new XorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(355);
						match(XOR);
						setState(356);
						expression(18);
						}
						break;
					case 17:
						{
						_localctx = new NandExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(358);
						match(NAND);
						setState(359);
						expression(17);
						}
						break;
					case 18:
						{
						_localctx = new NorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(361);
						match(NOR);
						setState(362);
						expression(16);
						}
						break;
					case 19:
						{
						_localctx = new XnorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(364);
						match(XNOR);
						setState(365);
						expression(15);
						}
						break;
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QuirkyFunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QuirkyFunParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			expression(0);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(373);
				expression(0);
				}
				}
				setState(378);
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
	public static class To_boolContext extends ParserRuleContext {
		public TerminalNode QUESTMARK() { return getToken(QuirkyFunParser.QUESTMARK, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public To_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterTo_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitTo_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitTo_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final To_boolContext to_bool() throws RecognitionException {
		To_boolContext _localctx = new To_boolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_to_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(QUESTMARK);
			setState(380);
			match(LPAREN);
			setState(381);
			expression(0);
			setState(382);
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
	public static class Catch_statementContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(QuirkyFunParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_catch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(CATCH);
			setState(385);
			match(LPAREN);
			setState(386);
			id();
			setState(387);
			match(RPAREN);
			setState(388);
			match(LBRACE);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
				{
				{
				setState(389);
				statement();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
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
	public static class Return_lambdaContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(QuirkyFunParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_lambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterReturn_lambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitReturn_lambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitReturn_lambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_lambdaContext return_lambda() throws RecognitionException {
		Return_lambdaContext _localctx = new Return_lambdaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_return_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(ARROW);
			setState(398);
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
	public static class Ternary_operatorContext extends ParserRuleContext {
		public To_boolContext to_bool() {
			return getRuleContext(To_boolContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(QuirkyFunParser.ARROW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(QuirkyFunParser.COLON, 0); }
		public Ternary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterTernary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitTernary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitTernary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_operatorContext ternary_operator() throws RecognitionException {
		Ternary_operatorContext _localctx = new Ternary_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ternary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			to_bool();
			setState(401);
			match(ARROW);
			setState(402);
			expression(0);
			setState(403);
			match(COLON);
			setState(404);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(QuirkyFunParser.PASS, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(QuirkyFunParser.COLON, 0); }
		public Function_data_typeContext function_data_type() {
			return getRuleContext(Function_data_typeContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode TO() { return getToken(QuirkyFunParser.TO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
		public Return_lambdaContext return_lambda() {
			return getRuleContext(Return_lambdaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QuirkyFunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QuirkyFunParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode GIVE() { return getToken(QuirkyFunParser.GIVE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(PASS);
			setState(407);
			match(LPAREN);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER) {
				{
				setState(408);
				parameter();
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(409);
					match(COMMA);
					setState(410);
					parameter();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(418);
			match(RPAREN);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(419);
				match(TO);
				setState(420);
				id();
				}
			}

			setState(423);
			match(COLON);
			setState(424);
			function_data_type();
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(425);
				match(LBRACE);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 741405088655867936L) != 0)) {
					{
					{
					setState(426);
					statement();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GIVE) {
					{
					setState(432);
					match(GIVE);
					setState(433);
					expression(0);
					setState(434);
					match(SEMICOLON);
					}
				}

				setState(438);
				match(RBRACE);
				}
				}
				break;
			case ARROW:
				{
				{
				setState(439);
				return_lambda();
				setState(440);
				match(SEMICOLON);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Function_data_typeContext extends ParserRuleContext {
		public Function_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_data_type; }
	 
		public Function_data_typeContext() { }
		public void copyFrom(Function_data_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDataTypeContext extends Function_data_typeContext {
		public TerminalNode FUNCTION_TYPE() { return getToken(QuirkyFunParser.FUNCTION_TYPE, 0); }
		public FunctionDataTypeContext(Function_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunctionDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunctionDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunctionDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableFunctionDataTypeContext extends Function_data_typeContext {
		public Variable_data_typeContext variable_data_type() {
			return getRuleContext(Variable_data_typeContext.class,0);
		}
		public VariableFunctionDataTypeContext(Function_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterVariableFunctionDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitVariableFunctionDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitVariableFunctionDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidFunctionDataTypeContext extends Function_data_typeContext {
		public TerminalNode VOID_TYPE() { return getToken(QuirkyFunParser.VOID_TYPE, 0); }
		public VoidFunctionDataTypeContext(Function_data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterVoidFunctionDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitVoidFunctionDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitVoidFunctionDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_data_typeContext function_data_type() throws RecognitionException {
		Function_data_typeContext _localctx = new Function_data_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_data_type);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TYPE:
			case NUMBER_TYPE:
			case DECIMAL_TYPE:
			case STRING_TYPE:
				_localctx = new VariableFunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				variable_data_type();
				}
				break;
			case FUNCTION_TYPE:
				_localctx = new FunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(FUNCTION_TYPE);
				}
				break;
			case VOID_TYPE:
				_localctx = new VoidFunctionDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
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
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParameterContext extends ParameterContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QuirkyFunParser.COLON, 0); }
		public Variable_data_typeContext variable_data_type() {
			return getRuleContext(Variable_data_typeContext.class,0);
		}
		public FunctionParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		try {
			_localctx = new FunctionParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			id();
			setState(450);
			match(COLON);
			setState(451);
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
	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(QuirkyFunParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(QuirkyFunParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(QuirkyFunParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirkyFunParser.DIGIT, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(LETTER);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(454);
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
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		public List<TerminalNode> DIGIT() { return getTokens(QuirkyFunParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirkyFunParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
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
		public List<TerminalNode> DIGIT() { return getTokens(QuirkyFunParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirkyFunParser.DIGIT, i);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decimal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(467);
				match(DIGIT);
				}
				}
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(472);
			match(T__2);
			setState(474); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(473);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(476); 
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
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(QuirkyFunParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(QuirkyFunParser.QUOTE, i);
		}
		public List<AnycharContext> anychar() {
			return getRuleContexts(AnycharContext.class);
		}
		public AnycharContext anychar(int i) {
			return getRuleContext(AnycharContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(QUOTE);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(479);
					anychar();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(485);
			match(QUOTE);
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
		public TerminalNode LETTER() { return getToken(QuirkyFunParser.LETTER, 0); }
		public TerminalNode DIGIT() { return getToken(QuirkyFunParser.DIGIT, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(QuirkyFunParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(QuirkyFunParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public TerminalNode QUESTMARK() { return getToken(QuirkyFunParser.QUESTMARK, 0); }
		public TerminalNode NOT() { return getToken(QuirkyFunParser.NOT, 0); }
		public TerminalNode OR() { return getToken(QuirkyFunParser.OR, 0); }
		public TerminalNode AND() { return getToken(QuirkyFunParser.AND, 0); }
		public TerminalNode XOR() { return getToken(QuirkyFunParser.XOR, 0); }
		public TerminalNode PLUS() { return getToken(QuirkyFunParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(QuirkyFunParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(QuirkyFunParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(QuirkyFunParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(QuirkyFunParser.MOD, 0); }
		public TerminalNode SUMM() { return getToken(QuirkyFunParser.SUMM, 0); }
		public TerminalNode OTHER_SYMBOL() { return getToken(QuirkyFunParser.OTHER_SYMBOL, 0); }
		public AnycharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anychar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).enterAnychar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener ) ((QuirkyFunListener)listener).exitAnychar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor ) return ((QuirkyFunVisitor<? extends T>)visitor).visitAnychar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_anychar);
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 32);
		case 1:
			return precpred(_ctx, 31);
		case 2:
			return precpred(_ctx, 30);
		case 3:
			return precpred(_ctx, 29);
		case 4:
			return precpred(_ctx, 28);
		case 5:
			return precpred(_ctx, 27);
		case 6:
			return precpred(_ctx, 26);
		case 7:
			return precpred(_ctx, 25);
		case 8:
			return precpred(_ctx, 24);
		case 9:
			return precpred(_ctx, 23);
		case 10:
			return precpred(_ctx, 22);
		case 11:
			return precpred(_ctx, 21);
		case 12:
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 18);
		case 15:
			return precpred(_ctx, 17);
		case 16:
			return precpred(_ctx, 16);
		case 17:
			return precpred(_ctx, 15);
		case 18:
			return precpred(_ctx, 14);
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
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		">\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001R\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002Y\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002`\b\u0002\u0003\u0002"+
		"b\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004k\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005s\b\u0005"+
		"\n\u0005\f\u0005v\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"{\b\u0005\n\u0005\f\u0005~\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0083\b\u0005\n\u0005\f\u0005\u0086\t\u0005\u0001\u0005\u0003"+
		"\u0005\u0089\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u008f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0096\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u009b\b\u0006\n\u0006\f\u0006\u009e\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a2\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00a9\b\u0007\n\u0007\f\u0007\u00ac\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00b0\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00b5\b\u0007\n\u0007\f\u0007\u00b8\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bf\b\u0007"+
		"\u0003\u0007\u00c1\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ce\b\b\n\b\f\b\u00d1"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d7\b\b\u0004\b\u00d9\b"+
		"\b\u000b\b\f\b\u00da\u0001\b\u0001\b\u0001\b\u0005\b\u00e0\b\b\n\b\f\b"+
		"\u00e3\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e9\b\b\u0003\b\u00eb"+
		"\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00f2\b\t\n\t\f\t"+
		"\u00f5\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00fe\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0111\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0116\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011b\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0121"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0126\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u012b\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0134\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u016f\b\u000b\n\u000b\f\u000b\u0172\t\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0177\b\f\n\f\f\f\u017a\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0187\b\u000e\n\u000e\f\u000e\u018a\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u019c\b\u0011\n\u0011\f\u0011"+
		"\u019f\t\u0011\u0003\u0011\u01a1\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u01a6\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u01ac\b\u0011\n\u0011\f\u0011\u01af\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01b5\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01bb\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01c0\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u01c8\b\u0014"+
		"\n\u0014\f\u0014\u01cb\t\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0004"+
		"\u0016\u01d0\b\u0016\u000b\u0016\f\u0016\u01d1\u0001\u0017\u0004\u0017"+
		"\u01d5\b\u0017\u000b\u0017\f\u0017\u01d6\u0001\u0017\u0001\u0017\u0004"+
		"\u0017\u01db\b\u0017\u000b\u0017\f\u0017\u01dc\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u01e1\b\u0018\n\u0018\f\u0018\u01e4\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u01e2\u0001\u0016\u001a"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02\u0000\u0003\u0001\u0000\u0005\u0006\u0001\u0000"+
		"\u0001\u0002\u0006\u0000\u0004\u0007\u000f\u0013\u0017\u0017!#&&(/\u022d"+
		"\u00005\u0001\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004a"+
		"\u0001\u0000\u0000\u0000\u0006c\u0001\u0000\u0000\u0000\bg\u0001\u0000"+
		"\u0000\u0000\nn\u0001\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000\u0000"+
		"\u000e\u00c0\u0001\u0000\u0000\u0000\u0010\u00c2\u0001\u0000\u0000\u0000"+
		"\u0012\u00ee\u0001\u0000\u0000\u0000\u0014\u00fd\u0001\u0000\u0000\u0000"+
		"\u0016\u0133\u0001\u0000\u0000\u0000\u0018\u0173\u0001\u0000\u0000\u0000"+
		"\u001a\u017b\u0001\u0000\u0000\u0000\u001c\u0180\u0001\u0000\u0000\u0000"+
		"\u001e\u018d\u0001\u0000\u0000\u0000 \u0190\u0001\u0000\u0000\u0000\""+
		"\u0196\u0001\u0000\u0000\u0000$\u01bf\u0001\u0000\u0000\u0000&\u01c1\u0001"+
		"\u0000\u0000\u0000(\u01c5\u0001\u0000\u0000\u0000*\u01cc\u0001\u0000\u0000"+
		"\u0000,\u01cf\u0001\u0000\u0000\u0000.\u01d4\u0001\u0000\u0000\u00000"+
		"\u01de\u0001\u0000\u0000\u00002\u01e7\u0001\u0000\u0000\u000046\u0003"+
		"\u0002\u0001\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009:\u0005\u0000\u0000\u0001:\u0001\u0001\u0000\u0000\u0000;=\u0003"+
		"\u0004\u0002\u0000<>\u0005.\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>R\u0001\u0000\u0000\u0000?@\u0003\u0006\u0003\u0000"+
		"@A\u0005.\u0000\u0000AR\u0001\u0000\u0000\u0000BC\u0003\b\u0004\u0000"+
		"CD\u0005.\u0000\u0000DR\u0001\u0000\u0000\u0000EF\u0005;\u0000\u0000F"+
		"G\u0005(\u0000\u0000GH\u0003\u0016\u000b\u0000HI\u0005)\u0000\u0000IJ"+
		"\u0005.\u0000\u0000JR\u0001\u0000\u0000\u0000KR\u0003\"\u0011\u0000LR"+
		"\u0003\n\u0005\u0000MR\u0003\f\u0006\u0000NR\u0003\u000e\u0007\u0000O"+
		"R\u0003\u0010\b\u0000PR\u0003\u0012\t\u0000Q;\u0001\u0000\u0000\u0000"+
		"Q?\u0001\u0000\u0000\u0000QB\u0001\u0000\u0000\u0000QE\u0001\u0000\u0000"+
		"\u0000QK\u0001\u0000\u0000\u0000QL\u0001\u0000\u0000\u0000QM\u0001\u0000"+
		"\u0000\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000R\u0003\u0001\u0000\u0000\u0000ST\u0003(\u0014\u0000"+
		"TU\u0005-\u0000\u0000UX\u0003\u0014\n\u0000VW\u0005\u001a\u0000\u0000"+
		"WY\u0003\u0016\u000b\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Yb\u0001\u0000\u0000\u0000Z[\u0003(\u0014\u0000[\\\u0005-\u0000"+
		"\u0000\\_\u0005\u000e\u0000\u0000]^\u0005\u001a\u0000\u0000^`\u0003\""+
		"\u0011\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000aS\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000"+
		"b\u0005\u0001\u0000\u0000\u0000cd\u0003(\u0014\u0000de\u0005\u001a\u0000"+
		"\u0000ef\u0003\u0016\u000b\u0000f\u0007\u0001\u0000\u0000\u0000gh\u0003"+
		"(\u0014\u0000hj\u0005(\u0000\u0000ik\u0003\u0018\f\u0000ji\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005"+
		")\u0000\u0000m\t\u0001\u0000\u0000\u0000no\u00059\u0000\u0000op\u0003"+
		"\u001a\r\u0000pt\u0005*\u0000\u0000qs\u0003\u0002\u0001\u0000rq\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000w|\u0005+\u0000\u0000xy\u0005:\u0000\u0000y{\u0003\n\u0005\u0000"+
		"zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u0088\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005:\u0000\u0000\u0080\u0084\u0005*\u0000"+
		"\u0000\u0081\u0083\u0003\u0002\u0001\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089\u0005+\u0000\u0000"+
		"\u0088\u007f\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u000b\u0001\u0000\u0000\u0000\u008a\u008b\u00053\u0000\u0000\u008b"+
		"\u008e\u0005(\u0000\u0000\u008c\u008f\u0003\u0004\u0002\u0000\u008d\u008f"+
		"\u0003\u0016\u000b\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005.\u0000\u0000\u0091\u0092\u0003"+
		"\u001a\r\u0000\u0092\u0095\u0005.\u0000\u0000\u0093\u0096\u0003\u0006"+
		"\u0003\u0000\u0094\u0096\u0003\u0016\u000b\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005)\u0000"+
		"\u0000\u0098\u009c\u0005*\u0000\u0000\u0099\u009b\u0003\u0002\u0001\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0005+\u0000\u0000\u00a0\u00a2\u0003\u001c\u000e\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\r\u0001\u0000\u0000\u0000\u00a3\u00a4\u00053\u0000\u0000\u00a4\u00a5"+
		"\u00055\u0000\u0000\u00a5\u00a6\u0003\u001a\r\u0000\u00a6\u00aa\u0005"+
		"*\u0000\u0000\u00a7\u00a9\u0003\u0002\u0001\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00af\u0005+\u0000"+
		"\u0000\u00ae\u00b0\u0003\u001c\u000e\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u00053\u0000\u0000\u00b2\u00b6\u0005*\u0000\u0000\u00b3"+
		"\u00b5\u0003\u0002\u0001\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005+\u0000\u0000\u00ba\u00bb"+
		"\u00055\u0000\u0000\u00bb\u00be\u0003\u001a\r\u0000\u00bc\u00bf\u0005"+
		".\u0000\u0000\u00bd\u00bf\u0003\u001c\u000e\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c0\u00a3\u0001\u0000\u0000\u0000\u00c0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00c1\u000f\u0001\u0000\u0000\u0000\u00c2\u00c3\u00056\u0000"+
		"\u0000\u00c3\u00c4\u0005(\u0000\u0000\u00c4\u00c5\u0003\u0016\u000b\u0000"+
		"\u00c5\u00c6\u0005)\u0000\u0000\u00c6\u00d8\u0005*\u0000\u0000\u00c7\u00c8"+
		"\u00057\u0000\u0000\u00c8\u00c9\u0005(\u0000\u0000\u00c9\u00ca\u0003\u0016"+
		"\u000b\u0000\u00ca\u00d6\u0005)\u0000\u0000\u00cb\u00cf\u0005*\u0000\u0000"+
		"\u00cc\u00ce\u0003\u0002\u0001\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d7\u0005+\u0000\u0000\u00d3"+
		"\u00d4\u0003\u001e\u000f\u0000\u00d4\u00d5\u0005.\u0000\u0000\u00d5\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d6\u00cb\u0001\u0000\u0000\u0000\u00d6\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00c7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00ea"+
		"\u0001\u0000\u0000\u0000\u00dc\u00e8\u0005:\u0000\u0000\u00dd\u00e1\u0005"+
		"*\u0000\u0000\u00de\u00e0\u0003\u0002\u0001\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e9\u0005+\u0000"+
		"\u0000\u00e5\u00e6\u0003\u001e\u000f\u0000\u00e6\u00e7\u0005.\u0000\u0000"+
		"\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ea\u00dc\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005+\u0000\u0000\u00ed"+
		"\u0011\u0001\u0000\u0000\u0000\u00ee\u00ef\u00053\u0000\u0000\u00ef\u00f3"+
		"\u0005*\u0000\u0000\u00f0\u00f2\u0003\u0002\u0001\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"+\u0000\u0000\u00f7\u00f8\u0003\u001c\u000e\u0000\u00f8\u0013\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fe\u0005\t\u0000\u0000\u00fa\u00fe\u0005\n\u0000"+
		"\u0000\u00fb\u00fe\u0005\u000b\u0000\u0000\u00fc\u00fe\u0005\f\u0000\u0000"+
		"\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u0015\u0001\u0000\u0000\u0000\u00ff\u0100\u0006\u000b\uffff\uffff"+
		"\u0000\u0100\u0101\u0005\u0014\u0000\u0000\u0101\u0134\u0003\u0016\u000b"+
		"\"\u0102\u0103\u0005\u0015\u0000\u0000\u0103\u0134\u0003\u0016\u000b!"+
		"\u0104\u0105\u0005#\u0000\u0000\u0105\u0134\u0003\u0016\u000b\r\u0106"+
		"\u0107\u0005(\u0000\u0000\u0107\u0108\u0003\u0016\u000b\u0000\u0108\u0109"+
		"\u0005)\u0000\u0000\u0109\u0134\u0001\u0000\u0000\u0000\u010a\u0134\u0003"+
		"\u001a\r\u0000\u010b\u0134\u0003 \u0010\u0000\u010c\u0134\u0003\"\u0011"+
		"\u0000\u010d\u0134\u0003\b\u0004\u0000\u010e\u0111\u0003,\u0016\u0000"+
		"\u010f\u0111\u0003(\u0014\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0115\u0005\u0017\u0000\u0000\u0113\u0116\u0003,\u0016\u0000\u0114\u0116"+
		"\u0003(\u0014\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011a\u0005"+
		"(\u0000\u0000\u0118\u011b\u0003\"\u0011\u0000\u0119\u011b\u0003(\u0014"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005)\u0000\u0000"+
		"\u011d\u0134\u0001\u0000\u0000\u0000\u011e\u0121\u0003,\u0016\u0000\u011f"+
		"\u0121\u0003(\u0014\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0125"+
		"\u0005\u0018\u0000\u0000\u0123\u0126\u0003,\u0016\u0000\u0124\u0126\u0003"+
		"(\u0014\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u012a\u0005(\u0000"+
		"\u0000\u0128\u012b\u0003\"\u0011\u0000\u0129\u012b\u0003(\u0014\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0005)\u0000\u0000\u012d"+
		"\u0134\u0001\u0000\u0000\u0000\u012e\u0134\u0003(\u0014\u0000\u012f\u0134"+
		"\u0003,\u0016\u0000\u0130\u0134\u0003.\u0017\u0000\u0131\u0134\u0003*"+
		"\u0015\u0000\u0132\u0134\u00030\u0018\u0000\u0133\u00ff\u0001\u0000\u0000"+
		"\u0000\u0133\u0102\u0001\u0000\u0000\u0000\u0133\u0104\u0001\u0000\u0000"+
		"\u0000\u0133\u0106\u0001\u0000\u0000\u0000\u0133\u010a\u0001\u0000\u0000"+
		"\u0000\u0133\u010b\u0001\u0000\u0000\u0000\u0133\u010c\u0001\u0000\u0000"+
		"\u0000\u0133\u010d\u0001\u0000\u0000\u0000\u0133\u0110\u0001\u0000\u0000"+
		"\u0000\u0133\u0120\u0001\u0000\u0000\u0000\u0133\u012e\u0001\u0000\u0000"+
		"\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u0170\u0001\u0000\u0000\u0000\u0135\u0136\n \u0000\u0000"+
		"\u0136\u0137\u0005\u000f\u0000\u0000\u0137\u016f\u0003\u0016\u000b!\u0138"+
		"\u0139\n\u001f\u0000\u0000\u0139\u013a\u0005\u0010\u0000\u0000\u013a\u016f"+
		"\u0003\u0016\u000b \u013b\u013c\n\u001e\u0000\u0000\u013c\u013d\u0005"+
		"\u0011\u0000\u0000\u013d\u016f\u0003\u0016\u000b\u001f\u013e\u013f\n\u001d"+
		"\u0000\u0000\u013f\u0140\u0005\u0012\u0000\u0000\u0140\u016f\u0003\u0016"+
		"\u000b\u001e\u0141\u0142\n\u001c\u0000\u0000\u0142\u0143\u0005\u0013\u0000"+
		"\u0000\u0143\u016f\u0003\u0016\u000b\u001d\u0144\u0145\n\u001b\u0000\u0000"+
		"\u0145\u0146\u0005\u0016\u0000\u0000\u0146\u016f\u0003\u0016\u000b\u001c"+
		"\u0147\u0148\n\u001a\u0000\u0000\u0148\u0149\u0005\u0019\u0000\u0000\u0149"+
		"\u016f\u0003\u0016\u000b\u001b\u014a\u014b\n\u0019\u0000\u0000\u014b\u014c"+
		"\u0005\u001b\u0000\u0000\u014c\u016f\u0003\u0016\u000b\u001a\u014d\u014e"+
		"\n\u0018\u0000\u0000\u014e\u014f\u0005\u001c\u0000\u0000\u014f\u016f\u0003"+
		"\u0016\u000b\u0019\u0150\u0151\n\u0017\u0000\u0000\u0151\u0152\u0005\u001d"+
		"\u0000\u0000\u0152\u016f\u0003\u0016\u000b\u0018\u0153\u0154\n\u0016\u0000"+
		"\u0000\u0154\u0155\u0005\u001e\u0000\u0000\u0155\u016f\u0003\u0016\u000b"+
		"\u0017\u0156\u0157\n\u0015\u0000\u0000\u0157\u0158\u0005\u001f\u0000\u0000"+
		"\u0158\u016f\u0003\u0016\u000b\u0016\u0159\u015a\n\u0014\u0000\u0000\u015a"+
		"\u015b\u0005 \u0000\u0000\u015b\u016f\u0003\u0016\u000b\u0015\u015c\u015d"+
		"\n\u0013\u0000\u0000\u015d\u015e\u0005!\u0000\u0000\u015e\u016f\u0003"+
		"\u0016\u000b\u0014\u015f\u0160\n\u0012\u0000\u0000\u0160\u0161\u0005\""+
		"\u0000\u0000\u0161\u016f\u0003\u0016\u000b\u0013\u0162\u0163\n\u0011\u0000"+
		"\u0000\u0163\u0164\u0005&\u0000\u0000\u0164\u016f\u0003\u0016\u000b\u0012"+
		"\u0165\u0166\n\u0010\u0000\u0000\u0166\u0167\u0005$\u0000\u0000\u0167"+
		"\u016f\u0003\u0016\u000b\u0011\u0168\u0169\n\u000f\u0000\u0000\u0169\u016a"+
		"\u0005%\u0000\u0000\u016a\u016f\u0003\u0016\u000b\u0010\u016b\u016c\n"+
		"\u000e\u0000\u0000\u016c\u016d\u0005\'\u0000\u0000\u016d\u016f\u0003\u0016"+
		"\u000b\u000f\u016e\u0135\u0001\u0000\u0000\u0000\u016e\u0138\u0001\u0000"+
		"\u0000\u0000\u016e\u013b\u0001\u0000\u0000\u0000\u016e\u013e\u0001\u0000"+
		"\u0000\u0000\u016e\u0141\u0001\u0000\u0000\u0000\u016e\u0144\u0001\u0000"+
		"\u0000\u0000\u016e\u0147\u0001\u0000\u0000\u0000\u016e\u014a\u0001\u0000"+
		"\u0000\u0000\u016e\u014d\u0001\u0000\u0000\u0000\u016e\u0150\u0001\u0000"+
		"\u0000\u0000\u016e\u0153\u0001\u0000\u0000\u0000\u016e\u0156\u0001\u0000"+
		"\u0000\u0000\u016e\u0159\u0001\u0000\u0000\u0000\u016e\u015c\u0001\u0000"+
		"\u0000\u0000\u016e\u015f\u0001\u0000\u0000\u0000\u016e\u0162\u0001\u0000"+
		"\u0000\u0000\u016e\u0165\u0001\u0000\u0000\u0000\u016e\u0168\u0001\u0000"+
		"\u0000\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000"+
		"\u0000\u0000\u0171\u0017\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0173\u0178\u0003\u0016\u000b\u0000\u0174\u0175\u0005,\u0000"+
		"\u0000\u0175\u0177\u0003\u0016\u000b\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u0019\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u0005/\u0000\u0000"+
		"\u017c\u017d\u0005(\u0000\u0000\u017d\u017e\u0003\u0016\u000b\u0000\u017e"+
		"\u017f\u0005)\u0000\u0000\u017f\u001b\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u00054\u0000\u0000\u0181\u0182\u0005(\u0000\u0000\u0182\u0183\u0003("+
		"\u0014\u0000\u0183\u0184\u0005)\u0000\u0000\u0184\u0188\u0005*\u0000\u0000"+
		"\u0185\u0187\u0003\u0002\u0001\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0005+\u0000\u0000\u018c"+
		"\u001d\u0001\u0000\u0000\u0000\u018d\u018e\u00050\u0000\u0000\u018e\u018f"+
		"\u0003\u0016\u000b\u0000\u018f\u001f\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0003\u001a\r\u0000\u0191\u0192\u00050\u0000\u0000\u0192\u0193\u0003"+
		"\u0016\u000b\u0000\u0193\u0194\u0005-\u0000\u0000\u0194\u0195\u0003\u0016"+
		"\u000b\u0000\u0195!\u0001\u0000\u0000\u0000\u0196\u0197\u00051\u0000\u0000"+
		"\u0197\u01a0\u0005(\u0000\u0000\u0198\u019d\u0003&\u0013\u0000\u0199\u019a"+
		"\u0005,\u0000\u0000\u019a\u019c\u0003&\u0013\u0000\u019b\u0199\u0001\u0000"+
		"\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u0198\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a5\u0005)\u0000\u0000\u01a3\u01a4\u00058\u0000\u0000"+
		"\u01a4\u01a6\u0003(\u0014\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0005-\u0000\u0000\u01a8\u01ba\u0003$\u0012\u0000\u01a9\u01ad\u0005"+
		"*\u0000\u0000\u01aa\u01ac\u0003\u0002\u0001\u0000\u01ab\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b4\u0001\u0000"+
		"\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b1\u00052\u0000"+
		"\u0000\u01b1\u01b2\u0003\u0016\u000b\u0000\u01b2\u01b3\u0005.\u0000\u0000"+
		"\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b6\u01bb\u0005+\u0000\u0000\u01b7\u01b8\u0003\u001e\u000f\u0000\u01b8"+
		"\u01b9\u0005.\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01bb#\u0001"+
		"\u0000\u0000\u0000\u01bc\u01c0\u0003\u0014\n\u0000\u01bd\u01c0\u0005\u000e"+
		"\u0000\u0000\u01be\u01c0\u0005\r\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01c0%\u0001\u0000\u0000\u0000\u01c1\u01c2\u0003(\u0014\u0000\u01c2"+
		"\u01c3\u0005-\u0000\u0000\u01c3\u01c4\u0003\u0014\n\u0000\u01c4\'\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c9\u0005\u0005\u0000\u0000\u01c6\u01c8\u0007"+
		"\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001"+
		"\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ca)\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0007\u0001\u0000\u0000\u01cd+\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d0\u0005\u0006\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2-\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d5\u0005\u0006\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d8\u01da\u0005\u0003\u0000\u0000\u01d9\u01db\u0005\u0006\u0000\u0000"+
		"\u01da\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000"+
		"\u01dd/\u0001\u0000\u0000\u0000\u01de\u01e2\u0005\b\u0000\u0000\u01df"+
		"\u01e1\u00032\u0019\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e2\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000\u01e4\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005\b\u0000\u0000\u01e61\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0007\u0002\u0000\u0000\u01e83\u0001\u0000"+
		"\u0000\u000037=QX_ajt|\u0084\u0088\u008e\u0095\u009c\u00a1\u00aa\u00af"+
		"\u00b6\u00be\u00c0\u00cf\u00d6\u00da\u00e1\u00e8\u00ea\u00f3\u00fd\u0110"+
		"\u0115\u011a\u0120\u0125\u012a\u0133\u016e\u0170\u0178\u0188\u019d\u01a0"+
		"\u01a5\u01ad\u01b4\u01ba\u01bf\u01c9\u01d1\u01d6\u01dc\u01e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}