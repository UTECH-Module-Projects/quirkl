package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.exp.*;
import com.apl.quirkyfun.language.semantics.model.exp.operation.ShiftExp;
import com.apl.quirkyfun.language.semantics.model.exp.operation.SumExp;
import com.apl.quirkyfun.language.semantics.model.exp.operation.TwoExpOpExp;
import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.exp.operation.bool.NotBoolExp;
import com.apl.quirkyfun.language.semantics.model.exp.operation.bool.TwoExpBoolExp;
import com.apl.quirkyfun.language.semantics.model.exp.operation.literal.NumberLit;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.util.QuirklList;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.processor.AntlrToExpressionProcessor;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.util.AntlrUtil;
import lombok.Getter;

import java.util.List;

@Getter
public class AntlrToExpression extends AntlrToModel<Exp> {

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
    public Exp visitBracketExpression(QuirklParser.BracketExpressionContext ctx) {
        Exp result = ctx.expression().accept(this);
        if (result == null) return null;
        return new BracketExp(AntlrUtil.getCoord(ctx), result);
    }

    @Override
    public Exp visitIncrementExpression(QuirklParser.IncrementExpressionContext ctx) {
        Exp result = ctx.expression().accept(this);
        if (result == null) return null;
        return new ShiftExp(AntlrUtil.getCoord(ctx), result, ShiftExp.OP.INC);
    }

    @Override
    public Exp visitDecrementExpression(QuirklParser.DecrementExpressionContext ctx) {
        Exp result = ctx.expression().accept(this);
        if (result == null) return null;
        return new ShiftExp(AntlrUtil.getCoord(ctx), result, ShiftExp.OP.DEC);
    }

    @Override
    public Exp visitExponentExpression(QuirklParser.ExponentExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.POWER, this);
    }

    @Override
    public Exp visitRootExpression(QuirklParser.RootExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.ROOT, this);
    }

    @Override
    public Exp visitMultiplicationExpression(QuirklParser.MultiplicationExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.MULTIPLY, this);
    }

    @Override
    public Exp visitDivisionExpression(QuirklParser.DivisionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.DIVIDE, this);
    }

    @Override
    public Exp visitModulusExpression(QuirklParser.ModulusExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.MODULO, this);
    }

    @Override
    public Exp visitAdditionExpression(QuirklParser.AdditionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.PLUS, this);
    }

    @Override
    public Exp visitSubtractionExpression(QuirklParser.SubtractionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.MINUS, this);
    }

    @Override
    public Exp visitSummationExpression(QuirklParser.SummationExpressionContext ctx) {
        return this.processor.getSumExpression(ctx, SumExp.OPERATOR.SUMM);
    }

    @Override
    public Exp visitProdSummationExpression(QuirklParser.ProdSummationExpressionContext ctx) {
        return this.processor.getSumExpression(ctx, SumExp.OPERATOR.PRODSUMM);
    }

    @Override
    public Exp visitNotBooleanExpression(QuirklParser.NotBooleanExpressionContext ctx) {
        Exp exp = ctx.expression().accept(this);
        if (exp == null) return null;
        return new NotBoolExp(AntlrUtil.getCoord(ctx), exp);
    }

    @Override
    public Exp visitEqualsBooleanExpression(QuirklParser.EqualsBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.EQUALS, this);
    }

    @Override
    public Exp visitNotEqualsBooleanExpression(QuirklParser.NotEqualsBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.NOT_EQUALS, this);
    }

    @Override
    public Exp visitGreaterThanBooleanExpression(QuirklParser.GreaterThanBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.GREATER_THAN, this);
    }

    @Override
    public Exp visitLessThanBooleanExpression(QuirklParser.LessThanBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.LESS_THAN, this);
    }

    @Override
    public Exp visitGreaterThanOrEqualsBooleanExpression(QuirklParser.GreaterThanOrEqualsBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.GREATER_THAN_OR_EQUALS, this);
    }

    @Override
    public Exp visitLessThanOrEqualsBooleanExpression(QuirklParser.LessThanOrEqualsBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.LESS_THAN_OR_EQUALS, this);
    }

    @Override
    public Exp visitAndBooleanExpression(QuirklParser.AndBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.AND, this);
    }

    @Override
    public Exp visitOrBooleanExpression(QuirklParser.OrBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.OR, this);
    }

    @Override
    public Exp visitXorBooleanExpression(QuirklParser.XorBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.XOR, this);
    }

    @Override
    public Exp visitNandBooleanExpression(QuirklParser.NandBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.NAND, this);
    }

    @Override
    public Exp visitNorBooleanExpression(QuirklParser.NorBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.NOR, this);
    }

    @Override
    public Exp visitXnorBooleanExpression(QuirklParser.XnorBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.XNOR, this);
    }

    @Override
    public Exp visitToBoolExpression(QuirklParser.ToBoolExpressionContext ctx) {
        return ctx.toBool().accept(this);
    }

    @Override
    public ToBoolExp visitToBool(QuirklParser.ToBoolContext ctx) {
        Exp exp = ctx.expression().accept(this);
        if (exp == null) return null;
        return new ToBoolExp(AntlrUtil.getCoord(ctx), exp);
    }

    @Override
    public Exp visitTernaryOperatorExpression(QuirklParser.TernaryOperatorExpressionContext ctx) {
        ToBoolExp toBoolExp = this.visitToBool(ctx.toBool());
        if (toBoolExp == null) return null;
        Exp trueExp = ctx.expression(0).accept(this);
        if (trueExp == null) return null;
        Exp falseExp = ctx.expression(1).accept(this);
        if (falseExp == null) return null;
        return new TernaryOperatorExp(AntlrUtil.getCoord(ctx), toBoolExp, trueExp, falseExp);
    }

    @Override
    public Exp visitFunctionWithBodyExpression(QuirklParser.FunctionWithBodyExpressionContext ctx) {
        Function func = ctx.functionWithBody().accept(new AntlrToFunction(program, scope));
        if (func == null) return null;
        QuirklCoord coord = AntlrUtil.getCoord(ctx);
        return new FunctionExp(coord, new QuirklFunction(coord, func));
    }

    @Override
    public Exp visitFunctionWithLambdaExpression(QuirklParser.FunctionWithLambdaExpressionContext ctx) {
        Function func = ctx.functionWithLambda().accept(new AntlrToFunction(program, scope));
        if (func == null) return null;
        QuirklCoord coord = AntlrUtil.getCoord(ctx);
        return new FunctionExp(coord, new QuirklFunction(coord, func));
    }

    @Override
    public Exp visitFunctionCallExpression(QuirklParser.FunctionCallExpressionContext ctx) {
        return ctx.functionCall().accept(this);
    }

    @Override
    public Exp visitFunctionCall(QuirklParser.FunctionCallContext ctx) {
        QuirklParser.IdContext idCTX = ctx.id();
        String varName = idCTX.getText();
        Variable var = program.getVariable(varName, this.scope);

        if (var == null) {
            program.addError(QuirklDeclarationException.undeclaredVariable(AntlrUtil.getCoord(idCTX), varName));
            return null;
        }

        QuirklType<?> value = var.getValue();

        if (!(value instanceof QuirklFunction func)) {
            program.addError(QuirklFunctionException.notAFunction(AntlrUtil.getCoord(ctx), var));
            return null;
        }

        List<QuirklParser.ExpressionContext> expCtxList = ctx.expression();
        if (func.getTotParam() != expCtxList.size()) {
            program.addError(QuirklFunctionException.invalidNumberOfArguments(AntlrUtil.getCoord(ctx), func.getValue(), func.getTotParam(), expCtxList.size()));
            return null;
        }

        List<Exp> expList = new QuirklList<>();
        for (QuirklParser.ExpressionContext expCtx : expCtxList) {
            Exp exp = expCtx.accept(this);
            if (exp == null) return null;
            expList.add(exp);
        }

        return new FunctionCallExp(AntlrUtil.getCoord(ctx), func, expList);
    }

    @Override
    public Exp visitVariableExpression(QuirklParser.VariableExpressionContext ctx) {
        QuirklParser.IdContext idCTX = ctx.id();
        String varName = idCTX.getText();
        Variable var = program.getVariable(varName, this.scope);

        if (var == null) {
            program.addError(QuirklDeclarationException.undeclaredVariable(AntlrUtil.getCoord(idCTX), varName));
            return null;
        }

        if (ctx.getChild(0) instanceof QuirklParser.IdContext) {
            return new VariableExp(AntlrUtil.getCoord(ctx), var);
        } else {
            return new TwoExpOpExp(AntlrUtil.getCoord(ctx), var, new NumberLit(AntlrUtil.getCoord(ctx), new QuirklLongNumber(-1)), TwoExpOpExp.OP.PLUS);
        }


    }
}
