package com.apl.quirkyfun.language.model.expression.operation.literal;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.QuirkyString;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;

public class StringLiteral extends Expression {

    private final QuirkyString str;

    public StringLiteral(QuirkyString str) {
        this.str = str;
    }

    @Override
    public QuirkyString eval() throws QuirkyMathException {
        return str;
    }
}
