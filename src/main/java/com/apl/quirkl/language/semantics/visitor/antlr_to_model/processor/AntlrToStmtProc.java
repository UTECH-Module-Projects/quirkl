package com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.CatchStmt;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.statement.loop.WhileLoopStmt;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToExp;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToStmt;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

import java.util.List;

public class AntlrToStmtProc extends AntlrToModelProc<Stmt, AntlrToStmt> {

    public AntlrToStmtProc(Prog prog, AntlrToStmt visitor) {
        super(prog, visitor);
    }

    public WhileLoopStmt getWhileLoopStmt(QuirklParser.StatementContext ctx, boolean isDoWhile) {
        CatchStmt catchStmt = null;

        AntlrToExp expVisitor = new AntlrToExp(prog, this.visitor.getScope());
        QuirklParser.ToBoolContext toBoolCtx = isDoWhile ? ((QuirklParser.WhileLoopContext) ctx).toBool() : ((QuirklParser.DoWhileLoopContext) ctx).toBool();
        ToBoolExp cond = expVisitor.visitToBool(toBoolCtx);
        if (cond == null) return null;
        WhileLoopStmt whileLoopStmt = new WhileLoopStmt(AntlrUtil.getCoord(ctx), this.visitor.getScope(), false, cond);

        AntlrToStmt antlrToStmt = new AntlrToStmt(prog, AntlrUtil.getObjAddress(whileLoopStmt));
        List<QuirklParser.StatementContext> stmtCtxList = isDoWhile ? ((QuirklParser.WhileLoopContext) ctx).statement() : ((QuirklParser.DoWhileLoopContext) ctx).statement();
        QuirklList<Stmt> body = whileLoopStmt.getBody();
        for (QuirklParser.StatementContext stmtCtx : stmtCtxList) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }

        QuirklParser.CatchBodyContext catchCtx = isDoWhile ? ((QuirklParser.WhileLoopContext) ctx).catchBody() : ((QuirklParser.DoWhileLoopContext) ctx).catchBody();
        if (catchCtx != null) {
            catchStmt = this.visitor.visitCatchBody(catchCtx);
            if (catchStmt == null) return null;
        }
        whileLoopStmt.setCatchStatement(catchStmt);

        return AntlrUtil.addToScopeContext(this.prog, whileLoopStmt);
    }
}
