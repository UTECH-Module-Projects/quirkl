package com.apl.quirkyfun.language.semantics.model.variable.function;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.variable.function.end_function.EndFunction;
import com.apl.quirkyfun.language.semantics.model.variable.function.error.QuirkyFunctionException;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklIncompatibleTypesException;
import lombok.Getter;

@Getter
public class Function {
    private final QuirklCoordinate coord;
    private final QuirklList<Variable> parameters;
    private final QuirklType.TYPE type;
    private final EndFunction body;
    private final String id;

    public Function(QuirklCoordinate coord, QuirklList<Variable> parameters, QuirklType.TYPE type, EndFunction body, String id) {
        this.coord = coord;
        this.type = type;
        this.parameters = parameters;
        this.body = body;
        this.id = id;
    }

    public Function(QuirklCoordinate coord, QuirklList<Variable> parameters, QuirklType.TYPE type, EndFunction body) {
        this.coord = coord;
        this.type = type;
        this.parameters = parameters;
        this.body = body;
        this.id = null;
    }

    public QuirklType<?> apply(QuirklType<?>...arguments) throws QuirklIncompatibleTypesException {
        if (arguments.length != this.parameters.size()) {
            throw new QuirkyFunctionException("Invalid number of arguments");
        }

        for (int i = 0; i < arguments.length; i++) {
            QuirklType<?> quirkyType = arguments[i];
            this.parameters.get(i).setValue(quirkyType);
        }
        QuirklType<?> result = this.body.eval();
        this.reset();
        if (result.getType().equals(this.type))
            return result;
        throw QuirklIncompatibleTypesException.invalidReturnType(this, result.getType(), this.coord);
    }

    public void reset() {
        for (Variable parameter : this.parameters) {
            parameter.setValue(null);
        }
    }

    private String idToString() {
        return this.id == null ? "" : "to " + this.id;
    }

    @Override
    public String toString() {
        return String.format("pass (%s) to %s: %s %s",
                String.join(", ", this.parameters.toStringArr()),
                this.idToString(), this.type,
                this.body.toString()
        );
    }
}
