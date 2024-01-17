package com.springmiguel.gympal.service;

import com.springmiguel.gympal.model.User;
import com.springmiguel.gympal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    // save operation
    @Autowired
    UserRepository userRepository;

    // return all users in db
    public List<User> listUsers() {
        return userRepository.findAll();
    }
}
