package com.movieticket.booking.models;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Customer {
    @NotNull(message = "First Name should not be null")
//    @Column(name = "firstname")
    private String firstName;
//    @Column(name = "lastname")
    @NotNull(message = "Last Name should not be null")
    private String lastName;
//    @Column(name = "email")
    @NotNull(message = "E-mail should not be null")
    private String email;
//    @Id
//    @Column(name = "username")
    private String userName;
    @NotNull
//    @Column(name = "password")
    private String password;


    public Customer() {

    }

    public Customer(String firstName, String lastName, String email, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
