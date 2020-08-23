package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Employee;
import com.websystique.spring.service.EmployeeService;


public class AppMain {

	
	public static void main(String args[]){
		AbstractApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		
		//AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext();
		//ctx.scan("com.websystique.spring");
		//ctx.refresh();
		
		
		EmployeeService service = (EmployeeService) ctx.getBean("employeeService");
		Employee employee = new Employee();
		employee.setName("Suraya");
		service.registerEmployee(employee);
		
		
		Employee emp1 = (Employee) ctx.getBean("empBean");
	    System.out.println("Name is from bean " + emp1.getName());
	    

		
		ctx.close();
	}
}
