package com.websystique.spring.model;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("empBean")
public class Employee {

	private int id;

	private String name = "Test";

	private LocalDate assessmentDate;

	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(LocalDate assessmentDate) {
		this.assessmentDate = assessmentDate;
	}
	
	public void initBean(){
		System.out.println("-----InitMethod");
	}
	public void initBean_1(){
		System.out.println("-----InitMethod_1");
	}
	
	public void destroyBean(){
		System.out.println("-----Bean destroyed");
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", assessmentDate="
				+ assessmentDate + "]";
	}

}
