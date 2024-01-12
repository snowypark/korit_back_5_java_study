package com.study.ch19;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Car2 {

    private String name;
    private String color;

    public Car2(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
