package com.shubh.uber.backend.project.uber.strategies;


import com.shubh.uber.backend.project.uber.entities.enums.PaymentMethod;
import com.shubh.uber.backend.project.uber.strategies.implementations.CashPaymentStrategy;
import com.shubh.uber.backend.project.uber.strategies.implementations.WalletPaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentStrategyManager {

    private final WalletPaymentStrategy walletPaymentStrategy;
    private final CashPaymentStrategy cashPaymentStrategy;

    public PaymentStrategy paymentStrategy(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case WALLET -> walletPaymentStrategy;
            case CASH -> cashPaymentStrategy;
        };
    }
}
