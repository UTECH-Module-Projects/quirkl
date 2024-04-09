package com.apl.quirkl.language.semantics.model.expression.operation.literal;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import lombok.Setter;

public class NumberLit extends QuirklTypeLit<QuirklLongNum> {

    public NumberLit(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    public NumberLit(QuirklCoord coord, String scope, QuirklLongNum value) {
        super(coord, scope, value);
    }
}
