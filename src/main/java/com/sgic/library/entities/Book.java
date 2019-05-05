package com.sgic.library.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonBackReference;

@SuppressWarnings("serial")
@Entity
@Table(schema = "library", name="book")
public class Book implements Serializable{

 @Id
 String id;
 String bookName;
 
 @OneToOne
	@JoinColumn(name="mainClassId", nullable=false)
// @JsonBackReference
	MainClassification mainClassification;

 @OneToOne
	@JoinColumn(name="subClassId", nullable=false)
// @JsonBackReference
	SubClassification subClassification;

 
public MainClassification getMainClassification() {
	return mainClassification;
}
public void setMainClassification(MainClassification mainClassification) {
	this.mainClassification = mainClassification;
}
public SubClassification getSubClassification() {
	return subClassification;
}
public void setSubClassification(SubClassification subClassification) {
	this.subClassification = subClassification;
}
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
