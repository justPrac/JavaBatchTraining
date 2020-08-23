package com.websystique.spring.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Employee;


@Repository("employeeDaoImpl1")
public class EmployeeDaoImpl1 implements EmployeeDao{

   @Override
	public void saveInDatabase(Employee employee) {
		
		System.out.println("employeeDaoImpl1:: Another implementation");
	}

	@Override
	public String getConnection() {
		
		return "employeeDaoImpl1:: Manish Negi";
	}

}
