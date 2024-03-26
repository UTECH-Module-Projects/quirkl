package com.apl.quirkyfun.language.model.expression.operation.bool;

import com.apl.quirkyfun.language.model.type.QuirkyBoolean;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;

public class NotBooleanExpression extends BooleanExpression {

    private final BooleanExpression exp;

    public NotBooleanExpression(BooleanExpression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return '!' + this.exp.toString();
    }

    @Override
    public QuirkyBoolean eval() throws QuirkyMathException {
        return ((QuirkyBoolean) this.exp.eval()).not();
    }
}
