package com.study.ch10;

/*
    [ 추상화 ]
    1. 추상 클래스 abstract class (공통점)
    2. 인터페이스 interface
 */
public abstract class ElectronicDevice {

    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 메소드 - 일반 클래스에 정의X
    abstract void showDeviceState() ;


}
