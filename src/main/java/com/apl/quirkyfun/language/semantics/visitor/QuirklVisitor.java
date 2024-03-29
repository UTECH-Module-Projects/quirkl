package com.apl.quirkyfun.language.semantics.visitor;// Generated from Quirkl.g4 by ANTLR 4.13.1
import com.apl.quirkyfun.language.parser.QuirklParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuirklParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuirklVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuirklParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuirklParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(QuirklParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(QuirklParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(QuirklParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(QuirklParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionWithBodyStatement}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithBodyStatement(QuirklParser.FunctionWithBodyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionWithLambdaStatement}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithLambdaStatement(QuirklParser.FunctionWithLambdaStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(QuirklParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(QuirklParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(QuirklParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(QuirklParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Switch}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(QuirklParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RunCatch}
	 * labeled alternative in {@link QuirklParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunCatch(QuirklParser.RunCatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link QuirklParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(QuirklParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link QuirklParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(QuirklParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QuirklParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(QuirklParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(QuirklParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchCaseWithBody}
	 * labeled alternative in {@link QuirklParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseWithBody(QuirklParser.SwitchCaseWithBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchCaseWithLambda}
	 * labeled alternative in {@link QuirklParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseWithLambda(QuirklParser.SwitchCaseWithLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteralExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteralExpression(QuirklParser.NumberLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExponentExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentExpression(QuirklParser.ExponentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(QuirklParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpression(QuirklParser.DecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(QuirklParser.StringLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModulusExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusExpression(QuirklParser.ModulusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalLiteralExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteralExpression(QuirklParser.DecimalLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryOperatorExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOperatorExpression(QuirklParser.TernaryOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(QuirklParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionWithBodyExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithBodyExpression(QuirklParser.FunctionWithBodyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(QuirklParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(QuirklParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToBoolExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToBoolExpression(QuirklParser.ToBoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionExpression(QuirklParser.SubtractionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RootExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRootExpression(QuirklParser.RootExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpression(QuirklParser.IncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SummationExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummationExpression(QuirklParser.SummationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionExpression(QuirklParser.DivisionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionWithLambdaExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithLambdaExpression(QuirklParser.FunctionWithLambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteralExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralExpression(QuirklParser.BooleanLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(QuirklParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProdSummationExpression}
	 * labeled alternative in {@link QuirklParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdSummationExpression(QuirklParser.ProdSummationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#toBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToBool(QuirklParser.ToBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBoolean(QuirklParser.NotBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualsBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsBoolean(QuirklParser.EqualsBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualsBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsBoolean(QuirklParser.NotEqualsBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanBoolean(QuirklParser.GreaterThanBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanBoolean(QuirklParser.LessThanBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOrEqualsBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualsBoolean(QuirklParser.GreaterThanOrEqualsBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEqualsBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualsBoolean(QuirklParser.LessThanOrEqualsBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndBoolean(QuirklParser.AndBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrBoolean(QuirklParser.OrBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XorBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorBoolean(QuirklParser.XorBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NandBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNandBoolean(QuirklParser.NandBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NorBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNorBoolean(QuirklParser.NorBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XnorBoolean}
	 * labeled alternative in {@link QuirklParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXnorBoolean(QuirklParser.XnorBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#catchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBody(QuirklParser.CatchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QuirklParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#functionWithBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithBody(QuirklParser.FunctionWithBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#functionWithLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWithLambda(QuirklParser.FunctionWithLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(QuirklParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(QuirklParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#functionDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDataType(QuirklParser.FunctionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#variableDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDataType(QuirklParser.VariableDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QuirklParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(QuirklParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(QuirklParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuirklParser#anychar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnychar(QuirklParser.AnycharContext ctx);
}