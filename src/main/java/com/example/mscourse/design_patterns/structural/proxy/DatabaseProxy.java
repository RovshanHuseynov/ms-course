package com.example.mscourse.design_patterns.structural.proxy;

public class DatabaseProxy extends Database{
    public int getSalaryById(long id){
        System.out.println("Validated by Proxy. Allowed");
        return super.getSalaryById(id);
    }
}
