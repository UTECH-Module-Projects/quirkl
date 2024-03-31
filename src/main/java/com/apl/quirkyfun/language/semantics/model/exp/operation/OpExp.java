package com.apl.quirkyfun.language.semantics.model.exp.operation;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.Exp;

public abstract class OpExp extends Exp {
    public OpExp(QuirklCoord coord) {
        super(coord);
    }
}
