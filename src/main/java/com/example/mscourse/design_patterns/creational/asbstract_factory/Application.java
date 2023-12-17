package com.example.mscourse.design_patterns.creational.asbstract_factory;

import com.example.mscourse.design_patterns.creational.asbstract_factory.food.*;
import com.example.mscourse.design_patterns.creational.asbstract_factory.vehicle.*;

public class Application {
    public static void main(String[] args) {
        CompanyFactory cf1 = createCompanyFactoryByType(CompanyTypeEnum.FOOD, FoodTypeEnum.BURGER);
        CompanyFactory cf2 = createCompanyFactoryByType(CompanyTypeEnum.FOOD, FoodTypeEnum.SOUP);
        CompanyFactory cf3 = createCompanyFactoryByType(CompanyTypeEnum.VEHICLE, VehicleTypeEnum.CAR);
        CompanyFactory cf4 = createCompanyFactoryByType(CompanyTypeEnum.VEHICLE, VehicleTypeEnum.AIRPLANE);
    }

    /*private static CompanyFactory createCompanyFactoryByType(Enum enumType){
        if(enumType instanceof VehicleTypeEnum) return createVehicleFactoryByType((VehicleTypeEnum) enumType);
        else if(enumType instanceof FoodTypeEnum) return createFoodFactoryByType((FoodTypeEnum) enumType);
        throw new RuntimeException("not found");
    }*/

    private static CompanyFactory createCompanyFactoryByType(CompanyTypeEnum companyType, Enum enumType){
        return switch (companyType){
            case FOOD -> createFoodFactoryByType((FoodTypeEnum) enumType);
            case VEHICLE -> createVehicleFactoryByType((VehicleTypeEnum) enumType);
        };
    }

    private static VehicleFactory createVehicleFactoryByType(VehicleTypeEnum vehicleType){
        return switch (vehicleType){
            case CAR -> new CarFactory();
            case AIRPLANE -> new AirplaneFactory();
        };
    }

    private static FoodFactory createFoodFactoryByType(FoodTypeEnum foodType){
        return switch (foodType){
            case BURGER -> new BurgerFactory();
            case SOUP -> new SoupFactory();
        };
    }
}
