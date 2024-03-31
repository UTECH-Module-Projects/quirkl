package com.apl.quirkyfun.language.semantics.model.exp.operation.bool;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.Exp;

public abstract class BoolExp extends Exp {
    public BoolExp(QuirklCoord coord) {
        super(coord);
    }
}
