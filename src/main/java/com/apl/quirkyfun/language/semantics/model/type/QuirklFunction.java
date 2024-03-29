package com.apl.quirkyfun.language.semantics.model.type;

import com.apl.quirkyfun.language.semantics.model.variable.function.Function;

public class QuirklFunction extends QuirklType<Function> {

    public QuirklFunction() {
        super();
    }

    public QuirklFunction(Function func) {
        super(func);
    }

    @Override
    public QuirklType<Function> add(QuirklType<?> other) {

        return null;
    }

    public QuirklType<?> call(QuirklType<?>... args) {
        return this.value.apply(args);
    }
}
