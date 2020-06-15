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
		
		Employee emp = employeeDAO.getEmployeeById(1);
		System.out.println(" empName:= " +  emp.getEmpName() + "empMailId: " + emp.getEmpMailId());
		
		
		emp.setEmpName("++++HelloRicha");
		emp.setEmpMailId("+++HelloRicha");
		System.out.println("Result " + employeeDAO.updateEmployee(emp));
		
		Employee emp1 = employeeDAO.getEmployeeById(1);
		System.out.println(" empName:= " +  emp1.getEmpName() + "empMailId: " + emp1.getEmpMailId());
		
		
	
		Employee empnew = new Employee("suraj", "suraj@gmail.com", "39223238293");
		
		employeeDAO.createEmployee(empnew);
		
		
		

		/*System.out.println("\nGet person with ID 2");

		Person personById = personDAO.getPersonById(2L);
		System.out.println(personById);

		System.out.println("\nCreating person: ");
		Person person = new Person(4L, 36, "Sergey", "Emets");
		System.out.println(person);
		personDAO.createPerson(person);
		System.out.println("\nList of person is:");

		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}

		System.out.println("\nDeleting person with ID 2");
		personDAO.deletePerson(personById);

		System.out.println("\nUpdate person with ID 4");

		Person pperson = personDAO.getPersonById(4L);
		pperson.setLastName("CHANGED");
		personDAO.updatePerson(pperson);

		System.out.println("\nList of person is:");
		for (Person p : personDAO.getAllPersons()) {
			System.out.println(p);
		}*/

		context.close();
	}
}
