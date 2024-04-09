package com.apl.quirkl.language.semantics.model.expression.operation.literal;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;

public class DecimalLit extends QuirklTypeLit<QuirklDoubleNum> {

    public DecimalLit(QuirklCoord coord, String scope) {
        super(coord, scope);
    }
}
