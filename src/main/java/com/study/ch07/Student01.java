package com.study.ch07;

public class Student01 {
    String name;
    int age;
//    String address;
    final String address;

    // 생성자 Constructor
    // args(arguments) 매개변수 값

    // NoArgsConstructor
//    Student01() {
//        address = "";
//    }

    // AllArgsConstructor
    Student01(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // RequiredArgsConstructor 필수생성자
    Student01(String address){
        this.address = address;
    }
}
