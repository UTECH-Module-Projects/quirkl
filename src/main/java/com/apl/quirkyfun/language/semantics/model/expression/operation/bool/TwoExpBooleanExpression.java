package com.apl.quirkyfun.language.semantics.model.expression.operation.bool;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class TwoExpBooleanExpression extends BooleanExpression {

    private final Expression left;
    private final Expression right;
    private final OPERATORS operator;

    public enum OPERATORS {
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

        OPERATORS(String exp) {
        }
    }

    public TwoExpBooleanExpression(Expression left, Expression right, OPERATORS operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return left.toString() + " " + operator + " " + right.toString();
    }

    @Override
    public QuirklBoolean eval() throws QuirklMathException {
        return switch (operator) {
            case EQUALS -> ((QuirklBoolean) this.left.eval()).eq((QuirklBoolean) this.right.eval());
            case NOT_EQUALS -> ((QuirklBoolean) this.left.eval()).neq((QuirklBoolean) this.right.eval());
            case GREATER_THAN -> ((QuirklBoolean) this.left.eval()).gt((QuirklBoolean) this.right.eval());
            case LESS_THAN -> ((QuirklBoolean) this.left.eval()).lt((QuirklBoolean) this.right.eval());
            case GREATER_THAN_OR_EQUALS -> ((QuirklBoolean) this.left.eval()).gte((QuirklBoolean) this.right.eval());
            case LESS_THAN_OR_EQUALS -> ((QuirklBoolean) this.left.eval()).lte((QuirklBoolean) this.right.eval());
            case AND -> ((QuirklBoolean) this.left.eval()).and((QuirklBoolean) this.right.eval());
            case OR ->  ((QuirklBoolean) this.left.eval()).or((QuirklBoolean) this.right.eval());
            case XOR -> ((QuirklBoolean) this.left.eval()).xor((QuirklBoolean) this.right.eval());
            case NAND -> ((QuirklBoolean) this.left.eval()).nand((QuirklBoolean) this.right.eval());
            case NOR -> ((QuirklBoolean) this.left.eval()).nor((QuirklBoolean) this.right.eval());
            case XNOR -> ((QuirklBoolean) this.left.eval()).xnor((QuirklBoolean) this.right.eval());
        };
    }

    public void checkIfCompatible(QuirklType)
}
