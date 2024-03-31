package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;

public class AntlrToVariable extends AntlrToModel<Variable> {
    public AntlrToVariable(Program program) {
        super(program);
    }

    public AntlrToVariable(Program program, String scope) {
        super(program, scope);
    }

    @Override
    public Variable visitParameter(QuirklParser.ParameterContext ctx) {
        String varName = ctx.id().getText();
        String varType = ctx.variableDataType().getText();
        Variable var = program.getVariable(varName, this.scope);
        int line = ctx.id().getStart().getLine();
        int pos = ctx.id().getStart().getCharPositionInLine();
        QuirklCoordinate coord = new QuirklCoordinate(line, pos);

        if (var != null) {
            this.program.addError(QuirklDeclarationException.variableAlreadyDeclared(var, coord));
            return null;
        }

        return new Variable(coord, QuirklType.getTypeAsQuirklName(varType), varName);
    }
}
