package com.springmiguel.gympal.service;

import com.springmiguel.gympal.model.User;
import com.springmiguel.gympal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> allUsers() {
        return (List<User>)userRepository.findAll();
    }
}
