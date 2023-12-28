package com.example.mscourse.design_patterns.bahavioral.strategy.example2;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        int distance = random.nextInt(1000);
        System.out.println("distance is: " + distance);
        VehicleFactory vehicleFactory = VehicleStrategy.getVehicleFactoryTypeByDistance(distance);
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.deliver();
    }
}
