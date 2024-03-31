package com.apl.quirkyfun.language.semantics.visitor.antlr_to_model.util;

import com.apl.quirkyfun.language.semantics.model.coordinate.QuirklCoordinate;
import org.antlr.v4.runtime.ParserRuleContext;

public class AntlrUtil {

    public static QuirklCoordinate getCoord(ParserRuleContext ctx) {
        int line = ctx.getStart().getLine();
        int pos = ctx.getStart().getCharPositionInLine();
        return new QuirklCoordinate(line, pos);
    }
}
