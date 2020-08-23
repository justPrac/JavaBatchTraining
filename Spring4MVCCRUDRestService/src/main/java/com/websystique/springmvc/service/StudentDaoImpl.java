package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.StudentInfo;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
    JdbcTemplate jdbcTemplate;
	/*public StudentInfo find(int studentId) {
		Object obj[] = new Object[] { studentId };
	    StudentInfo student = jdbcTemplate.queryForObject("SELECT * FROM StudentInfo where StudentInfo = ?",
	    obj, new BeanPropertyRowMapper(StudentInfo.class));
        return student;
    }
	
	public List < StudentInfo > findAll() {
	    List < StudentInfo > studentInfos = jdbcTemplate.query("SELECT * FROM Student", new BeanPropertyRowMapper(StudentInfo.class));
        return studentInfos;
    }*/
	
	

}
