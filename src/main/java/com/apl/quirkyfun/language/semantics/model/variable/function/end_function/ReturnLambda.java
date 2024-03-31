package com.apl.quirkyfun.language.semantics.model.variable.function.end_function;

import com.apl.quirkyfun.language.semantics.model.exp.Exp;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnLambda extends EndFunction {
    private Exp returnExp;


    public ReturnLambda(Exp returnExp) {
        this.returnExp = returnExp;
    }

    @Override
    public String toString() {
        return this.returnExp.toString();
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return this.returnExp.eval();
    }
}
