package com.example.mscourse.solid_principles.d;

public class SaveableImpl implements Saveable{
    @Override
    public void save(Shape shape) {
        System.out.println("Saving: " + shape);
    }
}
