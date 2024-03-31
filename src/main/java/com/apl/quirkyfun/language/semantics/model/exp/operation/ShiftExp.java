package com.apl.quirkyfun.language.semantics.model.exp.operation;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.Exp;
import com.apl.quirkyfun.language.semantics.model.exp.VariableExp;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class ShiftExp extends OpExp {
    private final Exp exp;
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

    public ShiftExp(QuirklCoord coord, Exp exp, OP op) {
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
        if (exp instanceof VariableExp varExp)
            varExp.getVariable().updateValue(res);
        return res;
    }

    private QuirklType<?> decrement() throws QuirklRuntimeException {
        QuirklType<?> res = exp.eval().subtract(one);
        if (exp instanceof VariableExp varExp)
            varExp.getVariable().updateValue(res);
        return res;
    }
}
