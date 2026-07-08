package com.CTS_DN.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CTS_DN.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
