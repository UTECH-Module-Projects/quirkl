package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.parser.QuirklParser.ExpressionContext;
import com.apl.quirkl.language.parser.QuirklParser.IdContext;
import com.apl.quirkl.language.parser.QuirklParser.ParametersContext;
import com.apl.quirkl.language.parser.QuirklParser.StatementContext;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType.TYPE;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor.AntlrToVarProc;
import lombok.Getter;

import java.util.List;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.*;

@Getter
public class AntlrToVar extends AntlrToModel<Var<?>> {

    private final AntlrToVarProc proc;

    public AntlrToVar(Prog prog, String scope) {
        super(prog, scope);
        this.proc = new AntlrToVarProc(prog, this);
    }

    @Override
    public Var<?> visitParameter(QuirklParser.ParameterContext ctx) {
        return newVariable(this, getCoord(ctx), ctx.variable_data_type().getText(), ctx.id());
    }

    @Override
    public Var<QuirklFunc> visitFunction(QuirklParser.FunctionContext ctx) {
        return isEmpty(ctx.functionWithBody()) ? this.visitFunctionWithLambda(ctx.functionWithLambda()) : this.visitFunctionWithBody(ctx.functionWithBody());
    }

    @Override
    @SuppressWarnings("unchecked")
    public Var<QuirklFunc> visitFunctionWithBody(QuirklParser.FunctionWithBodyContext ctx) {
        //Define Function Contexts
        IdContext idCtx = ctx.id();
        Var<QuirklFunc> variable = (Var<QuirklFunc>) newVariable(this, getCoord(ctx), TYPE.FUNCTION.getSimpleType(), ctx.id());
        ParametersContext parametersCtx = ctx.parameters();
        List<StatementContext> statementsCtx = ctx.statement();
        ExpressionContext returnExpCtx = ctx.expression();

        //Check if Variable is Empty
        if (isEmpty(variable)) return null;
        addToScopeContext(this.prog, variable);

        //Return Function Variable
        return this.proc.getFuncVar(variable, parametersCtx, idCtx, ctx.all_data_types().getText(), statementsCtx, returnExpCtx);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Var<QuirklFunc> visitFunctionWithLambda(QuirklParser.FunctionWithLambdaContext ctx) {
        //Define Function Contexts
        IdContext idCtx = ctx.id();
        Var<QuirklFunc> variable = (Var<QuirklFunc>) newVariable(this, getCoord(ctx), TYPE.FUNCTION.getSimpleType(), ctx.id());
        ParametersContext parametersCtx = ctx.parameters();
        ExpressionContext returnExpCtx = ctx.expression();

        //Check if Variable is Empty
        if (isEmpty(variable)) return null;

        //Return Function Variable
        return this.proc.getFuncVar(variable, parametersCtx, idCtx, ctx.all_data_types().getText(), null, returnExpCtx);
    }
}
