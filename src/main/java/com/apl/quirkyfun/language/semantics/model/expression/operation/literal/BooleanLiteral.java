package com.apl.quirkyfun.language.semantics.model.expression.operation.literal;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;

public class BooleanLiteral extends Expression {

    private final QuirklBoolean bool;

    public BooleanLiteral(QuirklBoolean bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return bool.toString();
    }

    @Override
    public QuirklBoolean eval() throws QuirklMathException {
        return bool;
    }
}
