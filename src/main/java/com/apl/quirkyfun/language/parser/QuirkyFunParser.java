package com.apl.quirkyfun.language.parser;// Generated from QuirkyFun.g4 by ANTLR 4.13.1

import com.apl.quirkyfun.language.listener.QuirkyFunListener;
import com.apl.quirkyfun.language.visitor.QuirkyFunVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QuirkyFunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LETTER=7, DIGIT=8, TRUE=9, 
		FALSE=10, BOOL=11, BYTE=12, INT=13, LONG=14, FLOAT=15, DOUBLE=16, STRING=17, 
		VOID=18, PLUS=19, MINUS=20, MULT=21, DIV=22, MOD=23, INC=24, DEC=25, EXPONENT=26, 
		SUMM=27, PRODSUMM=28, ROOT=29, ASSIGN=30, EQ=31, NEQ=32, GT=33, LT=34, 
		GTE=35, LTE=36, AND=37, OR=38, NOT=39, NAND=40, NOR=41, XOR=42, XNOR=43, 
		LPAREN=44, RPAREN=45, LBRACE=46, RBRACE=47, COMMA=48, COLON=49, SEMICOLON=50, 
		QUESTMARK=51, ARROW=52, PASS=53, GIVE=54, RUN=55, CATCH=56, CHECK=57, 
		MATCH=58, IS=59, TO=60, IF=61, ELSE=62, WS=63, COMMENT=64, BLOCK_COMMENT=65;
	public static final int
		RULE_alphanum = 0, RULE_id_valid = 1, RULE_id = 2, RULE_bool_lit = 3, 
		RULE_byte_lit = 4, RULE_int_lit = 5, RULE_long_lit = 6, RULE_float_lit = 7, 
		RULE_double_lit = 8, RULE_string_lit = 9, RULE_expression = 10, RULE_bracket_expression = 11, 
		RULE_data_literal = 12, RULE_ternary_operator = 13, RULE_to_bool = 14, 
		RULE_function = 15, RULE_parameter_list = 16, RULE_parameter = 17, RULE_data_type_parameter = 18, 
		RULE_data_type_function = 19, RULE_end_function = 20, RULE_function_body = 21, 
		RULE_return_lambda = 22, RULE_statement = 23, RULE_declaration = 24, RULE_assignment = 25, 
		RULE_if_statement = 26, RULE_for_loop = 27, RULE_catch_statement = 28, 
		RULE_while_loop = 29, RULE_switch_case = 30, RULE_run_catch = 31, RULE_return_statement = 32, 
		RULE_summation = 33, RULE_one_parameter_function = 34, RULE_prod_summation = 35, 
		RULE_function_call = 36, RULE_argument_list = 37, RULE_statement_list = 38, 
		RULE_program = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"alphanum", "id_valid", "id", "bool_lit", "byte_lit", "int_lit", "long_lit", 
			"float_lit", "double_lit", "string_lit", "expression", "bracket_expression", 
			"data_literal", "ternary_operator", "to_bool", "function", "parameter_list", 
			"parameter", "data_type_parameter", "data_type_function", "end_function", 
			"function_body", "return_lambda", "statement", "declaration", "assignment", 
			"if_statement", "for_loop", "catch_statement", "while_loop", "switch_case", 
			"run_catch", "return_statement", "summation", "one_parameter_function", 
			"prod_summation", "function_call", "argument_list", "statement_list", 
			"program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_'", "'B'", "'L'", "'.'", "'D'", "'\"'", null, null, "'true'", 
			"'false'", "'bool'", "'byte'", "'int'", "'long'", "'float'", "'double'", 
			"'str'", "'void'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
			"'/\\'", "'~'", "'~*'", "'\\/'", "'='", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'&'", "'|'", "'!'", "'!&'", "'!|'", "'^'", "'!^'", "'('", 
			"')'", "'{'", "'}'", "','", "':'", "';'", "'?'", "'->'", "'pass'", "'give'", 
			"'run'", "'catch'", "'check'", "'match'", "'is'", "'to'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "LETTER", "DIGIT", "TRUE", 
			"FALSE", "BOOL", "BYTE", "INT", "LONG", "FLOAT", "DOUBLE", "STRING", 
			"VOID", "PLUS", "MINUS", "MULT", "DIV", "MOD", "INC", "DEC", "EXPONENT", 
			"SUMM", "PRODSUMM", "ROOT", "ASSIGN", "EQ", "NEQ", "GT", "LT", "GTE", 
			"LTE", "AND", "OR", "NOT", "NAND", "NOR", "XOR", "XNOR", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "COMMA", "COLON", "SEMICOLON", "QUESTMARK", "ARROW", 
			"PASS", "GIVE", "RUN", "CATCH", "CHECK", "MATCH", "IS", "TO", "IF", "ELSE", 
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
	public static class AlphanumContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(QuirkyFunParser.LETTER, 0); }
		public TerminalNode DIGIT() { return getToken(QuirkyFunParser.DIGIT, 0); }
		public AlphanumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterAlphanum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitAlphanum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitAlphanum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphanumContext alphanum() throws RecognitionException {
		AlphanumContext _localctx = new AlphanumContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_alphanum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
	public static class Id_validContext extends ParserRuleContext {
		public AlphanumContext alphanum() {
			return getRuleContext(AlphanumContext.class,0);
		}
		public Id_validContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_valid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterId_valid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitId_valid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitId_valid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_validContext id_valid() throws RecognitionException {
		Id_validContext _localctx = new Id_validContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id_valid);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				alphanum();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__0);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(QuirkyFunParser.LETTER, 0); }
		public List<Id_validContext> id_valid() {
			return getRuleContexts(Id_validContext.class);
		}
		public Id_validContext id_valid(int i) {
			return getRuleContext(Id_validContext.class,i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LETTER);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					id_valid();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class Bool_litContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(QuirkyFunParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(QuirkyFunParser.FALSE, 0); }
		public Bool_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterBool_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitBool_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitBool_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_litContext bool_lit() throws RecognitionException {
		Bool_litContext _localctx = new Bool_litContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bool_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class Byte_litContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(QuirkyFunParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirkyFunParser.DIGIT, i);
		}
		public Byte_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byte_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterByte_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitByte_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitByte_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Byte_litContext byte_lit() throws RecognitionException {
		Byte_litContext _localctx = new Byte_litContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_byte_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				match(DIGIT);
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(100);
			match(T__1);
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
	public static class Int_litContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(QuirkyFunParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirkyFunParser.DIGIT, i);
		}
		public Int_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterInt_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitInt_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitInt_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_litContext int_lit() throws RecognitionException {
		Int_litContext _localctx = new Int_litContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_int_lit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(102);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
	public static class Long_litContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(QuirkyFunParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirkyFunParser.DIGIT, i);
		}
		public Long_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterLong_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitLong_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitLong_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Long_litContext long_lit() throws RecognitionException {
		Long_litContext _localctx = new Long_litContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_long_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				match(DIGIT);
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(112);
			match(T__2);
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
	public static class Float_litContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(QuirkyFunParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirkyFunParser.DIGIT, i);
		}
		public Float_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterFloat_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitFloat_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitFloat_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_litContext float_lit() throws RecognitionException {
		Float_litContext _localctx = new Float_litContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_float_lit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114);
				match(DIGIT);
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(119);
			match(T__3);
			setState(121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(120);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
	public static class Double_litContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(QuirkyFunParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(QuirkyFunParser.DIGIT, i);
		}
		public Double_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterDouble_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitDouble_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitDouble_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_litContext double_lit() throws RecognitionException {
		Double_litContext _localctx = new Double_litContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_double_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(DIGIT);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(130);
			match(T__3);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				match(DIGIT);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(136);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_litContext extends ParserRuleContext {
		public String_litContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterString_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitString_lit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitString_lit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_litContext string_lit() throws RecognitionException {
		String_litContext _localctx = new String_litContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string_lit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__5);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(139);
					matchWildcard();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(145);
			match(T__5);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INC() { return getToken(QuirkyFunParser.INC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DEC() { return getToken(QuirkyFunParser.DEC, 0); }
		public Bracket_expressionContext bracket_expression() {
			return getRuleContext(Bracket_expressionContext.class,0);
		}
		public Data_literalContext data_literal() {
			return getRuleContext(Data_literalContext.class,0);
		}
		public Ternary_operatorContext ternary_operator() {
			return getRuleContext(Ternary_operatorContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public SummationContext summation() {
			return getRuleContext(SummationContext.class,0);
		}
		public Prod_summationContext prod_summation() {
			return getRuleContext(Prod_summationContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(QuirkyFunParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(QuirkyFunParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(QuirkyFunParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(QuirkyFunParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(QuirkyFunParser.MOD, 0); }
		public TerminalNode EXPONENT() { return getToken(QuirkyFunParser.EXPONENT, 0); }
		public TerminalNode ROOT() { return getToken(QuirkyFunParser.ROOT, 0); }
		public TerminalNode EQ() { return getToken(QuirkyFunParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(QuirkyFunParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(QuirkyFunParser.GT, 0); }
		public TerminalNode LT() { return getToken(QuirkyFunParser.LT, 0); }
		public TerminalNode GTE() { return getToken(QuirkyFunParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(QuirkyFunParser.LTE, 0); }
		public TerminalNode AND() { return getToken(QuirkyFunParser.AND, 0); }
		public TerminalNode OR() { return getToken(QuirkyFunParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(148);
				id();
				}
				break;
			case 2:
				{
				setState(149);
				match(INC);
				setState(150);
				expression(24);
				}
				break;
			case 3:
				{
				setState(151);
				match(DEC);
				setState(152);
				expression(23);
				}
				break;
			case 4:
				{
				setState(153);
				bracket_expression();
				}
				break;
			case 5:
				{
				setState(154);
				data_literal();
				}
				break;
			case 6:
				{
				setState(155);
				ternary_operator();
				}
				break;
			case 7:
				{
				setState(156);
				function();
				}
				break;
			case 8:
				{
				setState(157);
				function_call();
				}
				break;
			case 9:
				{
				setState(158);
				summation();
				}
				break;
			case 10:
				{
				setState(159);
				prod_summation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(163);
						match(PLUS);
						setState(164);
						expression(23);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(166);
						match(MINUS);
						setState(167);
						expression(22);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(169);
						match(MULT);
						setState(170);
						expression(21);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(172);
						match(DIV);
						setState(173);
						expression(20);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(175);
						match(MOD);
						setState(176);
						expression(19);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(178);
						match(EXPONENT);
						setState(179);
						expression(18);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(181);
						match(ROOT);
						setState(182);
						expression(17);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(184);
						match(EQ);
						setState(185);
						expression(16);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(187);
						match(NEQ);
						setState(188);
						expression(15);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(190);
						match(GT);
						setState(191);
						expression(14);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(193);
						match(LT);
						setState(194);
						expression(13);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(196);
						match(GTE);
						setState(197);
						expression(12);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(199);
						match(LTE);
						setState(200);
						expression(11);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(202);
						match(AND);
						setState(203);
						expression(10);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(205);
						match(OR);
						setState(206);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class Bracket_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public Bracket_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitBracket_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitBracket_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_expressionContext bracket_expression() throws RecognitionException {
		Bracket_expressionContext _localctx = new Bracket_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bracket_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LPAREN);
			setState(213);
			expression(0);
			setState(214);
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
	public static class Data_literalContext extends ParserRuleContext {
		public Int_litContext int_lit() {
			return getRuleContext(Int_litContext.class,0);
		}
		public Long_litContext long_lit() {
			return getRuleContext(Long_litContext.class,0);
		}
		public Float_litContext float_lit() {
			return getRuleContext(Float_litContext.class,0);
		}
		public Double_litContext double_lit() {
			return getRuleContext(Double_litContext.class,0);
		}
		public String_litContext string_lit() {
			return getRuleContext(String_litContext.class,0);
		}
		public Bool_litContext bool_lit() {
			return getRuleContext(Bool_litContext.class,0);
		}
		public Byte_litContext byte_lit() {
			return getRuleContext(Byte_litContext.class,0);
		}
		public Data_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterData_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitData_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitData_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_literalContext data_literal() throws RecognitionException {
		Data_literalContext _localctx = new Data_literalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_data_literal);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				int_lit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				long_lit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				float_lit();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				double_lit();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				string_lit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				bool_lit();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				byte_lit();
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
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterTernary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitTernary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitTernary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_operatorContext ternary_operator() throws RecognitionException {
		Ternary_operatorContext _localctx = new Ternary_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ternary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			to_bool();
			setState(226);
			match(ARROW);
			setState(227);
			expression(0);
			setState(228);
			match(COLON);
			setState(229);
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
	public static class To_boolContext extends ParserRuleContext {
		public TerminalNode QUESTMARK() { return getToken(QuirkyFunParser.QUESTMARK, 0); }
		public Bracket_expressionContext bracket_expression() {
			return getRuleContext(Bracket_expressionContext.class,0);
		}
		public To_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterTo_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitTo_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitTo_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final To_boolContext to_bool() throws RecognitionException {
		To_boolContext _localctx = new To_boolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_to_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(QUESTMARK);
			setState(232);
			bracket_expression();
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
		public Data_type_functionContext data_type_function() {
			return getRuleContext(Data_type_functionContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode TO() { return getToken(QuirkyFunParser.TO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Return_lambdaContext return_lambda() {
			return getRuleContext(Return_lambdaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(PASS);
			setState(235);
			match(LPAREN);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER) {
				{
				setState(236);
				parameter_list();
				}
			}

			setState(239);
			match(RPAREN);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(240);
				match(TO);
				setState(241);
				id();
				}
			}

			setState(244);
			match(COLON);
			setState(245);
			data_type_function();
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(246);
				function_body();
				}
				break;
			case ARROW:
				{
				{
				setState(247);
				return_lambda();
				setState(248);
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
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QuirkyFunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QuirkyFunParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			parameter();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				parameter();
				}
				}
				setState(259);
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
		public TerminalNode COLON() { return getToken(QuirkyFunParser.COLON, 0); }
		public Data_type_parameterContext data_type_parameter() {
			return getRuleContext(Data_type_parameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			id();
			setState(261);
			match(COLON);
			setState(262);
			data_type_parameter();
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
	public static class Data_type_parameterContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(QuirkyFunParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(QuirkyFunParser.BYTE, 0); }
		public TerminalNode INT() { return getToken(QuirkyFunParser.INT, 0); }
		public TerminalNode LONG() { return getToken(QuirkyFunParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(QuirkyFunParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(QuirkyFunParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(QuirkyFunParser.STRING, 0); }
		public Data_type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterData_type_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitData_type_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitData_type_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_type_parameterContext data_type_parameter() throws RecognitionException {
		Data_type_parameterContext _localctx = new Data_type_parameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_data_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 260096L) != 0)) ) {
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
	public static class Data_type_functionContext extends ParserRuleContext {
		public Data_type_parameterContext data_type_parameter() {
			return getRuleContext(Data_type_parameterContext.class,0);
		}
		public TerminalNode VOID() { return getToken(QuirkyFunParser.VOID, 0); }
		public Data_type_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterData_type_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitData_type_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitData_type_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_type_functionContext data_type_function() throws RecognitionException {
		Data_type_functionContext _localctx = new Data_type_functionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_data_type_function);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				data_type_parameter();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(VOID);
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
	public static class End_functionContext extends ParserRuleContext {
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Return_lambdaContext return_lambda() {
			return getRuleContext(Return_lambdaContext.class,0);
		}
		public End_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterEnd_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitEnd_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitEnd_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_functionContext end_function() throws RecognitionException {
		End_functionContext _localctx = new End_functionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_end_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(270);
				function_body();
				}
				break;
			case ARROW:
				{
				setState(271);
				return_lambda();
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
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(LBRACE);
			setState(275);
			statement_list();
			setState(276);
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
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterReturn_lambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitReturn_lambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitReturn_lambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_lambdaContext return_lambda() throws RecognitionException {
		Return_lambdaContext _localctx = new Return_lambdaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ARROW);
			setState(279);
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
	public static class StatementContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Run_catchContext run_catch() {
			return getRuleContext(Run_catchContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				function_call();
				setState(283);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				declaration();
				setState(286);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				assignment();
				setState(289);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				for_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				while_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(294);
				switch_case();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(295);
				run_catch();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(296);
				return_statement();
				setState(297);
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(QuirkyFunParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			parameter();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(302);
				match(ASSIGN);
				setState(303);
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
		public TerminalNode ASSIGN() { return getToken(QuirkyFunParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			id();
			setState(307);
			match(ASSIGN);
			setState(308);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(QuirkyFunParser.IF, 0); }
		public To_boolContext to_bool() {
			return getRuleContext(To_boolContext.class,0);
		}
		public List<Function_bodyContext> function_body() {
			return getRuleContexts(Function_bodyContext.class);
		}
		public Function_bodyContext function_body(int i) {
			return getRuleContext(Function_bodyContext.class,i);
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
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(IF);
			setState(311);
			to_bool();
			setState(312);
			function_body();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					match(ELSE);
					setState(314);
					if_statement();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(320);
				match(ELSE);
				setState(321);
				function_body();
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
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
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
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(RUN);
			setState(325);
			match(LPAREN);
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(326);
				declaration();
				}
				break;
			case 2:
				{
				setState(327);
				expression(0);
				}
				break;
			}
			setState(330);
			match(SEMICOLON);
			setState(331);
			to_bool();
			setState(332);
			match(SEMICOLON);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(333);
				assignment();
				}
				break;
			case 2:
				{
				setState(334);
				expression(0);
				}
				break;
			}
			setState(337);
			match(RPAREN);
			setState(338);
			function_body();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(339);
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
	public static class Catch_statementContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(QuirkyFunParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(CATCH);
			setState(343);
			match(LPAREN);
			setState(344);
			id();
			setState(345);
			match(RPAREN);
			setState(346);
			function_body();
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
		public TerminalNode RUN() { return getToken(QuirkyFunParser.RUN, 0); }
		public TerminalNode CHECK() { return getToken(QuirkyFunParser.CHECK, 0); }
		public To_boolContext to_bool() {
			return getRuleContext(To_boolContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QuirkyFunParser.SEMICOLON, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_while_loop);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(RUN);
				setState(349);
				match(CHECK);
				setState(350);
				to_bool();
				setState(351);
				function_body();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(352);
					catch_statement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(RUN);
				setState(356);
				function_body();
				setState(357);
				match(CHECK);
				setState(358);
				to_bool();
				setState(361);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMICOLON:
					{
					setState(359);
					match(SEMICOLON);
					}
					break;
				case CATCH:
					{
					setState(360);
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
		public List<Bracket_expressionContext> bracket_expression() {
			return getRuleContexts(Bracket_expressionContext.class);
		}
		public Bracket_expressionContext bracket_expression(int i) {
			return getRuleContext(Bracket_expressionContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(QuirkyFunParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QuirkyFunParser.RBRACE, 0); }
		public List<TerminalNode> IS() { return getTokens(QuirkyFunParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(QuirkyFunParser.IS, i);
		}
		public List<End_functionContext> end_function() {
			return getRuleContexts(End_functionContext.class);
		}
		public End_functionContext end_function(int i) {
			return getRuleContext(End_functionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(QuirkyFunParser.ELSE, 0); }
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(MATCH);
			setState(366);
			bracket_expression();
			setState(367);
			match(LBRACE);
			setState(372); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				match(IS);
				setState(369);
				bracket_expression();
				setState(370);
				end_function();
				}
				}
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IS );
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(376);
				match(ELSE);
				setState(377);
				end_function();
				}
			}

			setState(380);
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
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public Run_catchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run_catch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterRun_catch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitRun_catch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitRun_catch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Run_catchContext run_catch() throws RecognitionException {
		Run_catchContext _localctx = new Run_catchContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_run_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(RUN);
			setState(383);
			function_body();
			setState(384);
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode GIVE() { return getToken(QuirkyFunParser.GIVE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(GIVE);
			setState(387);
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
	public static class SummationContext extends ParserRuleContext {
		public TerminalNode SUMM() { return getToken(QuirkyFunParser.SUMM, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public List<Int_litContext> int_lit() {
			return getRuleContexts(Int_litContext.class);
		}
		public Int_litContext int_lit(int i) {
			return getRuleContext(Int_litContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public One_parameter_functionContext one_parameter_function() {
			return getRuleContext(One_parameter_functionContext.class,0);
		}
		public SummationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterSummation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitSummation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitSummation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummationContext summation() throws RecognitionException {
		SummationContext _localctx = new SummationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_summation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(389);
				int_lit();
				}
				break;
			case LETTER:
				{
				setState(390);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(393);
			match(SUMM);
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(394);
				int_lit();
				}
				break;
			case LETTER:
				{
				setState(395);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(398);
			match(LPAREN);
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				{
				setState(399);
				one_parameter_function();
				}
				break;
			case LETTER:
				{
				setState(400);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(403);
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
	public static class One_parameter_functionContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(QuirkyFunParser.PASS, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(QuirkyFunParser.COLON, 0); }
		public Data_literalContext data_literal() {
			return getRuleContext(Data_literalContext.class,0);
		}
		public End_functionContext end_function() {
			return getRuleContext(End_functionContext.class,0);
		}
		public TerminalNode TO() { return getToken(QuirkyFunParser.TO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public One_parameter_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_parameter_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterOne_parameter_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitOne_parameter_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitOne_parameter_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_parameter_functionContext one_parameter_function() throws RecognitionException {
		One_parameter_functionContext _localctx = new One_parameter_functionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_one_parameter_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(PASS);
			setState(406);
			match(LPAREN);
			setState(407);
			parameter();
			setState(408);
			match(RPAREN);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(409);
				match(TO);
				setState(410);
				id();
				}
			}

			setState(413);
			match(COLON);
			setState(414);
			data_literal();
			setState(415);
			end_function();
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
	public static class Prod_summationContext extends ParserRuleContext {
		public TerminalNode PRODSUMM() { return getToken(QuirkyFunParser.PRODSUMM, 0); }
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public List<Int_litContext> int_lit() {
			return getRuleContexts(Int_litContext.class);
		}
		public Int_litContext int_lit(int i) {
			return getRuleContext(Int_litContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public One_parameter_functionContext one_parameter_function() {
			return getRuleContext(One_parameter_functionContext.class,0);
		}
		public Prod_summationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod_summation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterProd_summation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitProd_summation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitProd_summation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prod_summationContext prod_summation() throws RecognitionException {
		Prod_summationContext _localctx = new Prod_summationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_prod_summation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(417);
				int_lit();
				}
				break;
			case LETTER:
				{
				setState(418);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(421);
			match(PRODSUMM);
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(422);
				int_lit();
				}
				break;
			case LETTER:
				{
				setState(423);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(426);
			match(LPAREN);
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				{
				setState(427);
				one_parameter_function();
				}
				break;
			case LETTER:
				{
				setState(428);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(431);
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
	public static class Function_callContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QuirkyFunParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QuirkyFunParser.RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			id();
			setState(434);
			match(LPAREN);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11276591304804288L) != 0)) {
				{
				setState(435);
				argument_list();
				}
			}

			setState(438);
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
	public static class Argument_listContext extends ParserRuleContext {
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
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			expression(0);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(441);
				match(COMMA);
				setState(442);
				expression(0);
				}
				}
				setState(447);
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
	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2657123780148592768L) != 0)) {
				{
				{
				setState(448);
				statement();
				}
				}
				setState(453);
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
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuirkyFunListener) ((QuirkyFunListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuirkyFunVisitor) return ((QuirkyFunVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				statement();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2657123780148592768L) != 0) );
			setState(459);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u01ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001U\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002\f\u0002\\\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u0004a\b\u0004\u000b\u0004\f\u0004"+
		"b\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005h\b\u0005\u000b\u0005"+
		"\f\u0005i\u0001\u0006\u0004\u0006m\b\u0006\u000b\u0006\f\u0006n\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007t\b\u0007\u000b\u0007\f\u0007"+
		"u\u0001\u0007\u0001\u0007\u0004\u0007z\b\u0007\u000b\u0007\f\u0007{\u0001"+
		"\b\u0004\b\u007f\b\b\u000b\b\f\b\u0080\u0001\b\u0001\b\u0004\b\u0085\b"+
		"\b\u000b\b\f\b\u0086\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u008d\b\t"+
		"\n\t\f\t\u0090\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00a1\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00d0\b\n\n\n\f\n\u00d3\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00e0\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00ee\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00f3\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00fb\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0100\b\u0010\n\u0010\f\u0010\u0103\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u010d\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0111"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u012c\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0131\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u013c\b\u001a\n\u001a\f\u001a\u013f\t\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0143\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0149\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0150\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0155\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0162\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u016a\b\u001d\u0003\u001d"+
		"\u016c\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0004\u001e\u0175\b\u001e\u000b\u001e\f\u001e"+
		"\u0176\u0001\u001e\u0001\u001e\u0003\u001e\u017b\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0003!\u0188\b!\u0001!\u0001!\u0001!\u0003!\u018d\b!\u0001"+
		"!\u0001!\u0001!\u0003!\u0192\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u019c\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0003#\u01a4\b#\u0001#\u0001#\u0001#\u0003#\u01a9\b#"+
		"\u0001#\u0001#\u0001#\u0003#\u01ae\b#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0003$\u01b5\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u01bc\b%\n"+
		"%\f%\u01bf\t%\u0001&\u0005&\u01c2\b&\n&\f&\u01c5\t&\u0001\'\u0004\'\u01c8"+
		"\b\'\u000b\'\f\'\u01c9\u0001\'\u0001\'\u0001\'\u0001\u008e\u0001\u0014"+
		"(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0003\u0001\u0000\u0007\b"+
		"\u0001\u0000\t\n\u0001\u0000\u000b\u0011\u01f4\u0000P\u0001\u0000\u0000"+
		"\u0000\u0002T\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006"+
		"]\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000"+
		"\u0000\fl\u0001\u0000\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010"+
		"~\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u00a0"+
		"\u0001\u0000\u0000\u0000\u0016\u00d4\u0001\u0000\u0000\u0000\u0018\u00df"+
		"\u0001\u0000\u0000\u0000\u001a\u00e1\u0001\u0000\u0000\u0000\u001c\u00e7"+
		"\u0001\u0000\u0000\u0000\u001e\u00ea\u0001\u0000\u0000\u0000 \u00fc\u0001"+
		"\u0000\u0000\u0000\"\u0104\u0001\u0000\u0000\u0000$\u0108\u0001\u0000"+
		"\u0000\u0000&\u010c\u0001\u0000\u0000\u0000(\u0110\u0001\u0000\u0000\u0000"+
		"*\u0112\u0001\u0000\u0000\u0000,\u0116\u0001\u0000\u0000\u0000.\u012b"+
		"\u0001\u0000\u0000\u00000\u012d\u0001\u0000\u0000\u00002\u0132\u0001\u0000"+
		"\u0000\u00004\u0136\u0001\u0000\u0000\u00006\u0144\u0001\u0000\u0000\u0000"+
		"8\u0156\u0001\u0000\u0000\u0000:\u016b\u0001\u0000\u0000\u0000<\u016d"+
		"\u0001\u0000\u0000\u0000>\u017e\u0001\u0000\u0000\u0000@\u0182\u0001\u0000"+
		"\u0000\u0000B\u0187\u0001\u0000\u0000\u0000D\u0195\u0001\u0000\u0000\u0000"+
		"F\u01a3\u0001\u0000\u0000\u0000H\u01b1\u0001\u0000\u0000\u0000J\u01b8"+
		"\u0001\u0000\u0000\u0000L\u01c3\u0001\u0000\u0000\u0000N\u01c7\u0001\u0000"+
		"\u0000\u0000PQ\u0007\u0000\u0000\u0000Q\u0001\u0001\u0000\u0000\u0000"+
		"RU\u0003\u0000\u0000\u0000SU\u0005\u0001\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U\u0003\u0001\u0000\u0000\u0000VZ\u0005"+
		"\u0007\u0000\u0000WY\u0003\u0002\u0001\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u0005\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0007"+
		"\u0001\u0000\u0000^\u0007\u0001\u0000\u0000\u0000_a\u0005\b\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\u0002"+
		"\u0000\u0000e\t\u0001\u0000\u0000\u0000fh\u0005\b\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\u000b\u0001\u0000\u0000\u0000km\u0005\b\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0003\u0000\u0000q\r\u0001\u0000\u0000\u0000rt\u0005\b\u0000\u0000sr"+
		"\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0005\u0004"+
		"\u0000\u0000xz\u0005\b\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u000f"+
		"\u0001\u0000\u0000\u0000}\u007f\u0005\b\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0005\u0004\u0000\u0000\u0083\u0085\u0005\b\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0005\u0000\u0000\u0089"+
		"\u0011\u0001\u0000\u0000\u0000\u008a\u008e\u0005\u0006\u0000\u0000\u008b"+
		"\u008d\t\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0006\u0000\u0000\u0092\u0013"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0006\n\uffff\uffff\u0000\u0094\u00a1"+
		"\u0003\u0004\u0002\u0000\u0095\u0096\u0005\u0018\u0000\u0000\u0096\u00a1"+
		"\u0003\u0014\n\u0018\u0097\u0098\u0005\u0019\u0000\u0000\u0098\u00a1\u0003"+
		"\u0014\n\u0017\u0099\u00a1\u0003\u0016\u000b\u0000\u009a\u00a1\u0003\u0018"+
		"\f\u0000\u009b\u00a1\u0003\u001a\r\u0000\u009c\u00a1\u0003\u001e\u000f"+
		"\u0000\u009d\u00a1\u0003H$\u0000\u009e\u00a1\u0003B!\u0000\u009f\u00a1"+
		"\u0003F#\u0000\u00a0\u0093\u0001\u0000\u0000\u0000\u00a0\u0095\u0001\u0000"+
		"\u0000\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000"+
		"\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000\u00a0\u009b\u0001\u0000"+
		"\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00d1\u0001\u0000\u0000\u0000\u00a2\u00a3\n\u0016\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4\u00d0\u0003\u0014\n\u0017"+
		"\u00a5\u00a6\n\u0015\u0000\u0000\u00a6\u00a7\u0005\u0014\u0000\u0000\u00a7"+
		"\u00d0\u0003\u0014\n\u0016\u00a8\u00a9\n\u0014\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0015\u0000\u0000\u00aa\u00d0\u0003\u0014\n\u0015\u00ab\u00ac\n"+
		"\u0013\u0000\u0000\u00ac\u00ad\u0005\u0016\u0000\u0000\u00ad\u00d0\u0003"+
		"\u0014\n\u0014\u00ae\u00af\n\u0012\u0000\u0000\u00af\u00b0\u0005\u0017"+
		"\u0000\u0000\u00b0\u00d0\u0003\u0014\n\u0013\u00b1\u00b2\n\u0011\u0000"+
		"\u0000\u00b2\u00b3\u0005\u001a\u0000\u0000\u00b3\u00d0\u0003\u0014\n\u0012"+
		"\u00b4\u00b5\n\u0010\u0000\u0000\u00b5\u00b6\u0005\u001d\u0000\u0000\u00b6"+
		"\u00d0\u0003\u0014\n\u0011\u00b7\u00b8\n\u000f\u0000\u0000\u00b8\u00b9"+
		"\u0005\u001f\u0000\u0000\u00b9\u00d0\u0003\u0014\n\u0010\u00ba\u00bb\n"+
		"\u000e\u0000\u0000\u00bb\u00bc\u0005 \u0000\u0000\u00bc\u00d0\u0003\u0014"+
		"\n\u000f\u00bd\u00be\n\r\u0000\u0000\u00be\u00bf\u0005!\u0000\u0000\u00bf"+
		"\u00d0\u0003\u0014\n\u000e\u00c0\u00c1\n\f\u0000\u0000\u00c1\u00c2\u0005"+
		"\"\u0000\u0000\u00c2\u00d0\u0003\u0014\n\r\u00c3\u00c4\n\u000b\u0000\u0000"+
		"\u00c4\u00c5\u0005#\u0000\u0000\u00c5\u00d0\u0003\u0014\n\f\u00c6\u00c7"+
		"\n\n\u0000\u0000\u00c7\u00c8\u0005$\u0000\u0000\u00c8\u00d0\u0003\u0014"+
		"\n\u000b\u00c9\u00ca\n\t\u0000\u0000\u00ca\u00cb\u0005%\u0000\u0000\u00cb"+
		"\u00d0\u0003\u0014\n\n\u00cc\u00cd\n\b\u0000\u0000\u00cd\u00ce\u0005&"+
		"\u0000\u0000\u00ce\u00d0\u0003\u0014\n\t\u00cf\u00a2\u0001\u0000\u0000"+
		"\u0000\u00cf\u00a5\u0001\u0000\u0000\u0000\u00cf\u00a8\u0001\u0000\u0000"+
		"\u0000\u00cf\u00ab\u0001\u0000\u0000\u0000\u00cf\u00ae\u0001\u0000\u0000"+
		"\u0000\u00cf\u00b1\u0001\u0000\u0000\u0000\u00cf\u00b4\u0001\u0000\u0000"+
		"\u0000\u00cf\u00b7\u0001\u0000\u0000\u0000\u00cf\u00ba\u0001\u0000\u0000"+
		"\u0000\u00cf\u00bd\u0001\u0000\u0000\u0000\u00cf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c3\u0001\u0000\u0000\u0000\u00cf\u00c6\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u0015\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005,\u0000\u0000"+
		"\u00d5\u00d6\u0003\u0014\n\u0000\u00d6\u00d7\u0005-\u0000\u0000\u00d7"+
		"\u0017\u0001\u0000\u0000\u0000\u00d8\u00e0\u0003\n\u0005\u0000\u00d9\u00e0"+
		"\u0003\f\u0006\u0000\u00da\u00e0\u0003\u000e\u0007\u0000\u00db\u00e0\u0003"+
		"\u0010\b\u0000\u00dc\u00e0\u0003\u0012\t\u0000\u00dd\u00e0\u0003\u0006"+
		"\u0003\u0000\u00de\u00e0\u0003\b\u0004\u0000\u00df\u00d8\u0001\u0000\u0000"+
		"\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000"+
		"\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u0019\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u001c\u000e"+
		"\u0000\u00e2\u00e3\u00054\u0000\u0000\u00e3\u00e4\u0003\u0014\n\u0000"+
		"\u00e4\u00e5\u00051\u0000\u0000\u00e5\u00e6\u0003\u0014\n\u0000\u00e6"+
		"\u001b\u0001\u0000\u0000\u0000\u00e7\u00e8\u00053\u0000\u0000\u00e8\u00e9"+
		"\u0003\u0016\u000b\u0000\u00e9\u001d\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u00055\u0000\u0000\u00eb\u00ed\u0005,\u0000\u0000\u00ec\u00ee\u0003 "+
		"\u0010\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f2\u0005-\u0000"+
		"\u0000\u00f0\u00f1\u0005<\u0000\u0000\u00f1\u00f3\u0003\u0004\u0002\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u00051\u0000\u0000\u00f5"+
		"\u00fa\u0003&\u0013\u0000\u00f6\u00fb\u0003*\u0015\u0000\u00f7\u00f8\u0003"+
		",\u0016\u0000\u00f8\u00f9\u00052\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fb\u001f\u0001\u0000\u0000\u0000\u00fc\u0101\u0003\"\u0011\u0000"+
		"\u00fd\u00fe\u00050\u0000\u0000\u00fe\u0100\u0003\"\u0011\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"!\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0003\u0004\u0002\u0000\u0105\u0106\u00051\u0000\u0000\u0106\u0107\u0003"+
		"$\u0012\u0000\u0107#\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0002\u0000"+
		"\u0000\u0109%\u0001\u0000\u0000\u0000\u010a\u010d\u0003$\u0012\u0000\u010b"+
		"\u010d\u0005\u0012\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\'\u0001\u0000\u0000\u0000\u010e\u0111"+
		"\u0003*\u0015\u0000\u010f\u0111\u0003,\u0016\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111)\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005.\u0000\u0000\u0113\u0114\u0003L&\u0000\u0114"+
		"\u0115\u0005/\u0000\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		"4\u0000\u0000\u0117\u0118\u0003\u0014\n\u0000\u0118-\u0001\u0000\u0000"+
		"\u0000\u0119\u012c\u0003\u001e\u000f\u0000\u011a\u011b\u0003H$\u0000\u011b"+
		"\u011c\u00052\u0000\u0000\u011c\u012c\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u00030\u0018\u0000\u011e\u011f\u00052\u0000\u0000\u011f\u012c\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u00032\u0019\u0000\u0121\u0122\u00052\u0000\u0000"+
		"\u0122\u012c\u0001\u0000\u0000\u0000\u0123\u012c\u00034\u001a\u0000\u0124"+
		"\u012c\u00036\u001b\u0000\u0125\u012c\u0003:\u001d\u0000\u0126\u012c\u0003"+
		"<\u001e\u0000\u0127\u012c\u0003>\u001f\u0000\u0128\u0129\u0003@ \u0000"+
		"\u0129\u012a\u00052\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"+
		"\u0119\u0001\u0000\u0000\u0000\u012b\u011a\u0001\u0000\u0000\u0000\u012b"+
		"\u011d\u0001\u0000\u0000\u0000\u012b\u0120\u0001\u0000\u0000\u0000\u012b"+
		"\u0123\u0001\u0000\u0000\u0000\u012b\u0124\u0001\u0000\u0000\u0000\u012b"+
		"\u0125\u0001\u0000\u0000\u0000\u012b\u0126\u0001\u0000\u0000\u0000\u012b"+
		"\u0127\u0001\u0000\u0000\u0000\u012b\u0128\u0001\u0000\u0000\u0000\u012c"+
		"/\u0001\u0000\u0000\u0000\u012d\u0130\u0003\"\u0011\u0000\u012e\u012f"+
		"\u0005\u001e\u0000\u0000\u012f\u0131\u0003\u0014\n\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u01311\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0003\u0004\u0002\u0000\u0133\u0134\u0005\u001e"+
		"\u0000\u0000\u0134\u0135\u0003\u0014\n\u0000\u01353\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0005=\u0000\u0000\u0137\u0138\u0003\u001c\u000e\u0000"+
		"\u0138\u013d\u0003*\u0015\u0000\u0139\u013a\u0005>\u0000\u0000\u013a\u013c"+
		"\u00034\u001a\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001"+
		"\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001"+
		"\u0000\u0000\u0000\u013e\u0142\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005>\u0000\u0000\u0141\u0143\u0003*\u0015"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u01435\u0001\u0000\u0000\u0000\u0144\u0145\u00057\u0000\u0000\u0145"+
		"\u0148\u0005,\u0000\u0000\u0146\u0149\u00030\u0018\u0000\u0147\u0149\u0003"+
		"\u0014\n\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u00052\u0000\u0000\u014b\u014c\u0003\u001c\u000e"+
		"\u0000\u014c\u014f\u00052\u0000\u0000\u014d\u0150\u00032\u0019\u0000\u014e"+
		"\u0150\u0003\u0014\n\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u014e"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0005-\u0000\u0000\u0152\u0154\u0003"+
		"*\u0015\u0000\u0153\u0155\u00038\u001c\u0000\u0154\u0153\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u01557\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u00058\u0000\u0000\u0157\u0158\u0005,\u0000\u0000\u0158\u0159"+
		"\u0003\u0004\u0002\u0000\u0159\u015a\u0005-\u0000\u0000\u015a\u015b\u0003"+
		"*\u0015\u0000\u015b9\u0001\u0000\u0000\u0000\u015c\u015d\u00057\u0000"+
		"\u0000\u015d\u015e\u00059\u0000\u0000\u015e\u015f\u0003\u001c\u000e\u0000"+
		"\u015f\u0161\u0003*\u0015\u0000\u0160\u0162\u00038\u001c\u0000\u0161\u0160"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u016c"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u00057\u0000\u0000\u0164\u0165\u0003"+
		"*\u0015\u0000\u0165\u0166\u00059\u0000\u0000\u0166\u0169\u0003\u001c\u000e"+
		"\u0000\u0167\u016a\u00052\u0000\u0000\u0168\u016a\u00038\u001c\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016c\u0001\u0000\u0000\u0000\u016b\u015c\u0001\u0000\u0000\u0000\u016b"+
		"\u0163\u0001\u0000\u0000\u0000\u016c;\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0005:\u0000\u0000\u016e\u016f\u0003\u0016\u000b\u0000\u016f\u0174\u0005"+
		".\u0000\u0000\u0170\u0171\u0005;\u0000\u0000\u0171\u0172\u0003\u0016\u000b"+
		"\u0000\u0172\u0173\u0003(\u0014\u0000\u0173\u0175\u0001\u0000\u0000\u0000"+
		"\u0174\u0170\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0179\u0005>\u0000\u0000\u0179"+
		"\u017b\u0003(\u0014\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0005/\u0000\u0000\u017d=\u0001\u0000\u0000\u0000\u017e\u017f\u00057"+
		"\u0000\u0000\u017f\u0180\u0003*\u0015\u0000\u0180\u0181\u00038\u001c\u0000"+
		"\u0181?\u0001\u0000\u0000\u0000\u0182\u0183\u00056\u0000\u0000\u0183\u0184"+
		"\u0003\u0014\n\u0000\u0184A\u0001\u0000\u0000\u0000\u0185\u0188\u0003"+
		"\n\u0005\u0000\u0186\u0188\u0003\u0004\u0002\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000"+
		"\u0000\u0000\u0189\u018c\u0005\u001b\u0000\u0000\u018a\u018d\u0003\n\u0005"+
		"\u0000\u018b\u018d\u0003\u0004\u0002\u0000\u018c\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018e\u0191\u0005,\u0000\u0000\u018f\u0192\u0003D\"\u0000\u0190"+
		"\u0192\u0003\u0004\u0002\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0005-\u0000\u0000\u0194C\u0001\u0000\u0000\u0000\u0195\u0196\u0005"+
		"5\u0000\u0000\u0196\u0197\u0005,\u0000\u0000\u0197\u0198\u0003\"\u0011"+
		"\u0000\u0198\u019b\u0005-\u0000\u0000\u0199\u019a\u0005<\u0000\u0000\u019a"+
		"\u019c\u0003\u0004\u0002\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u00051\u0000\u0000\u019e\u019f\u0003\u0018\f\u0000\u019f\u01a0"+
		"\u0003(\u0014\u0000\u01a0E\u0001\u0000\u0000\u0000\u01a1\u01a4\u0003\n"+
		"\u0005\u0000\u01a2\u01a4\u0003\u0004\u0002\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a8\u0005\u001c\u0000\u0000\u01a6\u01a9\u0003\n\u0005"+
		"\u0000\u01a7\u01a9\u0003\u0004\u0002\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ad\u0005,\u0000\u0000\u01ab\u01ae\u0003D\"\u0000\u01ac"+
		"\u01ae\u0003\u0004\u0002\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0005-\u0000\u0000\u01b0G\u0001\u0000\u0000\u0000\u01b1\u01b2\u0003"+
		"\u0004\u0002\u0000\u01b2\u01b4\u0005,\u0000\u0000\u01b3\u01b5\u0003J%"+
		"\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005-\u0000\u0000"+
		"\u01b7I\u0001\u0000\u0000\u0000\u01b8\u01bd\u0003\u0014\n\u0000\u01b9"+
		"\u01ba\u00050\u0000\u0000\u01ba\u01bc\u0003\u0014\n\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01beK\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c2\u0003"+
		".\u0017\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4M\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c8\u0003.\u0017\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0005\u0000\u0000\u0001\u01ccO\u0001\u0000\u0000\u0000+T"+
		"Zbinu{\u0080\u0086\u008e\u00a0\u00cf\u00d1\u00df\u00ed\u00f2\u00fa\u0101"+
		"\u010c\u0110\u012b\u0130\u013d\u0142\u0148\u014f\u0154\u0161\u0169\u016b"+
		"\u0176\u017a\u0187\u018c\u0191\u019b\u01a3\u01a8\u01ad\u01b4\u01bd\u01c3"+
		"\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}