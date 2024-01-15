package com.study.ch19;

import lombok.ToString;

@ToString
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // builder 생성
    public static CarBuilder builder() {
//        Car car = new Car(); // static끼리 생성없이 호출
        return new CarBuilder();
    }

    //**test
    //@Builder와 동일
    // static이 아니면 생성 시기(new Car(); 이후)
    public static class CarBuilder { // 주소.model().color().build();
        private String model;
        private String color;

        public Car build() {              //Carbuild에 담긴 model,color -> Car에 이동 필요

            return new Car(model, color); //car 생성자 -> build
        }

        public CarBuilder model(String model){
            this.model = model;
            return this; //객체
        }

        public CarBuilder color (String color){
            this.color = color;
            return this; //객체
        }
    }

}
