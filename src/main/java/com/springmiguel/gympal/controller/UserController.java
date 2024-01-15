package com.springmiguel.gympal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome, user!";
    }
}
