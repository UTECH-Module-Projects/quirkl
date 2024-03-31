package com.apl.quirkyfun.language.semantics.model.type.number;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class QuirklLongNumber extends QuirklNumber<Long> {

    public static final QuirklLongNumber ZERO = new QuirklLongNumber(QuirklCoord.ORIGIN, 0L);
    public static final QuirklLongNumber ONE = new QuirklLongNumber(QuirklCoord.ORIGIN, 1L);

    public QuirklLongNumber(QuirklCoord coord, Long value) {
        super(coord, value);
    }

    public QuirklLongNumber(QuirklCoord coord) {
        super(coord, 0L);
    }

    public QuirklLongNumber(QuirklLongNumber value) {
        super(value.getCoord(), value.getValue());
    }

    @Override
    public QuirklLongNumber cast(Object other) throws QuirklCastException {
        if (other instanceof Boolean) return (Boolean) other ? new QuirklLongNumber(1L) : new QuirklLongNumber(0L);
        String value = other.toString();
        try {
            return new QuirklLongNumber(this.getCoord(), Long.valueOf(value));
        } catch (Exception e) {
            throw QuirklCastException.notCompatible(value, TYPE.LONG_NUMBER);
        }
    }

    @Override
    public int compareTo(QuirklType<?> other) throws QuirklMathException {
        return this.value.compareTo(other.toLong().getValue());
    }
}
