package com.CTS_DN.di.service;

import com.CTS_DN.di.book.Book;
import com.CTS_DN.di.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // 🔧 Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookTitle() {
        Book book = bookRepository.getBook();
        System.out.println("Book title: " + book.getTitle());
    }
}
