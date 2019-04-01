package com.sgic.library.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(schema = "library", name="mainclassification")
public class MainClassification implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long mainClassId;
	String mainClassName;
	
	@JsonBackReference
	@OneToMany(mappedBy="mainClassification", cascade= {CascadeType.ALL})
	private List<SubClassification> subClassification;
	
	public List<SubClassification> getSubClassification() {
		return subClassification;
	}
	public void setSubClassification(List<SubClassification> subClassification) {
		this.subClassification = subClassification;
	}
	
	public Long getMainClassId() {
		return mainClassId;
	}
	public void setMainClassId(Long mainClassId) {
		this.mainClassId = mainClassId;
	}
	public String getMainClassName() {
		return mainClassName;
	}
	public void setMainCLassName(String mainCLassName) {
		this.mainClassName = mainCLassName;
	}
	
	
}
