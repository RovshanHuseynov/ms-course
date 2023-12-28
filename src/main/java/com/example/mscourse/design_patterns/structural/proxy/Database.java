package com.example.mscourse.design_patterns.structural.proxy;

import java.util.Random;

public class Database {
    public int getSalaryById(long id){
        Random random = new Random();
        return random.nextInt(5000);
    }
}
