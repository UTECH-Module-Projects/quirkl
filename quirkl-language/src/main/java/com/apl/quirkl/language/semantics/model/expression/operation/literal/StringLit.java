package com.apl.quirkl.language.semantics.model.expression.operation.literal;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklString;

public class StringLit extends QuirklTypeLit<QuirklString> {

    public StringLit(QuirklCoord coord, String scope) {
        super(coord, scope);
    }
}
