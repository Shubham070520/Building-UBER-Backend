package com.shubh.uber.backend.project.uber.entities;

import com.shubh.uber.backend.project.uber.entities.enums.PaymentMethod;
import com.shubh.uber.backend.project.uber.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RideRequest {   //one riderequest table can have lot of users.
//one user can have 1 riderequest at one time
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;

    @ManyToOne(fetch = FetchType.LAZY)  //whenever I want to get the rideRequest from the DB,it will give ride request and not rider
    private Rider rider;   //One rider can have multiple ride request

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

    private Double fare;
}


