package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

public class AntlrToVar extends AntlrToModel<Var<?>> {

    public AntlrToVar(Prog prog, String scope) {
        super(prog, scope);
    }

    @Override
    public Var<?> visitParameter(QuirklParser.ParameterContext ctx) {
        return AntlrUtil.newVariable(this.prog, this.scope, ctx.id(), ctx.variableDataType().getText());
    }
}
