package com.apl.quirkyfun.language.semantics.model.expression.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklString;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class StringLiteral extends QuirklTypeLiteral<QuirklString> {

    public StringLiteral(QuirklCoordinate coord, QuirklString value) {
        super(coord, value);
    }
}
