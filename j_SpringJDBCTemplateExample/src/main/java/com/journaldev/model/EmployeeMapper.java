package com.journaldev.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {

		Employee employee = new Employee();
		employee.setId(resultSet.getInt("id"));
		employee.setEmpName(resultSet.getString("empName"));
		employee.setEmpMailId(resultSet.getString("empMailId"));
		employee.setEmpContactNumber(resultSet.getString("empContactNumber"));
		System.out.println("i==> " + i);
		return employee;
	}
}
