package com.sgic.library.services;

import java.util.List;

import com.sgic.library.entities.SubClassification;

public interface SubClassificationService {
	
	void saveSubClassification(SubClassification subClass); 					// Save SubClassification
	List<SubClassification> getAllSubClass(); 									// fetch all SubClassification
	SubClassification getSubClassificationById(String subClassId); 				// fetch SubClassification By using SubClassification Id
	List<SubClassification> getSubClassificationByMainClassId(Long mainClassId); // fetch SubClassification By using MainClassification Id
	Object[] getSubClassName(); 												// fetch SubClassification Name Only
	Object[] getSubClassNameByMainClassId(Long mainClassId); 					// fetch SubClassification Name By using MainClassification Id
	void updateSubClassification(SubClassification subClass);
	SubClassification deleteSubClassById(String subClassId);
}
