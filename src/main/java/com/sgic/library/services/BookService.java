package com.sgic.library.services;

import java.util.List;

import com.sgic.library.entities.Book;

public interface BookService {
	void saveBook(Book book);
	 List<Book> getAllBook();
	 Book geBookById(String id);
}
