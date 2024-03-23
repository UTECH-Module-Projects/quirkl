package com.apl.quirkyfun.language.model.variable;

import com.apl.quirkyfun.language.model.type.QType;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Variable<T extends QType> {
    private final String id;
    @Setter
    private T value;

    public Variable(String id) {
        this.id = id;
        this.value = null;
    }

    public Variable(String id, T value) {
        this.id = id;
        this.value = value;
    }

    /*@Override
    public String toString() {
        return this.id + ": " + ;
    }*/
}
