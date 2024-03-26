package com.apl.quirkyfun.language.visitor;

import com.apl.quirkyfun.language.listener.QuirkyFunBaseListener;
import com.apl.quirkyfun.language.model.program.Program;
import com.apl.quirkyfun.language.parser.QuirkyFunParser;

import java.util.List;

public class AntlrToProgram extends QuirkyFunBaseVisitor<Program> {

    @Override
    public Program visitProgram(QuirkyFunParser.ProgramContext ctx) {
        return Program.INSTANCE;
    }
}
