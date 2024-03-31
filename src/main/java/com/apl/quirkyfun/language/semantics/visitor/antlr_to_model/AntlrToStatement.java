package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.exp.Exp;
import com.apl.quirkyfun.language.semantics.model.exp.FunctionExp;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.statement.Statement;
import com.apl.quirkyfun.language.semantics.model.statement.VariableStatement;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

public class AntlrToStatement extends AntlrToModel<Statement> {

    public AntlrToStatement(Program program) {
        super(program);
    }

    public AntlrToStatement(Program program, String scope) {
        super(program, scope);
    }

    @Override
    public Statement visitVariableDeclaration(QuirklParser.VariableDeclarationContext ctx) {
        QuirklParser.IdContext idCTX = ctx.id();
        String varName = idCTX.getText();
        Variable var = program.getVariable(varName, this.scope);
        Exp exp = null;

        if (var != null) {
            program.addError(QuirklDeclarationException.variableAlreadyDeclared(AntlrUtil.getCoord(idCTX), var));
            return null;
        }
        var = new Variable(AntlrUtil.getCoord(idCTX), varName);

        QuirklType.TYPE varType = QuirklType.toQuirklType(ctx.variableDataType().getText());
        var.setType(varType);

        QuirklParser.ExpressionContext expCtx = ctx.expression();
        if (!expCtx.isEmpty()) {
            exp = expCtx.accept(new AntlrToExpression(program, this.scope));
            if (exp == null) return null;
        }
        program.addVariable(var, this.scope);
        return new VariableStatement(AntlrUtil.getCoord(ctx), var, exp);
    }

    @Override
    public Statement visitFunctionDeclaration(QuirklParser.FunctionDeclarationContext ctx) {
        Variable var = AntlrUtil.newVariable(program, this.scope, ctx.id(), ctx.FUNCTION_TYPE().getText());
        if (var == null) return null;

        QuirklParser.FunctionContext funcCtx = ctx.function();
        if (!funcCtx.isEmpty()) {
            Function func = funcCtx.accept(new AntlrToFunction(program, this.scope));
            if (func == null) return null;

            FunctionExp funcExp = new FunctionExp(AntlrUtil.getCoord(funcCtx), new QuirklFunction(func));
            return new VariableStatement(AntlrUtil.getCoord(ctx), var, funcExp);
        }

        return new VariableStatement(AntlrUtil.getCoord(ctx), var);
    }

    @Override
    public Statement visitAssignmentStatement(QuirklParser.AssignmentStatementContext ctx) {
        return ctx.assignment().accept(this);
    }

    @Override
    public Statement visitAssignment(QuirklParser.AssignmentContext ctx) {
        Variable var = AntlrUtil.getVariable(program, this.scope, ctx.id());
        if (var == null) return null;

        QuirklParser.ExpressionContext expCtx = ctx.expression();
        Exp exp = expCtx.accept(new AntlrToExpression(program, this.scope));
        if (exp == null) return null;

        return new VariableStatement(AntlrUtil.getCoord(ctx), var, exp);
    }
}
