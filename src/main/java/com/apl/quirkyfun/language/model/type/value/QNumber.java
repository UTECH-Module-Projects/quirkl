package com.apl.quirkyfun.language.model.type.value;

import lombok.Getter;

@Getter
public abstract class QNumber<V extends Number> {
    private final V value;

    protected QNumber(V value) {
        this.value = value;
    }

    public abstract V parse();
}
