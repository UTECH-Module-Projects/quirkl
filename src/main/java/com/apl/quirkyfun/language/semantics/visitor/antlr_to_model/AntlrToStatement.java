package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.FunctionExpression;
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
import org.antlr.v4.runtime.Token;

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
        Expression exp = null;

        if (var != null) {
            Token idToken = idCTX.LETTER().getFirst().getSymbol();
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine();
            program.addError(QuirklDeclarationException.variableAlreadyDeclared(var, new QuirklCoordinate(line, column)));
            return null;
        } else {
            var = new Variable(AntlrUtil.getCoord(idCTX), varName);
        }

        String varTypeStr = ctx.variableDataType().getText();
        QuirklType.TYPE varType = QuirklType.getTypeAsQuirklName(varTypeStr);
        var.setType(varType);

        QuirklParser.ExpressionContext expCtx = ctx.expression();
        if (!expCtx.isEmpty()) {
            exp = expCtx.accept(new AntlrToExpression(program, this.scope));
            if (exp == null) return null;
        }
        program.addVariable(var, this.scope);
        if (exp == null) return new VariableStatement(var);
        return new VariableStatement(var, exp);
    }

    @Override
    public Statement visitFunctionDeclaration(QuirklParser.FunctionDeclarationContext ctx) {
        QuirklParser.IdContext idCTX = ctx.id();
        String varName = idCTX.getText();
        Variable var = program.getVariable(varName, this.scope);
        Function func = null;

        if (var != null) {
            Token idToken = idCTX.LETTER().getFirst().getSymbol();
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine();
            program.addError(QuirklDeclarationException.variableAlreadyDeclared(var, new QuirklCoordinate(line, column)));
            return null;
        } else {
            var = new Variable(AntlrUtil.getCoord(idCTX), varName);
        }

        String varTypeStr = ctx.FUNCTION_TYPE().getText();
        QuirklType.TYPE varType = QuirklType.getTypeAsQuirklName(varTypeStr);
        var.setType(varType);

        QuirklParser.FunctionContext funcCtx = ctx.function();
        if (!funcCtx.isEmpty()) {
            func = funcCtx.accept(new AntlrToFunction(program, this.scope));
            if (func == null) return null;
        }
        program.addVariable(var, this.scope);
        if (func == null) return new VariableStatement(var);
        return new VariableStatement(var, new FunctionExpression(AntlrUtil.getCoord(funcCtx), new QuirklFunction(func)));
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
            program.addError(QuirklDeclarationException.undeclaredVariable(idCTX));
            return null;
        }

        QuirklParser.ExpressionContext expCtx = ctx.expression();
        Expression exp = expCtx.accept(new AntlrToExpression(program, this.scope));
        if (exp == null) return null;

        return new VariableStatement(var, exp);
    }
}
