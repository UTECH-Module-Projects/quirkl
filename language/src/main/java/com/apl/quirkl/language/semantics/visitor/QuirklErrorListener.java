package com.apl.quirkl.language.semantics.visitor;

import com.apl.quirkl.language.parser.QuirklParser;
import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil;
import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.getCoord;
import static com.apl.quirkl.language.semantics.visitor.antlr_to_model.util.AntlrUtil.isEmpty;

public class QuirklErrorListener extends BaseErrorListener {

    public static boolean hasError = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        hasError = true;

        ParserRuleContext ctx = ((Parser) recognizer).getRuleContext();
        StringBuilder str = new StringBuilder(String.format("QuirklSyntaxErrorException: %s->%s", msg, new QuirklCoord(line, charPositionInLine))).append("\n");
        while (!isEmpty(ctx) && !(ctx.getParent() instanceof QuirklParser.ProgramContext)) {
            String name = ctx.getClass().getSimpleName();
            str.append("\tat ").append(name, 0, name.length() - 7).append("->").append(getCoord(ctx)).append("\n");
            ctx = ctx.getParent();
        }
        System.err.println(str);
    }
}
