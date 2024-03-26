package com.apl.quirkyfun.language.model.expression.operation.literal;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.expression.operation.OperationExpression;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyLongNumber;

public class NumberLiteral extends Expression {

    private final QuirkyLongNumber num;

    public NumberLiteral(QuirkyLongNumber num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num.toString();
    }

    @Override
    public QuirkyLongNumber eval() throws QuirkyMathException {
        return num;
    }
}
