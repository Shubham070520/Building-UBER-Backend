package com.shubh.uber.backend.project.uber.strategies;

import com.shubh.uber.backend.project.uber.entities.Payment;

public interface PaymentStrategy {

    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}
