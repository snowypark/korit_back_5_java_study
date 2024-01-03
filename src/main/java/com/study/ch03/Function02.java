package com.study.ch03;

public class Function02 {

    // 매개변수 x, 리턴 x
    public static void fx01(){
        // void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    //오버로딩 함수명이 같더라도 매개변수의 자료형이 다르면 함수정의 가능하다.
    public static void fx02(String b, int a){
        System.out.println("fxo02 함수 실행");
        System.out.println("나이: " + a);
        System.out.println("이름: " + b);
        System.out.println();
    }

    public static int fx03(){
        System.out.println("fx03 함수 실행");
        return 100;
    }

    public static String fx04(String name, int age){
        return  name + ", " + age;
    }


    public static void main(String[] args){
        fx01();
        fx02("김준이",32);
        fx02("김준일", 31);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("김준일",31);
        System.out.println(result);

    }

}
