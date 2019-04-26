package com.sgic.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.library.entities.MainClassification;

public interface MainClassificationRepository extends JpaRepository<MainClassification, Long>{
	MainClassification findMainClassificationByMainClassId(Long mainClassId);
	
	String findMainClassId = "SELECT main_Class_Id from mainclassification";
	@Query(value = findMainClassId, nativeQuery=true)
	Object[] findMainClassId();
}
