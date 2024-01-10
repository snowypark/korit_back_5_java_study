package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SendData<T> {  // 제네릭 <T> Type
    private int code;
//  private Object data;    // object 는 모든 자료형
    private T data;         // T는 자료형을 변경할 수 있는 변수

    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }

}
