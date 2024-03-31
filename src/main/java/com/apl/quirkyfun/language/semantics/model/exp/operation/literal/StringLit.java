package com.apl.quirkyfun.language.semantics.model.exp.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklString;

public class StringLit extends QuirklTypeLit<QuirklString> {

    public StringLit(QuirklCoord coord, QuirklString value) {
        super(coord, value);
    }
}
