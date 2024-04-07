package com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.VarExp;
import com.apl.quirkl.language.semantics.model.expression.operation.SumExp;
import com.apl.quirkl.language.semantics.model.expression.operation.bool.TwoExpBoolExp;
import com.apl.quirkl.language.semantics.model.expression.operation.literal.NumberLit;
import com.apl.quirkl.language.semantics.model.expression.operation.TwoExpOpExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.number.QuirklLongNum;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToExp;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToVar;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklSummationException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.*;

public class AntlrToExpProc extends AntlrToModelProc<Exp, AntlrToExp> {

    public AntlrToExpProc(AntlrToExp visitor) {
        super(visitor);
    }

    @SuppressWarnings("unchecked")
    public SumExp getSumExpression(QuirklParser.ExpressionContext ctx, SumExp.OPERATOR op) {
        SumExp sumExp = addToScopeContext(new SumExp(AntlrUtil.getCoord(ctx), this.visitor.getScope()));
        sumExp.setOperator(op);

        int idCount = 0;
        Exp start;
        Exp end;

        var param = ctx.getChild(0);
        if (param instanceof QuirklParser.NumberContext numContext) {
            NumberLit numLit = new NumberLit(AntlrUtil.getCoord(numContext), this.visitor.getScope());
            numLit.setValue(new QuirklLongNum(Long.parseLong(numContext.getText()), numLit));
            start = numLit;
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            start = new VarExp(res.getCoord(), this.visitor.getScope(), res);
            idCount++;
        }
        sumExp.setStart(start);

        param = ctx.getChild(2);
        if (param instanceof QuirklParser.NumberContext numContext) {
            NumberLit numLit = new NumberLit(AntlrUtil.getCoord(numContext), this.visitor.getScope());
            numLit.setValue(new QuirklLongNum(Long.parseLong(numContext.getText()), numLit));
            end = numLit;
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            end = new VarExp(res.getCoord(), this.visitor.getScope(), res);
            idCount++;
        }
        sumExp.setEnd(end);

        Var<QuirklFunc> varFunc;
        param = ctx.getChild(4);
        if (param instanceof QuirklParser.FunctionContext funcCtx) {
            AntlrToVar antlrToVar = new AntlrToVar(this.visitor.getScope());
            varFunc = antlrToVar.visitFunction(funcCtx);
            if (isEmpty(varFunc)) return null;
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            if (!res.getType().equals(QuirklType.TYPE.FUNCTION)) {
                Prog.INSTANCE.addError(QuirklSummationException.notAFunction(res, this.visitor.getScope(), res.getCoord()));
                return null;
            }
            varFunc = (Var<QuirklFunc>) res;
        }
        sumExp.setSumFunc(varFunc);

        return sumExp;
    }

    private Var<?> checkVarExistsForSumExpression(String varName, QuirklParser.ExpressionContext ctx, SumExp.OPERATOR type, int idCount) {
        Var<?> varFunc = Prog.INSTANCE.getVarAllScope(varName, this.visitor.getScope());
        if (isEmpty(varFunc)) {
            QuirklParser.IdContext idCtx = switch (type) {
                case SUMM -> ((QuirklParser.SummationExpressionContext) ctx).id(idCount);
                case PRODSUMM -> ((QuirklParser.ProdSummationExpressionContext) ctx).id(idCount);
            };
            Prog.INSTANCE.addError(QuirklDeclarationException.undeclaredVariable(idCtx.getText(), this.visitor.getScope(), getCoord(ctx)));
            return null;
        }
        return varFunc;
    }

    public TwoExpOpExp getTwoExpOperationExpression(QuirklCoord coord, QuirklParser.ExpressionContext expCtx1, QuirklParser.ExpressionContext expCtx2, TwoExpOpExp.OP op, AntlrToExp visitor) {
        TwoExpOpExp twoExpOpExp = addToScopeContext(new TwoExpOpExp(coord, this.visitor.getScope()));
        twoExpOpExp.setOperator(op);

        Exp exp1 = expCtx1.accept(visitor);
        if (exp1 == null) return null;
        twoExpOpExp.setLeft(exp1);

        Exp exp2 = expCtx2.accept(visitor);
        if (exp2 == null) return null;
        twoExpOpExp.setRight(exp2);

        return twoExpOpExp;
    }

    public TwoExpBoolExp getTwoExpBoolExp(QuirklCoord coord, QuirklParser.ExpressionContext expCtx1, QuirklParser.ExpressionContext expCtx2, TwoExpBoolExp.OP op, AntlrToExp visitor) {
        TwoExpBoolExp twoExpBoolExp = addToScopeContext(new TwoExpBoolExp(coord, this.visitor.getScope()));
        twoExpBoolExp.setOperator(op);

        Exp exp1 = expCtx1.accept(visitor);
        if (exp1 == null) return null;
        twoExpBoolExp.setLeft(exp1);

        Exp exp2 = expCtx2.accept(visitor);
        if (exp2 == null) return null;
        twoExpBoolExp.setRight(exp2);

        return twoExpBoolExp;
    }
}
