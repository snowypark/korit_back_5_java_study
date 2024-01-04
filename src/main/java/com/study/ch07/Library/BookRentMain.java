package com.study.ch07.Library;

import java.util.Scanner;

public class BookRentMain {
    public static void main(String[] args) {

        BookService bookService = new BookService();
        Scanner scanner = new Scanner(System.in);

        String bookName = null;
        String bookCode = null;
        String userId = null;
        int rentDay = 0;


        System.out.println("책 대여 서비스");

        System.out.print("책 이름>>> ");
        bookName = scanner.nextLine();
        if(bookService.isEmptyString(bookName)){
            System.out.println("책 이름을 다시 입력하세요.");
            return;
        }

        System.out.print("책 코드>>> " );
        bookCode = scanner.nextLine();
        if(bookService.isEmptyString(bookCode)){
            System.out.println("코드번호를 다시 입력하세요.");
            return;
        }

        System.out.print("회원 아이디 조회>>> " );
        userId = scanner.nextLine();
        if(bookService.isEmptyString(userId)){
            System.out.println("아이디를 다시 입력하세요.");
            return;
        }

        System.out.print("대여 일수(7일 or 14일)>>> " );
        rentDay = scanner.nextInt();

        Book book = new Book(bookName,bookCode,userId,rentDay);
        bookService.registerBookService(book);

    }
}
