package com.apl.quirkyfun.language.semantics.model.exp;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;

public class FunctionExp extends Exp {
    private final QuirklFunction func;

    public FunctionExp(QuirklCoord coord, QuirklFunction func) {
        super(coord);
        this.func = func;
    }

    @Override
    public String toString() {
        return func.toString();
    }

    @Override
    public QuirklType<?> eval() {
        return this.func;
    }
}
