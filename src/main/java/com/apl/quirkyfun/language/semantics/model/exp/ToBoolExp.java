package com.apl.quirkyfun.language.semantics.model.exp;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class ToBoolExp extends Exp {
    private final Exp exp;

    public ToBoolExp(QuirklCoord coord, Exp exp) {
        super(coord);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "?(" + this.exp.toString() + ")";
    }

    @Override
    public QuirklBoolean eval() throws QuirklRuntimeException {
        return exp.eval().toBoolean();
    }
}
