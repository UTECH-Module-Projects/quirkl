package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.processor;

import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.AntlrToFunction;
import lombok.Getter;

public class AntlrToFunctionProcessor {
    private final Program program;
    private final AntlrToFunction visitor;

    public AntlrToFunctionProcessor(Program program, AntlrToFunction visitor) {
        this.program = program;
        this.visitor = visitor;
    }
}
