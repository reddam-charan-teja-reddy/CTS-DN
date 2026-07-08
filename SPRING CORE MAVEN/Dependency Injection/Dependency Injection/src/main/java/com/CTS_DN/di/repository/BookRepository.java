package com.CTS_DN.di.repository;

import com.CTS_DN.di.book.Book;

public class BookRepository {

    public Book getBook() {
        return new Book("Spring in Action");
    }
}
