package com.apl.quirkl.language.semantics.model.expression.operation;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.VariableExp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class ShiftExp extends OpExp {
    private final Exp exp;
    private final OP op;
    private final static QuirklLongNum one = new QuirklLongNum(1L);

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

    public ShiftExp(QuirklCoord coord, String scope, Exp exp, OP op) {
        super(coord, scope);
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
            varExp.getVar().updateValue(res);
        return res;
    }

    private QuirklType<?> decrement() throws QuirklRuntimeException {
        QuirklType<?> res = exp.eval().subtract(one);
        if (exp instanceof VariableExp varExp)
            varExp.getVar().updateValue(res);
        return res;
    }
}
