package com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToModel;

public abstract class AntlrToModelProc<V extends ProgTerm, T extends AntlrToModel<V>> {
    protected final T visitor;

    public AntlrToModelProc(T visitor) {
        this.visitor = visitor;
    }
}
