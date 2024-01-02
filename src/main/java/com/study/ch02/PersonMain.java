package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.age = 30;
//        p.name = "kji";
//
//        Person p2 = new Person();
//        p2.name = "김준이";
//        p2.age = 25;

        /*
        StudentType 클래스
        이름(name) , 주소(address) , 학년(studentyear)
         */
        StudentType junil = new StudentType();
        junil.name = "김준일";
        junil.address = "부산 동래구";
        junil.studentYear = 1;

        System.out.println("이름: " + junil.name);
        System.out.println("학년: " + junil.studentYear + "학년");
        System.out.println("주소: " + junil.address);

        int a = 10;
        double b = a;

        Person p = junil;
        StudentType junil2 = (StudentType) p;


    }
}
