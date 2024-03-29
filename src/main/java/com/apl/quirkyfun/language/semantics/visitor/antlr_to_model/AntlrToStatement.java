package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.statement.Statement;
import com.apl.quirkyfun.language.semantics.model.statement.declaration.VariableDeclaration;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import org.antlr.v4.runtime.Token;

public class AntlrToStatement extends AntlrToModel<Statement> {

    public AntlrToStatement() {
        super();
    }

    public AntlrToStatement(String scope) {
        super(scope);
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
        }

        String varType = ctx.variableDataType().getText();
        String assign = ctx.ASSIGN().getText();
        if (assign == null || assign.isEmpty()) {
            int line = idCTX.getStart().getLine();
            int column = idCTX.getStart().getCharPositionInLine();
            var = new Variable(new QuirklCoordinate(line, column), varName, varType);
        } else {
            exp = ctx.expression().accept(new AntlrToExpression2(scope));
            if (exp == null) return null;
        }
        program.addVariable(var, scope);
        if (exp == null) return new VariableDeclaration(var);
        return new VariableDeclaration(var, exp);
    }
}
