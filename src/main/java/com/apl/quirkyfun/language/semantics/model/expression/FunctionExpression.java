package com.apl.quirkyfun.language.semantics.model.expression;

import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class FunctionExpression extends Expression {
    private final QuirklFunction func;

    public FunctionExpression(QuirklFunction func) {
        this.func = func;
    }

    @Override
    public String toString() {
        return func.toString();
    }

    @Override
    public QuirklType eval() throws QuirklMathException {
        return this.func;
    }
}
