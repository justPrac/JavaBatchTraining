package com.journaldev.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.journaldev.model.Employee;
import com.journaldev.model.EmployeeMapper;


@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	

	private final String SQL_FIND_EMPLOYEE = "select * from employee where id = ?";
	private final String SQL_DELETE_EMPLOYEE = "delete from employee where id = ?";
	private final String SQL_UPDATE_EMPLOYEE = "update employee set empName = ?, empMailId = ?, empContactNumber  = ? where id = ?";
	private final String SQL_GET_ALL = "select * from employee";
	private final String SQL_INSERT_EMPLOYEE = "insert into employee(empName, empMailId, empContactNumber) values(?,?,?)";

	/*@Autowired
	public EmployeeDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}*/

	/*@Autowired
	public EmployeeDAOImpl(DataSource dataSource) {
		System.out.println("data" + dataSource);
		System.out.println("data1" + jdbcTemplate);
		
		jdbcTemplate.setDataSource(dataSource);
		System.out.println("data============>" + dataSource);
		
	}*/
	
	
	public Employee getEmployeeById(Integer id) {
		return jdbcTemplate.queryForObject(SQL_FIND_EMPLOYEE, new Object[] { id }, new EmployeeMapper());
	}

	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query(SQL_GET_ALL, new EmployeeMapper());
	}                

	public boolean deleteEmployee(Employee employee) {
		return jdbcTemplate.update(SQL_DELETE_EMPLOYEE, employee.getId()) > 0;
	}

	public boolean updateEmployee(Employee employee) {
		return jdbcTemplate.update(SQL_UPDATE_EMPLOYEE, new Object[]{employee.getEmpName(), employee.getEmpMailId(), employee.getEmpContactNumber(),
				employee.getId()}) > 0;
	}

	public boolean createEmployee(Employee employee) {
		return jdbcTemplate.update(SQL_INSERT_EMPLOYEE, employee.getEmpName(), employee.getEmpMailId(), employee.getEmpContactNumber()) > 0;
	}
}
