package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.expression.Expression;
import com.apl.quirkyfun.language.semantics.model.expression.VariableExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.bool.TwoExpBooleanExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.literal.NumberLiteral;
import com.apl.quirkyfun.language.semantics.model.expression.operation.SumExpression;
import com.apl.quirkyfun.language.semantics.model.expression.operation.TwoExpOperationExpression;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.type.QuirklFunction;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.type.number.QuirklLongNumber;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.AntlrToExpression;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.AntlrToFunction;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.runtime.QuirklSummationException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

public class AntlrToExpressionProcessor {
    private final Program program;
    private final AntlrToExpression visitor;

    public AntlrToExpressionProcessor(AntlrToExpression visitor) {
        this.program = visitor.getProgram();
        this.visitor = visitor;
    }

    public SumExpression getSumExpression(QuirklParser.ExpressionContext ctx, SumExpression.OPERATOR op) {
        int idCount = 0;
        Expression start;
        Expression end;
        QuirklFunction sumFunc;

        var param = ctx.getChild(0);
        if (param instanceof QuirklParser.NumberContext numContext) {
            start = new NumberLiteral(AntlrUtil.getCoord(numContext), new QuirklLongNumber(Long.parseLong(numContext.getText())));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            start = new VariableExpression(res.getCoord(), res);
            idCount++;
        }

        param = ctx.getChild(2);
        if (param instanceof QuirklParser.NumberContext numContext) {
            end = new NumberLiteral(AntlrUtil.getCoord(numContext), new QuirklLongNumber(Long.parseLong(numContext.getText())));
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            end = new VariableExpression(res.getCoord(), res);
            idCount++;
        }

        param = ctx.getChild(4);
        if (param instanceof QuirklParser.FunctionContext) {
            Function func = param.accept(new AntlrToFunction(this.program, this.visitor.getScope()));
            if (func == null) return null;
            sumFunc = new QuirklFunction(func);
        } else {
            var res = this.checkVarExistsForSumExpression(param.getText(), ctx, op, idCount);
            if (res == null) return null;
            QuirklType<?> value = res.getValue();
            if (!value.isType(QuirklType.TYPE.FUNCTION)) {
                this.program.addError(QuirklSummationException.notAFunction(res));
                return null;
            }
            sumFunc = (QuirklFunction) res.getValue();
        }
        return new SumExpression(AntlrUtil.getCoord(ctx), start, end, sumFunc, op);
    }

    private Variable checkVarExistsForSumExpression(String varName, QuirklParser.ExpressionContext ctx, SumExpression.OPERATOR type, int idCount) {
        if (!this.program.hasVariable(varName, this.visitor.getScope())) {
            QuirklParser.IdContext idCtx = switch (type) {
                case SUMM -> ((QuirklParser.SummationExpressionContext) ctx).id(idCount);
                case PRODSUMM -> ((QuirklParser.ProdSummationExpressionContext) ctx).id(idCount);
            };
            this.program.addError(QuirklDeclarationException.undeclaredVariable(idCtx));
            return null;
        }
        return program.getVariable(varName, this.visitor.getScope());
    }

    public TwoExpOperationExpression getTwoExpOperationExpression(QuirklCoordinate coord, QuirklParser.ExpressionContext expCtx1, QuirklParser.ExpressionContext expCtx2, TwoExpOperationExpression.OP op, AntlrToExpression visitor) {
        Expression exp1 = expCtx1.accept(visitor);
        if (exp1 == null)
            return null;
        Expression exp2 = expCtx2.accept(visitor);
        if (exp2 == null)
            return null;
        return new TwoExpOperationExpression(coord, exp1, exp2, op);
    }

    public TwoExpBooleanExpression getTwoExpBooleanExpression(QuirklCoordinate coord, QuirklParser.ExpressionContext expCtx1, QuirklParser.ExpressionContext expCtx2, TwoExpBooleanExpression.OP OP, AntlrToExpression visitor) {
        Expression exp1 = expCtx1.accept(visitor);
        if (exp1 == null)
            return null;
        Expression exp2 = expCtx2.accept(visitor);
        if (exp2 == null)
            return null;
        return new TwoExpBooleanExpression(coord, exp1, exp2, OP);
    }
}
