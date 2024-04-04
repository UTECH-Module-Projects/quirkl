package com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.parser.QuirklParser.ExpressionContext;
import com.apl.quirkl.language.parser.QuirklParser.IdContext;
import com.apl.quirkl.language.parser.QuirklParser.ParametersContext;
import com.apl.quirkl.language.parser.QuirklParser.StatementContext;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToExp;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToStmt;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToVar;
import lombok.SneakyThrows;

import java.util.List;

import static com.apl.quirkl.language.semantics.model.type.QuirklType.toQuirklType;
import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.getObjAddress;
import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.isEmpty;

public class AntlrToVarProc extends AntlrToModelProc<Var<?>, AntlrToVar> {
    public AntlrToVarProc(Prog prog, AntlrToVar visitor) {
        super(prog, visitor);
    }

    @SneakyThrows
    public Var<QuirklFunc> getFuncVar(Var<QuirklFunc> funcVar, ParametersContext parametersCtx, IdContext idCtx, String type, List<StatementContext> statementsCtx, ExpressionContext returnExpCtx) {
        String varScope = getObjAddress(funcVar);

        //Define Function Value
        QuirklFuncValue func = new QuirklFuncValue(funcVar.getCoord(), funcVar.getScope(), funcVar.getId(), toQuirklType(type), isEmpty(idCtx));
        funcVar.setValue(new QuirklFunc(func));

        //Add Parameters
        AntlrToVar antlrToVar = new AntlrToVar(this.prog, varScope);
        QuirklList<Var<?>> parameters = func.getParameters();
        for (var parameterCtx : parametersCtx.parameter()) {
            Var<?> parameter = antlrToVar.visitParameter(parameterCtx);
            if (isEmpty(parameter)) return null;
            parameters.add(parameter);
        }

        //Check if Function has a Body
        if (!isEmpty(statementsCtx)) {
            //Add Statements
            AntlrToStmt antlrToStmt = new AntlrToStmt(this.prog, varScope);
            QuirklList<Stmt> stmts = func.getBody().getStmts();
            for (var statementCtx : statementsCtx) {
                Stmt statement = statementCtx.accept(antlrToStmt);
                if (isEmpty(statement)) return null;
                stmts.add(statement);
            }
        }

        if (!isEmpty(returnExpCtx)) {
            //Add Return Expression
            AntlrToExp antlrToExp = new AntlrToExp(this.prog, varScope);
            Exp returnExp = returnExpCtx.accept(antlrToExp);
            if (isEmpty(returnExp)) return null;
            func.getBody().setReturnExp(returnExp);
        }

        return funcVar;
    }
}
