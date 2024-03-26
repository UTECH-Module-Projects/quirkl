package com.apl.quirkyfun.language.model.expression.operation.literal;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.QuirkyBoolean;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;

public class BooleanLiteral extends Expression {

    private final QuirkyBoolean bool;

    public BooleanLiteral(QuirkyBoolean bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return bool.toString();
    }

    @Override
    public QuirkyBoolean eval() throws QuirkyMathException {
        return bool;
    }
}
