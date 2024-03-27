package com.apl.quirkyfun.language.model.expression;

import com.apl.quirkyfun.language.lexer.QuirkyFunLexer;
import com.apl.quirkyfun.language.model.type.QuirkyBoolean;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.type.error.QuirkyMathException;
import com.apl.quirkyfun.language.parser.QuirkyFunParser;

public class TernaryOperatorExpression extends Expression {
    private final ToBoolExpression toBool;
    private final Expression expTrue;
    private final Expression expFalse;

    public TernaryOperatorExpression(ToBoolExpression toBool, Expression expTrue, Expression expFalse) {
        this.toBool = toBool;
        this.expTrue = expTrue;
        this.expFalse = expFalse;
    }

    @Override
    public String toString() {
        return toBool.toString() + " -> " + expTrue.toString() + " : " + expFalse.toString();
    }

    @Override
    public QuirkyType eval() throws QuirkyMathException {
        return ((boolean) toBool.eval().getValue()) ? expTrue.eval() : expFalse.eval();
    }
}
