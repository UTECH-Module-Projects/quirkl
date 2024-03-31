package com.apl.quirkyfun.language.semantics.model.variable.function;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.variable.function.end_function.EndFunction;
import com.apl.quirkyfun.language.semantics.model.variable.function.end_function.FunctionBody;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;


@Setter
public class Function {
    @Getter
    private QuirklCoordinate coord;
    @Getter
    private QuirklList<Variable> parameters;
    @Getter
    private QuirklType.TYPE type;
    @Getter
    private EndFunction body;
    private String id;
    @Getter
    private boolean isAnonymous;

    public Function() {
        this.coord = new QuirklCoordinate();
        this.type = QuirklType.TYPE.VOID;
        this.parameters = new QuirklList<>();
        this.body = new FunctionBody();
        this.id = null;
    }

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

    public QuirklType<?> apply(QuirklType<?>...arguments) throws QuirklRuntimeException {
        if (arguments.length != this.parameters.size())
            throw QuirklFunctionException.invalidNumberOfArguments(this.coord, this, arguments.length, this.parameters.size());

        for (int i = 0; i < arguments.length; i++) {
            QuirklType<?> quirkyType = arguments[i];
            this.parameters.get(i).setValue(quirkyType);
        }
        QuirklType<?> result = this.body.eval();
        this.reset();
        if (result.getType().equals(this.type))
            return result;
        throw QuirklFunctionException.invalidReturnType(this.coord, this, result.getType());
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

    public String getId() {
        return (this.isAnonymous || this.id == null) ? "anonymous" : this.id;
    }
}
