package com.sgic.library.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(schema = "library", name = "subclassification")
public class SubClassification implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String subClassId;
	private String subClassName;
	
	@ManyToOne
	@JoinColumn(name="mainClassId", nullable=false)
//	@JsonBackReference
	MainClassification mainClassification;
	
	public MainClassification getMainClassification() {
		return mainClassification;
	}
	public void setMainClassification(MainClassification mainClassification) {
		this.mainClassification = mainClassification;
	}
	public String getSubClassId() {
		return subClassId;
	}
	public void setSubClassId(String subClassId) {
		this.subClassId = subClassId;
	}
	public String getSubClassName() {
		return subClassName;
	}
	public void setSubClassName(String subClassName) {
		this.subClassName = subClassName;
	}
	
}
