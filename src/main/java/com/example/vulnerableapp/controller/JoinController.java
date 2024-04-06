package com.example.vulnerableapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vulnerableapp.model.User;

@Controller
@RequestMapping("/join")
public class JoinController {
    private static final User user1 = new User(1, "Alice", true);
    private static final User user2 = new User(2, "Bob", false);
    
    @RequestMapping("/{id}")
    public String joinSuccess(@PathVariable(name = "id") long id, Model model) {
        User user;

        if (id == 1) {
            user = user1;
        } else if (id == 2) {
            user = user2;
        } else {
            user = null;
        }

        if (user == null) {
            return "redirect:/";
        }
        
        model.addAttribute("name", user.getName()); 
        return "join";
    }
}
