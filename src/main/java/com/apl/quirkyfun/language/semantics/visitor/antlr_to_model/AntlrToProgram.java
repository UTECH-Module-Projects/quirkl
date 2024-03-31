package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.statement.Statement;

public class AntlrToProgram extends AntlrToModel<Program> {

    public AntlrToProgram(Program program) {
        super(program);
    }

    public AntlrToProgram(Program program, String scope) {
        super(program, scope);
    }

    @Override
    public Program visitProgram(QuirklParser.ProgramContext ctx) {
        Program program = new Program();
        AntlrToStatement antlrToStatement = new AntlrToStatement(program);
        for (QuirklParser.StatementContext statementContext : ctx.statement()) {
            Statement statement = statementContext.accept(antlrToStatement);
            if (statement == null) return program;
            program.addStatement(statement);
        }
        return program;
    }
}
