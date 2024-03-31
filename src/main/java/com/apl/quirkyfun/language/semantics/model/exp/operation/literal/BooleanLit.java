package com.apl.quirkyfun.language.semantics.model.exp.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;

public class BooleanLit extends QuirklTypeLit<QuirklBoolean> {

    public BooleanLit(QuirklCoord coord, QuirklBoolean value) {
        super(coord, value);
    }
}
