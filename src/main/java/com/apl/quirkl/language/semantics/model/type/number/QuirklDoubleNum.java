package com.apl.quirkl.language.semantics.model.type.number;

import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklDoubleNum extends QuirklNum<Double> {

    public static final QuirklDoubleNum ZERO = new QuirklDoubleNum(0D);
    public static final QuirklDoubleNum ONE = new QuirklDoubleNum(1D);

    public QuirklDoubleNum() {
        super(0.0);
    }

    public QuirklDoubleNum(Double value) {
        super(value);
    }

    public QuirklDoubleNum(QuirklDoubleNum value) {
        super(value.getValue());
    }

    @Override
    public QuirklDoubleNum cast(Object other) throws QuirklCastException {
        if (other instanceof Boolean) return (Boolean) other ? new QuirklDoubleNum(1D) : new QuirklDoubleNum(0D);
        String value = other.toString();
        try {
            return new QuirklDoubleNum(Double.valueOf(value));
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value, TYPE.DOUBLE_NUMBER);
        }
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toDouble().getValue());
    }
}
