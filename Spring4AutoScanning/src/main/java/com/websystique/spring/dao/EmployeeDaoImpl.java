package com.websystique.spring.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Employee;

@Qualifier("employeeDao")
@Repository
public class EmployeeDaoImpl implements EmployeeDao, InitializingBean  {
	private int port;
	
	private Employee empInst;
	


	public void saveInDatabase(Employee employee) {

		/*
		 * Logic to save in DB goes here
		 */
		System.out.println("Employee "+employee.getName()+" is registered for assessment on "+ employee.getAssessmentDate());
		
		
		
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {//To call the method on bean loading in the container
		System.out.println("My bean got called");
		port = 8080;
		empInst = new Employee();
	}

	public Employee getEmployee(){
		return empInst;
	}

	@Override
	public String getConnection() {
		// TODO Auto-generated method stub
		return "Impl connection";
	}
}
