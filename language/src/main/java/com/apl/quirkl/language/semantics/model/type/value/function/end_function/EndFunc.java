package com.apl.quirkl.language.semantics.model.type.value.function.end_function;

import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;

public abstract class EndFunc {
    public abstract QuirklType<?> eval() throws QuirklRuntimeException;
}
