package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.model.Employee;


public interface EmployeeDAO {
	Employee getEmployeeById(Integer id);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(Employee employee);

	boolean updateEmployee(Employee employee);

	boolean createEmployee(Employee employee);
}
