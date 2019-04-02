package com.sgic.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.library.entities.Book;

public interface BookRepository extends JpaRepository <Book, String> {
	Book findBookById(String id);
	List<Book> findBookByMainClassificationMainClassId(Long mainClassId);
	List<Book> findBookBySubClassificationSubClassId(String subClassId);
	
	String fetchBookByName = "SELECT * FROM book WHERE book_name LIKE %?1%";
	@Query(value = fetchBookByName, nativeQuery=true)
	List<Book> findBookByBookName(String bookName);
}
