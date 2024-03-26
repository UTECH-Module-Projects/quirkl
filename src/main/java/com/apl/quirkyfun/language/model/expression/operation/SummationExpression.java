package com.apl.quirkyfun.language.model.expression.operation;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.statement.function.Function;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyLongNumber;
import lombok.Getter;

@Getter
public class SummationExpression extends OperationExpression<QuirkyLongNumber> {
    private final Expression start;
    private final Expression end;
    private final Function<QuirkyLongNumber> sumFunc;

    public SummationExpression(Expression start, Expression end, Function<QuirkyLongNumber> sumFunc) {
        this.start = start;
        this.end = end;
        this.sumFunc = sumFunc;
    }

    @Override
    public String toString() {
        return this.start.toString() + " ~ " + this.end.toString() + "(" + this.sumFunc.toString() + ")";
    }

    @Override
    public QuirkyLongNumber eval() throws QuirkyMathException {
        long startValue = (long) start.eval().getValue();
        long endValue = (long) end.eval().getValue();
        long sum = 0;
        for (long i = startValue; i < endValue; i++) {
            sum += (Integer) sumFunc.apply(new QuirkyLongNumber(i)).getValue();
        }
        return new QuirkyLongNumber(sum);
    }
}
