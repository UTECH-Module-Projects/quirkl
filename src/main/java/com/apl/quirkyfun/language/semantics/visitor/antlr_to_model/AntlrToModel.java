package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.visitor.QuirklBaseVisitor;
import lombok.Getter;

@Getter
public abstract class AntlrToModel<T> extends QuirklBaseVisitor<T> {

    protected final Program program;
    protected final String scope;

    public AntlrToModel(Program program) {
        this.program = program;
        this.scope = "global";
    }

    public AntlrToModel(Program program, String scope) {
        this.program = program;
        this.scope = scope;
    }
}
