package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.parser.QuirklParser;

import java.util.List;

public class AntlrToFunction extends AntlrToModel<Function> {

    @Override
    public Function visitFunction(QuirklParser.FunctionContext ctx) {
        List<QuirklParser.ParameterContext> parameters = ctx.parameter();
        return super.visitFunction(ctx);
    }
}
