package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.FunctionCallExp;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.*;
import com.apl.quirkl.language.semantics.model.statement.if_statement.IfCondition;
import com.apl.quirkl.language.semantics.model.statement.if_statement.IfStmt;
import com.apl.quirkl.language.semantics.model.statement.loop.ForLoopStmt;
import com.apl.quirkl.language.semantics.model.statement.FuncCallStmt;
import com.apl.quirkl.language.semantics.model.statement.switch_statement.SwitchCaseStatement;
import com.apl.quirkl.language.semantics.model.statement.switch_statement.SwitchStmt;
import com.apl.quirkl.language.semantics.model.type.QuirklError;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor.AntlrToStmtProc;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;
import lombok.Getter;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.*;

@Getter
public class AntlrToStmt extends AntlrToModel<Stmt> {

    private final AntlrToStmtProc proc;

    public AntlrToStmt(Prog prog) {
        super(prog);
        this.proc = new AntlrToStmtProc(prog, this);
    }

    public AntlrToStmt(Prog prog, String scope) {
        super(prog, scope);
        this.proc = new AntlrToStmtProc(prog, this);
    }

    @Override
    public Stmt visitDeclarationStatement(QuirklParser.DeclarationStatementContext ctx) {
        return ctx.declaration().accept(this);
    }

    @Override
    public VariableStmt visitVariableDeclaration(QuirklParser.VariableDeclarationContext ctx) {
        //Get Coordinate
        final QuirklCoord coord = AntlrUtil.getCoord(ctx);

        //Define Variable Statement
        VariableStmt variableStmt = addToScopeContext(this.prog, new VariableStmt(coord, this.scope));
        final String varScope = AntlrUtil.getObjAddress(variableStmt);

        Var<?> var = newVariable(this, coord, ctx.variable_data_type().getText(), ctx.id());
        if (var == null) return null;
        variableStmt.setVar(var);

        Exp exp = null;
        QuirklParser.ExpressionContext expCtx = ctx.expression();
        if (expCtx != null) {
            exp = expCtx.accept(new AntlrToExp(prog, varScope));
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
        Var<?> var = getVariable(this, ctx.id());
        if (var == null) return null;

        QuirklParser.ExpressionContext expCtx = ctx.expression();
        Exp exp = expCtx.accept(new AntlrToExp(this.prog, this.scope));
        if (exp == null) return null;

        return addToScopeContext(this.prog, new VariableStmt(AntlrUtil.getCoord(ctx), this.scope, var, exp));
    }

    @Override
    public FuncCallStmt visitFunctionCallStatement(QuirklParser.FunctionCallStatementContext ctx) {
        FunctionCallExp exp = new AntlrToExp(this.prog, this.scope).visitFunctionCall(ctx.functionCall());
        if (exp == null) return null;
        return addToScopeContext(this.prog, new FuncCallStmt(AntlrUtil.getCoord(ctx), this.scope, exp.getVarFunc(), exp.getArguments()));
    }

    @Override
    public PrintStmt visitPrintStatement(QuirklParser.PrintStatementContext ctx) {
        Exp exp = ctx.expression().accept(new AntlrToExp(prog, this.scope));
        if (exp == null) return null;
        return addToScopeContext(this.prog, new PrintStmt(AntlrUtil.getCoord(ctx), this.scope, exp));
    }

    @Override
    public VariableStmt visitFunctionWithBodyStatement(QuirklParser.FunctionWithBodyStatementContext ctx) {
        final QuirklCoord coord = AntlrUtil.getCoord(ctx);

        VariableStmt variableStmt = addToScopeContext(this.prog, new VariableStmt(coord, this.scope));

        AntlrToVar antlrToVar = new AntlrToVar(this.prog, this.scope);
        Var<QuirklFunc> varFunc = antlrToVar.visitFunctionWithBody(ctx.functionWithBody());
        if (isEmpty(varFunc)) return null;
        variableStmt.setVar(varFunc);

        return variableStmt;
    }

    @Override
    public Stmt visitFunctionWithLambdaStatement(QuirklParser.FunctionWithLambdaStatementContext ctx) {
        final QuirklCoord coord = AntlrUtil.getCoord(ctx);

        VariableStmt variableStmt = addToScopeContext(this.prog, new VariableStmt(coord, this.scope));

        AntlrToVar antlrToVar = new AntlrToVar(this.prog, this.scope);
        Var<QuirklFunc> varFunc = antlrToVar.visitFunctionWithLambda(ctx.functionWithLambda());
        if (isEmpty(varFunc)) return null;
        variableStmt.setVar(varFunc);

        return variableStmt;
    }

    @Override
    public Stmt visitIfStatement(QuirklParser.IfStatementContext ctx) {
        IfCondition curCond = null;
        IfCondition firstCond = null;
        boolean flag = true;
        IfStmt ifStmt = addToScopeContext(this.prog, new IfStmt(AntlrUtil.getCoord(ctx), this.scope));
        for (QuirklParser.IfConditionContext ifCtx : ctx.ifCondition()) {
            IfCondition ifCond = this.visitIfCondition(ifCtx);
            if (ifCond == null) return null;
            if (curCond != null) {
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
            IfCondition lastCond = addToScopeContext(this.prog, new IfCondition(AntlrUtil.getCoord(ctx), this.scope));
            QuirklList<Stmt> body = lastCond.getBody();
            AntlrToStmt antlrToStmt = new AntlrToStmt(this.prog, AntlrUtil.getObjAddress(lastCond));
            for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
                Stmt stmt = stmtCtx.accept(antlrToStmt);
                if (stmt == null) return null;
                body.add(stmt);
            }
            assert curCond != null;
            curCond.setNextCondition(lastCond);
        }
        return ifStmt;
    }

    @Override
    public IfCondition visitIfCondition(QuirklParser.IfConditionContext ctx) {
        ToBoolExp cond = new AntlrToExp(prog, this.scope).visitToBool(ctx.toBool());
        if (cond == null) return null;
        IfCondition ifCond = addToScopeContext(this.prog, new IfCondition(AntlrUtil.getCoord(ctx), this.scope, cond));

        QuirklList<Stmt> body = ifCond.getBody();

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(ifCond));
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return ifCond;
    }

    @Override
    public Stmt visitForLoop(QuirklParser.ForLoopContext ctx) {
        Stmt init = null;
        Stmt update = null;
        CatchStmt catchStmt = null;

        ForLoopStmt forLoopStmt = addToScopeContext(this.prog, new ForLoopStmt(AntlrUtil.getCoord(ctx), this.scope));
        AntlrToExp expVisitor = new AntlrToExp(prog, getObjAddress(forLoopStmt));

        if (ctx.declaration() != null) {
            init = ctx.declaration().accept(new AntlrToStmt(this.prog, expVisitor.getScope()));
            if (init == null) return null;
        } else if (ctx.getChild(2) instanceof QuirklParser.ExpressionContext expCtx) {
            Exp exp = expCtx.accept(expVisitor);
            if (exp == null) return null;
            init = new ExpStmt(AntlrUtil.getCoord(expCtx), this.scope, exp);
        }
        forLoopStmt.setInit(init);

        ToBoolExp cond = expVisitor.visitToBool(ctx.toBool());
        if (cond == null) return null;
        forLoopStmt.setCondition(cond);

        if (ctx.assignment() != null) {
            update = ctx.assignment().accept(this);
            if (update == null) return null;
        } else if (ctx.getChild(6) instanceof QuirklParser.ExpressionContext expCtx) {
            Exp exp = expCtx.accept(expVisitor);
            if (exp == null) return null;
            update = new ExpStmt(AntlrUtil.getCoord(expCtx), this.scope, exp);
        } else if (ctx.getChild(5) instanceof QuirklParser.ExpressionContext expCtx) {
            Exp exp = expCtx.accept(expVisitor);
            if (exp == null) return null;
            update = new ExpStmt(AntlrUtil.getCoord(expCtx), this.scope, exp);
        }
        forLoopStmt.setUpdate(update);

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(forLoopStmt));
        QuirklList<Stmt> body = forLoopStmt.getBody();
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }

        if (ctx.catchBody() != null) {
            catchStmt = this.visitCatchBody(ctx.catchBody());
            if (catchStmt == null) return null;
        }
        forLoopStmt.setCatchStatement(catchStmt);

        return forLoopStmt;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CatchStmt visitCatchBody(QuirklParser.CatchBodyContext ctx) {
        final QuirklCoord coord = AntlrUtil.getCoord(ctx);
        CatchStmt catchStmt = addToScopeContext(this.prog, new CatchStmt(coord, this.scope));
        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, catchStmt.getMyScope());

        Var<QuirklError> errVar = (Var<QuirklError>) newVariable(antlrToStmt, coord, QuirklType.TYPE.ERROR.getSimpleType(), ctx.id());
        if (errVar == null) return null;
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
    public Stmt visitErrorStatement(QuirklParser.ErrorStatementContext ctx) {
        Exp exp = ctx.expression().accept(new AntlrToExp(prog, this.scope));
        if (exp == null) return null;
        return addToScopeContext(this.prog, new ErrorStmt(AntlrUtil.getCoord(ctx), this.scope, exp));
    }

    @Override
    public Stmt visitWhileLoop(QuirklParser.WhileLoopContext ctx) {
        return this.proc.getWhileLoopStmt(ctx, false);
    }

    @Override
    public Stmt visitDoWhileLoop(QuirklParser.DoWhileLoopContext ctx) {
        return this.proc.getWhileLoopStmt(ctx, true);
    }

    @Override
    public SwitchStmt visitSwitch(QuirklParser.SwitchContext ctx) {
        AntlrToExp antlrToExp = new AntlrToExp(prog, this.scope);
        Exp key = ctx.expression(0).accept(new AntlrToExp(prog, this.scope));
        if (key == null) return null;

        SwitchStmt switchStmt = addToScopeContext(this.prog, new SwitchStmt(AntlrUtil.getCoord(ctx), this.scope, key));

        QuirklList<SwitchCaseStatement> cases = switchStmt.getCases();
        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(switchStmt));
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
        SwitchCaseStatement switchCase = addToScopeContext(this.prog, new SwitchCaseStatement(AntlrUtil.getCoord(ctx), this.scope));

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(switchCase));
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
        SwitchCaseStatement switchCase = addToScopeContext(this.prog, new SwitchCaseStatement(AntlrUtil.getCoord(ctx), this.scope));

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(switchCase));
        QuirklList<Stmt> body = switchCase.getBody();
        Stmt stmt = ctx.statement().accept(antlrToStmt);
        body.add(stmt);

        return switchCase;
    }

    @Override
    public Stmt visitRunCatch(QuirklParser.RunCatchContext ctx) {
        CatchStmt catchStmt = this.visitCatchBody(ctx.catchBody());
        if (catchStmt == null) return null;

        RunCatchStmt runCatchStmt = addToScopeContext(this.prog, new RunCatchStmt(AntlrUtil.getCoord(ctx), this.scope, catchStmt));
        QuirklList<Stmt> body = runCatchStmt.getBody();
        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(runCatchStmt));
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return runCatchStmt;
    }
}
