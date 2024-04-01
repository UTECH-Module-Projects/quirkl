package com.apl.quirkl.language.semantics.model.type.value;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.program.Prog;
import com.apl.quirkl.language.semantics.model.statement.Stmt;
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
    private String trace;

    @SneakyThrows
    public QuirklErrValue(QuirklException e, Prog prog, String scope) {
        this.errMsg = e.getMessage();
        this.errType = e.getErrorType();
        this.parseTrace(prog, scope);
    }

    private void parseTrace(Prog prog, String scope) throws QuirklRuntimeException {
        String curScope = scope;
        StringBuilder str = new StringBuilder(this.errMsg).append("\n");
        do {
            Stmt stmt = prog.getStatement(curScope);
            if (stmt != null) {
                QuirklCoord coord = stmt.getCoord();

                str.append("\tat ").append(curScope).append(coord.toString()).append("\n");
                curScope = stmt.getScope();
            } else throw new QuirklRuntimeException("No statement found for scope: " + curScope);
        } while (!curScope.equals(Prog.GLOBAL_SCOPE));
        this.trace = str.toString();
    }

    @Override
    public String toString() {
        return this.errType + ": " + this.trace;
    }
}
