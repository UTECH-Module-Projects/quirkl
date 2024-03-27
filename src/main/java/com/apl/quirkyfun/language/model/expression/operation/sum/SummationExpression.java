package com.apl.quirkyfun.language.model.expression.operation.sum;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.variable.function.Function;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.model.type.number.QuirkyLongNumber;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SummationExpression extends SumExpression {

    public SummationExpression() {
    }

    public SummationExpression(Expression start, Expression end, Function sumFunc) {
        super(start, end, sumFunc);
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
