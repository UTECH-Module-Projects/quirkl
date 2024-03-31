package com.apl.quirkyfun.language.semantics.model.expression.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;

public class NumberLiteral extends QuirklTypeLiteral<QuirklLongNumber> {

    public NumberLiteral(QuirklCoordinate coord, QuirklLongNumber value) {
        super(coord, value);
    }
}
