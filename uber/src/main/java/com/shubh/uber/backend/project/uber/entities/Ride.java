package com.shubh.uber.backend.project.uber.entities;

import com.shubh.uber.backend.project.uber.entities.enums.PaymentMethod;
import com.shubh.uber.backend.project.uber.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;  //when driver accepts the ride

    @ManyToOne(fetch = FetchType.LAZY)  //whenever I want to get the rideRequest from the DB,it will give ride request and not rider
    private Rider rider;   //One rider can have multiple ride request

    @ManyToOne(fetch = FetchType.LAZY)  //whenever I want to get the rideRequest from the DB,it will give ride request and not rider
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private Double fare;

    private String otp;

    private LocalDateTime startedAt;  //when ride starts(after otp input)

    private LocalDateTime endedAt;  //when reached destination
}
