package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.*;
import com.apl.quirkyfun.language.semantics.model.expression.operation.ShiftExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.SumExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.TwoExpOperationExpression;
import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.QuirklVoid;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.processor.AntlrToExpressionProcessor;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.util.AntlrUtil;
import lombok.Getter;

@Getter
public class AntlrToExpression extends AntlrToModel<Expression> {

    private final AntlrToExpressionProcessor processor;

    public AntlrToExpression(Program program) {
        super(program);
        this.processor = new AntlrToExpressionProcessor(this);
    }

    public AntlrToExpression(Program program, String scope) {
        super(program, scope);
        this.processor = new AntlrToExpressionProcessor(this);
    }


    @Override
    public Expression visitBracketExpression(QuirklParser.BracketExpressionContext ctx) {
        Expression result = ctx.expression().accept(this);
        if (result == null) return null;
        return new BracketExpression(AntlrUtil.getCoord(ctx), result);
    }

    @Override
    public Expression visitIncrementExpression(QuirklParser.IncrementExpressionContext ctx) {
        Expression result = ctx.expression().accept(this);
        if (result == null) return null;
        return new ShiftExpression(AntlrUtil.getCoord(ctx), result, ShiftExpression.OP.INC);
    }

    @Override
    public Expression visitDecrementExpression(QuirklParser.DecrementExpressionContext ctx) {
        Expression result = ctx.expression().accept(this);
        if (result == null) return null;
        return new ShiftExpression(AntlrUtil.getCoord(ctx), result, ShiftExpression.OP.DEC);
    }

    @Override
    public Expression visitExponentExpression(QuirklParser.ExponentExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOperationExpression.OP.POWER, this);
    }

    @Override
    public Expression visitRootExpression(QuirklParser.RootExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOperationExpression.OP.ROOT, this);
    }

    @Override
    public Expression visitMultiplicationExpression(QuirklParser.MultiplicationExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOperationExpression.OP.MULTIPLY, this);
    }

    @Override
    public Expression visitDivisionExpression(QuirklParser.DivisionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOperationExpression.OP.DIVIDE, this);
    }

    @Override
    public Expression visitModulusExpression(QuirklParser.ModulusExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOperationExpression.OP.MODULO, this);
    }

    @Override
    public Expression visitAdditionExpression(QuirklParser.AdditionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOperationExpression.OP.PLUS, this);
    }

    @Override
    public Expression visitSubtractionExpression(QuirklParser.SubtractionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOperationExpression.OP.MINUS, this);
    }

    @Override
    public Expression visitSummationExpression(QuirklParser.SummationExpressionContext ctx) {
        return this.processor.getSumExpression(ctx, SumExpression.OPERATOR.SUMM);
    }

    @Override
    public Expression visitProdSummationExpression(QuirklParser.ProdSummationExpressionContext ctx) {
        return this.processor.getSumExpression(ctx, SumExpression.OPERATOR.PRODSUMM);
    }

    @Override
    public Expression visitToBoolExpression(QuirklParser.ToBoolExpressionContext ctx) {
        return ctx.toBool().accept(this);
    }

    @Override
    public ToBoolExpression visitToBool(QuirklParser.ToBoolContext ctx) {
        Expression exp = ctx.expression().accept(this);
        if (exp == null) return null;
        return new ToBoolExpression(AntlrUtil.getCoord(ctx), exp);
    }

    @Override
    public Expression visitTernaryOperatorExpression(QuirklParser.TernaryOperatorExpressionContext ctx) {
        ToBoolExpression toBoolExp = this.visitToBool(ctx.toBool());
        if (toBoolExp == null) return null;
        Expression trueExp = ctx.expression(0).accept(this);
        if (trueExp == null) return null;
        Expression falseExp = ctx.expression(1).accept(this);
        if (falseExp == null) return null;
        return new TernaryOperatorExpression(AntlrUtil.getCoord(ctx), toBoolExp, trueExp, falseExp);
    }

    @Override
    public Expression visitFunctionWithBodyExpression(QuirklParser.FunctionWithBodyExpressionContext ctx) {
        Function func = ctx.functionWithBody().accept(new AntlrToFunction(program, scope));
        if (func == null) return null;
        return new FunctionExpression(AntlrUtil.getCoord(ctx), new QuirklFunction(func));
    }

    @Override
    public Expression visitFunctionWithLambdaExpression(QuirklParser.FunctionWithLambdaExpressionContext ctx) {
        Function func = ctx.functionWithLambda().accept(new AntlrToFunction(program, scope));
        if (func == null) return null;
        return new FunctionExpression(AntlrUtil.getCoord(ctx), new QuirklFunction(func));
    }

    @Override
    public Expression visitFunctionCallExpression(QuirklParser.FunctionCallExpressionContext ctx) {
        return ctx.functionCall().accept(this);

        ctx.functionCall()
    }

    @Override
    public Expression visitFunctionCall(QuirklParser.FunctionCallContext ctx) {
        QuirklParser.IdContext idCTX = ctx.id();
        String varName = idCTX.getText();
        Variable var = program.getVariable(varName, this.scope);

        if (var == null) {
            int line = idCTX.getStart().getLine();
            int pos = idCTX.getStart().getCharPositionInLine();

            program.addError(QuirklDeclarationException.undeclaredVariable(new QuirklCoordinate(line, pos), varName));
            return null;
        }

//        Function func = ctx.

        if (!var.getValue().isType(QuirklType.TYPE.FUNCTION)) {
            program.addError(QuirklFunctionException.notAFunction(var));
            return null;
        }
    }
}
