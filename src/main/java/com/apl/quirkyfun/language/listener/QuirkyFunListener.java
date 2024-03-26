package com.apl.quirkyfun.language.listener;// Generated from QuirkyFun.g4 by ANTLR 4.13.1
import com.apl.quirkyfun.language.parser.QuirkyFunParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuirkyFunParser}.
 */
public interface QuirkyFunListener extends ParseTreeListener {
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
	/**
	 * Enter a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(QuirkyFunParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(QuirkyFunParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(QuirkyFunParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(QuirkyFunParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(QuirkyFunParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(QuirkyFunParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(QuirkyFunParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(QuirkyFunParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(QuirkyFunParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(QuirkyFunParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(QuirkyFunParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(QuirkyFunParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(QuirkyFunParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(QuirkyFunParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(QuirkyFunParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(QuirkyFunParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCase}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(QuirkyFunParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCase}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(QuirkyFunParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RunCatch}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRunCatch(QuirkyFunParser.RunCatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RunCatch}
	 * labeled alternative in {@link QuirkyFunParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRunCatch(QuirkyFunParser.RunCatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(QuirkyFunParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(QuirkyFunParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(QuirkyFunParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link QuirkyFunParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(QuirkyFunParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link QuirkyFunParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(QuirkyFunParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link QuirkyFunParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(QuirkyFunParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link QuirkyFunParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(QuirkyFunParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link QuirkyFunParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(QuirkyFunParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by the {@code WhileLoopCase}
	 * labeled alternative in {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopCase(QuirkyFunParser.WhileLoopCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoopCase}
	 * labeled alternative in {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopCase(QuirkyFunParser.WhileLoopCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileLoopCase}
	 * labeled alternative in {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoopCase(QuirkyFunParser.DoWhileLoopCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileLoopCase}
	 * labeled alternative in {@link QuirkyFunParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoopCase(QuirkyFunParser.DoWhileLoopCaseContext ctx);
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
	 * Enter a parse tree produced by the {@code BooleanDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDataType(QuirkyFunParser.BooleanDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDataType(QuirkyFunParser.BooleanDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 */
	void enterNumberDataType(QuirkyFunParser.NumberDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 */
	void exitNumberDataType(QuirkyFunParser.NumberDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 */
	void enterDecimalDataType(QuirkyFunParser.DecimalDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 */
	void exitDecimalDataType(QuirkyFunParser.DecimalDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(QuirkyFunParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDataType}
	 * labeled alternative in {@link QuirkyFunParser#variable_data_type}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(QuirkyFunParser.StringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpression(QuirkyFunParser.DecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpression(QuirkyFunParser.DecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(QuirkyFunParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(QuirkyFunParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XnorExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterXnorExpression(QuirkyFunParser.XnorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XnorExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitXnorExpression(QuirkyFunParser.XnorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(QuirkyFunParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(QuirkyFunParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsExpression(QuirkyFunParser.NotEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualsExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsExpression(QuirkyFunParser.NotEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XorExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterXorExpression(QuirkyFunParser.XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XorExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitXorExpression(QuirkyFunParser.XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(QuirkyFunParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(QuirkyFunParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryOperatorExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOperatorExpression(QuirkyFunParser.TernaryOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryOperatorExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOperatorExpression(QuirkyFunParser.TernaryOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(QuirkyFunParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(QuirkyFunParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(QuirkyFunParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(QuirkyFunParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(QuirkyFunParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(QuirkyFunParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToBoolExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterToBoolExpression(QuirkyFunParser.ToBoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToBoolExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitToBoolExpression(QuirkyFunParser.ToBoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(QuirkyFunParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(QuirkyFunParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(QuirkyFunParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(QuirkyFunParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpression(QuirkyFunParser.IncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpression(QuirkyFunParser.IncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(QuirkyFunParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(QuirkyFunParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SummationExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSummationExpression(QuirkyFunParser.SummationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SummationExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSummationExpression(QuirkyFunParser.SummationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivisionExpression(QuirkyFunParser.DivisionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivisionExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivisionExpression(QuirkyFunParser.DivisionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProdSummationExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterProdSummationExpression(QuirkyFunParser.ProdSummationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProdSummationExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitProdSummationExpression(QuirkyFunParser.ProdSummationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(QuirkyFunParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(QuirkyFunParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExponentExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentExpression(QuirkyFunParser.ExponentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExponentExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentExpression(QuirkyFunParser.ExponentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModulusExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulusExpression(QuirkyFunParser.ModulusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModulusExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulusExpression(QuirkyFunParser.ModulusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(QuirkyFunParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(QuirkyFunParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpression(QuirkyFunParser.SubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtractionExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpression(QuirkyFunParser.SubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NandExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNandExpression(QuirkyFunParser.NandExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NandExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNandExpression(QuirkyFunParser.NandExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqualsExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualsExpression(QuirkyFunParser.GreaterThanOrEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqualsExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualsExpression(QuirkyFunParser.GreaterThanOrEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(QuirkyFunParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(QuirkyFunParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RootExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRootExpression(QuirkyFunParser.RootExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RootExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRootExpression(QuirkyFunParser.RootExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqualsExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualsExpression(QuirkyFunParser.LessThanOrEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqualsExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualsExpression(QuirkyFunParser.LessThanOrEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(QuirkyFunParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(QuirkyFunParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(QuirkyFunParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(QuirkyFunParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NorExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNorExpression(QuirkyFunParser.NorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NorExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNorExpression(QuirkyFunParser.NorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(QuirkyFunParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(QuirkyFunParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(QuirkyFunParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanExpression}
	 * labeled alternative in {@link QuirkyFunParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(QuirkyFunParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(QuirkyFunParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(QuirkyFunParser.ArgumentsContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableFunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 */
	void enterVariableFunctionDataType(QuirkyFunParser.VariableFunctionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableFunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 */
	void exitVariableFunctionDataType(QuirkyFunParser.VariableFunctionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDataType(QuirkyFunParser.FunctionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDataType(QuirkyFunParser.FunctionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidFunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunctionDataType(QuirkyFunParser.VoidFunctionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidFunctionDataType}
	 * labeled alternative in {@link QuirkyFunParser#function_data_type}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunctionDataType(QuirkyFunParser.VoidFunctionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionParameter}
	 * labeled alternative in {@link QuirkyFunParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(QuirkyFunParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionParameter}
	 * labeled alternative in {@link QuirkyFunParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(QuirkyFunParser.FunctionParameterContext ctx);
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
	 * Enter a parse tree produced by {@link QuirkyFunParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(QuirkyFunParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(QuirkyFunParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(QuirkyFunParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(QuirkyFunParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(QuirkyFunParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(QuirkyFunParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(QuirkyFunParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(QuirkyFunParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuirkyFunParser#anychar}.
	 * @param ctx the parse tree
	 */
	void enterAnychar(QuirkyFunParser.AnycharContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuirkyFunParser#anychar}.
	 * @param ctx the parse tree
	 */
	void exitAnychar(QuirkyFunParser.AnycharContext ctx);
}