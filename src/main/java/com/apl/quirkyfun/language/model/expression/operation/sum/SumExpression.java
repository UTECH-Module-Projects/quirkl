package com.apl.quirkyfun.language.model.expression.operation.sum;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.expression.operation.OperationExpression;
import com.apl.quirkyfun.language.model.variable.function.Function;
import com.apl.quirkyfun.language.model.type.number.QuirkyLongNumber;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class SumExpression extends OperationExpression<QuirkyLongNumber> {
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
