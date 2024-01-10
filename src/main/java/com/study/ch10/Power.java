package com.study.ch10;

public interface Power {
    // 인터페이스의 특징 - 모든 클래스가 추상
    // 변수 선언 불가능
    boolean powerState = false; // 초기화 선언 -> 상수 선언만 가능
    String ERROR_CODE = "-9999";

    void setPowerOn();
    void setPowerOff();

    default void test() {

    }

}
