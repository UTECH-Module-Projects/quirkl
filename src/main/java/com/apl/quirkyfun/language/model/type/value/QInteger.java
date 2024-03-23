package com.apl.quirkyfun.language.model.type.value;

public class QInteger extends QNumber<Integer> {
    protected QInteger(Number value) {
        super((Integer) value);
    }

    @Override
    public Integer parse() {
        return null;
    }
}
