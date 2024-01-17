package com.springmiguel.gympal.repository;

import com.springmiguel.gympal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findById(int id);

    List<User> findAll();
}
