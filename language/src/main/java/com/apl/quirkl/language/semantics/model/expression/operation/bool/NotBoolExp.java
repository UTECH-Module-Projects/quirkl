package com.apl.quirkl.language.semantics.model.expression.operation.bool;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklBool;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class NotBoolExp extends BoolExp {

    private final Exp exp;
    public static final String NOT = "!";

    public NotBoolExp(QuirklCoord coord, String scope, Exp exp) {
        super(coord, scope);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return NOT + this.exp.toString();
    }

    @Override
    public QuirklBool eval() throws QuirklRuntimeException {
        return this.exp.eval().not();
    }
}
