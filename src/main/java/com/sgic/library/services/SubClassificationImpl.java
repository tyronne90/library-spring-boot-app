package com.sgic.library.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sgic.library.entities.SubClassification;
import com.sgic.library.repository.SubClassificationRepository;

@Service
public class SubClassificationImpl implements SubClassificationService {

	@Autowired
	SubClassificationRepository subClassificationRepository;
	
	@Override
	public void saveSubClassification(@Valid @RequestBody SubClassification subClass) {
		subClassificationRepository.save(subClass);
	}

	@Override
	public List<SubClassification> getAllSubClass() {
		return subClassificationRepository.findAll();
	}

}
