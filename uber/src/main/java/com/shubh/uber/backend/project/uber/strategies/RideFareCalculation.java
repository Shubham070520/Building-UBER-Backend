package com.shubh.uber.backend.project.uber.strategies;

import com.shubh.uber.backend.project.uber.dto.RideRequestDto;

public interface RideFareCalculation {

    Double calculateFare(RideRequestDto rideRequestDto);
}
