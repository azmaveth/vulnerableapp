package com.example.vulnerableapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vulnerableapp.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
    // Just manually create test data for now
    private static final User user1 = new User(1, "Alice");
    private static final User user2 = new User(2, "Bob");

    @GetMapping("")
    public User getCurrentUser() {
        User currentUser = user1; // Skip any real auth for now
        return currentUser;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable(name = "id") long id) {
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