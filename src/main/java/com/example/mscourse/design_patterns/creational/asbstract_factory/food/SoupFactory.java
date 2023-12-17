package com.example.mscourse.design_patterns.creational.asbstract_factory.food;

public class SoupFactory implements FoodFactory {
    @Override
    public Food createFood() {
        return new Soup();
    }
}
