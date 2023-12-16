package com.example.mscourse.solid_principles.s.bad;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private long id;
    private String name;
    private String model;
    private double price;

    public double calculatePrice(){
        // some code
        return 0;
    }

    public void addCarToDB(Car car){
        // some code;
    }
}
