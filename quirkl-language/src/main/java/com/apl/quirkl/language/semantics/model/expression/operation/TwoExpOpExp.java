package com.apl.quirkl.language.semantics.model.expression.operation;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Setter;

@Setter
public class TwoExpOpExp extends OpExp {
    private Exp left;
    private Exp right;
    private OP operator;

    public enum OP {
        PLUS("+"),
        MINUS("-"),
        MULTIPLY("*"),
        DIVIDE("/"),
        MODULO("%"),
        POWER("/\\"),
        ROOT("\\/");

        private final String symbol;

        OP(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return this.symbol;
        }
    }

    public TwoExpOpExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    public TwoExpOpExp(QuirklCoord coord, String scope, Exp left, Exp right, OP operator) {
        super(coord, scope);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return this.left + " " + this.operator + " " + this.right;
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
