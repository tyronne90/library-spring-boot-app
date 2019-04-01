package com.sgic.library.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sgic.library.entities.MainClassification;
import com.sgic.library.repository.MainClassificationRepository;

@Service
public class MainClassificationImpl implements MainClassificationService {

	@Autowired
	MainClassificationRepository mainClassRepository;
	@Override
	public void saveMainClassification(@Valid @RequestBody MainClassification mainClass) {
		mainClassRepository.save(mainClass);		
	}
	@Override
	public List<MainClassification> getAllMainClass() {
		return mainClassRepository.findAll();
	}
	@Override
	public MainClassification getMainClassificationById(Long mainClassId) {
		return mainClassRepository.findMainClassificationByMainClassId(mainClassId);
		//return null;
	}

}
