package com.example.cs445_project;

import java.util.Calendar;

/**
 * This class handles the ride request and creates a new ride when accepted.
 */
public class RideRequest {
    private User passenger;
    private Location startLocation;
    private Location endLocation;
    private Calendar requestTime;
    private double estimatedCost;
    private RideStatus status;

    public RideRequest(User passenger, Location startLocation, Location endLocation) {
        this.passenger = passenger;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.requestTime = Calendar.getInstance(); // Get current date and time
        this.estimatedCost = RideCostEstimator.calculateEstimatedCost(startLocation, endLocation);
        this.status = RideStatus.REQUESTED;
    }

    // Method to handle when a driver accepts the ride request
    public CurrentRide createRide(Driver driver) {
        // Create a new CurrentRide instance with the passenger, driver, start and end locations,
        // request time, estimated cost, and initial status
        CurrentRide ride = new CurrentRide(passenger, driver, startLocation, endLocation, requestTime, null, RideStatus.REQUESTED, estimatedCost);

        // Set the status of the ride request to accepted
        status = RideStatus.ACCEPTED;

        return ride;
    }
}
