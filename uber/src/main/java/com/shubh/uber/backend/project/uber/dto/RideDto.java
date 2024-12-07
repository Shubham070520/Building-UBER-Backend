package com.shubh.uber.backend.project.uber.dto;

import com.shubh.uber.backend.project.uber.entities.enums.PaymentMethod;
import com.shubh.uber.backend.project.uber.entities.enums.RideStatus;

import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDto {

    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;

    private String otp;

    private LocalDateTime statedAt;

    private LocalDateTime endedAt;
}
