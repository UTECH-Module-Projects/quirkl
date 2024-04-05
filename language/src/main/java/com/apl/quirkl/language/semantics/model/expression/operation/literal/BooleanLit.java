package com.apl.quirkl.language.semantics.model.expression.operation.literal;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklBool;

public class BooleanLit extends QuirklTypeLit<QuirklBool> {

    public BooleanLit(QuirklCoord coord, String scope) {
        super(coord, scope);
    }
}
