package com.example.mscourse.design_patterns.structural.facade;

public class Application {
    public static void main(String[] args) {
        CoreBankFacade coreBank = new CoreBankFacadeImpl();
        coreBank.doPayment(359521, 100, PaymentPlace.AZERISIQ, "0900550016");
        coreBank.doPayment(156437, 100, PaymentPlace.AZERISIQ, "0900550016");
        coreBank.doPayment(559349, 100, PaymentPlace.AZERISIQ, "0900550016");
    }
}
