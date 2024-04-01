package com.apl.quirkl.language.semantics.model.type.number;

import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklLongNum extends QuirklNum<Long> {

    public static final QuirklLongNum ZERO = new QuirklLongNum(0L);
    public static final QuirklLongNum ONE = new QuirklLongNum(1L);

    public QuirklLongNum(Long value) {
        super(value);
    }

    public QuirklLongNum() {
        super(0L);
    }

    public QuirklLongNum(QuirklLongNum value) {
        super(value.getValue());
    }

    @Override
    public QuirklLongNum cast(Object other) throws QuirklCastException {
        if (other instanceof Boolean) return (Boolean) other ? new QuirklLongNum(1L) : new QuirklLongNum(0L);
        String value = other.toString();
        try {
            return new QuirklLongNum(Long.valueOf(value));
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value, TYPE.LONG_NUMBER);
        }
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toLong().getValue());
    }
}
