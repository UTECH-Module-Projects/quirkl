package com.apl.quirkyfun.language.model.expression;

import com.apl.quirkyfun.language.model.type.QuirkyFunctionType;
import com.apl.quirkyfun.language.model.variable.function.Function;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;

public class FunctionExpression extends Expression {
    private final QuirkyFunctionType func;

    public FunctionExpression(QuirkyFunctionType func) {
        this.func = func;
    }

    @Override
    public String toString() {
        return func.toString();
    }

    @Override
    public QuirkyType eval() throws QuirkyMathException {
        return this.func;
    }
}
