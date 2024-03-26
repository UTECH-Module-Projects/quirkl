package com.apl.quirkyfun.language.model.type.number;

import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.hierchy.QuirkyTypeHierarchy;

public class QuirkyLongNumber extends QuirkyNumber {

    private static final String TYPE_NAME = "Long";
    public QuirkyLongNumber(Long value) {
        super(value);
    }

    @Override
    public QuirkyNumber add(QuirkyNumber other) {
        return new QuirkyLongNumber((long) this.value + (long) other.getValue());
    }

    @Override
    public QuirkyNumber subtract(QuirkyNumber other) {
        return new QuirkyLongNumber((long) this.value - (long) other.getValue());
    }

    @Override
    public QuirkyNumber multiply(QuirkyNumber other) {
        return new QuirkyLongNumber((long) this.value * (long) other.getValue());
    }

    @Override
    public QuirkyNumber divide(QuirkyNumber other) {
        return new QuirkyLongNumber((long) this.value / (long) other.getValue());
    }

    @Override
    public QuirkyNumber modulo(QuirkyNumber other) {
        return new QuirkyLongNumber((long) this.value % (long) other.getValue());
    }

    @Override
    public QuirkyNumber power(QuirkyNumber other) {
        return new QuirkyLongNumber((long) Math.pow((long) this.value, (long) other.getValue()));
    }

    @Override
    public QuirkyNumber root(QuirkyNumber other) throws QuirkyMathException {
        if ((long) other.getValue() == 0)
            throw new QuirkyMathException("Cannot calculate the root of a number by 0");
        return new QuirkyLongNumber((long) Math.pow((long) this.value, 1d / (long) other.getValue()));
    }

    @Override
    public QuirkyNumber cast(QuirkyNumber other) throws QuirkyMathException {
        if (QuirkyTypeHierarchy.INSTANCE.isSubtype(other, "Quirky" + TYPE_NAME))
            throw new QuirkyMathException("Cannot cast " + other.getClass().getSimpleName() + " to Quirky" + TYPE_NAME);
        return new QuirkyLongNumber((long) other.getValue());
    }
}
