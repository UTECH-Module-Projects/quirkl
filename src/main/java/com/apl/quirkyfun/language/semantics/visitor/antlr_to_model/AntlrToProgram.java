package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.parser.QuirklParser;

public class AntlrToProgram extends AntlrToModel<Program> {

    @Override
    public Program visitProgram(QuirklParser.ProgramContext ctx) {
        return Program.INSTANCE;
    }
}
