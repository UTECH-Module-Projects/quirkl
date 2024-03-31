package com.apl.quirkyfun.language.semantics.model.type.number;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklLongNumber extends QuirklNumber<Long> {

    public static final QuirklLongNumber ZERO = new QuirklLongNumber(0L);
    public static final QuirklLongNumber ONE = new QuirklLongNumber(1L);

    public QuirklLongNumber(Long value) {
        super(value);
    }

    public QuirklLongNumber() {
        super(0L);
    }

    public QuirklLongNumber(QuirklLongNumber value) {
        super(value.getValue());
    }

    @Override
    public QuirklLongNumber cast(Object other) throws QuirklCastException {
        if (other instanceof Boolean) return (Boolean) other ? new QuirklLongNumber(1L) : new QuirklLongNumber(0L);
        String value = other.toString();
        try {
            return new QuirklLongNumber(Long.valueOf(value));
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value, TYPE.LONG_NUMBER);
        }
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toLong().getValue());
    }
}
