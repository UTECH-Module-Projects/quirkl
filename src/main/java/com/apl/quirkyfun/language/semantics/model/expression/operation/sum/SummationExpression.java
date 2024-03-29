package com.apl.quirkyfun.language.semantics.model.expression.operation.sum;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
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
    public QuirklLongNumber eval() throws QuirklMathException {
        long startValue = (long) start.eval().getValue();
        long endValue = (long) end.eval().getValue();
        long sum = 0;
        for (long i = startValue; i < endValue; i++) {
            sum += (Integer) sumFunc.apply(new QuirklLongNumber(i)).getValue();
        }
        return new QuirklLongNumber(sum);
    }
}
