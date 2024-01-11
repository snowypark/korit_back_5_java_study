package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>(); // 순서X
        // <K, V> key , value - K 중복X , V 중복 O

        map.put("username","junil");
        map.put("password","1234");
        map.put("name","김준삼");
        map.put("email","skjil121@kakao.com");

        System.out.println(map);
        System.out.println(map.get("3번학생"));

    }
}
