package com.study.ch08.Book;

public class Book {
    String title;
    String writer;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }

    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }
}