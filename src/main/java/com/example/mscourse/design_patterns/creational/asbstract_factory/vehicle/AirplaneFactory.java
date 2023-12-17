package com.example.mscourse.design_patterns.creational.asbstract_factory.vehicle;

public class AirplaneFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Airplane();
    }
}
