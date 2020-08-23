package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websystique.springmvc.model.StudentInfo;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	/*@Autowired
	private StudentDaoImpl studentDao;

	public List<StudentInfo> fetchStudents() {
		return studentDao.findAll();
	}*/

}
