package com.java.spring.model;

public class University
{
	private Department dept;
	
	public University()
	{
		this.dept = new Department();
	}
	
	public University(String deptName)
	{
		this.dept = new Department(deptName);
	}
	
	public University(Department dept)
	{
		this.dept = dept;
	}
	
	public Department getDept()
	{
		return dept;
	}
	
	public void setDept(Department dept)
	{
		this.dept = dept;
	}
	
	@Override
	public String toString()
	{
		return ("University with dept: " + this.dept);
	}
}
