package com.apl.quirkyfun.language.semantics.model.expression.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;

public abstract class QuirklTypeLiteral<T extends QuirklType<?>> extends Expression {

    protected final T value;

    public QuirklTypeLiteral(QuirklCoordinate coord, T value) {
        super(coord);
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public T eval() {
        return value;
    }

}
