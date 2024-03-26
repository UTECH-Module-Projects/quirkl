package com.apl.quirkyfun.language.visitor;

import com.apl.quirkyfun.language.model.statement.function.Function;
import com.apl.quirkyfun.language.parser.QuirkyFunParser;

import java.util.List;

public class AntlrToFunction extends QuirkyFunBaseVisitor<Function<?>> {

    @Override
    public Function<?> visitFunction(QuirkyFunParser.FunctionContext ctx) {
        List<QuirkyFunParser.ParameterContext> parameters = ctx.parameter();
        return super.visitFunction(ctx);
    }
}
