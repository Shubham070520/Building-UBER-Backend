package com.shubh.uber.backend.project.uber.strategies;

import com.shubh.uber.backend.project.uber.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);
}
