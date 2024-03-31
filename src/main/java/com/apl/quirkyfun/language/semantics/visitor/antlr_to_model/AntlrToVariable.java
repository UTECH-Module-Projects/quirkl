package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model;

import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.util.AntlrUtil;

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
        QuirklType.TYPE varType = QuirklType.toQuirklType(ctx.variableDataType().getText());
        Variable var = program.getVariable(varName, this.scope);
        QuirklCoord coord = AntlrUtil.getCoord(ctx);

        if (var != null) {
            this.program.addError(QuirklDeclarationException.variableAlreadyDeclared(coord, var));
            return null;
        }

        return new Variable(coord, varType, varName);
    }
}
