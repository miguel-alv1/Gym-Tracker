package com.springmiguel.gympal.controller;

import com.springmiguel.gympal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/users/{id}")
    public User findUser(@PathVariable int id) {
        System.out.println("In find user endpoint");
        return userService.findUser(id);
    }

    @PostMapping(path="users", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User result = userService.saveUser(user);

        if (result == null) {
            throw new RuntimeException("User already exists");
        }
        else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable int id) {
        System.out.println("In deleteUser endpoint");
        User user = findUser(id);

        if (user == null) {
            throw new RuntimeException("User does not exist");
        }
        else {
            userService.deleteUser(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }
}
