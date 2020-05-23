package com.java.loops;

import java.util.Scanner;

public class _2_UserInputSum
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Require 10 values to be entered.");
		
		double sum = 0;
		int maxCount = 2;
		
		for(int i = 0; i < maxCount; i++)
		{
			System.out.print("Please enter value("+ (i+1) +"): ");
			
			while(!in.hasNextDouble())
			{
				in.next();
				System.out.println("Invalid value entered. Please try again!");
				System.out.print("Please enter value("+ (i+1) +"): ");
			}
			sum += in.nextDouble(); 
		}
		
		System.out.println("Sum: " + sum + ", and Average: " + (sum/maxCount));
		
		in.close();
	}

}
