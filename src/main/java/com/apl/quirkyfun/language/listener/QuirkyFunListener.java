package com.apl.quirkyfun.language.listener;// Generated from QuirkyFun.g4 by ANTLR 4.13.1
import com.apl.quirkyfun.language.parser.QuirkyFunParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuirkyFunParser}.
 */
public interface QuirkyFunListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#alphanum}.
	 * @param ctx the parse tree
	 */
	void enterAlphanum(QuirkyFunParser.AlphanumContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#alphanum}.
	 * @param ctx the parse tree
	 */
	void exitAlphanum(QuirkyFunParser.AlphanumContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#id_valid}.
	 * @param ctx the parse tree
	 */
	void enterId_valid(QuirkyFunParser.Id_validContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#id_valid}.
	 * @param ctx the parse tree
	 */
	void exitId_valid(QuirkyFunParser.Id_validContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(QuirkyFunParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(QuirkyFunParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#bool_lit}.
	 * @param ctx the parse tree
	 */
	void enterBool_lit(QuirkyFunParser.Bool_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#bool_lit}.
	 * @param ctx the parse tree
	 */
	void exitBool_lit(QuirkyFunParser.Bool_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#byte_lit}.
	 * @param ctx the parse tree
	 */
	void enterByte_lit(QuirkyFunParser.Byte_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#byte_lit}.
	 * @param ctx the parse tree
	 */
	void exitByte_lit(QuirkyFunParser.Byte_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void enterInt_lit(QuirkyFunParser.Int_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#int_lit}.
	 * @param ctx the parse tree
	 */
	void exitInt_lit(QuirkyFunParser.Int_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#long_lit}.
	 * @param ctx the parse tree
	 */
	void enterLong_lit(QuirkyFunParser.Long_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#long_lit}.
	 * @param ctx the parse tree
	 */
	void exitLong_lit(QuirkyFunParser.Long_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#float_lit}.
	 * @param ctx the parse tree
	 */
	void enterFloat_lit(QuirkyFunParser.Float_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#float_lit}.
	 * @param ctx the parse tree
	 */
	void exitFloat_lit(QuirkyFunParser.Float_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#double_lit}.
	 * @param ctx the parse tree
	 */
	void enterDouble_lit(QuirkyFunParser.Double_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#double_lit}.
	 * @param ctx the parse tree
	 */
	void exitDouble_lit(QuirkyFunParser.Double_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#string_lit}.
	 * @param ctx the parse tree
	 */
	void enterString_lit(QuirkyFunParser.String_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#string_lit}.
	 * @param ctx the parse tree
	 */
	void exitString_lit(QuirkyFunParser.String_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QuirkyFunParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QuirkyFunParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(QuirkyFunParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(QuirkyFunParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#data_literal}.
	 * @param ctx the parse tree
	 */
	void enterData_literal(QuirkyFunParser.Data_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#data_literal}.
	 * @param ctx the parse tree
	 */
	void exitData_literal(QuirkyFunParser.Data_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#ternary_operator}.
	 * @param ctx the parse tree
	 */
	void enterTernary_operator(QuirkyFunParser.Ternary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#ternary_operator}.
	 * @param ctx the parse tree
	 */
	void exitTernary_operator(QuirkyFunParser.Ternary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#to_bool}.
	 * @param ctx the parse tree
	 */
	void enterTo_bool(QuirkyFunParser.To_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#to_bool}.
	 * @param ctx the parse tree
	 */
	void exitTo_bool(QuirkyFunParser.To_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(QuirkyFunParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(QuirkyFunParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(QuirkyFunParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(QuirkyFunParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(QuirkyFunParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(QuirkyFunParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#data_type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterData_type_parameter(QuirkyFunParser.Data_type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#data_type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitData_type_parameter(QuirkyFunParser.Data_type_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#data_type_function}.
	 * @param ctx the parse tree
	 */
	void enterData_type_function(QuirkyFunParser.Data_type_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#data_type_function}.
	 * @param ctx the parse tree
	 */
	void exitData_type_function(QuirkyFunParser.Data_type_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#end_function}.
	 * @param ctx the parse tree
	 */
	void enterEnd_function(QuirkyFunParser.End_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#end_function}.
	 * @param ctx the parse tree
	 */
	void exitEnd_function(QuirkyFunParser.End_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(QuirkyFunParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(QuirkyFunParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#return_lambda}.
	 * @param ctx the parse tree
	 */
	void enterReturn_lambda(QuirkyFunParser.Return_lambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#return_lambda}.
	 * @param ctx the parse tree
	 */
	void exitReturn_lambda(QuirkyFunParser.Return_lambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(QuirkyFunParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(QuirkyFunParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QuirkyFunParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QuirkyFunParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(QuirkyFunParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(QuirkyFunParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(QuirkyFunParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(QuirkyFunParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(QuirkyFunParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(QuirkyFunParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(QuirkyFunParser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(QuirkyFunParser.Catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(QuirkyFunParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(QuirkyFunParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(QuirkyFunParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(QuirkyFunParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#run_catch}.
	 * @param ctx the parse tree
	 */
	void enterRun_catch(QuirkyFunParser.Run_catchContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#run_catch}.
	 * @param ctx the parse tree
	 */
	void exitRun_catch(QuirkyFunParser.Run_catchContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(QuirkyFunParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(QuirkyFunParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#summation}.
	 * @param ctx the parse tree
	 */
	void enterSummation(QuirkyFunParser.SummationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#summation}.
	 * @param ctx the parse tree
	 */
	void exitSummation(QuirkyFunParser.SummationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#one_parameter_function}.
	 * @param ctx the parse tree
	 */
	void enterOne_parameter_function(QuirkyFunParser.One_parameter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#one_parameter_function}.
	 * @param ctx the parse tree
	 */
	void exitOne_parameter_function(QuirkyFunParser.One_parameter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#prod_summation}.
	 * @param ctx the parse tree
	 */
	void enterProd_summation(QuirkyFunParser.Prod_summationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#prod_summation}.
	 * @param ctx the parse tree
	 */
	void exitProd_summation(QuirkyFunParser.Prod_summationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(QuirkyFunParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(QuirkyFunParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(QuirkyFunParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(QuirkyFunParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(QuirkyFunParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(QuirkyFunParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuirkyFunParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuirkyFunParser.ProgramContext ctx);
}