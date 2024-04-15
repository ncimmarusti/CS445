package com.example.cs445_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * This class is for the user interface of the Drivers. Once they are past the login page, they will
 * be redirected to this page where they can select rides they want to complete.
 */

public class DriverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);
    }
}