package com.apl.quirkl.language.semantics.model.type.value.function;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.EndFunc;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.FuncBody;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Setter
public class QuirklFuncValue extends ProgTerm {
    @Getter
    private QuirklList<Var<?>> parameters;
    @Getter
    private QuirklType.TYPE type;
    @Getter
    private EndFunc body;
    private String id;
    @Getter
    private boolean isAnonymous;

    public QuirklFuncValue() {
        super(new QuirklCoord(), "");
        this.type = QuirklType.TYPE.VOID;
        this.parameters = new QuirklList<>();
        this.body = new FuncBody();
        this.id = null;
    }

    public QuirklFuncValue(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.type = QuirklType.TYPE.VOID;
        this.parameters = new QuirklList<>();
        this.body = new FuncBody();
        this.id = null;
    }

    public QuirklFuncValue(QuirklCoord coord, String scope, QuirklList<Var<?>> parameters, QuirklType.TYPE type, EndFunc body, String id) {
        super(coord, scope);
        this.type = type;
        this.parameters = parameters;
        this.body = body;
        this.id = id;
    }

    public QuirklFuncValue(QuirklCoord coord, String scope, QuirklList<Var<?>> parameters, QuirklType.TYPE type, EndFunc body) {
        super(coord, scope);
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
        for (Var<?> parameter : this.parameters) {
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

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return new QuirklFunc(this);
    }
}
