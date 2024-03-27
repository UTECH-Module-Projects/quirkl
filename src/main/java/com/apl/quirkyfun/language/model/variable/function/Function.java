package com.apl.quirkyfun.language.model.variable.function;

import com.apl.quirkyfun.language.model.statement.Statement;
import com.apl.quirkyfun.language.model.variable.function.end_function.EndFunction;
import com.apl.quirkyfun.language.model.variable.function.error.QuirkyFunctionException;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.util.QuirkyList;
import com.apl.quirkyfun.language.model.variable.Variable;
import lombok.Getter;

@Getter
public class Function extends Variable {
    private final QuirkyList<Variable> parameters;
    private final EndFunction body;

    public Function(String id, String type, QuirkyList<Variable> parameters, EndFunction body) {
        super(id, type);
        this.parameters = parameters;
        this.body = body;
    }

    public String getName() {
        return this.id;
    }

    public QuirkyType apply(QuirkyType ...arguments) {
        if (arguments.length != this.parameters.size()) {
            throw new QuirkyFunctionException("Invalid number of arguments");
        }

        for (int i = 0; i < arguments.length; i++) {
            QuirkyType quirkyType = arguments[i];
            this.parameters.get(i).setValue(quirkyType);
        }
        QuirkyType result = this.body.eval();
        this.reset();
        return result;
    }

    public void reset() {
        for (Variable parameter : this.parameters) {
            parameter.setValue(null);
        }
    }

    @Override
    public String toString() {
        return String.format("pass (%s) to %s: %s %s",
                String.join(", ", this.parameters.toStringArr()),
                this.id, this.type,
                this.body.toString()
        );
    }
}
