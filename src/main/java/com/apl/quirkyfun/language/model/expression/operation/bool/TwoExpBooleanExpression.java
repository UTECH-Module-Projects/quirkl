package com.apl.quirkyfun.language.model.expression.operation.bool;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.type.QuirkyBoolean;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;

public class TwoExpBooleanExpression extends BooleanExpression {

    private final Expression left;
    private final Expression right;
    private final EXP operator;

    public enum EXP {
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

        EXP(String exp) {
        }
    }

    public TwoExpBooleanExpression(Expression left, Expression right, EXP operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return left.toString() + " " + operator + " " + right.toString();
    }

    @Override
    public QuirkyBoolean eval() throws QuirkyMathException {
        return switch (operator) {
            case EQUALS -> ((QuirkyBoolean) this.left.eval()).eq((QuirkyBoolean) this.right.eval());
            case NOT_EQUALS -> ((QuirkyBoolean) this.left.eval()).neq((QuirkyBoolean) this.right.eval());
            case GREATER_THAN -> ((QuirkyBoolean) this.left.eval()).gt((QuirkyBoolean) this.right.eval());
            case LESS_THAN -> ((QuirkyBoolean) this.left.eval()).lt((QuirkyBoolean) this.right.eval());
            case GREATER_THAN_OR_EQUALS -> ((QuirkyBoolean) this.left.eval()).gte((QuirkyBoolean) this.right.eval());
            case LESS_THAN_OR_EQUALS -> ((QuirkyBoolean) this.left.eval()).lte((QuirkyBoolean) this.right.eval());
            case AND -> ((QuirkyBoolean) this.left.eval()).and((QuirkyBoolean) this.right.eval());
            case OR ->  ((QuirkyBoolean) this.left.eval()).or((QuirkyBoolean) this.right.eval());
            case XOR -> ((QuirkyBoolean) this.left.eval()).xor((QuirkyBoolean) this.right.eval());
            case NAND -> ((QuirkyBoolean) this.left.eval()).nand((QuirkyBoolean) this.right.eval());
            case NOR -> ((QuirkyBoolean) this.left.eval()).nor((QuirkyBoolean) this.right.eval());
            case XNOR -> ((QuirkyBoolean) this.left.eval()).xnor((QuirkyBoolean) this.right.eval());
        };
    }
}
