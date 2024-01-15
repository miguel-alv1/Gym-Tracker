package com.springmiguel.gympal.dto;

public class User {

    // fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int gymLength;

    // constructors
    public User() {

    }

    public User(String firstName, String lastName, String email, int gymLength) {
        // this.id = id; ?
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gymLength = gymLength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGymLength() {
        return gymLength;
    }

    public void setGymLength(int gymLength) {
        this.gymLength = gymLength;
    }
}
