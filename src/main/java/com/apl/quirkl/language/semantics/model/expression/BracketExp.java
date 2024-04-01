package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class BracketExp extends Exp {
    private final Exp exp;

    public BracketExp(QuirklCoord coord, String scope, Exp exp) {
        super(coord, scope);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "(" + this.exp.toString() + ")";
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return exp.eval();
    }
}
