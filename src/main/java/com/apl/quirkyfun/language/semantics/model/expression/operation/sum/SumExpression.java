package com.apl.quirkyfun.language.semantics.model.expression.operation.sum;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.OperationExpression;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class SumExpression extends OperationExpression<QuirklLongNumber> {
    protected Expression start;
    protected Expression end;
    protected Function sumFunc;

    public SumExpression() {

    }

    public SumExpression(Expression start, Expression end, Function sumFunc) {
        this.start = start;
        this.end = end;
        this.sumFunc = sumFunc;
    }
}
