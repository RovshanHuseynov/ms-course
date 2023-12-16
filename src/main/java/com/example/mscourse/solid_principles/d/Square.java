package com.example.mscourse.solid_principles.d;

public class Square implements Shape{
    private final int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
