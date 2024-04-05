package com.apl.quirkl.language.semantics.model.expression.operation.bool;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;

public abstract class BoolExp extends Exp {
    public BoolExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }
}
