package com.shubh.uber.backend.project.uber.strategies.implementations;

import com.shubh.uber.backend.project.uber.dto.RideRequestDto;
import com.shubh.uber.backend.project.uber.entities.Driver;
import com.shubh.uber.backend.project.uber.entities.RideRequest;
import com.shubh.uber.backend.project.uber.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {


    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
