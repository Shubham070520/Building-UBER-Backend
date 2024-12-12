package com.shubh.uber.backend.project.uber.services;

import com.shubh.uber.backend.project.uber.dto.RideRequestDto;
import com.shubh.uber.backend.project.uber.entities.Driver;
import com.shubh.uber.backend.project.uber.entities.Ride;
import com.shubh.uber.backend.project.uber.entities.RideRequest;
import com.shubh.uber.backend.project.uber.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);  //Matching/Notifying all the driver....Then driver will accept the ride which will notify the rider.

    Ride createNewRide(RideRequest rideRequest , Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);   //Riderservice and driver service call this so no code is repeated

    Page<Ride> getAllRidesOfRider(Long riderId , PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId , PageRequest pageRequest);
}
