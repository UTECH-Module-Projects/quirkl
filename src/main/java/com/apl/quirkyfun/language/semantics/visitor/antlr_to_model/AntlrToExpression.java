package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.expression.*;
import com.apl.quirkyfun.language.semantics.model.expression.operation.bool.NotBooleanExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.literal.BooleanLiteral;
import com.apl.quirkyfun.language.semantics.model.expression.operation.literal.DecimalLiteral;
import com.apl.quirkyfun.language.semantics.model.expression.operation.literal.NumberLiteral;
import com.apl.quirkyfun.language.semantics.model.expression.operation.bool.TwoExpBooleanExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.literal.StringLiteral;
import com.apl.quirkyfun.language.semantics.model.expression.operation.shift.DecrementExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.shift.IncrementExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.sum.ProdSummationExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.sum.SumExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.sum.SummationExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.twoexp.*;
import com.apl.quirkyfun.language.semantics.model.type.QuirklBoolean;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklString;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklDoubleNumber;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.parser.QuirklParser;

import java.util.List;
import java.util.stream.Collectors;

public class AntlrToExpression extends AntlrToModel<Expression> {

    public String varNotDefined(QuirklParser.IdContext idContext) {
        String varName = idContext.getText();
        int line = idContext.getStart().getLine();
        int column = idContext.getStart().getCharPositionInLine();
        return String.format("Variable %s is not defined. {line: %d, column: %d}", varName, line, column);
    }

    public String expNotBool(QuirklParser.ExpressionContext expContext) {
        int line = expContext.getStart().getLine();
        int column = expContext.getStart().getCharPositionInLine();
        return String.format("Expression is not a boolean expression. {line: %d, column: %d}", line, column);
    }

    public TwoExpBooleanExpression getTwoExpBooleanExpression(QuirklParser.ExpressionContext exp1, QuirklParser.ExpressionContext exp2, TwoExpBooleanExpression.OPERATORS OPERATORS) {
        Expression expNew1 = exp1.accept(this);
        Expression expNew2 = exp2.accept(this);
        return new TwoExpBooleanExpression(expNew1, expNew2, OPERATORS);
    }

    public TwoExpOperationExpression getTwoExpOperationExpression(QuirklParser.ExpressionContext exp1, QuirklParser.ExpressionContext exp2) {
        Expression expNew1 = exp1.accept(this);
        Expression expNew2 = exp2.accept(this);
        return new TwoExpOperationExpression(expNew1, expNew2);
    }

    public Variable checkVarExistsForSumExpression(String varName, QuirklParser.ExpressionContext ctx, String type, int idCount) {
        if (!this.program.hasVariable(varName)) {
            var idCTX = (type.equals("ProdSummation") ? ((QuirklParser.ProdSummationExpressionContext) ctx).id(idCount) : ((QuirklParser.SummationExpressionContext) ctx).id(idCount));
            this.program.addError(this.varNotDefined(idCTX));
            return null;
        }
        return program.getVariable(varName);
    }

    public SumExpression getSumExpression(SumExpression exp, QuirklParser.ExpressionContext ctx, String type) {
        int idCount = 0;
        var param = ctx.getChild(0);
        if (param instanceof QuirklParser.NumberContext) {
            exp.setStart(new NumberLiteral(new QuirklLongNumber(Long.parseLong(param.getText()))));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, type, idCount);
            if (res == null) return null;
            exp.setStart(new VariableExpression(res));
            idCount++;
        }

        param = ctx.getChild(2);
        if (param instanceof QuirklParser.NumberContext) {
            exp.setEnd(new NumberLiteral(new QuirklLongNumber(Long.parseLong(param.getText()))));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, type, idCount);
            if (res == null) return null;
            exp.setStart(new VariableExpression(res));
            idCount++;
        }

        param = ctx.getChild(4);
        if (param instanceof QuirklParser.FunctionContext) {
            exp.setEnd(new NumberLiteral(new QuirklLongNumber(Long.parseLong(param.getText()))));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, type, idCount);
            if (res == null) return null;
            exp.setStart(new VariableExpression(res));
        }
        return exp;
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
    public Expression visitXnorExpression(QuirklParser.XnorExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.XNOR);
    }

    @Override
    public Expression visitNotEqualsExpression(QuirklParser.NotEqualsExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.NOT_EQUALS);
    }

    @Override
    public Expression visitXorExpression(QuirklParser.XorExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.XOR);
    }

    @Override
    public Expression visitNotExpression(QuirklParser.NotExpressionContext ctx) {
        return new NotBooleanExpression(ctx.expression().accept(this));
    }

    @Override
    public Expression visitTernaryOperatorExpression(QuirklParser.TernaryOperatorExpressionContext ctx) {
        return ctx.ternary_operator().accept(this);
    }

    @Override
    public Expression visitTernary_operator(QuirklParser.Ternary_operatorContext ctx) {
        Expression toBool = ctx.to_bool().accept(this);
        Expression expTrue = ctx.expression(0).accept(this);
        Expression expFalse = ctx.expression(1).accept(this);
        return new TernaryOperatorExpression(new ToBoolExpression(toBool), expTrue, expFalse);
    }

    @Override
    public Expression visitGreaterThanExpression(QuirklParser.GreaterThanExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.GREATER_THAN);
    }

    @Override
    public Expression visitOrExpression(QuirklParser.OrExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.OR);
    }

    @Override
    public Expression visitFunctionCallExpression(QuirklParser.FunctionCallExpressionContext ctx) {
        return ctx.function_call().accept(this);
    }

    @Override
    public Expression visitFunction_call(QuirklParser.Function_callContext ctx) {
        String varName = ctx.id().getText();
        if (!this.program.hasVariable(varName))
            this.program.addError(this.varNotDefined(ctx.id()));

        Function func = (Function) this.program.getVariable(varName);

        List<Expression> args = ctx.arguments().expression().stream().map(exp -> exp.accept(this)).collect(Collectors.toList());
        return new FunctionCallExpression(new QuirklFunction(func), args);
    }

    @Override
    public Expression visitToBoolExpression(QuirklParser.ToBoolExpressionContext ctx) {
        return new ToBoolExpression(ctx.to_bool().accept(this));
    }

    @Override
    public Expression visitFunctionExpression(QuirklParser.FunctionExpressionContext ctx) {
        AntlrToFunction antlrToFunction = new AntlrToFunction();
        return new FunctionExpression(new QuirklFunction(ctx.function().accept(antlrToFunction)));
    }

    @Override
    public Expression visitAndExpression(QuirklParser.AndExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.AND);
    }

    @Override
    public Expression visitSummationExpression(QuirklParser.SummationExpressionContext ctx) {
        return this.getSumExpression(new SummationExpression(), ctx, "Summation");
    }

    @Override
    public Expression visitDivisionExpression(QuirklParser.DivisionExpressionContext ctx) {
        return new DivideExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitProdSummationExpression(QuirklParser.ProdSummationExpressionContext ctx) {
        return this.getSumExpression(new ProdSummationExpression(), ctx, "ProdSummation");
    }

    @Override
    public Expression visitAdditionExpression(QuirklParser.AdditionExpressionContext ctx) {
        return new AdditionExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitExponentExpression(QuirklParser.ExponentExpressionContext ctx) {
        return new ExponentExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitModulusExpression(QuirklParser.ModulusExpressionContext ctx) {
        return new ModulusExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitBracketExpression(QuirklParser.BracketExpressionContext ctx) {
        return new BracketExpression(ctx.expression().accept(this));
    }

    @Override
    public Expression visitSubtractionExpression(QuirklParser.SubtractionExpressionContext ctx) {
        return new SubtractionExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitNandExpression(QuirklParser.NandExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.NAND);
    }

    @Override
    public Expression visitGreaterThanOrEqualsExpression(QuirklParser.GreaterThanOrEqualsExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.GREATER_THAN_OR_EQUALS);
    }

    @Override
    public Expression visitRootExpression(QuirklParser.RootExpressionContext ctx) {
        return new RootExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitLessThanOrEqualsExpression(QuirklParser.LessThanOrEqualsExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.LESS_THAN_OR_EQUALS);
    }

    @Override
    public Expression visitMultiplicationExpression(QuirklParser.MultiplicationExpressionContext ctx) {
        return new MultiplicationExpression(this.getTwoExpOperationExpression(ctx.expression(0), ctx.expression(1)));
    }

    @Override
    public Expression visitNorExpression(QuirklParser.NorExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.NOR);
    }

    @Override
    public Expression visitEqualsExpression(QuirklParser.EqualsExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.EQUALS);
    }

    @Override
    public Expression visitLessThanExpression(QuirklParser.LessThanExpressionContext ctx) {
        return this.getTwoExpBooleanExpression(ctx.expression(0), ctx.expression(1), TwoExpBooleanExpression.OPERATORS.LESS_THAN);
    }

    @Override
    public Expression visitVariable(QuirklParser.VariableContext ctx) {
        String varName = ctx.id().getText();
        if (!this.program.hasVariable(varName))
            this.program.addError(this.varNotDefined(ctx.id()));
        return new VariableExpression(this.program.getVariable(varName));
    }

    @Override
    public Expression visitNumberLiteral(QuirklParser.NumberLiteralContext ctx) {
        long num = Long.parseLong(ctx.number().getText());
        return new NumberLiteral(new QuirklLongNumber(num));
    }

    @Override
    public Expression visitDecimalLiteral(QuirklParser.DecimalLiteralContext ctx) {
        double dec = Double.parseDouble(ctx.decimal().getText());
        return new DecimalLiteral(new QuirklDoubleNumber(dec));
    }

    @Override
    public Expression visitBooleanLiteral(QuirklParser.BooleanLiteralContext ctx) {
        boolean bool = Boolean.parseBoolean(ctx.boolean_().getText());
        return new BooleanLiteral(new QuirklBoolean(bool));
    }

    @Override
    public Expression visitStringLiteral(QuirklParser.StringLiteralContext ctx) {
        String str = ctx.string().getText();
        return new StringLiteral(new QuirklString(str));
    }
}
