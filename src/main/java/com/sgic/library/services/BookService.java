package com.sgic.library.services;

import java.util.List;

import com.sgic.library.entities.Book;

public interface BookService {
	void saveBook(Book book);		//	Save Book
	List<Book> getAllBook();		//	Get All Book
	Book getBookById(String id);	//	Get Book By ID
	Book deleteBookById(String id);	//	Delete Book
	void updateBook(Book book);		//	Update Book
}
