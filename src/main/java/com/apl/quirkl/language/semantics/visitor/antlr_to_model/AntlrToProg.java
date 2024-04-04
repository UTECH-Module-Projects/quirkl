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
        Prog prog = new Prog();
        Prog.setProg(prog);
        this.setProg(prog);
        AntlrToStmt antlrToStmt = new AntlrToStmt(prog);
        QuirklList<Stmt> stmts = prog.getStmts();
        for (QuirklParser.StatementContext statementContext : ctx.statement()) {
            Stmt stmt = statementContext.accept(antlrToStmt);
            if (stmt == null) return prog;
            stmts.add(stmt);
        }
        return prog;
    }
}
