package com.apl.quirkl.language.semantics.visitor.antlr_to_model.util;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.openjdk.jol.vm.VM;

public class AntlrUtil {

    public static QuirklCoord getCoord(ParserRuleContext ctx) {
        int line = ctx.getStart().getLine();
        int pos = ctx.getStart().getCharPositionInLine();
        return new QuirklCoord(line, pos);
    }

    public static Var<?> getVariable(Prog prog, String scope, QuirklParser.IdContext ctx) {
        String varName = ctx.getText();
        System.out.println("Attempting to get variable: " + varName + " in scope: " + scope);
        Var<?> var = prog.getVar(varName, scope);

        if (var == null) {
            prog.addError(QuirklDeclarationException.undeclaredVariable(AntlrUtil.getCoord(ctx), varName));
            return null;
        }

        return var;
    }

    public static Var<?> newVariable(Prog prog, String scope, QuirklParser.IdContext ctx, String type) {
        String varName = ctx.getText();
        Var<?> var = prog.getVar(varName, scope);

        if (var != null) {
            prog.addError(QuirklDeclarationException.variableAlreadyDeclared(AntlrUtil.getCoord(ctx), var));
            return null;
        }
        var = new Var<>(AntlrUtil.getCoord(ctx), scope, varName);

        QuirklType.TYPE varType = QuirklType.toQuirklType(type);
        var.setType(varType);
        addToVariableContext(prog, var);
        return var;
    }

    public static String getObjAddress(Object obj) {
        return String.valueOf(VM.current().addressOf(obj));
    }

    public static <T extends Stmt> T addToStatementContext(Prog prog, T statement) {
        prog.addScopeStatement(statement, getObjAddress(statement));
        return statement;
    }

    public static <T extends Var<?>> T addToVariableContext(Prog prog, T variable) {
        prog.addVar(variable, variable.getScope());
        return variable;
    }
}
