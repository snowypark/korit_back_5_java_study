package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {

        // static. Car in Carbuilder(static class)
        Car.CarBuilder carBuilder = new Car.CarBuilder(); // 생성자(Car class 안에 들어있음)
        Car car2 = carBuilder.build(); // Car 객체 new 생성

        // builder = static method 접근
        Car car = Car.builder()
                .model("아반떼")
                .color("블랙")
                .build(); //생성

        System.out.println(car);

    }
}
