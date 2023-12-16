package com.example.mscourse.solid_principles.d;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Triangle implements Shape{
    private final int a;
    private final int b;
    private final int c;
}
