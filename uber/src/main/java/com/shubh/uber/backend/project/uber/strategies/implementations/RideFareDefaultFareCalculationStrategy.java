package com.shubh.uber.backend.project.uber.strategies.implementations;

import com.shubh.uber.backend.project.uber.entities.RideRequest;
import com.shubh.uber.backend.project.uber.strategies.RideFareCalculationStrategy;

public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    @Override
    public Double calculateFare(RideRequest rideRequest) {
        return 0.0;
    }
}
