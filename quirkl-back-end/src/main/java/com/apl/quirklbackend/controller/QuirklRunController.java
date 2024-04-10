package com.apl.quirklbackend.controller;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

@RestController
public class QuirklRunController {

    @PostMapping("/run")
    public ProgramResponse runProgram(@RequestBody String program) {
        ProgramResponse response = new ProgramResponse();
        try {
            Process process = Runtime.getRuntime().exec(String.format("java -jar quirkl.jar -p \"%s\"", program.replace("\"", "'")));

            process.waitFor();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(process.errorReader());
            reader.lines().forEach(line -> output.append(line).append("\n"));

            // Read the output of the process
            reader = new BufferedReader(process.inputReader());
            reader.lines().forEach(line -> output.append(line).append("\n"));
            output.append("\n");
            System.out.println(output);

            // Set the output of the process to the response object
            response.setOutput(output.toString());
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception
            response.setOutput("An error occurred: " + e.getMessage());
        }
        return response;
    }
}
