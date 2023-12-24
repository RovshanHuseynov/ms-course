package com.example.mscourse.design_patterns.structural.facade;

public interface CoreBankFacade {
    void doPayment(long userId, int amount, PaymentPlace paymentPlace, String subscriberCode);
}
