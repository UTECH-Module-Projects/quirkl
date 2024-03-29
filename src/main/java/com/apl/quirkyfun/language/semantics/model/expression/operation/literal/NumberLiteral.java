package com.apl.quirkyfun.language.semantics.model.expression.operation.literal;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklMathException;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;

public class NumberLiteral extends Expression {

    private final QuirklLongNumber num;

    public NumberLiteral(QuirklLongNumber num) {
        this.num = num;
    }

    public NumberLiteral(long num) {
        this.num = new QuirklLongNumber(num);
    }

    @Override
    public String toString() {
        return num.toString();
    }

    @Override
    public QuirklLongNumber eval() throws QuirklMathException {
        return num;
    }
}
