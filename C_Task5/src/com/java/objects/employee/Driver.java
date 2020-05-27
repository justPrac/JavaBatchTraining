package com.java.objects.employee;

public class Driver
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee("Robert", "64C- Walls Streat", 85000, 1994);
		Employee e2 = new Employee("Sam", "68D- Walls Streat", 78000, 2000);
		Employee e3 = new Employee("John", "26B- Walls Streat", 125000, 1999);
		
		String heading = String.format("%-15s%-15s%s", "Name", "Year", "Address");
		System.out.println(heading);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
