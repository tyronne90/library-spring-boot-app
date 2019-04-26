package com.sgic.library.services;


import java.util.List;

import com.sgic.library.entities.MainClassification;

public interface MainClassificationService {
	void saveMainClassification(MainClassification mainClass);
	List<MainClassification> getAllMainClass();
	Object[] getAllMainClassId();
	MainClassification getMainClassificationById(Long mainClassId);
	MainClassification deleteMainClassificationById(Long mainClassId);
	void updateMainClassification(MainClassification mainClass);
}
