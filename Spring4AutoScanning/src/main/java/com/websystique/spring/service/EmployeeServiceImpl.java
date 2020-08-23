package com.websystique.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.websystique.spring.dao.EmployeeDao;
import com.websystique.spring.dao.EmployeeDaoImpl;
import com.websystique.spring.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private DateService dateService;
	
	//@Autowired
	//private EmployeeDao employeeDao2;
	
	@Autowired
	@Qualifier("employeeDaoImpl")
	private EmployeeDao employeeDaoTest;
	
	
	
	@Override
	public void testConnection(){
		System.out.println("I ama here");
		employeeDaoTest.getConnection();
	}

	public void registerEmployee(Employee employee) {
		employee.setAssessmentDate(dateService.getNextAssessmentDate());
		
		System.out.println("Port number is");
		
		//Checking if the bean on loading calls the init method or not by accessing the initialized employee object
		/*Employee emp = ((EmployeeDaoImpl)employeeDao).getEmployee();
		emp.setName("Manish");
		emp.setId(12354);*/
		
		employeeDaoTest.saveInDatabase(employee);
		employeeDaoTest.getConnection();
	}
	
}
