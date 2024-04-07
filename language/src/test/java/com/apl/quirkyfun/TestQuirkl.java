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
        File file = new File("src/main/resources/test_cases/scope_and_binding_example.qkl");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            QuirklCompiler.main(new String[]{"-d", String.join("\n", reader.lines().toList()), "0", "10", "SUM", "sads"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testQuirkl() {
        int count = 1;
        File file = new File("src/main/resources/test_cases/test_" + count + ".qkl");

        do {
            System.out.println("Test Case: " + count);
            try {
                QuirklCompiler.main(new String[]{"-f", file.getPath(), "-d"});
                Prog.INSTANCE = new Prog();
            } catch (Exception e) {
                e.printStackTrace();
            }
            file = new File("src/main/resources/test_cases/test_" + ++count + ".qkl");
        } while (file.exists());
    }
}
