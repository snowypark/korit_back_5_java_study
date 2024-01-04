package com.study.ch07.Library;

public class Book {
    /*
        도서관 책 대여
        String BookName 책 이름
        String BookCode 책 코드
        String UserId   대출자 아이디
        int day         대출일수
     */

    String name;
    String code;
    String id;
    int day;

    Book(String name, String code, String id, int day) {
        this.name = name;
        this.code = code;
        this.id = id;
        this.day = day;
    }

}
