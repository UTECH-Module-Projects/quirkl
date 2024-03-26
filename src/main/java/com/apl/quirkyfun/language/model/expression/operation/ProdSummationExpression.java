package com.apl.quirkyfun.language.model.expression.operation;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.statement.function.Function;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyLongNumber;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdSummationExpression extends OperationExpression<QuirkyLongNumber> {
    private Expression start;
    private Expression end;
    private Function<QuirkyLongNumber> sumFunc;

    public ProdSummationExpression() {

    }

    public ProdSummationExpression(Expression start, Expression end, Function<QuirkyLongNumber> sumFunc) {
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
        long sum = 1;
        for (long i = startValue; i < endValue; i++) {
            sum *= (Integer) sumFunc.apply(new QuirkyLongNumber(i)).getValue();
        }
        return new QuirkyLongNumber(sum);
    }
}
