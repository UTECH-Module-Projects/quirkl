package com.apl.quirkl.language.semantics.model.statement.if_statement;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklVoid;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IfCondition extends Stmt {
    private ToBoolExp condition;
    private QuirklList<Stmt> body;
    private IfCondition nextCondition;

    public IfCondition(QuirklCoord coord, String scope) {
        super(coord, scope);
        this.condition = null;
        this.body = new QuirklList<>();
        this.nextCondition = null;
    }

    public IfCondition(QuirklCoord coord, String scope, ToBoolExp condition, QuirklList<Stmt> body, IfCondition nextCondition) {
        super(coord, scope);
        this.condition = condition;
        this.body = body;
        this.nextCondition = nextCondition;
    }

    public IfCondition(QuirklCoord coord, String scope, QuirklList<Stmt> body, IfCondition nextCondition) {
        super(coord, scope);
        this.body = body;
        this.nextCondition = nextCondition;
        this.condition = null;
    }

    public IfCondition(QuirklCoord coord, String scope, QuirklList<Stmt> body) {
        super(coord, scope);
        this.body = body;
        this.nextCondition = null;
        this.condition = null;
    }

    public IfCondition(QuirklCoord coord, String scope, ToBoolExp condition, QuirklList<Stmt> body) {
        super(coord, scope);
        this.condition = condition;
        this.body = body;
        this.nextCondition = null;
    }

    public IfCondition(QuirklCoord coord, String scope, ToBoolExp condition) {
        super(coord, scope);
        this.condition = condition;
        this.body = new QuirklList<>();
        this.nextCondition = null;
    }

    public boolean hasCondition() {
        return this.condition != null;
    }

    public boolean hasNext() {
        return this.nextCondition != null;
    }

    public QuirklVoid eval() throws QuirklRuntimeException {
        if (this.condition != null && this.condition.eval().getValue()) {
            for (Stmt stmt : body)
                stmt.eval();
        } else if (this.nextCondition != null) {
            this.nextCondition.eval();
        }
        return QuirklVoid.VOID;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (this.condition != null)
            str.append(String.format("if %s { %s }", this.condition, this.body.toStringBy(" ")));
        else
            str.append(String.format("{ %s }", this.body.toStringBy(" ")));

        if (this.nextCondition != null)
            str.append(String.format(" else %s", this.nextCondition));
        return str.toString();
    }
}
