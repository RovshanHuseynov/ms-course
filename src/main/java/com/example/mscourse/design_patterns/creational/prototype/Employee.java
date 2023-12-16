package com.example.mscourse.design_patterns.creational.prototype;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "prototype")
@Component
@RequiredArgsConstructor
public class Employee {
    private final long id;
    private final String name;
}
