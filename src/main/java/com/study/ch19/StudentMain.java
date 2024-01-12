package com.study.ch19;

public class StudentMain {
    public static void main(String[] args) {


        Student student1 = new Student.StudentBuilder()
                .name("a")
                .address("부산")
                .age(20)
                .build();

        System.out.println(student1);

        Student student2 = new Student.StudentBuilder()
                .name("b")
                .address("서울")
                .age(25)
                .build();

        System.out.println(student2);


    }
}
