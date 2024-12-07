package com.shubh.uber.backend.project.uber.strategies.implementations;

import com.shubh.uber.backend.project.uber.entities.RideRequest;
import com.shubh.uber.backend.project.uber.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import com.shubh.uber.backend.project.uber.services.DistanceService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public Double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),
                rideRequest.getDropOffLocation());
        return distance*RIDE_FARE_MULTIPLIER;
    }
}
