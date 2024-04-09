package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.visitor.QuirklBaseVisitor;
import lombok.Getter;
import lombok.Setter;

import static com.apl.quirkl.language.semantics.model.program.Prog.GLOBAL_SCOPE;

@Getter
@Setter
public abstract class AntlrToModel<T> extends QuirklBaseVisitor<T> {

    protected final String scope;

    public AntlrToModel() {
        this.scope = GLOBAL_SCOPE;
    }

    public AntlrToModel(String scope) {
        this.scope = scope;
    }
}
