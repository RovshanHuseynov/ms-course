package com.example.mscourse.design_patterns.creational.factory;

public class Application {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory1 = createVehicleFactoryByType(VehicleTypeEnum.CAR);
        Vehicle vehicle1 = vehicleFactory1.createVehicle();
        vehicle1.deliver();

        VehicleFactory vehicleFactory2 = createVehicleFactoryByType(VehicleTypeEnum.AIRPLANE);
        Vehicle vehicle2 = vehicleFactory2.createVehicle();
        vehicle2.deliver();
    }

    private static VehicleFactory createVehicleFactoryByType(VehicleTypeEnum vehicleType){
        return switch (vehicleType){
            case CAR -> new CarFactory();
            case AIRPLANE -> new AirplaneFactory();
        };
    }
}
