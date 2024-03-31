package com.apl.quirkyfun.language.semantics.model.variable.function.end_function;

import com.apl.quirkyfun.language.semantics.model.exp.Exp;
import com.apl.quirkyfun.language.semantics.model.statement.Statement;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.QuirklVoid;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FunctionBody extends EndFunction {
    private QuirklList<Statement> statements;
    private Exp returnExp;

    public FunctionBody() {
        this.statements = new QuirklList<>();
        this.returnExp = null;
    }

    public FunctionBody(Exp returnExp) {
        this.statements = new QuirklList<>();
        this.returnExp = returnExp;
    }

    public FunctionBody(QuirklList<Statement> statements, Exp returnExp) {
        this.statements = statements;
        this.returnExp = returnExp;
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    @Override
    public String toString() {
        if (this.returnExp == null) {
            return String.join("\n", this.statements.toStringArr());
        }
        return String.join("{\n", this.statements.toStringArr()) + "\ngive " + this.returnExp + ";\n}";
    }

    @Override
    public QuirklType<?> eval() throws QuirklRuntimeException {
        for (Statement statement : this.statements)
            statement.eval();

        if (this.returnExp == null)
            return QuirklVoid.VOID;

        return returnExp.eval();
    }
}
