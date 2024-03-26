package com.apl.quirkyfun.language.model.type.number;

import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import lombok.Getter;

@Getter
public abstract class QuirkyNumber extends QuirkyType {

    protected QuirkyNumber(Number value) {
        super(value);
    }

    public abstract QuirkyNumber add(QuirkyNumber other);
    public abstract QuirkyNumber subtract(QuirkyNumber other);
    public abstract QuirkyNumber multiply(QuirkyNumber other);
    public abstract QuirkyNumber divide(QuirkyNumber other);
    public abstract QuirkyNumber modulo(QuirkyNumber other);
    public abstract QuirkyNumber power(QuirkyNumber other);
    public abstract QuirkyNumber root(QuirkyNumber other) throws QuirkyMathException;
    public abstract QuirkyNumber cast(QuirkyNumber other) throws QuirkyMathException;
}
