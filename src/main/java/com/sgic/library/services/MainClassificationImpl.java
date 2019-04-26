package com.sgic.library.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.entities.MainClassification;
import com.sgic.library.repository.MainClassificationRepository;

@Service
public class MainClassificationImpl implements MainClassificationService {

	@Autowired
	MainClassificationRepository mainClassRepository;
	@Override
	public void saveMainClassification(MainClassification mainClass) {
		mainClassRepository.save(mainClass);		
	}
	@Override
	public List<MainClassification> getAllMainClass() {
		return mainClassRepository.findAll();
	}
	@Override
	public Object[] getAllMainClassId() {
		return mainClassRepository.findMainClassId();
	}
	@Override
	public MainClassification getMainClassificationById(Long mainClassId) {
		return mainClassRepository.findMainClassificationByMainClassId(mainClassId);
	}
	
	@Override
	public void updateMainClassification(MainClassification mainClass) {
		Long mainClassId = mainClass.getMainClassId();
		boolean isExist = mainClassRepository.findMainClassificationByMainClassId(mainClassId) != null;
		if(isExist) {
		mainClassRepository.save(mainClass);
		}
	}
	@Override
	public MainClassification deleteMainClassificationById(Long mainClassId) {
		 mainClassRepository.deleteById(mainClassId);
		 return null;
	}
	

}
