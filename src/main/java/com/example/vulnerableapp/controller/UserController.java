package com.example.vulnerableapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.vulnerableapp.model.User;

@Controller
public class UserController {
    // Just manually create test data for now
    private static final User user1 = new User(1, "Alice");
    private static final User user2 = new User(2, "Bob");

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") long id) {
        User user;

        if (id == 1) {
            user = user1;
        } else if (id == 2) {
            user = user2;
        } else {
            user = null;
        }

        return user;
    }
}