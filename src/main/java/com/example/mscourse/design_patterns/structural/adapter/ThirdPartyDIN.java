package com.example.mscourse.design_patterns.structural.adapter;

public interface ThirdPartyDIN {
    void connect();

    Citizen getCitizenByPin(String pin);
}
