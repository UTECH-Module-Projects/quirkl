package com.apl.quirkyfun.language.visitor;

import com.apl.quirkyfun.language.model.expression.*;
import com.apl.quirkyfun.language.model.expression.operation.bool.NotBooleanExpression;
import com.apl.quirkyfun.language.model.expression.operation.literal.BooleanLiteral;
import com.apl.quirkyfun.language.model.expression.operation.literal.DecimalLiteral;
import com.apl.quirkyfun.language.model.expression.operation.literal.NumberLiteral;
import com.apl.quirkyfun.language.model.expression.operation.bool.TwoExpBooleanExpression;
import com.apl.quirkyfun.language.model.expression.operation.literal.StringLiteral;
import com.apl.quirkyfun.language.model.expression.operation.shift.DecrementExpression;
import com.apl.quirkyfun.language.model.expression.operation.shift.IncrementExpression;
import com.apl.quirkyfun.language.model.expression.operation.sum.ProdSummationExpression;
import com.apl.quirkyfun.language.model.expression.operation.sum.SumExpression;
import com.apl.quirkyfun.language.model.expression.operation.sum.SummationExpression;
import com.apl.quirkyfun.language.model.expression.operation.twoexp.*;
import com.apl.quirkyfun.language.model.type.QuirkyBoolean;
import com.apl.quirkyfun.language.model.type.QuirkyFunctionType;
import com.apl.quirkyfun.language.model.type.QuirkyString;
import com.apl.quirkyfun.language.model.type.number.QuirkyDoubleNumber;
import com.apl.quirkyfun.language.model.type.number.QuirkyLongNumber;
import com.apl.quirkyfun.language.model.variable.Variable;
import com.apl.quirkyfun.language.model.variable.function.Function;
import com.apl.quirkyfun.language.parser.QuirkyFunParser;

import java.util.List;
import java.util.stream.Collectors;

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

    public Variable checkVarExistsForSumExpression(String varName, QuirkyFunParser.ExpressionContext ctx, String type, int idCount) {
        if (!this.program.hasVariable(varName)) {
            var idCtx = (type.equals("ProdSummation") ? ((QuirkyFunParser.ProdSummationExpressionContext) ctx).id(idCount) : ((QuirkyFunParser.SummationExpressionContext) ctx).id(idCount));
            this.program.addError(this.varNotDefined(idCtx));
            return null;
        }
        return program.getVariable(varName);
    }

    public SumExpression getSumExpression(SumExpression exp, QuirkyFunParser.ExpressionContext ctx, String type) {
        int idCount = 0;
        var param = ctx.getChild(0);
        if (param instanceof QuirkyFunParser.NumberContext) {
            exp.setStart(new NumberLiteral(new QuirkyLongNumber(Long.parseLong(param.getText()))));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, type, idCount);
            if (res == null) return null;
            exp.setStart(new VariableExpression(res));
            idCount++;
        }

        param = ctx.getChild(1);
        if (param instanceof QuirkyFunParser.NumberContext) {
            exp.setEnd(new NumberLiteral(new QuirkyLongNumber(Long.parseLong(param.getText()))));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, type, idCount);
            if (res == null) return null;
            exp.setStart(new VariableExpression(res));
            idCount++;
        }

        param = ctx.getChild(2);
        if (param instanceof QuirkyFunParser.FunctionContext) {
            exp.setEnd(new NumberLiteral(new QuirkyLongNumber(Long.parseLong(param.getText()))));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, type, idCount);
            if (res == null) return null;
            exp.setStart(new VariableExpression(res));
        }
        return exp;
    }

    @Override
    public Expression visitIncrementExpression(QuirkyFunParser.IncrementExpressionContext ctx) {
        return new IncrementExpression(ctx.expression().accept(this));
    }

    @Override
    public Expression visitDecrementExpression(QuirkyFunParser.DecrementExpressionContext ctx) {
        return new DecrementExpression(ctx.expression().accept(this));
    }

    @Override
    public Expression visitXnorExpression(QuirkyFunParser.XnorExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.XNOR);
    }

    @Override
    public Expression visitNotEqualsExpression(QuirkyFunParser.NotEqualsExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.NOT_EQUALS);
    }

    @Override
    public Expression visitXorExpression(QuirkyFunParser.XorExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.XOR);
    }

    @Override
    public Expression visitNotExpression(QuirkyFunParser.NotExpressionContext ctx) {
        return new NotBooleanExpression(ctx.expression().accept(this));
    }

    @Override
    public Expression visitTernaryOperatorExpression(QuirkyFunParser.TernaryOperatorExpressionContext ctx) {
        return ctx.ternary_operator().accept(this);
    }

    @Override
    public Expression visitTernary_operator(QuirkyFunParser.Ternary_operatorContext ctx) {
        Expression toBool = ctx.to_bool().accept(this);
        Expression expTrue = ctx.expression(0).accept(this);
        Expression expFalse = ctx.expression(1).accept(this);
        return new TernaryOperatorExpression(new ToBoolExpression(toBool), expTrue, expFalse);
    }

    @Override
    public Expression visitGreaterThanExpression(QuirkyFunParser.GreaterThanExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.GREATER_THAN);
    }

    @Override
    public Expression visitOrExpression(QuirkyFunParser.OrExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.OR);
    }

    @Override
    public Expression visitFunctionCallExpression(QuirkyFunParser.FunctionCallExpressionContext ctx) {
        return ctx.function_call().accept(this);
    }

    @Override
    public Expression visitFunctionCall(QuirkyFunParser.FunctionCallContext ctx) {
        String varName = ctx.id().getText();
        if (!this.program.hasVariable(varName))
            this.program.addError(this.varNotDefined(ctx.id()));

        Function func = (Function) this.program.getVariable(varName);

        List<Expression> args = ctx.arguments().expression().stream().map(exp -> exp.accept(this)).collect(Collectors.toList());
        return new FunctionCallExpression(new QuirkyFunctionType(func), args);
    }

    @Override
    public Expression visitToBoolExpression(QuirkyFunParser.ToBoolExpressionContext ctx) {
        return new ToBoolExpression(ctx.to_bool().accept(this));
    }

    @Override
    public Expression visitFunctionExpression(QuirkyFunParser.FunctionExpressionContext ctx) {
        AntlrToFunction antlrToFunction = new AntlrToFunction();
        return new FunctionExpression(new QuirkyFunctionType(ctx.function().accept(antlrToFunction)));
    }

    @Override
    public Expression visitAndExpression(QuirkyFunParser.AndExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.EXP.AND);
    }

    @Override
    public Expression visitSummationExpression(QuirkyFunParser.SummationExpressionContext ctx) {
        return this.getSumExpression(new SummationExpression(), ctx, "Summation");
    }

    @Override
    public Expression visitDivisionExpression(QuirkyFunParser.DivisionExpressionContext ctx) {
        return new DivideExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitProdSummationExpression(QuirkyFunParser.ProdSummationExpressionContext ctx) {
        return this.getSumExpression(new ProdSummationExpression(), ctx, "ProdSummation");
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
        return new BracketExpression(ctx.expression().accept(this));
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
