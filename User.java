package com.example.cs445_project;

import java.util.ArrayList;
import java.util.List;


/**
 * This class represents a user of the system. It collects the user's username, email,
 * password, phone number, and payment methods. It also manages the user registration
 * and login details.
 */
public class User {

    private static int nextId = 1; // Static variable to generate unique user IDs
    private int id;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private List<PaymentMethod> paymentMethods;

    // Constructor for user
    public User(String username, String email, String password, String phoneNumber) {
        this.id = nextId++;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.paymentMethods = new ArrayList<>();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.add(paymentMethod);
    }

    public void removePaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.remove(paymentMethod);
    }
}
