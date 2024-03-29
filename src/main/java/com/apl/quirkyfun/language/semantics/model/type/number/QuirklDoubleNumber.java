package com.apl.quirkyfun.language.semantics.model.type.number;

import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;

public class QuirklDoubleNumber extends QuirklNumber<Double> {

    public QuirklDoubleNumber(Double value) {
        super(value);
    }

    @Override
    public QuirklDoubleNumber cast(Object other) throws QuirklCastException {
        try {
            return new QuirklDoubleNumber((double) other);
        } catch (Exception e) {
            throw QuirklCastException.invalidNumberFormat(other.toString());
        }
    }


}
