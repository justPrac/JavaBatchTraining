package com.java.spring.model;

public class Department
{
	private String deptName;
	
	public Department()
	{
		this.deptName = "default";
	}
	
	public Department(String deptName)
	{
		this.deptName = deptName;
	}
	
	public String getDeptName()
	{
		return deptName;
	}
	
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		
		if(obj instanceof Department)
		{
			return (this.deptName.equalsIgnoreCase(((Department)obj).getDeptName()));
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return this.deptName;
	}
}
