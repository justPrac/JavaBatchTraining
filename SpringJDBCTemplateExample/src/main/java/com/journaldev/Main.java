package com.journaldev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.journaldev.model.Employee;
import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.dao.EmployeeDAO;


public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		

		System.out.println("List of Employees :");

		/*for (Employee emp : employeeDAO.getAllEmployees()) {
			System.out.println(emp);
		}*/
		
		Employee emp = employeeDAO.getEmployeeById(12);
		System.out.println(" empName:= " +  emp.getEmpName() + "empMailId: " + emp.getEmpMailId());
		
		
		emp.setEmpName("++++HelloRicha");
		emp.setEmpMailId("+++HelloRicha");
		System.out.println("Result " + employeeDAO.updateEmployee(emp));
		
		Employee emp1 = employeeDAO.getEmployeeById(12);
		System.out.println(" empName:= " +  emp1.getEmpName() + "empMailId: " + emp1.getEmpMailId());
		
		
	
		Employee empnew = new Employee("suraj", "suraj@gmail.com", "39223238293");
		
		employeeDAO.createEmployee(empnew);
		
		
		
		context.close();
	}
}
