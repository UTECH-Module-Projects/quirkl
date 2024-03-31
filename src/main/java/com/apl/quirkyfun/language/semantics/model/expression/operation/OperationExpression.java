package com.apl.quirkyfun.language.semantics.model.expression.operation;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;

public abstract class OperationExpression extends Expression {
    public OperationExpression(QuirklCoordinate coord) {
        super(coord);
    }
}
