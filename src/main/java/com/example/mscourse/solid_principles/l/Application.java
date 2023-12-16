package com.example.mscourse.solid_principles.l;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Birdable> list = List.of(new Sparrow(), new Ostrich());
        list.forEach(i -> i.fly());
    }
}
