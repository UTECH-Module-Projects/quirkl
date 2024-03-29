package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.VariableExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.bool.TwoExpBooleanExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.literal.NumberLiteral;
import com.apl.quirkyfun.language.semantics.model.expression.operation.sum.SumExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.twoexp.TwoExpOperationExpression;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.AntlrToExpression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.AntlrToExpression2;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.QuirklException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;

public class AntlrToExpressionProcessor {

    public static final AntlrToExpressionProcessor INSTANCE = new AntlrToExpressionProcessor();

    private final Program program;

    private AntlrToExpressionProcessor() {
        this.program = Program.INSTANCE;
    }

    public SumExpression getSumExpression(SumExpression exp, QuirklParser.ExpressionContext ctx, String type) throws QuirklException {
        try {
            int idCount = 0;
            var param = ctx.getChild(0);
            if (param instanceof QuirklParser.NumberContext) {
                exp.setStart(new NumberLiteral(Long.parseLong(param.getText())));
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
        } catch (Exception e) {
            throw new QuirklException(e);
        }
    }

    private Variable checkVarExistsForSumExpression(String varName, QuirklParser.ExpressionContext ctx, String type, int idCount) throws QuirklDeclarationException {
        if (!this.program.hasVariable(varName)) {
            var idCtx = (type.equals("ProdSummation") ? ((QuirklParser.ProdSummationExpressionContext) ctx).id(idCount) : ((QuirklParser.SummationExpressionContext) ctx).id(idCount));
            throw QuirklDeclarationException.undeclaredVariable(idCtx);
        }
        return program.getVariable(varName);
    }

    public TwoExpOperationExpression getTwoExpOperationExpression(QuirklParser.ExpressionContext expCtx1, QuirklParser.ExpressionContext expCtx2, AntlrToExpression2 visitor) {
        Expression exp1 = expCtx1.accept(visitor);
        if (exp1 == null)
            return null;
        Expression exp2 = expCtx2.accept(visitor);
        if (exp2 == null)
            return null;
        return new TwoExpOperationExpression(exp1, exp2);
    }

    public TwoExpBooleanExpression getTwoExpBooleanExpression(QuirklParser.ExpressionContext expCtx1, QuirklParser.ExpressionContext expCtx2, TwoExpBooleanExpression.OPERATORS OPERATORS, AntlrToExpression visitor) {
        Expression exp1 = expCtx1.accept(visitor);
        if (exp1 == null)
            return null;
        Expression exp2 = expCtx2.accept(visitor);
        if (exp2 == null)
            return null;
        return new TwoExpBooleanExpression(exp1, exp2, OPERATORS);
    }
}
