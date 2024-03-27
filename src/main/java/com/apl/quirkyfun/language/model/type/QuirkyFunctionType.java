package com.apl.quirkyfun.language.model.type;

import com.apl.quirkyfun.language.model.variable.function.Function;

public class QuirkyFunctionType extends QuirkyType {

    public QuirkyFunctionType(Function func) {
        super(func);
    }

    public QuirkyType call(QuirkyType... args) {
        return ((Function) this.value).apply(args);
    }
}
