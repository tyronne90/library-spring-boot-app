package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.MainClassification;
import com.sgic.library.services.MainClassificationService;

@RestController
public class MainClassificationController {

	@Autowired
	MainClassificationService mainClassService;
	
	@PostMapping("/saveMainClass")
	public HttpStatus saveMainClass(@Valid @RequestBody MainClassification mainClass) {
		mainClassService.saveMainClassification(mainClass);;
		return HttpStatus.CREATED;
	}
	@GetMapping("/getAllMainClass")
	public List<MainClassification> getAllMainClass() {
		return mainClassService.getAllMainClass();
	}
	@GetMapping("/getMainClassById/{mainClassId}")
	public ResponseEntity<MainClassification> getMainClassificationById(@PathVariable("mainClassId") Long mainClassId){
		return new ResponseEntity<MainClassification>(mainClassService.getMainClassificationById(mainClassId), HttpStatus.OK);
	}
	@PutMapping("/updateMainClassification")
	public ResponseEntity<MainClassification> updateBook(@Valid @RequestBody MainClassification mainClass) {
		mainClassService.updateMainClassification(mainClass);
		return new ResponseEntity<MainClassification>(mainClass, HttpStatus.ACCEPTED);
	}
}
