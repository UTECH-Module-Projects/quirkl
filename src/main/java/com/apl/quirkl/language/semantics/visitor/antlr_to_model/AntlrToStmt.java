package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.semantics.model.expression.Exp;
import com.apl.quirkl.language.semantics.model.expression.FunctionCallExp;
import com.apl.quirkl.language.semantics.model.expression.FunctionExp;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.*;
import com.apl.quirkl.language.semantics.model.statement.if_statement.IfCondition;
import com.apl.quirkl.language.semantics.model.statement.if_statement.IfStmt;
import com.apl.quirkl.language.semantics.model.statement.loop.ForLoopStmt;
import com.apl.quirkl.language.semantics.model.statement.function.FuncCallStmt;
import com.apl.quirkl.language.semantics.model.statement.function.FuncStmt;
import com.apl.quirkl.language.semantics.model.statement.switch_statement.SwitchCaseStatement;
import com.apl.quirkl.language.semantics.model.statement.switch_statement.SwitchStmt;
import com.apl.quirkl.language.semantics.model.type.QuirklError;
import com.apl.quirkl.language.semantics.model.type.QuirklFunc;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.type.value.function.QuirklFuncValue;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor.AntlrToStmtProc;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

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
        System.out.println("visitVariableDeclaration: " + ctx.getText());
        System.out.println(this.scope);
        VariableStmt variableStmt = new VariableStmt(AntlrUtil.getCoord(ctx), this.scope);
        final String THIS_SCOPE = AntlrUtil.getObjAddress(variableStmt);

        Var<?> var = AntlrUtil.newVariable(prog, this.scope, ctx.id(), ctx.variableDataType().getText());
        if (var == null) return null;
        variableStmt.setVar(var);

        QuirklType.TYPE varType = QuirklType.toQuirklType(ctx.variableDataType().getText());
        var.setType(varType);

        Exp exp = null;
        QuirklParser.ExpressionContext expCtx = ctx.expression();
        if (!expCtx.isEmpty()) {
            exp = expCtx.accept(new AntlrToExp(prog, THIS_SCOPE));
            if (exp == null) return null;
        }
        variableStmt.setExp(exp);
        AntlrUtil.addToVariableContext(prog, var);
        return AntlrUtil.addToStatementContext(this.prog, variableStmt);
    }


    @Override
    public VariableStmt visitFunctionDeclaration(QuirklParser.FunctionDeclarationContext ctx) {
        System.out.println("visitFunctionDeclaration: " + ctx.getText());
        System.out.println(this.scope);
        VariableStmt variableStmt = new VariableStmt(AntlrUtil.getCoord(ctx), this.scope);
        final String THIS_SCOPE = AntlrUtil.getObjAddress(variableStmt);

        Var<?> var = AntlrUtil.newVariable(prog, this.scope, ctx.id(), ctx.FUNCTION_TYPE().getText());
        if (var == null) return null;
        variableStmt.setVar(var);

        QuirklParser.FunctionContext funcCtx = ctx.function();
        if (!funcCtx.isEmpty()) {
            QuirklFuncValue func = new AntlrToFunc(prog, THIS_SCOPE).visitFunction(funcCtx);
            if (func == null) return null;

            FunctionExp funcExp = new FunctionExp(AntlrUtil.getCoord(funcCtx), THIS_SCOPE, new QuirklFunc(func));
            variableStmt.setExp(funcExp);
            return AntlrUtil.addToStatementContext(this.prog, variableStmt);
        }

        return AntlrUtil.addToStatementContext(this.prog, variableStmt);
    }

    @Override
    public Stmt visitAssignmentStatement(QuirklParser.AssignmentStatementContext ctx) {
        return ctx.assignment().accept(this);
    }

    @Override
    public VariableStmt visitAssignment(QuirklParser.AssignmentContext ctx) {
        Var<?> var = AntlrUtil.getVariable(this.prog, this.scope, ctx.id());
        if (var == null) return null;

        QuirklParser.ExpressionContext expCtx = ctx.expression();
        Exp exp = expCtx.accept(new AntlrToExp(this.prog, this.scope));
        if (exp == null) return null;

        return AntlrUtil.addToStatementContext(this.prog, new VariableStmt(AntlrUtil.getCoord(ctx), this.scope, var, exp));
    }

    @Override
    public FuncCallStmt visitFunctionCallStatement(QuirklParser.FunctionCallStatementContext ctx) {
        FunctionCallExp exp = new AntlrToExp(this.prog, this.scope).visitFunctionCall(ctx.functionCall());
        if (exp == null) return null;
        return AntlrUtil.addToStatementContext(this.prog, new FuncCallStmt(AntlrUtil.getCoord(ctx), this.scope, exp.getFunc(), exp.getArguments()));
    }

    @Override
    public PrintStmt visitPrintStatement(QuirklParser.PrintStatementContext ctx) {
        Exp exp = ctx.expression().accept(new AntlrToExp(prog, this.scope));
        if (exp == null) return null;
        return AntlrUtil.addToStatementContext(this.prog, new PrintStmt(AntlrUtil.getCoord(ctx), this.scope, exp));
    }

    @Override
    public FuncStmt visitFunctionWithBodyStatement(QuirklParser.FunctionWithBodyStatementContext ctx) {
        QuirklFuncValue func = new AntlrToFunc(prog, this.scope).visitFunctionWithBody(ctx.functionWithBody());
        if (func == null) return null;
        return AntlrUtil.addToStatementContext(this.prog, new FuncStmt(AntlrUtil.getCoord(ctx), this.scope, new QuirklFunc(func)));
    }

    @Override
    public Stmt visitFunctionWithLambdaStatement(QuirklParser.FunctionWithLambdaStatementContext ctx) {
        System.out.println("visitFunctionWithLambdaStatement: " + ctx.getText());
        System.out.println(this.scope);
        QuirklFuncValue func = new AntlrToFunc(prog, this.scope).visitFunctionWithLambda(ctx.functionWithLambda());
        if (func == null) return null;
        return AntlrUtil.addToStatementContext(this.prog, new FuncStmt(AntlrUtil.getCoord(ctx), this.scope, new QuirklFunc(func)));
    }

    @Override
    public Stmt visitIfStatement(QuirklParser.IfStatementContext ctx) {
        IfCondition curCond = null;
        IfCondition firstCond = null;
        boolean flag = true;
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

        if (!ctx.statement().isEmpty()) {
            IfCondition lastCond = new IfCondition(AntlrUtil.getCoord(ctx), this.scope);
            QuirklList<Stmt> body = lastCond.getBody();
            AntlrToStmt antlrToStmt = new AntlrToStmt(this.prog, AntlrUtil.getObjAddress(lastCond));
            for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
                Stmt stmt = stmtCtx.accept(antlrToStmt);
                if (stmt == null) return null;
                body.add(stmt);
            }
            assert curCond != null;
            curCond.setNextCondition(lastCond);
        } else if (ctx.LBRACE().getText() != null) {
            assert curCond != null;
            curCond.setNextCondition(new IfCondition(AntlrUtil.getCoord(ctx), this.scope));
        }
        return AntlrUtil.addToStatementContext(this.prog, new IfStmt(AntlrUtil.getCoord(ctx), this.scope, firstCond));
    }

    @Override
    public IfCondition visitIfCondition(QuirklParser.IfConditionContext ctx) {
        ToBoolExp cond = new AntlrToExp(prog, this.scope).visitToBool(ctx.toBool());
        if (cond == null) return null;
        IfCondition ifCond = new IfCondition(AntlrUtil.getCoord(ctx), this.scope, cond);

        QuirklList<Stmt> body = ifCond.getBody();

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(ifCond));
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return AntlrUtil.addToStatementContext(this.prog, ifCond);
    }

    @Override
    public Stmt visitForLoop(QuirklParser.ForLoopContext ctx) {
        Stmt init = null;
        Stmt update = null;
        CatchStmt catchStmt = null;

        AntlrToExp expVisitor = new AntlrToExp(prog, this.scope);
        ToBoolExp cond = expVisitor.visitToBool(ctx.toBool());
        if (cond == null) return null;
        ForLoopStmt forLoopStmt = new ForLoopStmt(AntlrUtil.getCoord(ctx), this.scope, cond);

        if (!ctx.declaration().isEmpty()) {
            init = ctx.declaration().accept(this);
            if (init == null) return null;
        } else if (ctx.getChild(2) instanceof QuirklParser.ExpressionContext expCtx) {
            Exp exp = expCtx.accept(expVisitor);
            if (exp == null) return null;
            init = new ExpStmt(AntlrUtil.getCoord(expCtx), this.scope, exp);
        }
        forLoopStmt.setInit(init);

        if (!ctx.assignment().isEmpty()) {
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

        if (!ctx.catchBody().isEmpty()) {
            catchStmt = this.visitCatchBody(ctx.catchBody());
            if (catchStmt == null) return null;
        }
        forLoopStmt.setCatchStatement(catchStmt);

        return AntlrUtil.addToStatementContext(this.prog, forLoopStmt);
    }

    @Override
    @SuppressWarnings("unchecked")
    public CatchStmt visitCatchBody(QuirklParser.CatchBodyContext ctx) {
        Var<QuirklError> errVar = (Var<QuirklError>) AntlrUtil.newVariable(this.prog, this.scope, ctx.id(), QuirklType.TYPE.ERROR.toString());
        if (errVar == null) return null;
        CatchStmt catchStmt = new CatchStmt(AntlrUtil.getCoord(ctx), this.scope, this.prog, errVar);

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(catchStmt));
        QuirklList<Stmt> body = catchStmt.getBody();
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return AntlrUtil.addToStatementContext(this.prog, catchStmt);
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

        SwitchStmt switchStmt = new SwitchStmt(AntlrUtil.getCoord(ctx), this.scope, key);

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
        return AntlrUtil.addToStatementContext(this.prog, switchStmt);
    }

    @Override
    public SwitchCaseStatement visitSwitchCaseWithBody(QuirklParser.SwitchCaseWithBodyContext ctx) {
        SwitchCaseStatement switchCase = new SwitchCaseStatement(AntlrUtil.getCoord(ctx), this.scope);

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(switchCase));
        QuirklList<Stmt> body = switchCase.getBody();
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return AntlrUtil.addToStatementContext(this.prog, switchCase);
    }

    @Override
    public Stmt visitSwitchCaseWithLambda(QuirklParser.SwitchCaseWithLambdaContext ctx) {
        SwitchCaseStatement switchCase = new SwitchCaseStatement(AntlrUtil.getCoord(ctx), this.scope);

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(switchCase));
        QuirklList<Stmt> body = switchCase.getBody();
        Stmt stmt = ctx.statement().accept(antlrToStmt);
        body.add(stmt);

        return AntlrUtil.addToStatementContext(this.prog, switchCase);
    }

    @Override
    public Stmt visitRunCatch(QuirklParser.RunCatchContext ctx) {
        CatchStmt catchStmt = this.visitCatchBody(ctx.catchBody());
        if (catchStmt == null) return null;

        RunCatchStmt runCatchStmt = new RunCatchStmt(AntlrUtil.getCoord(ctx), this.scope, catchStmt);
        QuirklList<Stmt> body = runCatchStmt.getBody();
        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(runCatchStmt));
        for (QuirklParser.StatementContext stmtCtx : ctx.statement()) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }
        return AntlrUtil.addToStatementContext(this.prog, runCatchStmt);
    }
}
