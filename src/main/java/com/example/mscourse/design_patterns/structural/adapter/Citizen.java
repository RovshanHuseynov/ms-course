package com.example.mscourse.design_patterns.structural.adapter;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Citizen {
    private final String name;
    private final String surname;
    private final String country;
}
