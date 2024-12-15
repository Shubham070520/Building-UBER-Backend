package com.shubh.uber.backend.project.uber.services;

import com.shubh.uber.backend.project.uber.entities.Payment;
import com.shubh.uber.backend.project.uber.entities.Ride;
import com.shubh.uber.backend.project.uber.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);

}
