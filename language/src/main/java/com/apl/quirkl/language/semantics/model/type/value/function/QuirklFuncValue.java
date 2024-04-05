package com.apl.quirkl.language.semantics.model.type.value.function;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.FuncBody;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

import static com.apl.quirkl.language.semantics.model.program.Prog.GLOBAL_SCOPE;


@Getter
public class QuirklFuncValue extends ProgTerm {

    private final String id;
    private final QuirklList<Var<?>> parameters;
    private final QuirklType.TYPE type;
    private final FuncBody body;
    private final boolean isAnonymous;

    private final String ANONYMOUS = "anonymous";

    public QuirklFuncValue() {
        this(new QuirklCoord(), GLOBAL_SCOPE, "", QuirklType.TYPE.VOID, true);
    }

    public QuirklFuncValue(QuirklCoord coord, String scope, String id, QuirklType.TYPE type, boolean isAnonymous) {
        super(coord, scope);
        this.id = id;
        this.parameters = new QuirklList<>();
        this.type = type;
        this.body = new FuncBody();
        this.isAnonymous = isAnonymous;
    }

    public QuirklType<?> apply(QuirklType<?>...arguments) throws QuirklRuntimeException {
        if (arguments.length != this.parameters.size())
            throw QuirklFunctionException.invalidNumberOfArguments(this, this.parameters.size(), arguments.length, this.getMyScope());

        for (int i = 0; i < arguments.length; i++) {
            QuirklType<?> quirkyType = arguments[i];
            this.parameters.get(i).setValue(quirkyType);
        }
        QuirklType<?> result = this.body.eval();
        this.reset();
        if (Objects.equals(result.getType(), this.type))
            return result;
        throw QuirklFunctionException.invalidReturnType(this, result.getType(), this.getMyScope());
    }

    public void reset() {
        for (Var<?> parameter : this.parameters) {
            parameter.reset();
        }
        body.reset();
    }

    private String idToString() {
        return this.isAnonymous ? "" : " to " + this.id;
    }

    @Override
    public String toString() {
        return String.format("pass (%s)%s: %s %s",
                this.parameters.toStringBy(", "),
                this.idToString(), this.type.getSimpleType(),
                this.body.toString()
        );
    }

    public String getId() {
        return this.isAnonymous ? ANONYMOUS : this.id;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        return new QuirklFunc(this, Prog.INSTANCE);
    }
}
