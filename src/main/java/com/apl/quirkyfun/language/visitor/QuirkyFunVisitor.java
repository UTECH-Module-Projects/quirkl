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
	 * Visit a parse tree produced by {@link QuirkyFunParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuirkyFunParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(QuirkyFunParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(QuirkyFunParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(QuirkyFunParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(QuirkyFunParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(QuirkyFunParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(QuirkyFunParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(QuirkyFunParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(QuirkyFunParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchCase}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(QuirkyFunParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RunCatch}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunCatch(QuirkyFunParser.RunCatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(QuirkyFunParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(QuirkyFunParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link QuirkyFunParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(QuirkyFunParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link QuirkyFunParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(QuirkyFunParser.FunctionCallContext ctx);
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
	 * Visit a parse tree produced by the {@code WhileLoopCase}
	 * labeled alternative in {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoopCase(QuirkyFunParser.WhileLoopCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileLoopCase}
	 * labeled alternative in {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoopCase(QuirkyFunParser.DoWhileLoopCaseContext ctx);
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
	 * Visit a parse tree produced by the {@code BooleanDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDataType(QuirkyFunParser.BooleanDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDataType(QuirkyFunParser.NumberDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalDataType(QuirkyFunParser.DecimalDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDataType(QuirkyFunParser.StringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decrementexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpression(QuirkyFunParser.DecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(QuirkyFunParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xnorexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXnorExpression(QuirkyFunParser.XnorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(QuirkyFunParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualsexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsExpression(QuirkyFunParser.NotEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xorexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExpression(QuirkyFunParser.XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Notexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(QuirkyFunParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryOperatorexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOperatorExpression(QuirkyFunParser.TernaryOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(QuirkyFunParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Orexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(QuirkyFunParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(QuirkyFunParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToBoolexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToBoolExpression(QuirkyFunParser.ToBoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Functionexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(QuirkyFunParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Andexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(QuirkyFunParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Incrementexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpression(QuirkyFunParser.IncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(QuirkyFunParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Summationexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummationExpression(QuirkyFunParser.SummationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divisionexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(QuirkyFunParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProdSummationexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdSummationExpression(QuirkyFunParser.ProdSummationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Additionexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(QuirkyFunParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exponentexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentExpression(QuirkyFunParser.ExponentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulusexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusExpression(QuirkyFunParser.ModulusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bracketexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(QuirkyFunParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtractionexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionExpression(QuirkyFunParser.SubtractionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nandexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNandExpression(QuirkyFunParser.NandExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOrEqualsexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualsExpression(QuirkyFunParser.GreaterThanOrEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(QuirkyFunParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rootexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootExpression(QuirkyFunParser.RootExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEqualsexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualsExpression(QuirkyFunParser.LessThanOrEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicationexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(QuirkyFunParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(QuirkyFunParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Norexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNorExpression(QuirkyFunParser.NorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equalsexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpression(QuirkyFunParser.EqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanexpression()}
	 * labeled alternative in {@link QuirkyFunParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpression(QuirkyFunParser.LessThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(QuirkyFunParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#to_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo_bool(QuirkyFunParser.To_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(QuirkyFunParser.Catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#return_lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_lambda(QuirkyFunParser.Return_lambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#ternary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_operator(QuirkyFunParser.Ternary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QuirkyFunParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableFunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFunctionDataType(QuirkyFunParser.VariableFunctionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDataType(QuirkyFunParser.FunctionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidFunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunctionDataType(QuirkyFunParser.VoidFunctionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionParameter}
	 * labeled alternative in {@link QuirkyFunParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(QuirkyFunParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QuirkyFunParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#boolean_()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(QuirkyFunParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(QuirkyFunParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(QuirkyFunParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(QuirkyFunParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirkyFunParser#anychar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnychar(QuirkyFunParser.AnycharContext ctx);
}