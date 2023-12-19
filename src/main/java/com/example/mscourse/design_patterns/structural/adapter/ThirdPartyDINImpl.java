package com.example.mscourse.design_patterns.structural.adapter;

public class ThirdPartyDINImpl implements ThirdPartyDIN {
    private DB db;

    @Override
    public void connect() {
        System.out.println("connected");
        db = new DB();
    }

    @Override
    public Citizen getCitizenByPin(String pin) {
        return db.getCitizenByPin(pin);
    }
}
