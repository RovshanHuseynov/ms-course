package com.example.mscourse.design_patterns.bahavioral.strategy.example2;

public class VehicleStrategy {
    public static VehicleFactory getVehicleFactoryTypeByDistance(int distance){
        if(distance <= 2){
            return new BicycleFactory();
        } else if(distance < 20){
            return new MotoCycleFactory();
        } else if(distance < 300){
            return new CarFactory();
        } else {
            return new AirplaneFactory();
        }
    }
}
