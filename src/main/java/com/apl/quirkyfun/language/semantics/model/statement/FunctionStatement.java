package com.apl.quirkyfun.language.semantics.model.statement;

import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public class FunctionStatement extends Statement {
    private final QuirklFunction function;

    public FunctionStatement(QuirklFunction function) {
        this.function = function;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return this.function;
    }
}
