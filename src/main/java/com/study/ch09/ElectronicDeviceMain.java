package com.study.ch09;

public class ElectronicDeviceMain extends ElectronicDevice{
    public static void main(String[] args) {

        ElectronicDevice[] electronicDevice = new ElectronicDevice[5];

        for (int i = 0; i < electronicDevice.length; i++) {
            electronicDevice[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }

        for (int i = 0; i < electronicDevice.length; i++) {
            electronicDevice[i].showDeviceState();
        }

        for (int i = 0; i < electronicDevice.length; i++) {
            electronicDevice[i].setPowerOn();
        }

        System.out.println();

        for (int i = 0; i < electronicDevice.length; i++) {
            electronicDevice[i].setPowerOff();
        }

        for (int i = 0; i < electronicDevice.length; i++) {

            if (electronicDevice[i] instanceof Computer) { //instanceof 사용x (후속버전 지원x)
                Computer computer = (Computer) electronicDevice[i];
                computer.playGame();

            }else if(electronicDevice[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevice[i];
                smartPhone.call();
            }

        }
    }
}
