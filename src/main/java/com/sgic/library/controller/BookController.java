package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.Book;
import com.sgic.library.services.BookService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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
	
	@GetMapping("/getBookTable")
	public List<Book> fetchBookTable(){
		return bookService.fetchBookTable();
	}
	
	
	@GetMapping("/getBookById/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") String id){
		return new ResponseEntity<Book>(bookService.getBookById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable("id") String id) {
		bookService.deleteBookById(id);
		return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/updateBook")
	public ResponseEntity<Book> updateBook(@Valid @RequestBody Book book) {
		bookService.updateBook(book);
		return new ResponseEntity<Book>(book, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getBookByMainClassId/{mainClassId}")
	public List<Book> getBookByMainClassId(@PathVariable("mainClassId") Long mainClassId){
		return bookService.getBookByMainClassId(mainClassId);
	}
	
	@GetMapping("/getBookBySubClassId/{subClassId}")
	public List<Book> getBookBySubClassId(@PathVariable("subClassId") String subClassId){
		return bookService.getBookBySubClassId(subClassId);
	}
	
	@GetMapping("/getBookByBookName/{bookName}")
	public List<Book> getBookByBookName(@PathVariable("bookName") String bookName){
		return bookService.getBookByBookName(bookName);
	}
	
	
}