package com.shubh.uber.backend.project.uber.services;

import com.shubh.uber.backend.project.uber.dto.DriverDto;
import com.shubh.uber.backend.project.uber.dto.RideDto;
import com.shubh.uber.backend.project.uber.dto.RideRequestDto;
import com.shubh.uber.backend.project.uber.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateRider(Long rideId , Integer rating);

    RiderDto getMyProfile();  //Driver id will come from spring security context holder

    List<RideDto> getAllMyRides();


}