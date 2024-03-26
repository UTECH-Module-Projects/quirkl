package com.apl.quirkyfun.language.visitor;

import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.expression.operation.IncrementExpression;
import com.apl.quirkyfun.language.model.expression.operation.ProdSummationExpression;
import com.apl.quirkyfun.language.model.expression.operation.literal.BooleanLiteral;
import com.apl.quirkyfun.language.model.expression.operation.literal.DecimalLiteral;
import com.apl.quirkyfun.language.model.expression.operation.literal.NumberLiteral;
import com.apl.quirkyfun.language.model.expression.operation.VariableExpression;
import com.apl.quirkyfun.language.model.expression.operation.bool.TwoExpBooleanExpression;
import com.apl.quirkyfun.language.model.expression.operation.literal.StringLiteral;
import com.apl.quirkyfun.language.model.expression.operation.twoexp.*;
import com.apl.quirkyfun.language.model.program.Program;
import com.apl.quirkyfun.language.model.type.QuirkyBoolean;
import com.apl.quirkyfun.language.model.type.QuirkyString;
import com.apl.quirkyfun.language.model.type.number.QuirkyDoubleNumber;
import com.apl.quirkyfun.language.model.type.number.QuirkyLongNumber;
import com.apl.quirkyfun.language.model.variable.Variable;
import com.apl.quirkyfun.language.parser.QuirkyFunParser;

public class AntlrToExpression extends QuirkyFunBaseVisitor<Expression> {

    public String varNotDefined(QuirkyFunParser.IdContext idContext) {
        String varName = idContext.getText();
        int line = idContext.getStart().getLine();
        int column = idContext.getStart().getCharPositionInLine();
        return String.format("Variable %s is not defined. {line: %d, column: %d}", varName, line, column);
    }

    public String expNotBool(QuirkyFunParser.ExpressionContext expContext) {
        int line = expContext.getStart().getLine();
        int column = expContext.getStart().getCharPositionInLine();
        return String.format("Expression is not a boolean expression. {line: %d, column: %d}", line, column);
    }

    public TwoExpBooleanExpression getTwoExpBooleanExpression(QuirkyFunParser.ExpressionContext exp1, QuirkyFunParser.ExpressionContext exp2, TwoExpBooleanExpression.EXP exp) {
        Expression expNew1 = exp1.accept(this);
        Expression expNew2 = exp2.accept(this);
        return new TwoExpBooleanExpression(expNew1, expNew2, exp);
    }

    public TwoExpOperationExpression getTwoExpOperationExpression(QuirkyFunParser.ExpressionContext exp1, QuirkyFunParser.ExpressionContext exp2) {
        Expression expNew1 = exp1.accept(this);
        Expression expNew2 = exp2.accept(this);
        return new TwoExpOperationExpression(expNew1, expNew2);
    }

    @Override
    public Expression visitIncrementExpression(QuirkyFunParser.IncrementExpressionContext ctx) {

        IncrementExpression incrementExpression = new IncrementExpression(ctx.expression().accept(this));
        ctx.expression().accept(this);
        return super.visitIncrementExpression(ctx);
    }

    @Override
    public Expression visitDecrementExpression(QuirkyFunParser.DecrementExpressionContext ctx) {

        return super.visitDecrementExpression(ctx);
    }

    @Override
    public Expression visitXnorExpression(QuirkyFunParser.XnorExpressionContext ctx) {
        return super.visitXnorExpression(ctx);
    }

    @Override
    public Expression visitNotEqualsExpression(QuirkyFunParser.NotEqualsExpressionContext ctx) {
        return super.visitNotEqualsExpression(ctx);
    }

    @Override
    public Expression visitXorExpression(QuirkyFunParser.XorExpressionContext ctx) {
        return super.visitXorExpression(ctx);
    }

    @Override
    public Expression visitNotExpression(QuirkyFunParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public Expression visitTernaryOperatorExpression(QuirkyFunParser.TernaryOperatorExpressionContext ctx) {
        return super.visitTernaryOperatorExpression(ctx);
    }

    @Override
    public Expression visitGreaterThanExpression(QuirkyFunParser.GreaterThanExpressionContext ctx) {
        return super.visitGreaterThanExpression(ctx);
    }

    @Override
    public Expression visitOrExpression(QuirkyFunParser.OrExpressionContext ctx) {
        return super.visitOrExpression(ctx);
    }

    @Override
    public Expression visitFunctionCallExpression(QuirkyFunParser.FunctionCallExpressionContext ctx) {
        return super.visitFunctionCallExpression(ctx);
    }

    @Override
    public Expression visitToBoolExpression(QuirkyFunParser.ToBoolExpressionContext ctx) {
        return super.visitToBoolExpression(ctx);
    }

    @Override
    public Expression visitFunctionExpression(QuirkyFunParser.FunctionExpressionContext ctx) {
        return super.visitFunctionExpression(ctx);
    }

    @Override
    public Expression visitAndExpression(QuirkyFunParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx);
    }



    @Override
    public Expression visitSummationExpression(QuirkyFunParser.SummationExpressionContext ctx) {
        return super.visitSummationExpression(ctx);
    }

    @Override
    public Expression visitDivisionExpression(QuirkyFunParser.DivisionExpressionContext ctx) {
        return super.visitDivisionExpression(ctx);
    }

    @Override
    public Expression visitProdSummationExpression(QuirkyFunParser.ProdSummationExpressionContext ctx) {
        ProdSummationExpression exp = new ProdSummationExpression();
        var param = ctx.getChild(0);
        if (param instanceof QuirkyFunParser.NumberContext) {
            exp.setStart(new NumberLiteral(new QuirkyLongNumber(Long.parseLong(param.getText()))));
        } else {
            String varName = param.getText();
            if (!this.program.hasVariable(varName)) {
                this.program.addError(this.varNotDefined(ctx.id(0)));
                return null;
            }
            exp.setStart(new VariableExpression(program.getVariable(varName)));
        }

        param = ctx.getChild(1);
        if (param instanceof QuirkyFunParser.NumberContext) {
            exp.setEnd(new NumberLiteral(new QuirkyLongNumber(Long.parseLong(param.getText()))));
        } else {
            String varName = param.getText();
            if (!this.program.hasVariable(varName)) {
                this.program.addError(this.varNotDefined(ctx.id(1)));
                return null;
            }
            exp.setEnd(new VariableExpression(program.getVariable(varName)));
        }

        param = ctx.getChild(2);
        if (param instanceof QuirkyFunParser.FunctionContext) {
            exp.setEnd(new NumberLiteral(new QuirkyLongNumber(Long.parseLong(param.getText()))));
        } else {
            String varName = param.getText();
            if (!this.program.hasVariable(varName)) {
                this.program.addError(this.varNotDefined(ctx.id(1)));
                return null;
            }
            exp.setEnd(new VariableExpression(program.getVariable(varName)));
        }
        return exp;
    }

    @Override
    public Expression visitAdditionExpression(QuirkyFunParser.AdditionExpressionContext ctx) {
        return new AdditionExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitExponentExpression(QuirkyFunParser.ExponentExpressionContext ctx) {
        return new PowerExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitModulusExpression(QuirkyFunParser.ModulusExpressionContext ctx) {
        return new ModuloExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitBracketExpression(QuirkyFunParser.BracketExpressionContext ctx) {
        return super.visitBracketExpression(ctx);
    }

    @Override
    public Expression visitSubtractionExpression(QuirkyFunParser.SubtractionExpressionContext ctx) {
        return new SubtractionExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitNandExpression(QuirkyFunParser.NandExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.NAND);
    }

    @Override
    public Expression visitGreaterThanOrEqualsExpression(QuirkyFunParser.GreaterThanOrEqualsExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.GREATER_THAN_OR_EQUALS);
    }

    @Override
    public Expression visitRootExpression(QuirkyFunParser.RootExpressionContext ctx) {
        return new RootExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitLessThanOrEqualsExpression(QuirkyFunParser.LessThanOrEqualsExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.LESS_THAN_OR_EQUALS);
    }

    @Override
    public Expression visitMultiplicationExpression(QuirkyFunParser.MultiplicationExpressionContext ctx) {
        return new MultiplicationExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitNorExpression(QuirkyFunParser.NorExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.NOR);
    }

    @Override
    public Expression visitEqualsExpression(QuirkyFunParser.EqualsExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.EQUALS);
    }

    @Override
    public Expression visitLessThanExpression(QuirkyFunParser.LessThanExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.LESS_THAN);
    }

    @Override
    public Expression visitVariable(QuirkyFunParser.VariableContext ctx) {
        String varName = ctx.id().getText();
        if (!this.program.hasVariable(varName))
            this.program.addError(this.varNotDefined(ctx.id()));

        return new VariableExpression(this.program.getVariable(varName));
    }

    @Override
    public Expression visitNumberLiteral(QuirkyFunParser.NumberLiteralContext ctx) {
        long num = Long.parseLong(ctx.number().getText());
        return new NumberLiteral(new QuirkyLongNumber(num));
    }

    @Override
    public Expression visitDecimalLiteral(QuirkyFunParser.DecimalLiteralContext ctx) {
        double dec = Double.parseDouble(ctx.decimal().getText());
        return new DecimalLiteral(new QuirkyDoubleNumber(dec));
    }

    @Override
    public Expression visitBooleanLiteral(QuirkyFunParser.BooleanLiteralContext ctx) {
        boolean bool = Boolean.parseBoolean(ctx.boolean_().getText());
        return new BooleanLiteral(new QuirkyBoolean(bool));
    }

    @Override
    public Expression visitStringLiteral(QuirkyFunParser.StringLiteralContext ctx) {
        String str = ctx.string().getText();
        return new StringLiteral(new QuirkyString(str));
    }
}
