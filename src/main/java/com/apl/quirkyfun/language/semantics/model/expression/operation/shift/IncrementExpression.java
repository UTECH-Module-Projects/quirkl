package com.apl.quirkyfun.language.semantics.model.expression.operation.shift;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.OperationExpression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklNumber;

public class IncrementExpression extends OperationExpression<QuirklNumber> {
    private final Expression exp;
    private final QuirklLongNumber one = new QuirklLongNumber(1L);

    public IncrementExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "++" + this.exp.toString();
    }

    @Override
    public QuirklNumber eval() throws QuirklMathException {
        QuirklNumber eval = (QuirklNumber) exp.eval();
        QuirklNumber incOne = eval.cast(one);
        return eval.add(incOne);
    }
}
