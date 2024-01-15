package com.study.ch10;

public class ElectronicDeviceMain {

    public static void main(String[] args) {

        // 익명클래스
        ElectronicDevice electronicDevice = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");

            }
        };

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {

                System.out.println("두번째 기기 상태확인");

            }
        };

        RemoteController remoteController = new RemoteController(); //class 생성 (상속을 통해 추상클래스 생성 가능) -> 익명클래스

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for(int i = 0; i < electronicDevices.length ; i++) {
            electronicDevices[i].showDeviceState();
        }
    }
}
