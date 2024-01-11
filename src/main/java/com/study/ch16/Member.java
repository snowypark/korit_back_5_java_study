package com.study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private String name;
    private String address;

}

/*
    더 공부하기
    향상된 for문
    객체 생성과 리스트 제네릭

    for(자료형 변수명 : 배열명){
	    문장
      }

    for(자료형 한 단계 아래의 자료형의 변수명 : 배열명){
        }
 */

