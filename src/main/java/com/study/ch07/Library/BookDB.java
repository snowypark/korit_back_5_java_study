package com.study.ch07.Library;


public class BookDB {

    void insertDB(Book book) {
        System.out.println("DB에 입력 완료");
        System.out.println("책 이름: " + book.name);
        System.out.println("책 코드: " + book.code);
        System.out.println("회원 아이디: " + book.id);
        System.out.println("대여 일수: " + book.day);
        System.out.println();
    }
}
