package com.springmiguel.gympal.model;

import jakarta.persistence.*;

@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="user_email")
    private String email;

    @Column(name="gym_xp")
    private int gymXp;
}
