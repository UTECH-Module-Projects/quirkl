package com.apl.quirkyfun.language.semantics.model.exp;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class BracketExp extends Exp {
    private final Exp exp;

    public BracketExp(QuirklCoord coord, Exp exp) {
        super(coord);
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
