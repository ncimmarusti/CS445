package com.example.cs445_project;

/**
 * This class represents a driver in the system. It contains their login information as well as their
 * ratings, vehicle, and location.
 */
public class Driver {
    private static int nextId = 1;
    private int id;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String vehicleInfo;
    private float rating;
    private Location location;
    private boolean availability;

    // Constructor for Driver
    public Driver(String username, String email, String password, String phoneNumber,
                  String vehicleInfo, float rating, Location location, boolean availability) {
        this.id = nextId++;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.vehicleInfo = vehicleInfo;
        this.rating = rating;
        this.location = location;
        this.availability = availability;
    }

    // Getters and Setters
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

    public String getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(String vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}