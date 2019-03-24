package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.Book;
import com.sgic.library.services.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;

	@PostMapping("/saveBook")
	public HttpStatus createBook(@Valid @RequestBody Book book){
		bookService.saveBook(book);
		return HttpStatus.CREATED;
	}
	
	@GetMapping("/getAllBook")
	public List<Book> getAllBook(){
		return bookService.getAllBook();
	}
	
	@GetMapping("/geBookById/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") String id){
		return new ResponseEntity<Book>(bookService.geBookById(id), HttpStatus.OK);
		
	}
	
	
	
	
}