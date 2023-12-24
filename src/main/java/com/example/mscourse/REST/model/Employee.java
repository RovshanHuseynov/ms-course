package com.example.mscourse.REST.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Employee {
    private final long id;
    private final String name;
}
