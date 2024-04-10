package com.apl.quirklbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientForwardController {

    @GetMapping("/**/{path:[^.]*}")
    public String forward() {
        return "forward:/";
    }
}
