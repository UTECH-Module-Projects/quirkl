package com.apl.quirkyfun.language.visitor;

import com.apl.quirkyfun.language.listener.QuirkyFunBaseListener;
import com.apl.quirkyfun.language.model.expression.Expression;
import com.apl.quirkyfun.language.model.program.Program;
import com.apl.quirkyfun.language.model.statement.Statement;
import com.apl.quirkyfun.language.model.statement.declaration.VariableDeclaration;
import com.apl.quirkyfun.language.model.type.QuirkyType;
import com.apl.quirkyfun.language.model.variable.Variable;
import com.apl.quirkyfun.language.parser.QuirkyFunParser;
import org.antlr.v4.runtime.Token;

public class AntlrToStatement extends QuirkyFunBaseVisitor<Statement> {

    public String genVarDecExcMsg(String variable, int line, int column) {
        return String.format("Variable %s already declared at line (%d, %d)", variable, line, column);
    }

    @Override
    public Statement visitVariableDeclaration(QuirkyFunParser.VariableDeclarationContext ctx) {
        Program program = Program.INSTANCE;
        QuirkyFunParser.IdContext idContext = ctx.id();
        String varName = ctx.id().getText();
        Variable var;
        Expression exp = null;

        if (program.hasVariable(varName)) {
            Token idToken = idContext.LETTER().getFirst().getSymbol();
            int line = idToken.getLine();
            int column = idToken.getCharPositionInLine();
            program.addError(this.genVarDecExcMsg(varName, line, column));
            return null;
        }
        var = this.program.getVariable(varName);
        String varType = ctx.variable_data_type().getText();
        String assign = ctx.ASSIGN().getText();
        if (assign.isEmpty()) {
            var = new Variable(varName, varType);
            program.addVariable(var);
        } else {
            ctx.expression().accept(new AntlrToExpression());
            //TODO: Fix this
            exp = ctx.expression().accept(new AntlrToExpression());
            program.addVariable(var);
        }
        return new VariableDeclaration(var, exp);
    }
}
