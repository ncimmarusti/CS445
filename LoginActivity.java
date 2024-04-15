package com.example.cs445_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * This class is for the login page. It will have a way to register or login for both users and drivers.
 * Users are sent to the User page where they can request rides and Drivers are sent to the Drivers page
 * where they can accept ride requests.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    // Method to handle user registration
    public static User register(String username, String email, String password, String phoneNumber) {
        // Validation checks for unique username, email, and phone number
        // Add the new user to the database
        // Hash the password before storing
        return null; // Return the newly registered user
    }

    // Method to handle user login
    public static User login(String email, String password) {
        // Authenticate user based on email and password
        // Retrieve user data from the database
        return null; // Return the authenticated user
    }
}

