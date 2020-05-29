package com.java.model;

public class Employee
{
	private String name;
	private EmployeeId id;
	
	public Employee(String name, int id)
	{
		this.id = new EmployeeId(id);
		this.name = name;
	}
	
	public Employee(String name, EmployeeId id)
	{
		this.id = id;
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id.getId();
	}

	public void setId(int id)
	{
		this.id.setId(id);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		
		if(obj instanceof Employee)
		{
			Employee e = (Employee)obj;
			return (this.name.equalsIgnoreCase(e.name) && this.id.equals(e.id));
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString()
	{
		String emp = "[ID: " + this.getId() + ", Name: " + this.name + "]";
		return emp;
	}
	
}
