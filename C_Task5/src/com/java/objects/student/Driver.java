package com.java.objects.student;

import java.util.LinkedList;
import java.util.List;

public class Driver
{
	public static void main(String[] args)
	{
		List<Student> students = new LinkedList<Student>();
		students.add(new Student());
		students.add(new Student("Rob"));
		students.add(new Student("Sam"));
		students.add(new Student("Emina"));
		
		for (Student student : students)
		{
			System.out.println("Student name: " + student);
		}
	}

}
