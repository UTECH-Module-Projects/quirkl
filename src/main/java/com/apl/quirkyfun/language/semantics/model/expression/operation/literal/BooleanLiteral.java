package com.apl.quirkyfun.language.semantics.model.expression.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class BooleanLiteral extends QuirklTypeLiteral<QuirklBoolean> {

    public BooleanLiteral(QuirklCoordinate coord, QuirklBoolean value) {
        super(coord, value);
    }
}
