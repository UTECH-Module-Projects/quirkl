package com.apl.quirkl.language.semantics.visitor.antlr_to_model.util;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.variable.Var;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.AntlrToModel;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.compile.QuirklDeclarationException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.openjdk.jol.vm.VM;

import static com.apl.quirkl.language.semantics.model.type.QuirklType.toQuirklType;

public class AntlrUtil {

    public static boolean isEmpty(Object obj) {
        //Check if Object is Null
        return obj == null;
    }

    public static String getObjAddress(Object obj) {
        return String.valueOf(VM.current().addressOf(obj));
    }

    public static QuirklCoord getCoord(ParserRuleContext ctx) {
        //Get Line and Position
        int line = ctx.getStart().getLine();
        int pos = ctx.getStart().getCharPositionInLine();

        //Return Coordinate
        return new QuirklCoord(line, pos);
    }

    public static <T extends ProgTerm> T addToScopeContext(Prog prog, T term) {
        prog.addScopeTerm(term, getObjAddress(term));
        return term;
    }

    public static <T extends Var<?>> T addToVariableContext(Prog prog, T variable) {
        prog.addVar(variable, variable.getScope());
        return variable;
    }

    public static Var<?> getVariable(AntlrToModel<?> visitor, QuirklParser.IdContext ctx) {
        //Check if Variable has a name (anonymous functions have no name)
        if (isEmpty(ctx))
            return null;

        //Get Program and Scope
        Prog prog = visitor.getProg();
        String scope = visitor.getScope();

        //Get Variable
        String varName = ctx.getText();
        Var<?> var = prog.getVarAllScope(varName, scope);

        //Check if Variable is not declared
        if (isEmpty(var)) {
            prog.addError(QuirklDeclarationException.undeclaredVariable(AntlrUtil.getCoord(ctx), varName));
            return null;
        }

        return var;
    }

    public static Var<?> newVariable(AntlrToModel<?> visitor, QuirklCoord coord, String type, QuirklParser.IdContext idCtx) {
        //Define Variable
        Var<?> var;

        //Get Program and Scope
        Prog prog = visitor.getProg();
        String scope = visitor.getScope();

        //Check if Variable has an ID
        boolean hasID = !isEmpty(idCtx);

        //Check if Variable has an ID
        if (hasID) {
            //Get Variable Name
            var = prog.getVar(idCtx.getText(), scope);

            //Check if Variable is declared
            if (!isEmpty(var)) {
                prog.addError(QuirklDeclarationException.variableAlreadyDeclared(coord, var));
                return null;
            }
        }

        //Create Variable
        var = new Var<>(coord, scope);

        //Set Variable ID
        var.setId(hasID ? idCtx.getText() : getObjAddress(var));
        var.setType(toQuirklType(type));

        //Add Variable to Context and Return Variable
        addToScopeContext(prog, var);
        return addToVariableContext(prog, var);
    }




}
