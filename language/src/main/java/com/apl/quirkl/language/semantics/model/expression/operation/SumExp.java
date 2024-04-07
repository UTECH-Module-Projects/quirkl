package com.apl.quirkl.language.semantics.model.expression.operation;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklOperationException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SumExp extends OpExp {
    private Exp start;
    private Exp end;
    private Var<QuirklFunc> sumFunc;
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

    public SumExp(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.start = null;
        this.end = null;
        this.sumFunc = null;
        this.operator = null;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s (%s)", start, operator, end, sumFunc);
    }

    @Override
    public QuirklLongNum eval() throws QuirklRuntimeException {
        QuirklType<?> startResult = start.eval();
        if (startResult.isNotNumberType())
            throw QuirklOperationException.notCompatible(this.operator.symbol, startResult.getType(), this.getMyScope(), this.getCoord());

        QuirklType<?> endResult = end.eval();
        if (endResult.isNotNumberType())
            throw QuirklOperationException.notCompatible(this.operator.symbol, endResult.getType(), this.getScope(), this.getCoord());

        long startValue = startResult.toLong().getValue();
        long endValue = endResult.toLong().getValue();

        return switch (this.operator) {
            case SUMM -> summ(startValue, endValue);
            case PRODSUMM -> prodSumm(startValue, endValue);
        };
    }

    private QuirklLongNum summ(long startValue, long endValue) throws QuirklRuntimeException {
        long sum = 0;
        for (long i = startValue; i <= endValue; i++) {
            sum += sumFunc.getValue().call(new QuirklLongNum(i, this)).toLong().getValue();
        }
        return new QuirklLongNum(sum, this);
    }

    private QuirklLongNum prodSumm(long startValue, long endValue) throws QuirklRuntimeException {
        long sum = 1;
        for (long i = startValue; i <= endValue; i++) {
            sum *= sumFunc.getValue().call(new QuirklLongNum(i, this)).toLong().getValue();
        }
        return new QuirklLongNum(sum, this);
    }
}
