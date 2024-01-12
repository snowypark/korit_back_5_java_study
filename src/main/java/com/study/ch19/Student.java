package com.study.ch19;

import lombok.Data;

import javax.swing.*;

@Data
public class Student {
    private String name;
    private String address;
    private int age;

    //Allargs 생성자
    //new Student(..)에 입력한 정보가 전달되는 것이 목표
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // builder() 안에 build()
    // static -static 끼리 접근 가능
    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    //static class builder {}
    //builder()를 생성해줄 클래스 -> public static Studentbuilder builder() { return Studentbuilder();}
    public static class StudentBuilder {
        private String name;
        private String address;
        private int age;

        // build() - return new Student 객체
        // 자기 자신을 return
        public Student build() {
            return new Student(name, address, age);
        }

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }



    }

    //@ToString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
