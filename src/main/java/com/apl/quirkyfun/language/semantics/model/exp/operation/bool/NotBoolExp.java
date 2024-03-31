package com.apl.quirkyfun.language.semantics.model.exp.operation.bool;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.Exp;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class NotBoolExp extends BoolExp {

    private final Exp exp;
    public static final String NOT = "!";

    public NotBoolExp(QuirklCoord coord, Exp exp) {
        super(coord);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return NOT + this.exp.toString();
    }

    @Override
    public QuirklBoolean eval() throws QuirklRuntimeException {
        return this.exp.eval().not();
    }
}
