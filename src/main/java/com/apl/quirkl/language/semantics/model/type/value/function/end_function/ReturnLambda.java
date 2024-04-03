package com.apl.quirkl.language.semantics.model.type.value.function.end_function;

import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnLambda extends EndFunc {
    private Exp returnExp;

    public ReturnLambda(Exp returnExp) {
        this.returnExp = returnExp;
    }

    @Override
    public String toString() {
        return "-> " + this.returnExp.toString();
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return this.returnExp.eval();
    }
}
