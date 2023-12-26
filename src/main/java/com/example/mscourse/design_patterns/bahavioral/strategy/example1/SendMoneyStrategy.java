package com.example.mscourse.design_patterns.bahavioral.strategy.example1;

public class SendMoneyStrategy {
    private Sendible sendMoney;

    public void sendMoney(int amount){
        if(amount > 2000) sendMoney = new WesternUnionSender();
        else sendMoney = new ZolotoyaKoronaSender();
        sendMoney.send(amount);
    }
}
