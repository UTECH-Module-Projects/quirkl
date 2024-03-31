package com.apl.quirkyfun.language.semantics.model.expression.operation;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class TwoExpOperationExpression extends OperationExpression {
    private final Expression left;
    private final Expression right;
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

    public TwoExpOperationExpression(QuirklCoordinate coord, Expression left, Expression right, OP operator) {
        super(coord);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public TwoExpOperationExpression(QuirklCoordinate coord, TwoExpOperationExpression exp) {
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
