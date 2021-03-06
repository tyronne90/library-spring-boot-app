package com.sgic.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.library.entities.SubClassification;

public interface SubClassificationRepository extends JpaRepository<SubClassification, String>{
	SubClassification findSubClassificationBySubClassId(String subClassId);
	List<SubClassification> findSubClassificationByMainClassificationMainClassId (Long mainClassId);
	
	String findSubClassName = "SELECT sub_Class_Name from subclassification";
	@Query(value = findSubClassName, nativeQuery=true)
	Object[] findSubClassName();
		
	String fetchSubClassNameByMainClassId = "SELECT sub_Class_Name from subclassification WHERE main_Class_Id=?1";
	@Query(value = fetchSubClassNameByMainClassId, nativeQuery=true)
	Object[] fetchSubClassNameByMainClassId(Long mainClassId);
	
	String fetchOneSubClassTable = "SELECT s.sub_Class_Id, s.sub_Class_Name, s.main_Class_Id, m.main_Class_Name FROM subclassification s LEFT JOIN mainclassification m ON s.main_Class_Id = m.main_Class_Id WHERE sub_Class_Id=?1";
	@Query(value = fetchOneSubClassTable, nativeQuery=true)
	List<SubClassification> fetchOneSubClassTable(String subClassId);
	

}
