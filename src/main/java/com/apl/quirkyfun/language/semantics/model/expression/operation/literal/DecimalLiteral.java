package com.apl.quirkyfun.language.semantics.model.expression.operation.literal;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;

public class DecimalLiteral extends Expression {

    private final QuirklDoubleNumber dec;

    public DecimalLiteral(QuirklDoubleNumber dec) {
        this.dec = dec;
    }

    @Override
    public String toString() {
        return dec.toString();
    }

    @Override
    public QuirklDoubleNumber eval() throws QuirklMathException {
        return dec;
    }
}
