package com.shubh.uber.backend.project.uber.strategies;

import com.shubh.uber.backend.project.uber.dto.RideRequestDto;
import com.shubh.uber.backend.project.uber.entities.Driver;
import com.shubh.uber.backend.project.uber.entities.RideRequest;


import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
