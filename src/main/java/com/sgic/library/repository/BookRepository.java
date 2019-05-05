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
	
	String fetchBookTable = "SELECT b.id, b.book_name, b.main_class_id, b.sub_class_id, m.main_class_name, s.sub_class_name FROM book b \r\n" + 
			"	LEFT JOIN mainclassification m ON b.main_class_id = m.main_class_id\r\n" + 
			"	LEFT JOIN subclassification s ON b.sub_class_id = s.sub_class_id\r\n" + 
			"	ORDER BY b.id;";
	@Query(value = fetchBookTable, nativeQuery=true)
	List<Book> fetchBookTable();
	
	
	
	
	
}
