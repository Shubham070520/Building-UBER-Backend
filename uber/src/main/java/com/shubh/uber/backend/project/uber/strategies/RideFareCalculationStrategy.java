package com.shubh.uber.backend.project.uber.strategies;

import com.shubh.uber.backend.project.uber.dto.RideRequestDto;
import com.shubh.uber.backend.project.uber.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    Double calculateFare(RideRequest rideRequest);
}
