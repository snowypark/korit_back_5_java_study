package com.study.ch18;

public class AddtionImpl implements Addition{
    @Override
    public int add(int a, int b) {
        System.out.println("AdditionImpl에서 호출한 add 메소드");
        return a + b; //자료형만 같으면 매개변수 이름 상관 X
    }
}
