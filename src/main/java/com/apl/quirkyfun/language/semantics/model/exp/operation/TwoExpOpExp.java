package com.apl.quirkyfun.language.semantics.model.exp.operation;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.Exp;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class TwoExpOpExp extends OpExp {
    private final Exp left;
    private final Exp right;
    private final OP operator;

    public enum OP {
        PLUS("+"),
        MINUS("-"),
        MULTIPLY("*"),
        DIVIDE("/"),
        MODULO("%"),
        POWER("^"),
        ROOT("/\\");

        private final String symbol;

        OP(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return this.symbol;
        }
    }

    public TwoExpOpExp(QuirklCoord coord, Exp left, Exp right, OP operator) {
        super(coord);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public TwoExpOpExp(QuirklCoord coord, TwoExpOpExp exp) {
        super(coord);
        this.left = exp.left;
        this.right = exp.right;
        this.operator = exp.operator;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return switch (this.operator) {
            case PLUS -> left.eval().add(right.eval());
            case MINUS -> left.eval().subtract(right.eval());
            case MULTIPLY -> left.eval().multiply(right.eval());
            case DIVIDE -> left.eval().divide(right.eval());
            case MODULO -> left.eval().modulus(right.eval());
            case POWER -> left.eval().power(right.eval());
            case ROOT -> left.eval().root(right.eval());
        };
    }
}
