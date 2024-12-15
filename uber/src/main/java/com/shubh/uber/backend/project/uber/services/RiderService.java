package com.shubh.uber.backend.project.uber.services;

import com.shubh.uber.backend.project.uber.dto.DriverDto;
import com.shubh.uber.backend.project.uber.dto.RideDto;
import com.shubh.uber.backend.project.uber.dto.RideRequestDto;
import com.shubh.uber.backend.project.uber.dto.RiderDto;
import com.shubh.uber.backend.project.uber.entities.Rider;
import com.shubh.uber.backend.project.uber.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateRider(Long rideId , Integer rating);

    RiderDto getMyProfile();  //Driver id will come from spring security context holder

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
