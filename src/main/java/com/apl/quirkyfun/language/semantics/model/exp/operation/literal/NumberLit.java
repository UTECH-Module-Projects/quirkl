package com.apl.quirkyfun.language.semantics.model.exp.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;

public class NumberLit extends QuirklTypeLit<QuirklLongNumber> {

    public NumberLit(QuirklCoord coord, QuirklLongNumber value) {
        super(coord, value);
    }
}
