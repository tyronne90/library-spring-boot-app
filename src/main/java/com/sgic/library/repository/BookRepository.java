package com.sgic.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.library.entities.Book;

public interface BookRepository extends JpaRepository <Book, String> {
	Book findBookById(String id);
}
