package com.sgic.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.library.entities.MainClassification;

public interface MainClassificationRepository extends JpaRepository<MainClassification, String>{
	MainClassification findMainClassificationByMainClassId(Long mainClassId);
}
