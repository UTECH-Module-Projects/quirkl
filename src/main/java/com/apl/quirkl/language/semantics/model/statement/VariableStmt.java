package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VariableStmt extends Stmt {

    private Var<?> var;
    private Exp exp;

    public VariableStmt(QuirklCoord coord, String scope, Var<?> var, Exp exp) {
        super(coord, scope);
        this.var = var;
        this.exp = exp;
    }

    public VariableStmt(QuirklCoord coord, String scope, Var<?> var) {
        super(coord, scope);
        this.var = var;
        this.exp = null;
    }

    public VariableStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.var = null;
        this.exp = null;
    }

    @Override
    public String toString() {
        return var + (exp != null ? " = " + exp + ";" : ";");
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        if (exp != null) {
            var.setValue(exp.eval());
            return QuirklVoid.VOID;
        }
        return var.getValue();
    }
}
