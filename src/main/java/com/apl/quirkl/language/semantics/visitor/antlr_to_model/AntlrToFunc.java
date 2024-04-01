package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.FuncBody;
import com.apl.quirkl.language.semantics.model.type.value.function.end_function.ReturnLambda;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

public class AntlrToFunc extends AntlrToModel<QuirklFuncValue> {

    public AntlrToFunc(Prog prog) {
        super(prog);
    }

    public AntlrToFunc(Prog prog, String scope) {
        super(prog, scope);
    }

    @Override
    public QuirklFuncValue visitFunction(QuirklParser.FunctionContext ctx) {
        return ctx.functionWithBody().isEmpty() ? this.visitFunctionWithLambda(ctx.functionWithLambda()) : this.visitFunctionWithBody(ctx.functionWithBody());
    }

    @Override
    public QuirklFuncValue visitFunctionWithBody(QuirklParser.FunctionWithBodyContext ctx) {
        System.out.println("visitFunctionWithBody: " + ctx.getText());
        System.out.println(this.scope);

        final QuirklCoord THIS_COORD = AntlrUtil.getCoord(ctx);

        Var<?> var = new Var<>(THIS_COORD, this.scope, QuirklType.TYPE.FUNCTION);
        final String THIS_SCOPE = AntlrUtil.getObjAddress(var);

        QuirklFuncValue func = new QuirklFuncValue(THIS_COORD, THIS_SCOPE);
        var.setValue(new QuirklFunc(func));

        AntlrToVar antlrToVar = new AntlrToVar(this.prog, THIS_SCOPE);
        QuirklList<Var<?>> parameters = func.getParameters();
        for (QuirklParser.ParameterContext param : ctx.parameters().parameter()) {
            Var<?> varParam = antlrToVar.visitParameter(param);
            if (varParam == null) return null;
            parameters.add(varParam);
        }

        QuirklParser.IdContext idCtx = ctx.id();
        if (!idCtx.isEmpty()) {
            func.setId(idCtx.getText());
        } else {
            func.setAnonymous(true);
            func.setId(AntlrUtil.getObjAddress(func));
        }
        var.setId(func.getId());

        QuirklType.TYPE funcType = QuirklType.toQuirklType(ctx.functionDataType().getText());
        func.setType(funcType);

        QuirklParser.ExpressionContext returnExpCtx = ctx.expression();
        QuirklCoord returnExpCoord = AntlrUtil.getCoord(returnExpCtx);
        if (returnExpCtx.isEmpty() && funcType != QuirklType.TYPE.VOID) {
            this.prog.addError(QuirklFunctionException.noReturn(returnExpCoord, func));
            return null;
        } else if (!returnExpCtx.isEmpty() && funcType == QuirklType.TYPE.VOID) {
            this.prog.addError(QuirklFunctionException.returnButVoid(returnExpCoord, func));
            return null;
        }

        FuncBody body = new FuncBody();
        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, THIS_SCOPE);
        for (QuirklParser.StatementContext statementContext : ctx.statement()) {
            Stmt stmt = statementContext.accept(antlrToStmt);
            if (stmt == null) return null;
            body.addStatement(stmt);
        }

        if (!returnExpCtx.isEmpty()) {
            AntlrToExp antlrToExp = new AntlrToExp(prog, THIS_SCOPE);
            Exp returnExp = returnExpCtx.accept(antlrToExp);
            if (returnExp == null) return null;
            body.setReturnExp(returnExp);
        }
        func.setBody(body);

        this.prog.addVar(var, this.scope);

        return func;
    }

    @Override
    public QuirklFuncValue visitFunctionWithLambda(QuirklParser.FunctionWithLambdaContext ctx) {
        System.out.println("visitFunctionWithLambda: " + ctx.getText());
        System.out.println(this.scope);

        final QuirklCoord THIS_COORD = AntlrUtil.getCoord(ctx);

        Var<?> var = new Var<>(THIS_COORD, this.scope, QuirklType.TYPE.FUNCTION);
        final String THIS_SCOPE = AntlrUtil.getObjAddress(var);

        QuirklFuncValue func = new QuirklFuncValue(THIS_COORD, THIS_SCOPE);
        var.setValue(new QuirklFunc(func));

        AntlrToVar antlrToVar = new AntlrToVar(this.prog, THIS_SCOPE);
        QuirklList<Var<?>> parameters = func.getParameters();
        for (QuirklParser.ParameterContext param : ctx.parameters().parameter()) {
            Var<?> varParam = antlrToVar.visitParameter(param);
            if (varParam == null) return null;
            parameters.add(varParam);
        }

        QuirklParser.IdContext idCtx = ctx.id();
        if (!idCtx.isEmpty()) {
            func.setId(idCtx.getText());
        } else {
            func.setAnonymous(true);
            func.setId(AntlrUtil.getObjAddress(func));
        }
        var.setId(func.getId());

        QuirklType.TYPE funcType = QuirklType.toQuirklType(ctx.functionDataType().getText());
        func.setType(funcType);

        QuirklParser.ExpressionContext returnExpCtx = ctx.expression();
        QuirklCoord returnExpCoord = AntlrUtil.getCoord(returnExpCtx);
        if (returnExpCtx.isEmpty() && funcType != QuirklType.TYPE.VOID) {
            this.prog.addError(QuirklFunctionException.noReturn(returnExpCoord, func));
            return null;
        } else if (!returnExpCtx.isEmpty() && funcType == QuirklType.TYPE.VOID) {
            this.prog.addError(QuirklFunctionException.returnButVoid(returnExpCoord, func));
            return null;
        }

        AntlrToExp antlrToExp = new AntlrToExp(this.prog, THIS_SCOPE);
        Exp returnExp = returnExpCtx.accept(antlrToExp);
        if (returnExp == null) return null;
        ReturnLambda body = new ReturnLambda(returnExp);

        func.setBody(body);
        AntlrUtil.addToVariableContext(this.prog, var);
        return func;
    }
}
