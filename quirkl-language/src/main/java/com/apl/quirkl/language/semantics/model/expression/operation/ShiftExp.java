package com.apl.quirkl.language.semantics.model.expression.operation;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.VarExp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class ShiftExp extends OpExp {
    private final Exp exp;
    private final OP op;
    private final boolean isLate;

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

    public ShiftExp(QuirklCoord coord, String scope, Exp exp, OP op, boolean isLate) {
        super(coord, scope);
        this.exp = exp;
        this.op = op;
        this.isLate = isLate;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        QuirklType<?> res;
        if (isLate) {
            res = exp.eval();
            switch (this.op) {
                case INC -> increment();
                case DEC -> decrement();
            }
        } else {
            res = switch (this.op) {
                case INC -> increment();
                case DEC -> decrement();
            };
        }
        return res;
    }

    @Override
    public String toString() {
        return (isLate ? "" : op.toString()) + exp + (isLate ? op.toString() : "");
    }

    private QuirklType<?> increment() throws QuirklRuntimeException {
        QuirklType<?> res = exp.eval().add(QuirklLongNum.ONE);
        if (exp instanceof VarExp varExp)
            varExp.getVar().updateValue(res);
        return res;
    }

    private QuirklType<?> decrement() throws QuirklRuntimeException {
        QuirklType<?> res = exp.eval().subtract(QuirklLongNum.ONE);
        if (exp instanceof VarExp varExp)
            varExp.getVar().updateValue(res);
        return res;
    }
}
