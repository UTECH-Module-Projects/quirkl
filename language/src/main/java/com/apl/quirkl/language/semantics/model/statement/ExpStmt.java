package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class ExpStmt extends Stmt {

    private final Exp exp;

    public ExpStmt(QuirklCoord coord, String scope, Exp exp) {
        super(coord, scope);
        this.exp = exp;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return exp.eval();
    }

    @Override
    public String toString() {
        return exp.toString();
    }
}
