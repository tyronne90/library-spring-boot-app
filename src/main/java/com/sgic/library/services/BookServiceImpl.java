package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.Book;
import com.sgic.library.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookRepository bookRepository;

	public void saveBook(Book book) {
		bookRepository.save(book);
	}
	
	public List<Book> getAllBook(){
		return bookRepository.findAll();
	}
	
	@Override
	public Book getBookById(String id){
		return bookRepository.findBookById(id);
	}

	public Book deleteBookById(String id) {
		 bookRepository.deleteById(id);
		 return null;
	}

	@Override
	public void updateBook(Book book) {
		bookRepository.save(book);		
	}
}
