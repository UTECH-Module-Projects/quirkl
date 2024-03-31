package com.apl.quirkyfun.language.semantics.model.expression.operation.bool;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class TwoExpBooleanExpression extends BooleanExpression {

    private final Expression left;
    private final Expression right;
    private final OP operator;

    public enum OP {
        EQUALS("=="),
        NOT_EQUALS("!="),
        GREATER_THAN(">"),
        LESS_THAN("<"),
        GREATER_THAN_OR_EQUALS(">="),
        LESS_THAN_OR_EQUALS("<="),
        AND("&"),
        OR("|"),
        XOR("^"),
        NAND("!&"),
        NOR("!|"),
        XNOR("!^");

        private final String op;

        OP(String op) {
            this.op = op;
        }

        @Override
        public String toString() {
            return this.op;
        }
    }

    public TwoExpBooleanExpression(QuirklCoordinate coord, Expression left, Expression right, OP operator) {
        super(coord);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return left.toString() + " " + operator + " " + right.toString();
    }

    @Override
    public QuirklBoolean eval() throws QuirklRuntimeException {
        return switch (operator) {
            case EQUALS -> this.left.eval().eq(this.right.eval());
            case NOT_EQUALS -> this.left.eval().neq(this.right.eval());
            case GREATER_THAN -> this.left.eval().gt(this.right.eval());
            case LESS_THAN ->this.left.eval().lt(this.right.eval());
            case GREATER_THAN_OR_EQUALS -> this.left.eval().gte(this.right.eval());
            case LESS_THAN_OR_EQUALS -> this.left.eval().lte(this.right.eval());
            case AND -> this.left.eval().and(this.right.eval());
            case OR ->  this.left.eval().or(this.right.eval());
            case XOR -> this.left.eval().xor(this.right.eval());
            case NAND -> this.left.eval().nand(this.right.eval());
            case NOR -> this.left.eval().nor(this.right.eval());
            case XNOR -> this.left.eval().xnor(this.right.eval());
        };
    }
}
