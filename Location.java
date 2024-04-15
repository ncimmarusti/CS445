package com.example.cs445_project;

/**
 * This is the Location class. It is responsible for handling the coordinates of a user and driver.
 * The coordinates can be used to help a driver find a user and vise versa.
 */
public class Location {
    private int id;
    private float latitude;
    private float longitude;

    public Location(int id, float latitude, float longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}