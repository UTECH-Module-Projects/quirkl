package com.apl.quirkl.language.semantics.model.type.value;

import com.apl.quirkl.language.semantics.model.ProgTerm;
import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.QuirklException;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class QuirklErrValue {
    private String errMsg;
    private String errType;
    private QuirklCoord coord;
    private String trace;

    public QuirklErrValue() {
        this.errMsg = "";
        this.errType = "";
        this.coord = new QuirklCoord();
        this.trace = "";
    }

    @SneakyThrows
    public QuirklErrValue(QuirklException e) {
        this.errMsg = e.getMessage();
        this.errType = e.getErrorType();
        this.coord = e.getCoord();
        this.parseTrace(e.getScope());
    }

    private void parseTrace(String scope) {
        Prog prog = Prog.INSTANCE;
        String curScope = scope;
        StringBuilder str = new StringBuilder(this.errMsg).append(":").append(this.coord).append("\n");
        do {
            ProgTerm term = prog.getTerm(curScope);
            if (term != null) {
                QuirklCoord coord = term.getCoord();

                str.append("\tat ").append(term.getSimpleName()).append("->").append(coord.toString()).append("\n");
                curScope = term.getScope();
            } else break;
        } while (!curScope.equals(Prog.GLOBAL_SCOPE));
        this.trace = str.toString();
    }

    @Override
    public String toString() {
        return this.errType + ": " + this.trace;
    }
}
