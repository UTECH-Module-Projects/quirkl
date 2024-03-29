package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile;

import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;

public class QuirklDeclarationException extends QuirklCompileException {
    public QuirklDeclarationException(String message) {
        super(message);
    }

    public QuirklDeclarationException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuirklDeclarationException(Throwable cause) {
        super(cause);
    }

    protected QuirklDeclarationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static QuirklDeclarationException undeclaredVariable(QuirklParser.IdContext idContext) {
        String varName = idContext.getText();
        int line = idContext.getStart().getLine();
        int column = idContext.getStart().getCharPositionInLine();
        return new QuirklDeclarationException(String.format("Variable %s is not defined. {line: %d, column: %d}", varName, line, column));
    }

    public static QuirklDeclarationException variableAlreadyDeclared(Variable var, QuirklCoordinate coord) {
        return new QuirklDeclarationException(String.format("Variable %s already declared %s. %s", var.getId(), var.getCoord(), coord));
    }
}
