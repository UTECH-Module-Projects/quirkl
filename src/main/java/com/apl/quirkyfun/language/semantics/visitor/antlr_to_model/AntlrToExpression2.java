package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.expression.BracketExpression;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.bool.NotBooleanExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.shift.DecrementExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.shift.IncrementExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.sum.SummationExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.twoexp.*;
import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.QuirklException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.processor.AntlrToExpressionProcessor;

public class AntlrToExpression2 extends AntlrToModel<Expression> {

    private final AntlrToExpressionProcessor processor;

    public AntlrToExpression2() {
        super();
        this.processor = AntlrToExpressionProcessor.INSTANCE;
    }

    public AntlrToExpression2(String scope) {
        super(scope);
        this.processor = AntlrToExpressionProcessor.INSTANCE;
    }

    @Override
    public Expression visitBracketExpression(QuirklParser.BracketExpressionContext ctx) {
        return new BracketExpression(ctx.expression().accept(this));
    }

    @Override
    public Expression visitIncrementExpression(QuirklParser.IncrementExpressionContext ctx) {
        return new IncrementExpression(ctx.expression().accept(this));
    }

    @Override
    public Expression visitDecrementExpression(QuirklParser.DecrementExpressionContext ctx) {
        return new DecrementExpression(ctx.expression().accept(this));
    }

    @Override
    public Expression visitExponentExpression(QuirklParser.ExponentExpressionContext ctx) {
        TwoExpOperationExpression exp = this.processor.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1), this);
        if (exp == null) return null;
        return new ExponentExpression(exp);
    }

    @Override
    public Expression visitRootExpression(QuirklParser.RootExpressionContext ctx) {
        TwoExpOperationExpression exp = this.processor.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1), this);
        if (exp == null) return null;
        return new RootExpression(exp);
    }

    @Override
    public Expression visitMultiplicationExpression(QuirklParser.MultiplicationExpressionContext ctx) {
        TwoExpOperationExpression exp = this.processor.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1), this);
        if (exp == null) return null;
        return new MultiplicationExpression(exp);
    }

    @Override
    public Expression visitDivisionExpression(QuirklParser.DivisionExpressionContext ctx) {
        TwoExpOperationExpression exp = this.processor.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1), this);
        if (exp == null) return null;
        return new DivideExpression(exp);
    }

    @Override
    public Expression visitModulusExpression(QuirklParser.ModulusExpressionContext ctx) {
        TwoExpOperationExpression exp = this.processor.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1), this);
        if (exp == null) return null;
        return new ModulusExpression(exp);
    }

    @Override
    public Expression visitAdditionExpression(QuirklParser.AdditionExpressionContext ctx) {
        TwoExpOperationExpression exp = this.processor.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1), this);
        if (exp == null) return null;
        return new AdditionExpression(exp);
    }

    @Override
    public Expression visitSubtractionExpression(QuirklParser.SubtractionExpressionContext ctx) {
        TwoExpOperationExpression exp = this.processor.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1), this);
        if (exp == null) return null;
        return new SubtractionExpression(exp);
    }

    @Override
    public Expression visitSummationExpression(QuirklParser.SummationExpressionContext ctx) {
        try {
            return this.processor.getSumExpression(new SummationExpression(), ctx, "Summation");
        } catch (QuirklException e) {
            this.program.addError(e);
        }
        return null;
    }

    @Override
    public Expression visitProdSummationExpression(QuirklParser.ProdSummationExpressionContext ctx) {
        try {
            return this.processor.getSumExpression(new SummationExpression(), ctx, "Summation");
        } catch (QuirklException e) {
            this.program.addError(e);
        }
        return null;
    }

    @Override
    public Expression visitToBoolExpression(QuirklParser.ToBoolExpressionContext ctx) {
        return ctx.toBool().accept(this);
    }

    @Override
    public Expression visitToBool(QuirklParser.ToBoolContext ctx) {
        return ctx.booleanExpression().accept(this);
    }

    @Override
    public Expression visitNotBoolean(QuirklParser.NotBooleanContext ctx) {
        Expression exp = ctx.expression().accept(this);
        if (exp == null) return null;
        return new NotBooleanExpression(exp);
    }

    @Override
    public Expression visitEqualsBoolean(QuirklParser.EqualsBooleanContext ctx) {
        return this.
    }
}
