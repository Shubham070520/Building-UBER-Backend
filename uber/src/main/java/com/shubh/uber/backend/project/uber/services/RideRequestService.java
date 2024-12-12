package com.shubh.uber.backend.project.uber.services;

import com.shubh.uber.backend.project.uber.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}

