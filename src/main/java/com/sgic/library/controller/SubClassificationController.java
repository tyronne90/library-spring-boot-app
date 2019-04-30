package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.SubClassification;
import com.sgic.library.services.SubClassificationService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SubClassificationController {

	@Autowired
	SubClassificationService subClassService;
	
	@PostMapping("/saveSubClass")
	public HttpStatus saveSubClass(@Valid @RequestBody SubClassification subClass) {
		subClassService.saveSubClassification(subClass);
		return HttpStatus.CREATED;
	}
	@GetMapping("/getAllSubClass")
	public List<SubClassification> getAllSubClass() {
		return subClassService.getAllSubClass();
	}
//	@GetMapping("/getAllSubClassTable")
//	public List<SubClassification> getAllSubClassTable() {
//		return subClassService.fetchSubClassTable();
//	}
	@GetMapping("/getAllSubClassById/{subClassId}")
	public ResponseEntity<SubClassification> getSubClassificationById(@PathVariable("subClassId") String subClassId){
		return new ResponseEntity<SubClassification>(subClassService.getSubClassificationById(subClassId), HttpStatus.OK);
	}
	@GetMapping("/getAllSubClassByMainClassId/{mainClassId}")
	public List<SubClassification> getSubClassificationByMainClassId(@PathVariable("mainClassId") Long mainClassId){
		return subClassService.getSubClassificationByMainClassId(mainClassId);
	}
	@GetMapping("/getAllSubClassName")
	public Object[] getSubClassName(){
		 Object[] subName = subClassService.getSubClassName();
		 return subName;
	}
	@GetMapping("/getAllSubClassNameByMainClassId/{mainClassId}")
	public Object[] getSubClassNameByMainClassId(@PathVariable("mainClassId") Long mainClassId){
		 Object[] subClassName = subClassService.getSubClassNameByMainClassId(mainClassId);
		 return subClassName;
	}
	@PutMapping("/updateSubClassification")
	public ResponseEntity<SubClassification> updateBook(@Valid @RequestBody SubClassification subClass) {
		subClassService.updateSubClassification(subClass);
		return new ResponseEntity<SubClassification>(subClass, HttpStatus.OK);
	}
	@DeleteMapping("/deleteSubClassById/{subClassId}")
	public ResponseEntity<SubClassification> deleteSubClassificationById(@PathVariable("subClassId") String subClassId){
		return new ResponseEntity<SubClassification>(subClassService.deleteSubClassById(subClassId), HttpStatus.OK);
	}
	
}
