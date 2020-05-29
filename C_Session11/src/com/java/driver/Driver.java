package com.java.driver;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import com.java.model.Employee;
import com.java.model.EmployeeId;

public class Driver
{
	public static void main(String[] args)
	{
		Map<EmployeeId, Employee> employees = new HashMap<EmployeeId, Employee>();
		Map<EmployeeId, Employee> employees_1 = new Hashtable<EmployeeId, Employee>();
		
		for(int i = 0; i < 5; i++)
		{
			employees.put(new EmployeeId(i), new Employee("Emp"+i, i));
			employees_1.put(new EmployeeId(i), new Employee("Emp"+i, i));
		}
		
		System.out.println("Employee HashMap Printing!");
		printEmployees(employees);
		
		System.out.println("\nFind emp with id 3: " + findEmp(3, employees));
		
		System.out.println("\nEmployee Set Printing!");
		
		for(Employee e : getEmpSet(employees))
		{
			System.out.println(e);
		}
		
		System.out.println("\nEmployee HashTable Printing!");
		printEmployees(employees_1);
	}
	
	public static void printEmployees(Map<EmployeeId, Employee> emp)
	{
		for(Employee e : emp.values())
		{
			System.out.println(e);
		}
	}
	
	public static Employee findEmp(int id, Map<EmployeeId, Employee> emp)
	{
		return emp.get(new EmployeeId(id));		
	}
	
	public static Set<Employee> getEmpSet(Map<EmployeeId, Employee> emp)
	{
		Set<Employee> empSet = new HashSet<Employee>();
		
		for(Employee e : emp.values())
		{
			empSet.add(e);
		}
		return empSet;
	}

}
