package com.apl.quirkl.language.semantics.model.expression;

import com.apl.quirkl.language.semantics.model.coordinate.QuirklCoord;
import com.apl.quirkl.language.semantics.model.type.QuirklString;
import com.apl.quirkl.language.semantics.model.type.QuirklType;
import com.apl.quirkl.language.semantics.visitor.antlr_to_model.error.runtime.QuirklRuntimeException;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Getter
@Setter
public class InputExp extends Exp {
    private String msg;

    public InputExp(QuirklCoord coord, String scope) {
        super(coord, scope);
    }

    @Override
    public QuirklString eval() throws QuirklRuntimeException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            if (msg != null)
                System.out.print(msg);
            return new QuirklString(reader.readLine(), this);
        } catch (Exception e) {
            throw new QuirklRuntimeException(e.getMessage(), this.getScope(), this.getCoord());
        }
    }

    @Override
    public String toString() {
        return "input(" + (msg != null ? msg : "") + ")";
    }
}