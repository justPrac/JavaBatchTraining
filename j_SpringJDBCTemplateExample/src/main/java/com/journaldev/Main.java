package com.journaldev;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.journaldev.model.Employee;
import com.journaldev.spring.config.AppConfig;
import com.journaldev.spring.dao.EmployeeDAO;


public class Main 
{
	
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		Scanner in = new Scanner(System.in);
		
		int choice = 0;
		do
		{
			choice = menu(in);	
			
			switch (choice)
			{
				case 1: 
					listAllEmployees(employeeDAO); break;
				case 2:
					getEmployeeById(employeeDAO, in);	break;
				case 3: 
					deleteEmployeeById(employeeDAO, in);	break;
				case 4: 
					updateEmployeeById(employeeDAO, in);	break;
				case 5: 
					createEmployee(employeeDAO, in);	break;
				case 6: 
					break;
				default: 
					System.out.println("Invalid Input! Try Again");
			}			
		}while(choice != 6);
		
		System.out.println("Thank you!");
		
		in.close();
		context.close();
	}
	
	private static void createEmployee(EmployeeDAO employeeDAO, Scanner in)
	{
		System.out.println("Please enter the following details below.");
		System.out.print("Name: "); 
		String name = in.nextLine();
		
		System.out.print("Email: "); 
		String email = in.nextLine();
		
		System.out.print("Phone: "); 
		String phone = in.nextLine();
		
		Employee empToAdd = new Employee(name, email, phone);
		employeeDAO.createEmployee(empToAdd);
		System.out.println("New Employee Created\n");
		
	}

	private static void updateEmployeeById(EmployeeDAO employeeDAO, Scanner in)
	{
		System.out.print("Please enter Employee ID: ");
		int id = in.nextInt();
		try
		{
			Employee emp = employeeDAO.getEmployeeById(id);
			System.out.println("Current Employee Details = " + emp);
			System.out.println("Please enter the following details below.");
			System.out.print("Name: "); 
			String name = in.nextLine();
			
			System.out.print("Email: "); 
			String email = in.nextLine();
			
			System.out.print("Phone: "); 
			String phone = in.nextLine();
			
			emp.setEmpContactNumber(phone);
			emp.setEmpMailId(email);
			emp.setEmpName(name);
			System.out.println("Updated Employee Details = " + emp);
			
			System.out.println("Employee details Updated!\n");
		}
		catch (EmptyResultDataAccessException e) 
		{
			System.out.println("No Employee exist with ID: " + id);
		}
		
	}

	private static void deleteEmployeeById(EmployeeDAO employeeDAO, Scanner in)
	{
		System.out.print("Please enter Employee ID to DELETE: ");
		int id = in.nextInt();
		try
		{
			Employee empToDelete = employeeDAO.getEmployeeById(id);
			employeeDAO.deleteEmployee(empToDelete);
		}
		catch (EmptyResultDataAccessException e) 
		{
			System.out.println("No Employee exist with ID: " + id);
		}
		
	}

	private static void getEmployeeById(EmployeeDAO employeeDAO, Scanner in)
	{
		System.out.print("Please enter Employee ID: ");
		int id = in.nextInt();
		try
		{
			System.out.println(employeeDAO.getEmployeeById(id));
		}
		catch (EmptyResultDataAccessException e) 
		{
			System.out.println("No Employee exist with ID: " + id);
		}
	}

	private static void listAllEmployees(EmployeeDAO employeeDAO)
	{
		System.out.println("\n**********All Employees' List**********");
		for (Employee emp : employeeDAO.getAllEmployees())
		{
			System.out.println(emp);
		}
		System.out.println("**************End of List**************\n");
	}

	private static int menu(Scanner in)
	{
		System.out.println("******************************");
		System.out.println("1. List All Employees.");
		System.out.println("2. Get Employee by ID.");
		System.out.println("3. Delete an Employee by ID.");
		System.out.println("4. Update an Employee by ID.");
		System.out.println("5. Create an Employee.");
		System.out.println("6. EXIT.");
		System.out.print("Enter your choice: ");
		
		int choice = in.nextInt();
		
		System.out.println("******************************");
		
		return choice;
	}
}
