package com.apl.quirkl.language.semantics.model.expression.operation;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;

public abstract class OpExp extends Exp {
    public OpExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }
}
