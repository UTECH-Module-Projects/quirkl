package com.apl.quirkl.language.semantics.model.statement.switch_statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SwitchStmt extends Stmt {
    private Exp key;
    private QuirklList<SwitchCaseStatement> cases;
    private SwitchCaseStatement defaultCase;

    public SwitchStmt(QuirklCoord coord, String scope, Exp key) {
        super(coord, scope);
        this.key = key;
        this.cases = new QuirklList<>();
        this.defaultCase = null;
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        QuirklType<?> keyValue = key.eval();
        for (SwitchCaseStatement switchCase : cases) {
            if (switchCase.getMatch().eval().eq(keyValue).getValue()) {
                switchCase.eval();
                return QuirklVoid.VOID;
            }
        }
        if (defaultCase != null)
            defaultCase.eval();
        return null;
    }
}
