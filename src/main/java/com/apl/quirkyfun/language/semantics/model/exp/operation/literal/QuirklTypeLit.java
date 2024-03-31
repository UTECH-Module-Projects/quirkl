package com.apl.quirkyfun.language.semantics.model.exp.operation.literal;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.Exp;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;

public abstract class QuirklTypeLit<T extends QuirklType<?>> extends Exp {

    protected final T value;

    public QuirklTypeLit(QuirklCoord coord, T value) {
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
