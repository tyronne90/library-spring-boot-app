package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.SubClassification;
import com.sgic.library.services.SubClassificationService;

@RestController
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
	
}
