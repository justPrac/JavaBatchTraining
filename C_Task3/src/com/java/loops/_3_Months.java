package com.java.loops;

import java.util.Scanner;

public class _3_Months
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the month number: ");
		
		if(in.hasNextInt())
		{
			daysInMonth(in.nextInt());
		}
		else
			System.out.println("Invalid Details");
		in.close();
	}

	private static void daysInMonth(int n)
	{
		switch(n)
		{
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12: 
				System.out.println("The number of days in month #" + n + " is: " + 31);
				break;
			case 2: 
				//Leap year NOT accounted!
				System.out.println("The number of days in month #" + n + " is: " + 28);
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("The number of days in month #" + n + " is: " + 30);
				break;
			default: 
				System.out.println("Invalid Details");
				break;
		}
	}

}
