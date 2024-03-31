package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.statement.Statement;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.variable.function.end_function.FunctionBody;
import com.apl.quirkyfun.language.semantics.model.variable.function.end_function.ReturnLambda;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import org.openjdk.jol.vm.VM;

public class AntlrToFunction extends AntlrToModel<Function> {

    public AntlrToFunction(Program program) {
        super(program);
    }

    public AntlrToFunction(Program program, String scope) {
        super(program, scope);
    }

    @Override
    public Function visitFunction(QuirklParser.FunctionContext ctx) {
        return ctx.functionWithBody().isEmpty() ? ctx.functionWithLambda().accept(this) : ctx.functionWithBody().accept(this);
    }

    @Override
    public Function visitFunctionWithBody(QuirklParser.FunctionWithBodyContext ctx) {
        Function func = new Function();
        AntlrToVariable antlrToVariable = new AntlrToVariable(program, scope);
        QuirklList<Variable> parameters = new QuirklList<>();
        int line = ctx.getStart().getLine();
        int pos = ctx.getStart().getCharPositionInLine();
        QuirklCoordinate coord = new QuirklCoordinate(line, pos);
        func.setCoord(coord);

        for (QuirklParser.ParameterContext param : ctx.parameters().parameter()) {
            Variable variable = param.accept(antlrToVariable);
            if (variable == null) return null;
            parameters.add(variable);
        }
        func.setParameters(parameters);

        QuirklParser.IdContext idCtx = ctx.id();
        if (!idCtx.isEmpty()) {
            func.setId(idCtx.getText());
        } else {
            func.setAnonymous(true);
            func.setId(String.valueOf(VM.current().addressOf(func)));
        }

        QuirklType.TYPE funcType = QuirklType.getTypeAsQuirklName(ctx.functionDataType().getText());
        func.setType(funcType);

        QuirklParser.ExpressionContext returnExpCtx = ctx.expression();
        int returnExpressionLine = returnExpCtx.getStart().getLine();
        int returnExpressionPos = returnExpCtx.getStart().getCharPositionInLine();
        QuirklCoordinate returnExpCoord = new QuirklCoordinate(returnExpressionLine, returnExpressionPos);
        if (returnExpCtx.isEmpty() && funcType != QuirklType.TYPE.VOID) {
            this.program.addError(QuirklFunctionException.noReturn(returnExpCoord, func));
            return null;
        } else if (!returnExpCtx.isEmpty() && funcType == QuirklType.TYPE.VOID) {
            this.program.addError(QuirklFunctionException.returnButVoid(returnExpCoord, func));
            return null;
        }

        FunctionBody body = new FunctionBody();
        AntlrToStatement antlrToStatement = new AntlrToStatement(program, scope);
        for (QuirklParser.StatementContext statementContext : ctx.statement()) {
            Statement statement = statementContext.accept(antlrToStatement);
            if (statement == null) return null;
            body.addStatement(statement);
        }

        if (!returnExpCtx.isEmpty()) {
            AntlrToExpression antlrToExpression = new AntlrToExpression(program, scope);
            Expression returnExp = returnExpCtx.accept(antlrToExpression);
            if (returnExp == null) return null;
            body.setReturnExpression(returnExp);
        }

        func.setBody(body);
        this.program.addVariable(new Variable(coord, QuirklType.TYPE.FUNCTION, func.getId(), new QuirklFunction(func)), scope);

        return func;
    }

    @Override
    public Function visitFunctionWithLambda(QuirklParser.FunctionWithLambdaContext ctx) {
        Function func = new Function();
        AntlrToVariable antlrToVariable = new AntlrToVariable(program, scope);
        QuirklList<Variable> parameters = new QuirklList<>();
        int line = ctx.getStart().getLine();
        int pos = ctx.getStart().getCharPositionInLine();
        QuirklCoordinate coord = new QuirklCoordinate(line, pos);
        func.setCoord(coord);

        for (QuirklParser.ParameterContext param : ctx.parameters().parameter()) {
            Variable variable = param.accept(antlrToVariable);
            if (variable == null) return null;
            parameters.add(variable);
        }
        func.setParameters(parameters);

        QuirklParser.IdContext idCtx = ctx.id();
        if (!idCtx.isEmpty()) {
            func.setId(idCtx.getText());
        } else {
            func.setAnonymous(true);
            func.setId(String.valueOf(VM.current().addressOf(func)));
        }

        QuirklType.TYPE funcType = QuirklType.getTypeAsQuirklName(ctx.functionDataType().getText());
        func.setType(funcType);

        QuirklParser.ExpressionContext returnExpCtx = ctx.expression();
        int returnExpressionLine = returnExpCtx.getStart().getLine();
        int returnExpressionPos = returnExpCtx.getStart().getCharPositionInLine();
        QuirklCoordinate returnExpCoord = new QuirklCoordinate(returnExpressionLine, returnExpressionPos);
        if (returnExpCtx.isEmpty() && funcType != QuirklType.TYPE.VOID) {
            this.program.addError(QuirklFunctionException.noReturn(returnExpCoord, func));
            return null;
        } else if (!returnExpCtx.isEmpty() && funcType == QuirklType.TYPE.VOID) {
            this.program.addError(QuirklFunctionException.returnButVoid(returnExpCoord, func));
            return null;
        }

        AntlrToExpression antlrToExpression = new AntlrToExpression(program, scope);
        Expression returnExp = returnExpCtx.accept(antlrToExpression);
        if (returnExp == null) return null;
        ReturnLambda body = new ReturnLambda(returnExp);

        func.setBody(body);
        this.program.addVariable(new Variable(coord, QuirklType.TYPE.FUNCTION, func.getId(), new QuirklFunction(func)), scope);
        return func;
    }
}
