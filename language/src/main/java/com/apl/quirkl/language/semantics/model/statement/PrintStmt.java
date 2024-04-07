package com.apl.quirkl.language.semantics.model.statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
public class PrintStmt extends Stmt {
    private final QuirklList<Exp> expressions;

    public PrintStmt(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.expressions = new QuirklList<>();
    }

    @Override
    public String toString() {
        return String.format("print(%s);", this.expressions.toStringBy(", "));
    }

    @Override
    public QuirklVoid eval() throws QuirklRuntimeException {
        StringBuilder strBuilder = new StringBuilder();
        for (Exp exp : expressions) {
            String value = exp.eval().toStr().getValue().replace("\\n", "\n").replace("\\t", "\t");
            strBuilder.append(value);
        }
        System.out.print(strBuilder);
        return QuirklVoid.VOID;
    }
}
