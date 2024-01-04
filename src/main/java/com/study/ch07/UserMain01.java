package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {

        User01 user1 = new User01("abc","1234");
        User01 user2 = new User01("bbb","5678","Bname","bbb@naver.com");

        user1.showInfo();
        System.out.println("---------\n");

        user1.setName("abc");
        user1.setEmail("abc@naver.com");
        user1.showInfo();
        System.out.println("-----------\n");

        user2.showInfo();
        System.out.println("-----------\n");

        user1.setEmail("새로운이메일");
        user1.showInfo();

    }
}
