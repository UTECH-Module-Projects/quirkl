package com.apl.quirkl.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.expression.ToBoolExp;
import com.apl.quirkl.language.semantics.model.statement.CatchStmt;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.statement.loop.WhileLoopStmt;
import com.apl.quirkl.language.semantics.model.util.QuirklList;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToExp;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToStmt;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

import java.util.List;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.addToScopeContext;

public class AntlrToStmtProc extends AntlrToModelProc<Stmt, AntlrToStmt> {

    public AntlrToStmtProc(AntlrToStmt visitor) {
        super(visitor);
    }

    public WhileLoopStmt getWhileLoopStmt(QuirklParser.StatementContext ctx, boolean isDoWhile) {
        WhileLoopStmt whileLoopStmt = addToScopeContext(new WhileLoopStmt(AntlrUtil.getCoord(ctx), this.visitor.getScope(), false));
        CatchStmt catchStmt = null;

        AntlrToExp expVisitor = new AntlrToExp(this.visitor.getScope());
        QuirklParser.ToBoolContext toBoolCtx = isDoWhile ? ((QuirklParser.DoWhileLoopContext) ctx).toBool() : ((QuirklParser.WhileLoopContext) ctx).toBool();
        ToBoolExp cond = expVisitor.visitToBool(toBoolCtx);
        if (cond == null) return null;
        whileLoopStmt.setCondition(cond);

        AntlrToStmt antlrToStmt = new AntlrToStmt(AntlrUtil.getObjAddress(whileLoopStmt));
        List<QuirklParser.StatementContext> stmtCtxList = isDoWhile ? ((QuirklParser.DoWhileLoopContext) ctx).statement() : ((QuirklParser.WhileLoopContext) ctx).statement();
        QuirklList<Stmt> body = whileLoopStmt.getBody();
        for (QuirklParser.StatementContext stmtCtx : stmtCtxList) {
            Stmt stmt = stmtCtx.accept(antlrToStmt);
            if (stmt == null) return null;
            body.add(stmt);
        }

        QuirklParser.CatchBodyContext catchCtx = isDoWhile ? ((QuirklParser.DoWhileLoopContext) ctx).catchBody() : ((QuirklParser.WhileLoopContext) ctx).catchBody();
        if (catchCtx != null) {
            catchStmt = this.visitor.visitCatchBody(catchCtx);
            if (catchStmt == null) return null;
        }
        whileLoopStmt.setCatchStatement(catchStmt);

        return whileLoopStmt;
    }
}
