package com.apl.quirkyfun.language.semantics.model.exp.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;

public class DecimalLit extends QuirklTypeLit<QuirklDoubleNumber> {

    public DecimalLit(QuirklCoord coord, QuirklDoubleNumber value) {
        super(coord, value);
    }
}
