package com.apl.quirkyfun.language.semantics.model.expression.operation.literal;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklString;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class StringLiteral extends Expression {

    private final QuirklString str;

    public StringLiteral(QuirklString str) {
        this.str = str;
    }

    @Override
    public QuirklString eval() throws QuirklMathException {
        return str;
    }
}
