package com.example.vulnerableapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class XssController {
    @GetMapping("/xss")
    public String xssDemo(@RequestParam(name = "input", required = false, defaultValue = "Try some XSS! Add a URL parameter called 'input' and set it to whatever you like...") String input, Model model) {
        model.addAttribute("input", input);                                
        return "xss";
    }
}