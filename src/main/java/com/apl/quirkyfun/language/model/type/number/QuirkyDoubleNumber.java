package com.apl.quirkyfun.language.model.type.number;

import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.hierchy.QuirkyTypeHierarchy;

public class QuirkyDoubleNumber extends QuirkyNumber {

    private static final String TYPE_NAME = "Double";
    public QuirkyDoubleNumber(Double value) {
        super(value);
    }

    @Override
    public QuirkyNumber add(QuirkyNumber other) {
        return new QuirkyDoubleNumber((double) this.value + (double) other.getValue());
    }

    @Override
    public QuirkyNumber subtract(QuirkyNumber other) {
        return new QuirkyDoubleNumber((double) this.value - (double) other.getValue());
    }

    @Override
    public QuirkyNumber multiply(QuirkyNumber other) {
        return new QuirkyDoubleNumber((double) this.value * (double) other.getValue());
    }

    @Override
    public QuirkyNumber divide(QuirkyNumber other) {
        return new QuirkyDoubleNumber((double) this.value / (double) other.getValue());
    }

    @Override
    public QuirkyNumber modulo(QuirkyNumber other) {
        return new QuirkyDoubleNumber((double) this.value % (double) other.getValue());
    }

    @Override
    public QuirkyNumber power(QuirkyNumber other) {
        return new QuirkyDoubleNumber(Math.pow((double) this.value, (double) other.getValue()));
    }

    @Override
    public QuirkyNumber root(QuirkyNumber other) throws QuirkyMathException {
        if ((double) other.getValue() == 0d)
            throw new QuirkyMathException("Cannot calculate the root of a number by 0");
        return new QuirkyDoubleNumber(Math.pow((double) this.value, 1d / (double) other.getValue()));
    }

    public QuirkyNumber cast(QuirkyNumber value) throws QuirkyMathException {
        if (QuirkyTypeHierarchy.INSTANCE.isSubtype(value, "Quirky" + TYPE_NAME))
            throw new QuirkyMathException("Cannot cast " + value.getClass().getSimpleName() + " to Quirky" + TYPE_NAME);
        return new QuirkyDoubleNumber((double) value.getValue());
    }
}
