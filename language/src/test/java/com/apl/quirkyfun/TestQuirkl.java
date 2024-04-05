package com.apl.quirkyfun;

import com.apl.quirkl.controller.QuirklCompiler;
import com.apl.quirkl.language.semantics.model.program.Prog;
import org.junit.jupiter.api.Test;

import java.io.File;

public class TestQuirkl {

    @Test
    public void testFileQuirkl() {
        File file = new File("src/main/resources/test_cases/test_3.qkl");
        try {
            QuirklCompiler.main(new String[]{"-f", file.getPath(), "-d"});
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
