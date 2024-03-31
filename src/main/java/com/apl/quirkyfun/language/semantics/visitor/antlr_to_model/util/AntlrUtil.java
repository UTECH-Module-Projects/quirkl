package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.util;

import com.apl.quirkyfun.language.parser.QuirklParser;
import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkyfun.language.semantics.model.program.Program;
import com.apl.quirkyfun.language.semantics.model.type.QuirklType;
import com.apl.quirkyfun.language.semantics.model.variable.Variable;
import com.apl.quirkyfun.language.semantics.model.variable.function.Function;
import com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import org.antlr.v4.runtime.ParserRuleContext;

public class AntlrUtil {

    public static QuirklCoord getCoord(ParserRuleContext ctx) {
        int line = ctx.getStart().getLine();
        int pos = ctx.getStart().getCharPositionInLine();
        return new QuirklCoord(line, pos);
    }

    public static Variable getVariable(Program program, String scope, QuirklParser.IdContext ctx) {
        String varName = ctx.getText();
        Variable var = program.getVariable(varName, scope);

        if (var == null) {
            program.addError(QuirklDeclarationException.undeclaredVariable(AntlrUtil.getCoord(ctx), varName));
            return null;
        }

        return var;
    }

    public static Variable newVariable(Program program, String scope, QuirklParser.IdContext ctx, String type) {
        String varName = ctx.getText();
        Variable var = program.getVariable(varName, scope);

        if (var != null) {
            program.addError(QuirklDeclarationException.variableAlreadyDeclared(AntlrUtil.getCoord(ctx), var));
            return null;
        }
        var = new Variable(AntlrUtil.getCoord(ctx), varName);

        QuirklType.TYPE varType = QuirklType.toQuirklType(type);
        var.setType(varType);
        program.addVariable(var, scope);
        return var;
    }
}
