package com.java.objects.employee;

public class Employee
{
	private String name;
	private String address;
	private double salary;
	private int joiningYear;
	
	public Employee(String name, String address, double salary, int joiningYear)
	{
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.joiningYear = joiningYear;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public int getJoiningYear()
	{
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear)
	{
		this.joiningYear = joiningYear;
	}
	
	@Override
	public String toString()
	{
		String s = String.format("%-15s%-12s%s", this.name, this.joiningYear, this.address);
		return s;
	}
}
