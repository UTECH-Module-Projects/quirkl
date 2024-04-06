package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.semantics.model.expression.*;
import com.apl.quirkl.language.semantics.model.expression.operation.ShiftExp;
import com.apl.quirkl.language.semantics.model.expression.operation.SumExp;
import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.expression.operation.bool.NotBoolExp;
import com.apl.quirkl.language.semantics.model.expression.operation.bool.TwoExpBoolExp;
import com.apl.quirkl.language.semantics.model.expression.operation.literal.BooleanLit;
import com.apl.quirkl.language.semantics.model.expression.operation.literal.DecimalLit;
import com.apl.quirkl.language.semantics.model.expression.operation.literal.NumberLit;
import com.apl.quirkl.language.semantics.model.expression.operation.literal.StringLit;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.QuirklBool;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklString;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.number.QuirklDoubleNum;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklFunctionException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor.AntlrToExpProc;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;
import lombok.Getter;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.*;

@Getter
public class AntlrToExp extends AntlrToModel<Exp> {

    private final AntlrToExpProc processor;

    public AntlrToExp(String scope) {
        super(scope);
        this.processor = new AntlrToExpProc(this);
    }

    @Override
    public Exp visitInputExpression(QuirklParser.InputExpressionContext ctx) {
        InputExp inputExp = addToScopeContext(new InputExp(AntlrUtil.getCoord(ctx), this.scope));
        if (!isEmpty(ctx.STRING())) {
            String msgFull = ctx.STRING().getText();
            inputExp.setMsg(msgFull.substring(1, msgFull.length() - 1));
        }

        return inputExp;
    }

    @Override
    public Exp visitTypeCastExpression(QuirklParser.TypeCastExpressionContext ctx) {
        CastExp castExp = addToScopeContext(new CastExp(AntlrUtil.getCoord(ctx), this.scope));
        castExp.setType(QuirklType.toQuirklType(ctx.variable_data_type().getText()));

        Exp exp = ctx.expression().accept(this);
        if (exp == null) return null;
        castExp.setExp(exp);

        return castExp;
    }

    @Override
    public Exp visitBracketExpression(QuirklParser.BracketExpressionContext ctx) {
        BracketExp bracketExp = addToScopeContext(new BracketExp(AntlrUtil.getCoord(ctx), this.scope));

        Exp result = ctx.expression().accept(this);
        if (result == null) return null;
        bracketExp.setExp(result);

        if (ctx.getChild(1) instanceof QuirklParser.ExpressionContext)
            return bracketExp;

        return addToScopeContext(new TwoExpOpExp(AntlrUtil.getCoord(ctx), this.scope, bracketExp, new NumberLit(AntlrUtil.getCoord(ctx), this.scope, QuirklLongNum.NEG_ONE), TwoExpOpExp.OP.MULTIPLY));
    }

    @Override
    public ShiftExp visitIncrementExpression(QuirklParser.IncrementExpressionContext ctx) {
        Exp result = ctx.expression().accept(this);
        if (result == null) return null;
        return new ShiftExp(AntlrUtil.getCoord(ctx), this.scope, result, ShiftExp.OP.INC, false);
    }

    @Override
    public ShiftExp visitDecrementExpression(QuirklParser.DecrementExpressionContext ctx) {
        Exp result = ctx.expression().accept(this);
        if (result == null) return null;
        return new ShiftExp(AntlrUtil.getCoord(ctx), this.scope, result, ShiftExp.OP.DEC, false);
    }

    @Override
    public TwoExpOpExp visitExponentExpression(QuirklParser.ExponentExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.POWER, this);
    }

    @Override
    public TwoExpOpExp visitRootExpression(QuirklParser.RootExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.ROOT, this);
    }

    @Override
    public TwoExpOpExp visitMultiplicationExpression(QuirklParser.MultiplicationExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.MULTIPLY, this);
    }

    @Override
    public TwoExpOpExp visitDivisionExpression(QuirklParser.DivisionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.DIVIDE, this);
    }

    @Override
    public TwoExpOpExp visitModulusExpression(QuirklParser.ModulusExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.MODULO, this);
    }

    @Override
    public TwoExpOpExp visitAdditionExpression(QuirklParser.AdditionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.PLUS, this);
    }

    @Override
    public TwoExpOpExp visitSubtractionExpression(QuirklParser.SubtractionExpressionContext ctx) {
        return this.processor.getTwoExpOperationExpression(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpOpExp.OP.MINUS, this);
    }

    @Override
    public SumExp visitSummationExpression(QuirklParser.SummationExpressionContext ctx) {
        return this.processor.getSumExpression(ctx, SumExp.OPERATOR.SUMM);
    }

    @Override
    public SumExp visitProdSummationExpression(QuirklParser.ProdSummationExpressionContext ctx) {
        return this.processor.getSumExpression(ctx, SumExp.OPERATOR.PRODSUMM);
    }

    @Override
    public NotBoolExp visitNotBooleanExpression(QuirklParser.NotBooleanExpressionContext ctx) {
        Exp exp = ctx.expression().accept(this);
        if (exp == null) return null;
        return new NotBoolExp(AntlrUtil.getCoord(ctx), this.scope, exp);
    }

    @Override
    public TwoExpBoolExp visitEqualsBooleanExpression(QuirklParser.EqualsBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.EQUALS, this);
    }

    @Override
    public TwoExpBoolExp visitNotEqualsBooleanExpression(QuirklParser.NotEqualsBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.NOT_EQUALS, this);
    }

    @Override
    public TwoExpBoolExp visitGreaterThanBooleanExpression(QuirklParser.GreaterThanBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.GREATER_THAN, this);
    }

    @Override
    public TwoExpBoolExp visitLessThanBooleanExpression(QuirklParser.LessThanBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.LESS_THAN, this);
    }

    @Override
    public TwoExpBoolExp visitGreaterThanOrEqualsBooleanExpression(QuirklParser.GreaterThanOrEqualsBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.GREATER_THAN_OR_EQUALS, this);
    }

    @Override
    public TwoExpBoolExp visitLessThanOrEqualsBooleanExpression(QuirklParser.LessThanOrEqualsBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.LESS_THAN_OR_EQUALS, this);
    }

    @Override
    public TwoExpBoolExp visitAndBooleanExpression(QuirklParser.AndBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.AND, this);
    }

    @Override
    public TwoExpBoolExp visitOrBooleanExpression(QuirklParser.OrBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.OR, this);
    }

    @Override
    public TwoExpBoolExp visitXorBooleanExpression(QuirklParser.XorBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.XOR, this);
    }

    @Override
    public TwoExpBoolExp visitNandBooleanExpression(QuirklParser.NandBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.NAND, this);
    }

    @Override
    public TwoExpBoolExp visitNorBooleanExpression(QuirklParser.NorBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.NOR, this);
    }

    @Override
    public TwoExpBoolExp visitXnorBooleanExpression(QuirklParser.XnorBooleanExpressionContext ctx) {
        return this.processor.getTwoExpBoolExp(AntlrUtil.getCoord(ctx), ctx.expression(0), ctx.expression(1), TwoExpBoolExp.OP.XNOR, this);
    }

    @Override
    public Exp visitToBoolExpression(QuirklParser.ToBoolExpressionContext ctx) {
        return ctx.toBool().accept(this);
    }

    @Override
    public ToBoolExp visitToBool(QuirklParser.ToBoolContext ctx) {
        ToBoolExp toBoolExp = addToScopeContext(new ToBoolExp(AntlrUtil.getCoord(ctx), this.scope));
        Exp exp = ctx.expression().accept(this);
        if (exp == null) return null;
        toBoolExp.setExp(exp);
        return toBoolExp;
    }

    @Override
    public TernaryOperatorExp visitTernaryOperatorExpression(QuirklParser.TernaryOperatorExpressionContext ctx) {
        TernaryOperatorExp ternaryOperatorExp = addToScopeContext(new TernaryOperatorExp(AntlrUtil.getCoord(ctx), this.scope));

        ToBoolExp toBoolExp = this.visitToBool(ctx.toBool());
        if (toBoolExp == null) return null;
        ternaryOperatorExp.setToBool(toBoolExp);

        Exp trueExp = ctx.expression(0).accept(this);
        if (trueExp == null) return null;
        ternaryOperatorExp.setExpTrue(trueExp);

        Exp falseExp = ctx.expression(1).accept(this);
        if (falseExp == null) return null;
        ternaryOperatorExp.setExpFalse(falseExp);

        return ternaryOperatorExp;
    }

    @Override
    public FunctionExp visitFunctionWithBodyExpression(QuirklParser.FunctionWithBodyExpressionContext ctx) {
        FunctionExp functionExp = addToScopeContext(new FunctionExp(getCoord(ctx), this.scope));
        Var<QuirklFunc> quirklFuncVar = new AntlrToVar(this.scope).visitFunctionWithBody(ctx.functionWithBody());
        if (isEmpty(quirklFuncVar)) return null;
        functionExp.setVarFunc(quirklFuncVar);

        return functionExp;
    }

    @Override
    public FunctionExp visitFunctionWithLambdaExpression(QuirklParser.FunctionWithLambdaExpressionContext ctx) {
        FunctionExp functionExp = addToScopeContext(new FunctionExp(getCoord(ctx), this.scope));
        Var<QuirklFunc> quirklFuncVar = new AntlrToVar(this.scope).visitFunctionWithLambda(ctx.functionWithLambda());
        if (isEmpty(quirklFuncVar)) return null;
        functionExp.setVarFunc(quirklFuncVar);

        return functionExp;
    }

    @Override
    public Exp visitFunctionCallExpression(QuirklParser.FunctionCallExpressionContext ctx) {
        return ctx.functionCall().accept(this);
    }

    @Override
    @SuppressWarnings("unchecked")
    public FunctionCallExp visitFunctionCall(QuirklParser.FunctionCallContext ctx) {
        FunctionCallExp functionCallExp = addToScopeContext(new FunctionCallExp(AntlrUtil.getCoord(ctx), this.scope));

        Var<?> var = getVariable(functionCallExp, ctx.id());
        if (var == null) return null;

        if (!var.getType().equals(QuirklType.TYPE.FUNCTION)) {
            Prog.INSTANCE.addError(QuirklFunctionException.notAFunction(var, this.scope, AntlrUtil.getCoord(ctx)));
            return null;
        }
        functionCallExp.setVarFunc((Var<QuirklFunc>) var);

        QuirklList<Exp> expList = functionCallExp.getArguments();
        for (QuirklParser.ExpressionContext expCtx : ctx.expression()) {
            Exp exp = expCtx.accept(this);
            if (exp == null) return null;
            expList.add(exp);
        }

        return functionCallExp;
    }

    @Override
    public Exp visitVariableExpression(QuirklParser.VariableExpressionContext ctx) {
        VarExp varExp = addToScopeContext(new VarExp(AntlrUtil.getCoord(ctx), this.scope));

        Var<?> var = getVariable(varExp, ctx.id());
        if (var == null) return null;
        varExp.setVar(var);

        if (ctx.getChild(0) instanceof QuirklParser.IdContext) {
            return varExp;
        } else {
            return addToScopeContext(new TwoExpOpExp(AntlrUtil.getCoord(ctx), this.scope, varExp, new NumberLit(AntlrUtil.getCoord(ctx), this.scope, QuirklLongNum.NEG_ONE), TwoExpOpExp.OP.MULTIPLY));
        }
    }

    @Override
    public NumberLit visitNumberLiteralExpression(QuirklParser.NumberLiteralExpressionContext ctx) {
        long value = Long.parseLong(ctx.number().getText());
        NumberLit numLit = addToScopeContext(new NumberLit(AntlrUtil.getCoord(ctx), this.scope));
        numLit.setValue(new QuirklLongNum(value, numLit));
        return numLit;
    }

    @Override
    public DecimalLit visitDecimalLiteralExpression(QuirklParser.DecimalLiteralExpressionContext ctx) {
        double value = Double.parseDouble(ctx.getText());
        DecimalLit decLit = addToScopeContext(new DecimalLit(AntlrUtil.getCoord(ctx), this.scope));
        decLit.setValue(new QuirklDoubleNum(value, decLit));
        return decLit;
    }

    @Override
    public BooleanLit visitBooleanLiteralExpression(QuirklParser.BooleanLiteralExpressionContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.getText());
        BooleanLit boolLit = addToScopeContext(new BooleanLit(AntlrUtil.getCoord(ctx), this.scope));
        boolLit.setValue(new QuirklBool(value, boolLit));
        return boolLit;
    }

    @Override
    public StringLit visitStringLiteralExpression(QuirklParser.StringLiteralExpressionContext ctx) {
        String value = ctx.getText().substring(1, ctx.getText().length() - 1);
        StringLit strLit = addToScopeContext(new StringLit(AntlrUtil.getCoord(ctx), this.scope));
        strLit.setValue(new QuirklString(value, strLit));
        return strLit;
    }

    @Override
    public ShiftExp visitLateIncrementExpression(QuirklParser.LateIncrementExpressionContext ctx) {
        VarExp varExp = addToScopeContext(new VarExp(AntlrUtil.getCoord(ctx), this.scope));
        Var<?> var = getVariable(varExp, ctx.id());
        if (var == null) return null;
        varExp.setVar(var);

        return addToScopeContext(new ShiftExp(AntlrUtil.getCoord(ctx), this.scope, varExp, ShiftExp.OP.INC, true));
    }

    @Override
    public ShiftExp visitLateDecrementExpression(QuirklParser.LateDecrementExpressionContext ctx) {
        VarExp varExp = addToScopeContext(new VarExp(AntlrUtil.getCoord(ctx), this.scope));
        Var<?> var = getVariable(varExp, ctx.id());
        if (var == null) return null;
        varExp.setVar(var);

        return addToScopeContext(new ShiftExp(AntlrUtil.getCoord(ctx), this.scope, varExp, ShiftExp.OP.INC, true));
    }
}
