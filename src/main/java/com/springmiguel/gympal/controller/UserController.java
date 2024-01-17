package com.springmiguel.gympal.controller;

import com.springmiguel.gympal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springmiguel.gympal.model.User;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome, user!";
    }

    @GetMapping("/users")
    public List<User> allUsers() {
        System.out.println("In all users endpoint");
        return userService.listUsers();
    }
}
