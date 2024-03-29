package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;

public class QuirklString extends QuirklType<String> {

    public QuirklString(String value) {
        super(value);
    }

    @Override
    public QuirklType<String> add(QuirklType<?> other) {
        return new QuirklString(this.value + other.toString());
    }

    public Number parseToNumber() throws QuirklCastException {
        try {
            return Double.parseDouble(this.value);
        } catch (NullPointerException | NumberFormatException e) {
            throw QuirklCastException.invalidNumberFormat(this.value);
        }
    }
}
