package com.example.mscourse.design_patterns.creational.builder;

public class Application {
    public static void main(String[] args) {
        Student student1 = Student.builder().id(1).name("Rovshan").build();
        Student student2 = Student.builder().id(2).name("Ali").surname("Aliyev").build();
        Student student3 = Student.builder().id(3).name("Qasim").age(40).fathername("Kamil").build();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
