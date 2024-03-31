package com.apl.quirkyfun.language.semantics.model.expression.operation;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklCastException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SumExpression extends OperationExpression {
    private Expression start;
    private Expression end;
    private QuirklFunction sumFunc;
    private OPERATOR operator;

    public enum OPERATOR {
        SUMM("~"),
        PRODSUMM("~*");

        private final String symbol;

        OPERATOR(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return this.symbol;
        }
    }

    public SumExpression(QuirklCoordinate coord) {
        super(coord);
        this.start = null;
        this.end = null;
        this.sumFunc = null;
        this.operator = null;
    }

    public SumExpression(QuirklCoordinate coord, Expression start, Expression end, QuirklFunction sumFunc, OPERATOR operator) {
        super(coord);
        this.start = start;
        this.end = end;
        this.sumFunc = sumFunc;
        this.operator = operator;
    }

    @Override
    public QuirklLongNumber eval() throws QuirklRuntimeException {
        QuirklType<?> startResult = start.eval();
        if (startResult.isNotNumberType())
            throw QuirklOperationException.notCompatible(this.operator.symbol, startResult.getType());

        QuirklType<?> endResult = end.eval();
        if (endResult.isNotNumberType())
            throw QuirklOperationException.notCompatible(this.operator.symbol, endResult.getType());

        long startValue = startResult.toLong().getValue();
        long endValue = endResult.toLong().getValue();

        return switch (this.operator) {
            case SUMM -> summ(startValue, endValue);
            case PRODSUMM -> prodSumm(startValue, endValue);
        };
    }

    private QuirklLongNumber summ(long startValue, long endValue) throws QuirklRuntimeException {
        long sum = 0;
        for (long i = startValue; i < endValue; i++) {
            sum += sumFunc.call(new QuirklLongNumber(i)).toLong().getValue();
        }
        return new QuirklLongNumber(sum);
    }

    private QuirklLongNumber prodSumm(long startValue, long endValue) throws QuirklRuntimeException {
        long sum = 1;
        for (long i = startValue; i < endValue; i++) {
            sum *= sumFunc.call(new QuirklLongNumber(i)).toLong().getValue();
        }
        return new QuirklLongNumber(sum);
    }
}
