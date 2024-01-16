package com.springmiguel.gympal.service;

import com.springmiguel.gympal.model.User;

import java.util.List;

public interface UserService {

    // save operation
    User saveUser(User user);

    // read all users
    List<User> allUsers();
}
