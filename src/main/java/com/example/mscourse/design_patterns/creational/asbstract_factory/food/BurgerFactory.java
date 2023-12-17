package com.example.mscourse.design_patterns.creational.asbstract_factory.food;

public class BurgerFactory implements FoodFactory{
    @Override
    public Food createFood() {
        return new Burger();
    }
}
