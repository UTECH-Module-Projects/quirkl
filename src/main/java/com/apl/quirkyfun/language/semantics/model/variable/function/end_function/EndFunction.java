package com.apl.quirkyfun.language.semantics.model.variable.function.end_function;

import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public abstract class EndFunction {
    public abstract QuirklType<?> eval() throws QuirklRuntimeException;
}
