package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
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
            QuirklType<?> res = exp.eval();
            res.setTerm(this);

            if (res instanceof QuirklFunc resFunc) {
                resFunc.getValue().setId(var.getId());
                resFunc.getValue().setAnonymous(false);
            }

            var.setValue(res);
            return QuirklVoid.VOID;
        } else if (var.getValue() == null) {
            var.setDefault();
        }
        return var.getValue();
    }

    @Override
    public void reset() {
        var.reset();
    }
}
