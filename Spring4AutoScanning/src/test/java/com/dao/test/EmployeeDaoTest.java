package com.dao.test;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.stubbing.answers.DoesNothing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.dao.EmployeeDao;
import com.websystique.spring.service.DateService;
import com.websystique.spring.service.EmployeeService;
@ContextConfiguration(classes = {AppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeDaoTest {
	
	@Mock
	EmployeeDao employeeDao;
	
	@Autowired
	private EmployeeService employeeService;
	
	 @Before
	    public void setUp() {
	        MockitoAnnotations.initMocks(this);
	    }
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		//Employee emp = new Employee();
		
		when(employeeDao.getConnection()).thenReturn("Test");
		employeeService.testConnection();
		System.out.println(employeeDao.getConnection());
		
		

	}

}
