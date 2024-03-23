package com.apl.quirkyfun.language.model.statement.function;

import com.apl.quirkyfun.language.model.statement.Statement;
import com.apl.quirkyfun.language.model.statement.function.end_function.EndFunction;
import com.apl.quirkyfun.language.model.type.QType;
import com.apl.quirkyfun.language.model.util.QList;
import com.apl.quirkyfun.language.model.variable.Variable;
import lombok.Getter;

@Getter
public class Function extends Statement {
    private final Variable id;
    private final QList<Variable> variables;
    private final QType returnQType;
    private final EndFunction body;

    public Function(Variable id, QList<Variable> variables, QType returnQType, EndFunction body) {
        this.id = id;
        this.variables = variables;
        this.returnQType = returnQType;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("pass (%s) to %s: %s %s",
                String.join(", ", this.variables.toStringArr()),
                this.id.toString(),
                this.returnQType.toString(),
                this.body.toString()
        );
    }
}
