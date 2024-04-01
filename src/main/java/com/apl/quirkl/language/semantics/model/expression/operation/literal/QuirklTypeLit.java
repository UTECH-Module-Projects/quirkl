package com.apl.quirkl.language.semantics.model.expression.operation.literal;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;

public abstract class QuirklTypeLit<T extends QuirklType<?>> extends Exp {

    protected final T value;

    public QuirklTypeLit(QuirklCoord coord, String scope, T value) {
        super(coord, scope);
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
