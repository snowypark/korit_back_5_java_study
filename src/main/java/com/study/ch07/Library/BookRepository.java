package com.study.ch07.Library;

public class BookRepository {

    static void saveBook(Book book) {

        BookDB bookDB = new BookDB();
        bookDB.insertDB(book);

    }
}
