package com.apl.quirkyfun.language.semantics.model.statement;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.Exp;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.QuirklVoid;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;

@Getter
public class VariableStatement extends Statement {

    private final Variable variable;
    private final Exp exp;

    public VariableStatement(QuirklCoord coord, Variable variable, Exp exp) {
        super(coord);
        this.variable = variable;
        this.exp = exp;
    }

    public VariableStatement(QuirklCoord coord, Variable variable) {
        super(coord);
        this.variable = variable;
        this.exp = null;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        if (exp != null) {
            variable.setValue(exp.eval());
            return QuirklVoid.VOID;
        }
        return variable.getValue();
    }
}
