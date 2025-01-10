package com.shubh.uber.backend.project.uber.services;

import com.shubh.uber.backend.project.uber.dto.DriverDto;
import com.shubh.uber.backend.project.uber.dto.RiderDto;
import com.shubh.uber.backend.project.uber.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);

    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);

}
