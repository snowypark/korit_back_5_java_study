package com.study.ch07.Library;


public class BookService {

    boolean isEmptyString(String str) {
        if (str == null) {
            return true;
        }

        return str.isBlank();
    }


    void registerBookService(Book book) {
        BookRepository bookRepository = new BookRepository();

        System.out.println("서비스까지 데이터 전달.");

        BookRepository.saveBook(book);
    }

}
