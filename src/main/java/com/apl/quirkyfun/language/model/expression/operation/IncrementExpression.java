package com.apl.quirkyfun.language.model.expression.operation;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyLongNumber;
import com.apl.quirkyfun.language.model.type.number.QuirkyNumber;

public class IncrementExpression extends OperationExpression<QuirkyNumber> {
    private final Expression exp;
    private final QuirkyLongNumber one = new QuirkyLongNumber(1L);

    public IncrementExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "++" + this.exp.toString();
    }

    @Override
    public QuirkyNumber eval() throws QuirkyMathException {
        QuirkyNumber eval = (QuirkyNumber) exp.eval();
        QuirkyNumber incOne = eval.cast(one);
        return eval.add(incOne);
    }
}
