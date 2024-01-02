package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20201229;
        // int a;  선언
        // a = 10; 대입
        double date2 = (double) date;
        int date3 = (int) date2; //형변환 : 문자 -> 정수 -> 실수

        char a = '1';
        int b = a;
        double c = b;

        System.out.println(20231229 + 1);
        System.out.println(20231229 + 2);
        System.out.println(20231229 + 3);
    }
}
