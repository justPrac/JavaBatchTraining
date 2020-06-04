package com.java.spring.driver;

import com.java.spring.model.Department;
import com.java.spring.model.University;

public class Diver
{
	public static void main(String[] args)
	{
		 University u1 = new University();
		 System.out.println(u1);
		 
		 u1 = new University("Math");
		 System.out.println(u1);
		 
		 u1 = new University(new Department("Science"));
		 System.out.println(u1);
	}
}
