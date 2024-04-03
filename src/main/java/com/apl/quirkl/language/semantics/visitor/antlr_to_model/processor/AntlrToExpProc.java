package com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.VariableExp;
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

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.isEmpty;

public class AntlrToExpProc extends AntlrToModelProc<Exp, AntlrToExp> {

    public AntlrToExpProc(Prog prog, AntlrToExp visitor) {
        super(prog, visitor);
    }

    @SuppressWarnings("unchecked")
    public SumExp getSumExpression(QuirklParser.ExpressionContext ctx, SumExp.OPERATOR op) {
        int idCount = 0;
        Exp start;
        Exp end;
        QuirklFunc sumFunc;

        var param = ctx.getChild(0);
        if (param instanceof QuirklParser.NumberContext numContext) {
            start = new NumberLit(AntlrUtil.getCoord(numContext), this.visitor.getScope(), new QuirklLongNum(Long.parseLong(numContext.getText())));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            start = new VariableExp(res.getCoord(), this.visitor.getScope(), res);
            idCount++;
        }

        param = ctx.getChild(2);
        if (param instanceof QuirklParser.NumberContext numContext) {
            end = new NumberLit(AntlrUtil.getCoord(numContext), this.visitor.getScope(), new QuirklLongNum(Long.parseLong(numContext.getText())));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            end = new VariableExp(res.getCoord(), this.visitor.getScope(), res);
            idCount++;
        }

        Var<QuirklFunc> varFunc;
        param = ctx.getChild(4);
        if (param instanceof QuirklParser.FunctionContext funcCtx) {
            AntlrToVar antlrToVar = new AntlrToVar(this.prog, this.visitor.getScope());
            varFunc = antlrToVar.visitFunction(funcCtx);
            if (isEmpty(varFunc)) return null;
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            if (!res.getType().equals(QuirklType.TYPE.FUNCTION)) {
                this.prog.addError(QuirklSummationException.notAFunction(res));
                return null;
            }
            varFunc = (Var<QuirklFunc>) res;
        }
        return new SumExp(AntlrUtil.getCoord(ctx), this.visitor.getScope(), start, end, varFunc, op);
    }

    private Var<?> checkVarExistsForSumExpression(String varName, QuirklParser.ExpressionContext ctx, SumExp.OPERATOR type, int idCount) {
        Var<?> varFunc = this.prog.getVarAllScope(varName, this.visitor.getScope());
        if (isEmpty(varFunc)) {
            QuirklParser.IdContext idCtx = switch (type) {
                case SUMM -> ((QuirklParser.SummationExpressionContext) ctx).id(idCount);
                case PRODSUMM -> ((QuirklParser.ProdSummationExpressionContext) ctx).id(idCount);
            };
            this.prog.addError(QuirklDeclarationException.undeclaredVariable(AntlrUtil.getCoord(idCtx), idCtx.getText()));
            return null;
        }
        return varFunc;
    }

    public TwoExpOpExp getTwoExpOperationExpression(QuirklCoord coord, QuirklParser.ExpressionContext expCtx1, QuirklParser.ExpressionContext expCtx2, TwoExpOpExp.OP op, AntlrToExp visitor) {
        Exp exp1 = expCtx1.accept(visitor);
        if (exp1 == null)
            return null;
        Exp exp2 = expCtx2.accept(visitor);
        if (exp2 == null)
            return null;
        return new TwoExpOpExp(coord, this.visitor.getScope(), exp1, exp2, op);
    }

    public TwoExpBoolExp getTwoExpBoolExp(QuirklCoord coord, QuirklParser.ExpressionContext expCtx1, QuirklParser.ExpressionContext expCtx2, TwoExpBoolExp.OP OP, AntlrToExp visitor) {
        Exp exp1 = expCtx1.accept(visitor);
        if (exp1 == null)
            return null;
        Exp exp2 = expCtx2.accept(visitor);
        if (exp2 == null)
            return null;
        return new TwoExpBoolExp(coord, this.visitor.getScope(), exp1, exp2, OP);
    }
}
