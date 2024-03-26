package com.apl.quirkyfun.language.model.expression.operation.literal;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.expression.operation.OperationExpression;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyDoubleNumber;

public class DecimalLiteral extends Expression {

    private final QuirkyDoubleNumber dec;

    public DecimalLiteral(QuirkyDoubleNumber dec) {
        this.dec = dec;
    }

    @Override
    public String toString() {
        return dec.toString();
    }

    @Override
    public QuirkyDoubleNumber eval() throws QuirkyMathException {
        return dec;
    }
}
