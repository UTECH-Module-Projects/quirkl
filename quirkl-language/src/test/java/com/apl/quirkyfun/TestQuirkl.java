package com.apl.quirkyfun;

import com.apl.quirkl.controller.QuirklCompiler;
import com.apl.quirkl.language.semantics.model.program.Prog;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestQuirkl {

    @Test
    public void testFileQuirkl() {
        File file = new File("src/main/resources/test_cases/test_1.qkl");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            QuirklCompiler.main(new String[]{"-d", "-p", String.join("\n", reader.lines().toList()), "0", "10", "SUM", "sads"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
