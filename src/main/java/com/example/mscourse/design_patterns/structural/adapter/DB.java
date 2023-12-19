package com.example.mscourse.design_patterns.structural.adapter;

public class DB {
    public Citizen getCitizenByPin(String pin){
        return new Citizen("Rovshan", "Huseynov", "AZE");
    }
}
