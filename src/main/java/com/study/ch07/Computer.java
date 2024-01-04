package com.study.ch07;

public class Computer {

    String type;
    String cpu;
    String ram;
    String disk;

    // 생성자
    // 1. 클래스의 이름과 동일하다.
    // 2. 메소드의 형태이다.
    
    Computer(){
        System.out.println("컴퓨터 하나 생성");
        type = "컴퓨터";
    }

    Computer(String type){
        this.type = type;
    }


    void showInfo() {
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);
    }
}
