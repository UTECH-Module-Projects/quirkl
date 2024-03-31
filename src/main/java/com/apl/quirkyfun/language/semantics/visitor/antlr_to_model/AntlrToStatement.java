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
        QuirklParser.IdContext idCTX = ctx.id();
        String varName = idCTX.getText();
        Variable var = program.getVariable(varName, this.scope);
        Function func = null;

        if (var != null) {
            program.addError(QuirklDeclarationException.variableAlreadyDeclared(AntlrUtil.getCoord(idCTX), var));
            return null;
        }
        var = new Variable(AntlrUtil.getCoord(idCTX), varName);

        QuirklType.TYPE varType = QuirklType.toQuirklType(ctx.FUNCTION_TYPE().getText());
        var.setType(varType);

        QuirklParser.FunctionContext funcCtx = ctx.function();
        if (!funcCtx.isEmpty()) {
            func = funcCtx.accept(new AntlrToFunction(program, this.scope));
            if (func == null) return null;
        }
        program.addVariable(var, this.scope);

        FunctionExp funcExp = new FunctionExp(AntlrUtil.getCoord(funcCtx), new QuirklFunction(AntlrUtil.getCoord(funcCtx), func));
        return new VariableStatement(AntlrUtil.getCoord(ctx), var, funcExp);
    }

    @Override
    public Statement visitAssignmentStatement(QuirklParser.AssignmentStatementContext ctx) {
        return ctx.assignment().accept(this);
    }

    @Override
    public Statement visitAssignment(QuirklParser.AssignmentContext ctx) {
        QuirklParser.IdContext idCTX = ctx.id();
        String varName = idCTX.getText();
        Variable var = program.getVariable(varName, this.scope);

        if (var == null) {
            program.addError(QuirklDeclarationException.undeclaredVariable(AntlrUtil.getCoord(idCTX), varName));
            return null;
        }

        QuirklParser.ExpressionContext expCtx = ctx.expression();
        Exp exp = expCtx.accept(new AntlrToExpression(program, this.scope));
        if (exp == null) return null;

        return new VariableStatement(AntlrUtil.getCoord(ctx), var, exp);
    }
}
