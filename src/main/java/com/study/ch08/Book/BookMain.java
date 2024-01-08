package com.study.ch08.Book;

import com.study.ch08.Member.Member;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Book[] books = new Book[3];

        while (loopFlag) {

            System.out.println("도서관 대출 프로그램");
            System.out.println("1. 책 대출");
            System.out.println("2. 대출 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("선택 >>> ");
            selectedMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectedMenu)) {
                loopFlag = false;
                System.out.println("프로그램이 종료합니다...");

            }else if("1".equals(selectedMenu)) {

                String title = null;
                String writer= null;

                System.out.println("<< 책 대출 서비스 >>\n");

                System.out.print("첵 제목 입력: ");
                title = scanner.nextLine();
                System.out.print("저자 입력");
                writer= scanner.nextLine();

//                Book book = new Book(title, writer);
                books[0] = new Book(title, writer);

                for(int i = 0; i < books.length ; i++){
                    if (books[i] == null) {
                    continue;
                }
                    System.out.println(books[i].toString());
                }

                }else if("2".equals(selectedMenu)) {

                System.out.println("<< 대출 도서 조회 >>");

                for(int i = 0; i < books.length ; i++){
                    System.out.print(i );
                    if(books[i] == null) {
                        System.out.println("> x");
                        continue;
                    }
                    System.out.println(books[i].toString());
                }
                System.out.println();

            }else {
                System.out.println("다시 입력해 주세요.");
            }

        }

        System.out.println("프로그램이 종료했습니다.");

    }
}
