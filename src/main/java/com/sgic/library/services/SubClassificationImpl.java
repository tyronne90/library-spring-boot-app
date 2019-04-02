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

	@Override
	public SubClassification getSubClassificationById(String subClassId) {
		return subClassificationRepository.findSubClassificationBySubClassId(subClassId);
	}

	@Override
	public List<SubClassification>  getSubClassificationByMainClassId(Long mainClassId) {
		return subClassificationRepository.findSubClassificationByMainClassificationMainClassId(mainClassId);
	}

	@Override
	public Object[] getSubClassName() {
		 Object[] subName = subClassificationRepository.findSubClassName();
		 return subName;
	}

	@Override
	public Object[] getSubClassNameByMainClassId(Long mainClassId) {
		Object[] getSubName = subClassificationRepository.fetchSubClassNameByMainClassId(mainClassId);
		return getSubName;
	}

	@Override
	public void updateSubClassification(SubClassification subClass) {
		String subClassId = subClass.getSubClassId();
		boolean isExist = subClassificationRepository.findSubClassificationBySubClassId(subClassId) != null;
		if(isExist) {
		subClassificationRepository.save(subClass);
		}
	}

	@Override
	public SubClassification deleteSubClassById(String subClassId) {
		subClassificationRepository.deleteById(subClassId);
		return null;
	}

}
