package com.study.ch08.Book;

public class BookService {

    BookRepository bookRepository;

    BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    boolean isFull() {
        return bookRepository.getEmptyIndex() == -1;
    }

    void append(Book book) {
        bookRepository.insert(book);
    }

    void printBookArray() {
        Book [] books = bookRepository.getBooksDatas();
        if (books.length == 0) {
            System.out.println("등록된 차량이 없습니다");
            return;
        }
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
}
