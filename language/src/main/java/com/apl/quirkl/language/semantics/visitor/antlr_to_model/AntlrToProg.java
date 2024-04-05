package com.apl.quirkl.language.semantics.visitor.antlr_to_model;

import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.util.QuirklList;

public class AntlrToProg extends AntlrToModel<Prog> {

    public AntlrToProg() {
        super();
    }

    @Override
    public Prog visitProgram(QuirklParser.ProgramContext ctx) {
        AntlrToStmt antlrToStmt = new AntlrToStmt(Prog.GLOBAL_SCOPE);
        QuirklList<Stmt> stmts = Prog.INSTANCE.getStmts();
        for (QuirklParser.StatementContext statementContext : ctx.statement()) {
            Stmt stmt = statementContext.accept(antlrToStmt);
            if (stmt == null) return Prog.INSTANCE;
            stmts.add(stmt);
        }
        return Prog.INSTANCE;
    }
}
