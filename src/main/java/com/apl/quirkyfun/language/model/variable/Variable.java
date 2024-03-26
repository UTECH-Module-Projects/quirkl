package com.apl.quirkyfun.language.model.variable;

import com.apl.quirkyfun.language.model.type.QuirkyType;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Variable {

    private final String id;
    private final String type;
    @Setter
    private QuirkyType value;

    public Variable(String id, String type) {
        this.id = id;
        this.type = type;
        this.value = null;
    }

    public Variable(String id, String type, QuirkyType value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public boolean isInitialized() {
        return this.value != null;
    }

    @Override
    public String toString() {
        return this.id + ": " + type + (this.isInitialized() ? " = " + this.value.toString() : "");
    }
}
