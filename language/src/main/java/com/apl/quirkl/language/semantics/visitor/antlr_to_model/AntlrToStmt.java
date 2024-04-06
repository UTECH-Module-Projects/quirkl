package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.FunctionCallExp;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.expression.operation.ShiftExp;
import com.apl.quirkl.language.semantics.model.statement.*;
import com.apl.quirkl.language.semantics.model.statement.if_statement.IfCondition;
import com.apl.quirkl.language.semantics.model.statement.if_statement.IfStmt;
import com.apl.quirkl.language.semantics.model.statement.loop.ForLoopStmt;
import com.apl.quirkl.language.semantics.model.statement.FuncCallStmt;
import com.apl.quirkl.language.semantics.model.statement.switch_statement.SwitchCaseStatement;
import com.apl.quirkl.language.semantics.model.statement.switch_statement.SwitchStmt;
import com.apl.quirkl.language.semantics.model.type.QuirklErr;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor.AntlrToStmtProc;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;
import lombok.Getter;

import java.util.Objects;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.*;

@Getter
public class AntlrToStmt extends AntlrToModel<Stmt> {

    private final AntlrToStmtProc proc;

    public AntlrToStmt(String scope) {
        super(scope);
        this.proc = new AntlrToStmtProc(this);
    }

    @Override
    public Stmt visitErrorStatement(QuirklParser.ErrorStatementContext ctx) {
        ErrorStmt errorStmt = addToScopeContext(new ErrorStmt(getCoord(ctx), this.scope));

        Exp exp = ctx.expression().accept(new AntlrToExp(this.scope));
        if (exp == null) return null;
        errorStmt.setExp(exp);

        return errorStmt;
    }

    @Override
    public Stmt visitIncrementStatement(QuirklParser.IncrementStatementContext ctx) {
        ShiftStmt incrementStmt = addToScopeContext(new ShiftStmt(getCoord(ctx), this.scope, ShiftExp.OP.INC));

        Var<?> var = getVariable(incrementStmt, ctx.id());
        if (var == null) return null;
        incrementStmt.setVar(var);

        return incrementStmt;
    }

    @Override
    public Stmt visitDecrementStatement(QuirklParser.DecrementStatementContext ctx) {
        ShiftStmt decrementStmt = addToScopeContext(new ShiftStmt(getCoord(ctx), this.scope, ShiftExp.OP.DEC));

        Var<?> var = getVariable(decrementStmt, ctx.id());
        if (var == null) return null;
        decrementStmt.setVar(var);

        return decrementStmt;
    }

    @Override
    public PrintStmt visitPrintStatement(QuirklParser.PrintStatementContext ctx) {
        PrintStmt printStmt = addToScopeContext(new PrintStmt(getCoord(ctx), this.scope));

        AntlrToExp antlrToExp = new AntlrToExp(this.scope);
        QuirklList<Exp> expressions = printStmt.getExpressions();
        for (QuirklParser.ExpressionContext expCtx : ctx.expression()) {
            Exp exp = expCtx.accept(antlrToExp);
            if (exp == null) return null;
            expressions.add(exp);
        }

        return printStmt;
    }

    @Override
    public Stmt visitDeclarationStatement(QuirklParser.DeclarationStatementContext ctx) {
        return ctx.declaration().accept(this);
    }

    @Override
    public VariableStmt visitVariableDeclaration(QuirklParser.VariableDeclarationContext ctx) {
        VariableStmt variableStmt = addToScopeContext(new VariableStmt(getCoord(ctx), this.scope, true));

        Var<?> var = newVariable(this.scope, variableStmt.getCoord(), ctx.variable_data_type().getText(), ctx.id());
        if (var == null) return null;
        variableStmt.setVar(var);

        Exp exp = null;
        QuirklParser.ExpressionContext expCtx = ctx.expression();
        if (!isEmpty(expCtx)) {
            exp = expCtx.accept(new AntlrToExp(this.scope));
            if (exp == null) return null;
        }
        variableStmt.setExp(exp);
        return variableStmt;
    }

    @Override
    public Stmt visitAssignmentStatement(QuirklParser.AssignmentStatementContext ctx) {
        return ctx.assignment().accept(this);
    }

    @Override
    public VariableStmt visitAssignment(QuirklParser.AssignmentContext ctx) {
        VariableStmt variableStmt = addToScopeContext(new VariableStmt(getCoord(ctx), this.scope, false));

        Var<?> var = getVariable(variableStmt, ctx.id());
        if (var == null) return null;
        variableStmt.setVar(var);

        QuirklParser.ExpressionContext expCtx = ctx.expression();
        Exp exp = expCtx.accept(new AntlrToExp(this.scope));
        if (exp == null) return null;
        variableStmt.setExp(exp);

        return variableStmt;
    }

    @Override
    public FuncCallStmt visitFunctionCallStatement(QuirklParser.FunctionCallStatementContext ctx) {
        FuncCallStmt funcCallStmt = addToScopeContext(new FuncCallStmt(getCoord(ctx), this.scope));

        FunctionCallExp exp = new AntlrToExp(this.scope).visitFunctionCall(ctx.functionCall());
        if (exp == null) return null;
        funcCallStmt.setVarFunc(exp.getVarFunc());
        funcCallStmt.setArguments(exp.getArguments());

        return funcCallStmt;
    }

    @Override
    public VariableStmt visitFunctionWithBodyStatement(QuirklParser.FunctionWithBodyStatementContext ctx) {
        final QuirklCoord coord = getCoord(ctx);

        VariableStmt variableStmt = addToScopeContext(new VariableStmt(coord, this.scope, true));

        AntlrToVar antlrToVar = new AntlrToVar(this.scope);
        Var<QuirklFunc> varFunc = antlrToVar.visitFunctionWithBody(ctx.functionWithBody());
        if (isEmpty(varFunc)) return null;
        variableStmt.setVar(varFunc);

        return variableStmt;
    }

    @Override
    public Stmt visitFunctionWithLambdaStatement(QuirklParser.FunctionWithLambdaStatementContext ctx) {
        VariableStmt variableStmt = addToScopeContext(new VariableStmt(getCoord(ctx), this.scope, true));

        AntlrToVar antlrToVar = new AntlrToVar(this.scope);
        Var<QuirklFunc> varFunc = antlrToVar.visitFunctionWithLambda(ctx.functionWithLambda());
        if (isEmpty(varFunc)) return null;
        variableStmt.setVar(varFunc);

        return variableStmt;
    }

    @Override
    public Stmt visitIfStatement(QuirklParser.IfStatementContext ctx) {
        IfStmt ifStmt = addToScopeContext(new IfStmt(getCoord(ctx), this.scope));

        IfCondition curCond = null;
        IfCondition firstCond = null;
        boolean flag = true;

        for (QuirklParser.IfConditionContext ifCtx : ctx.ifCondition()) {
            IfCondition ifCond = this.visitIfCondition(ifCtx);
            if (isEmpty(ifCond)) return null;
            if (!isEmpty(curCond)) {
                curCond.setNextCondition(ifCond);
            }
            curCond = ifCond;
            if (flag) {
                firstCond = ifCond;
                flag = false;
            }
        }
        ifStmt.setFirstCondition(firstCond);

        if (!ctx.statement().isEmpty()) {
            IfCondition lastCond = addToScopeContext(new IfCondition(getCoord(ctx), this.scope));
            QuirklList<Stmt> body = lastCond.getBody();
            AntlrToStmt antlrToStmt = new AntlrToStmt(AntlrUtil.getObjAddress(lastCond));
            for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
                Stmt stmt = stmtCtx.accept(antlrToStmt);
                if (isEmpty(stmt)) return null;
                body.add(stmt);
            }
            Objects.requireNonNull(curCond).setNextCondition(lastCond);
        }
        return ifStmt;
    }

    @Override
    public IfCondition visitIfCondition(QuirklParser.IfConditionContext ctx) {
        IfCondition ifCond = addToScopeContext(new IfCondition(getCoord(ctx), this.scope));

        ToBoolExp cond = new AntlrToExp(ifCond.getMyScope()).visitToBool(ctx.toBool());
        if (isEmpty(cond)) return null;
        ifCond.setCondition(cond);

        QuirklList<Stmt> body = ifCond.getBody();

        AntlrToStmt antlrToStmt = new AntlrToStmt(ifCond.getMyScope());
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (isEmpty(stmt)) return null;
            body.add(stmt);
        }
        return ifCond;
    }

    @Override
    public Stmt visitForLoop(QuirklParser.ForLoopContext ctx) {
        ForLoopStmt forLoopStmt = addToScopeContext(new ForLoopStmt(getCoord(ctx), this.scope));
        AntlrToExp expVisitor = new AntlrToExp(forLoopStmt.getMyScope());

        Stmt init = null;
        Stmt update = null;
        CatchStmt catchStmt = null;

        if (!isEmpty(ctx.declaration())) {
            init = ctx.declaration().accept(new AntlrToStmt(expVisitor.getScope()));
            if (init == null) return null;
        } else if (ctx.getChild(2) instanceof QuirklParser.ExpressionContext expCtx) {
            Exp exp = expCtx.accept(expVisitor);
            if (exp == null) return null;
            init = new ExpStmt(getCoord(expCtx), forLoopStmt.getMyScope(), exp);
        }
        forLoopStmt.setInit(init);

        ToBoolExp cond = expVisitor.visitToBool(ctx.toBool());
        if (cond == null) return null;
        forLoopStmt.setCondition(cond);

        if (!isEmpty(ctx.assignment())) {
            update = ctx.assignment().accept(this);
            if (isEmpty(update)) return null;
        } else if (ctx.getChild(6) instanceof QuirklParser.ExpressionContext expCtx) {
            Exp exp = expCtx.accept(expVisitor);
            if (exp == null) return null;
            update = new ExpStmt(getCoord(expCtx), forLoopStmt.getMyScope(), exp);
        } else if (ctx.getChild(5) instanceof QuirklParser.ExpressionContext expCtx) {
            Exp exp = expCtx.accept(expVisitor);
            if (isEmpty(exp)) return null;
            update = new ExpStmt(getCoord(expCtx), forLoopStmt.getMyScope(), exp);
        }
        forLoopStmt.setUpdate(update);

        AntlrToStmt antlrToStmt = new AntlrToStmt(AntlrUtil.getObjAddress(forLoopStmt));
        QuirklList<Stmt> body = forLoopStmt.getBody();
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (isEmpty(stmt)) return null;
            body.add(stmt);
        }

        if (!isEmpty(ctx.catchBody())) {
            catchStmt = this.visitCatchBody(ctx.catchBody());
            if (catchStmt == null) return null;
        }
        forLoopStmt.setCatchStatement(catchStmt);

        return forLoopStmt;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CatchStmt visitCatchBody(QuirklParser.CatchBodyContext ctx) {
        CatchStmt catchStmt = addToScopeContext(new CatchStmt(getCoord(ctx), this.scope));
        AntlrToStmt antlrToStmt = new AntlrToStmt(catchStmt.getMyScope());

        Var<QuirklErr> errVar = (Var<QuirklErr>) newVariable(catchStmt.getMyScope(), catchStmt.getCoord(), QuirklType.TYPE.ERROR.getSimpleType(), ctx.id());
        if (isEmpty(errVar)) return null;
        catchStmt.setErrVar(errVar);

        QuirklList<Stmt> body = catchStmt.getBody();
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return catchStmt;
    }

    @Override
    public Stmt visitWhileLoop(QuirklParser.WhileLoopContext ctx) {
        System.out.println(ctx.getText());

        return this.proc.getWhileLoopStmt(ctx, false);
    }

    @Override
    public Stmt visitDoWhileLoop(QuirklParser.DoWhileLoopContext ctx) {
        return this.proc.getWhileLoopStmt(ctx, true);
    }

    @Override
    public SwitchStmt visitSwitch(QuirklParser.SwitchContext ctx) {
        SwitchStmt switchStmt = addToScopeContext(new SwitchStmt(getCoord(ctx), this.scope));

        AntlrToExp antlrToExp = new AntlrToExp(switchStmt.getMyScope());
        Exp key = ctx.expression(0).accept(new AntlrToExp(this.scope));
        if (key == null) return null;
        switchStmt.setKey(key);

        QuirklList<SwitchCaseStatement> cases = switchStmt.getCases();
        AntlrToStmt antlrToStmt = new AntlrToStmt(AntlrUtil.getObjAddress(switchStmt));
        for (int i = 1; i < ctx.expression().size(); i++) {
            Exp match = ctx.expression(i).accept(antlrToExp);
            if (match == null) return null;

            SwitchCaseStatement switchCase = (SwitchCaseStatement) ctx.switchCase(i - 1).accept(antlrToStmt);
            if (switchCase == null) return null;

            switchCase.setMatch(match);
            cases.add(switchCase);
        }

        if (ctx.expression().size() == ctx.switchCase().size()) {
            SwitchCaseStatement defaultCase = (SwitchCaseStatement) ctx.switchCase(ctx.switchCase().size() - 1).accept(antlrToStmt);
            if (defaultCase == null) return null;
            switchStmt.setDefaultCase(defaultCase);
        }
        return switchStmt;
    }

    @Override
    public SwitchCaseStatement visitSwitchCaseWithBody(QuirklParser.SwitchCaseWithBodyContext ctx) {
        SwitchCaseStatement switchCase = addToScopeContext(new SwitchCaseStatement(getCoord(ctx), this.scope));

        AntlrToStmt antlrToStmt = new AntlrToStmt(switchCase.getMyScope());
        QuirklList<Stmt> body = switchCase.getBody();
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return switchCase;
    }

    @Override
    public Stmt visitSwitchCaseWithLambda(QuirklParser.SwitchCaseWithLambdaContext ctx) {
        SwitchCaseStatement switchCase = addToScopeContext(new SwitchCaseStatement(getCoord(ctx), this.scope));

        AntlrToStmt antlrToStmt = new AntlrToStmt(switchCase.getMyScope());
        QuirklList<Stmt> body = switchCase.getBody();
        Stmt stmt = ctx.statement().accept(antlrToStmt);
        body.add(stmt);

        return switchCase;
    }

    @Override
    public Stmt visitRunCatch(QuirklParser.RunCatchContext ctx) {
        CatchStmt catchStmt = this.visitCatchBody(ctx.catchBody());
        if (catchStmt == null) return null;

        RunCatchStmt runCatchStmt = addToScopeContext(new RunCatchStmt(getCoord(ctx), this.scope, catchStmt));
        QuirklList<Stmt> body = runCatchStmt.getBody();
        AntlrToStmt antlrToStmt = new AntlrToStmt(runCatchStmt.getMyScope());
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return runCatchStmt;
    }
}
