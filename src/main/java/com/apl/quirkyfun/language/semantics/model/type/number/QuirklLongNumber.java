package com.apl.quirkyfun.language.semantics.model.type.number;

import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;

public class QuirklLongNumber extends QuirklNumber<Long> {

    public QuirklLongNumber(Long value) {
        super(value);
    }

    @Override
    public QuirklLongNumber cast(Object other) throws QuirklCastException {
        try {
            return new QuirklLongNumber((long) other);
        } catch (Exception e) {
            throw QuirklCastException.invalidNumberFormat(other.toString());
        }
    }
}
