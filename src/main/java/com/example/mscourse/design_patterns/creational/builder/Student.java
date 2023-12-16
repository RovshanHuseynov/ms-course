package com.example.mscourse.design_patterns.creational.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Student {
    private long id;
    private String name;
    private String surname;
    private String fathername;
    private int age;
}
