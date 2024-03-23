package com.apl.quirkyfun.language.visitor;// Generated from QuirkyFun.g4 by ANTLR 4.13.1
import com.apl.quirkyfun.language.parser.QuirkyFunParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuirkyFunParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuirkyFunVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#alphanum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanum(QuirkyFunParser.AlphanumContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#id_valid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_valid(QuirkyFunParser.Id_validContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QuirkyFunParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#bool_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_lit(QuirkyFunParser.Bool_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#byte_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByte_lit(QuirkyFunParser.Byte_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#int_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_lit(QuirkyFunParser.Int_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#long_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLong_lit(QuirkyFunParser.Long_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#float_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_lit(QuirkyFunParser.Float_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#double_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_lit(QuirkyFunParser.Double_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#string_lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_lit(QuirkyFunParser.String_litContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QuirkyFunParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#bracket_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(QuirkyFunParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#data_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_literal(QuirkyFunParser.Data_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#ternary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_operator(QuirkyFunParser.Ternary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#to_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_bool(QuirkyFunParser.To_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QuirkyFunParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(QuirkyFunParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(QuirkyFunParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#data_type_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_parameter(QuirkyFunParser.Data_type_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#data_type_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_function(QuirkyFunParser.Data_type_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#end_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_function(QuirkyFunParser.End_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(QuirkyFunParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#return_lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_lambda(QuirkyFunParser.Return_lambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(QuirkyFunParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QuirkyFunParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QuirkyFunParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(QuirkyFunParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(QuirkyFunParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(QuirkyFunParser.Catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(QuirkyFunParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(QuirkyFunParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#run_catch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun_catch(QuirkyFunParser.Run_catchContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(QuirkyFunParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#summation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummation(QuirkyFunParser.SummationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#one_parameter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_parameter_function(QuirkyFunParser.One_parameter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#prod_summation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd_summation(QuirkyFunParser.Prod_summationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(QuirkyFunParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(QuirkyFunParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(QuirkyFunParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuirkyFunParser.ProgramContext ctx);
}