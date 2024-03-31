package com.apl.quirkyfun.language.semantics.model.type.number;

import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklDoubleNumber extends QuirklNumber<Double> {

    public static final QuirklDoubleNumber ZERO = new QuirklDoubleNumber(0D);

    public QuirklDoubleNumber() {
        super(0.0);
    }

    public QuirklDoubleNumber(Double value) {
        super(value);
    }

    @Override
    public QuirklDoubleNumber cast(Object other) throws QuirklCastException {
        if (other instanceof Boolean) return (Boolean) other ? new QuirklDoubleNumber(1D) : new QuirklDoubleNumber(0D);
        String value = other.toString();
        try {
            return new QuirklDoubleNumber(Double.valueOf(value));
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value, TYPE.DOUBLE_NUMBER);
        }
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toDouble().getValue());
    }
}
