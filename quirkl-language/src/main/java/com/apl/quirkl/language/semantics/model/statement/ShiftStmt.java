package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.operation.ShiftExp;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShiftStmt extends Stmt {

    private Var<?> var;
    private ShiftExp.OP op;

    public ShiftStmt(QuirklCoord coord, String scope, ShiftExp.OP op) {
        super(coord, scope);
        this.op = op;
    }

    @Override
    public QuirklVoid eval() throws QuirklRuntimeException {
        switch (this.op) {
            case INC -> increment();
            case DEC -> decrement();
        }
        return QuirklVoid.VOID;
    }

    private void increment() throws QuirklRuntimeException {
        QuirklType<?> res = var.getValue().add(QuirklLongNum.ONE);
        var.updateValue(res);
    }

    private void decrement() throws QuirklRuntimeException {
        QuirklType<?> res = var.getValue().subtract(QuirklLongNum.ONE);
        var.updateValue(res);
    }
}
