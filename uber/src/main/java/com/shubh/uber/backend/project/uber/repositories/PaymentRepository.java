package com.shubh.uber.backend.project.uber.repositories;

import com.shubh.uber.backend.project.uber.entities.Payment;
import com.shubh.uber.backend.project.uber.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Optional<Payment> findByRide(Ride ride);
}
