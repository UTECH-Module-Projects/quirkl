package com.apl.quirkyfun.language.semantics.model.expression.operation;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.VariableExpression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class ShiftExpression extends OperationExpression {
    private final Expression exp;
    private final OP op;
    private final static QuirklLongNumber one = new QuirklLongNumber(1L);

    public enum OP {
        INC("++"), DEC("--");

        private final String operator;

        OP(String operator) {
            this.operator = operator;
        }

        @Override
        public String toString() {
            return this.operator;
        }
    }

    public ShiftExpression(QuirklCoordinate coord, Expression exp, OP op) {
        super(coord);
        this.exp = exp;
        this.op = op;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return switch (this.op) {
            case INC -> increment();
            case DEC -> decrement();
        };
    }

    private QuirklType<?> increment() throws QuirklRuntimeException {
        QuirklType<?> res = exp.eval().add(one);
        if (exp instanceof VariableExpression varExp)
            varExp.getVariable().updateValue(res);
        return res;
    }

    private QuirklType<?> decrement() throws QuirklRuntimeException {
        QuirklType<?> res = exp.eval().subtract(one);
        if (exp instanceof VariableExpression varExp)
            varExp.getVariable().updateValue(res);
        return res;
    }
}
