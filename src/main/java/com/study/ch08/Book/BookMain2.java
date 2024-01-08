package com.study.ch08.Book;

import com.study.ch08.car.Car;

import java.util.Scanner;

public class BookMain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);

        while (loopFlag) {
            System.out.println("도서관 대출 프로그램");
            System.out.println("1. 책 대출");
            System.out.println("2. 대출 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("선택 >>> ");
            selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                loopFlag = false;
                System.out.println("프로그램이 종료합니다...");

            } else if ("1".equals(selectedMenu)) {
                String title = null;
                String writer = null;

                if (bookService.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }
                System.out.println("<< 책 대출 서비스 >>\n");


                System.out.print("첵 제목 입력: ");
                title = scanner.nextLine();
                System.out.print("저자 입력");
                writer = scanner.nextLine();

                Book book = new Book(title, writer);
                bookService.append(book);

            } else if ("2".equals(selectedMenu)) {
                System.out.println("<< 대출 도서 조회 >>");

                bookService.printBookArray();


        }else{
            System.out.println("다시 입력해 주세요.");
        }


    }

        System.out.println("프로그램이 종료했습니다.");
    }

}

