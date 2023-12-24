package com.example.mscourse.design_patterns.structural.facade;

// spagetti code
public class CoreBankFacadeImpl implements CoreBankFacade {
    @Override
    public void doPayment(long userId, int amount, PaymentPlace paymentPlace, String subscriberCode) {
        if(paymentPlace == PaymentPlace.AZERISIQ){
            double doubleAmount = amount;
            insertPaymentToDatabase("electric_payments", userId, doubleAmount, subscriberCode);
        } else if(paymentPlace == PaymentPlace.AZERQAZ){
            double doubleAmount = amount;
            insertPaymentToDatabase("gas_payments", userId, doubleAmount, subscriberCode);
        } else if(paymentPlace == PaymentPlace.AZERSU){
            double doubleAmount = amount;
            insertPaymentToDatabase("water_payments", userId, doubleAmount, subscriberCode);
        }
    }

    private void insertPaymentToDatabase(String tableName, long userId, double amount, String subscriberCode){
        if(tableName.equals("electric_payments")){
            // save payment
        } else if(tableName.equals("gas_payments")){
            // save payment
        } else if(tableName.equals("water_payments")){
            // save payment
        }
    }
}
