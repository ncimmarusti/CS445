package com.example.cs445_project;

import java.util.Calendar;

/**
 * This class contains information and methods for when the user is currently being driven by the driver.
 * It contains information on the start and end times and distances as well as the identities of
 * the driver and user.
 */

public class CurrentRide {
    private static int nextId = 1;
    private int id;
    private User passenger;
    private Driver driver;
    private Location startLocation;
    private Location endLocation;
    private Calendar startTime;
    private Calendar endTime;
    private RideStatus rideStatus;
    private double cost;

    public CurrentRide(User passenger, Driver driver, Location startLocation, Location endLocation,
                       Calendar startTime, Calendar endTime, RideStatus rideStatus, double cost) {
        this.id = nextId++;
        this.passenger = passenger;
        this.driver = driver;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.rideStatus = rideStatus;
        this.cost = cost;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public User getPassenger() {
        return passenger;
    }

    public void setPassenger(User passenger) {
        this.passenger = passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}