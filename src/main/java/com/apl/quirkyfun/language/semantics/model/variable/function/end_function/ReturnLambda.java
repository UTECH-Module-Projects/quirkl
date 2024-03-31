package com.apl.quirkyfun.language.semantics.model.variable.function.end_function;

import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnLambda extends EndFunction {
    private Expression returnExpression;


    public ReturnLambda(Expression returnExpression) {
        this.returnExpression = returnExpression;
    }

    @Override
    public String toString() {
        return this.returnExpression.toString();
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return this.returnExpression.eval();
    }
}
