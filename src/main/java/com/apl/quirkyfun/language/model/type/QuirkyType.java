package com.apl.quirkyfun.language.model.type;

import lombok.Getter;

@Getter
public abstract class QuirkyType {
    protected final Object value;

    protected QuirkyType(Object value) {
        this.value = value;
    }
}
