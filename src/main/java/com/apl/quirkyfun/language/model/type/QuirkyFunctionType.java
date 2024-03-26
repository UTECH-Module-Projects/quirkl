package com.apl.quirkyfun.language.model.type;

import com.apl.quirkyfun.language.model.statement.function.Function;

public class QuirkyFunctionType extends QuirkyType<Function> {

    protected QuirkyFunctionType(Function value) {
        super(value);
    }

    public boolean isFunctionCall(String functionName) {
        return this.value.getName().equals(functionName);
    }
}
