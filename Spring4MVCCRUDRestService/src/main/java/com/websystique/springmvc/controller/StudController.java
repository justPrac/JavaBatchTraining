package com.websystique.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springmvc.model.StudentInfo;
import com.websystique.springmvc.service.StudentService;




@RestController
@RequestMapping("/api")
public class StudController {
	
	@Autowired
	private StudentService studentService;
	
	//@RequestMapping(value = "/students/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   /* public ResponseEntity<List<StudentInfo>> getStudentInfo(@PathVariable("id") long id){
		studentService.fetchStudents();
    }*/
	
	
	/*@RequestMapping(value = "/students/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentInfo>> addStudentInfo(StudentInfo std){
		studentService.fetchStudents();
    }*/
	
	
}


