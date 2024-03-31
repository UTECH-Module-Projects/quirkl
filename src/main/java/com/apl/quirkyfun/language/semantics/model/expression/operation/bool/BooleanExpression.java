package com.apl.quirkyfun.language.semantics.model.expression.operation.bool;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;

public abstract class BooleanExpression extends Expression {
    public BooleanExpression(QuirklCoordinate coord) {
        super(coord);
    }
}
