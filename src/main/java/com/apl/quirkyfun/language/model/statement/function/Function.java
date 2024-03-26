package com.apl.quirkyfun.language.model.statement.function;

import com.apl.quirkyfun.language.model.statement.Statement;
import com.apl.quirkyfun.language.model.statement.function.end_function.EndFunction;
import com.apl.quirkyfun.language.model.statement.function.error.QuirkyFunctionException;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.util.QuirkyList;
import com.apl.quirkyfun.language.model.variable.Variable;
import lombok.Getter;

@Getter
public class Function<T extends QuirkyType<?>> extends Statement {
    private final Variable<T> info;
    private final QuirkyList<Variable<?>> parameters;
    private final EndFunction body;

    public Function(Variable<T> info, QuirkyList<Variable<?>> parameters, EndFunction body) {
        this.info = info;
        this.parameters = parameters;
        this.body = body;
    }

    public String getName() {
        return this.info.getId();
    }

    public QuirkyType<?> apply(QuirkyType<?> ...arguments) {
        if (arguments.length != this.parameters.size()) {
            throw new QuirkyFunctionException("Invalid number of arguments");
        }

        for (int i = 0; i < arguments.length; i++) {
            QuirkyType<?> quirkyType = arguments[i];
            this.parameters.get(i).setValue(quirkyType);
        }
        QuirkyType<?> result = this.body.eval();
        this.reset();
        return result;
    }

    public void reset() {
        for (Variable<?> parameter : this.parameters) {
            parameter.setValue(null);
        }
    }

    @Override
    public QuirkyType<?> eval() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("pass (%s) to %s: %s",
                String.join(", ", this.parameters.toStringArr()),
                this.info.toString(),
                this.body.toString()
        );
    }
}
