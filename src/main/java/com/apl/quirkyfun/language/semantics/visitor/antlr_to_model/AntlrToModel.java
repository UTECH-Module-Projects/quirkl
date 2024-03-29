package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.visitor.QuirklBaseVisitor;

public abstract class AntlrToModel<T> extends QuirklBaseVisitor<T> {

    protected final Program program = Program.INSTANCE;
    protected final String scope;

    public AntlrToModel() {
        this.scope = "global";
    }

    public AntlrToModel(String scope) {
        this.scope = scope;
    }
}
