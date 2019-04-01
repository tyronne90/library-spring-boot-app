package com.sgic.library.services;


import java.util.List;

import com.sgic.library.entities.MainClassification;

public interface MainClassificationService {
	void saveMainClassification(MainClassification mainClass);
	List<MainClassification> getAllMainClass();
	MainClassification getMainClassificationById(Long mainClassId);
}
