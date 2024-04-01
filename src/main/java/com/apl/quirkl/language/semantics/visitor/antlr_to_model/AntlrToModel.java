package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.visitor.QuirklBaseVisitor;
import lombok.Getter;
import lombok.Setter;

import static com.apl.quirkl.language.semantics.model.program.Prog.GLOBAL_SCOPE;

@Getter
@Setter
public abstract class AntlrToModel<T> extends QuirklBaseVisitor<T> {

    protected Prog prog;
    protected final String scope;

    public AntlrToModel() {
        this.prog = null;
        this.scope = GLOBAL_SCOPE;
    }

    public AntlrToModel(Prog prog) {
        this.prog = prog;
        this.scope = GLOBAL_SCOPE;
    }

    public AntlrToModel(Prog prog, String scope) {
        this.prog = prog;
        this.scope = scope;
    }
}
