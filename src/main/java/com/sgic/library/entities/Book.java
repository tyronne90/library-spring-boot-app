package com.sgic.library.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "library", name="book")
public class Book implements Serializable{

 @Id
 String id;
 String bookName;
 
 
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
}
