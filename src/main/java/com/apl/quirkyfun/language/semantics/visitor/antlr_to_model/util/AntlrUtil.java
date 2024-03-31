package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.util;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoord;
import org.antlr.v4.runtime.ParserRuleContext;

public class AntlrUtil {

    public static QuirklCoord getCoord(ParserRuleContext ctx) {
        int line = ctx.getStart().getLine();
        int pos = ctx.getStart().getCharPositionInLine();
        return new QuirklCoord(line, pos);
    }
}
