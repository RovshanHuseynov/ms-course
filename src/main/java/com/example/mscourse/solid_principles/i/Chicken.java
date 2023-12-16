package com.example.mscourse.solid_principles.i;

// Chicken can walk, run, but cannot fly, so we implement only one interface (Birdable) here
public class Chicken implements Birdable{
    @Override
    public void walk() {
        // some code
    }

    @Override
    public void run() {
        // some code
    }
}
