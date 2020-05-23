package com.java.operators;

import java.util.Scanner;

public class _2_Calculator
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int option = displayMenu(in);
		double result = 0;
		
		switch(option)
		{
			case 1: 
				result = add(in); 
				break;
			case 2: 
				result = sub(in); 
				break;
			case 3: 
				result = div(in); 
				break;
			case 4: 
				result = mult(in); 
				break;
			case 5: 
				result = avg(in); 
				break;
		}
		
		if(result < 0) System.out.println("Oops option " + option +" is returning the negative number");
		
		System.out.println("The result is: " + result);
		
		in.close();
	}

	private static double avg(Scanner in)
	{
		int first = getInt(-21000000, 21000000, in);
		int second = getInt(-21000000, 21000000, in);
		
		return (first+second)/2;
		
	}

	private static double mult(Scanner in)
	{
		int first = getInt(-21000000, 21000000, in);
		int second = getInt(-21000000, 21000000, in);
		
		return (first*second);
	}

	private static double div(Scanner in)
	{
		int first = getInt(-21000000, 21000000, in);
		int second = 1;
		
		do
		{
			second = getInt(-21000000, 21000000, in);
			if(second == 0) System.out.println("Division by 0 not allowed. Try again!");
		
		}while(second == 0);
			
		return (first/second);
	}

	private static double sub(Scanner in)
	{
		int first = getInt(-21000000, 21000000, in);
		int second = getInt(-21000000, 21000000, in);
		
		return (first-second);
	}

	private static double add(Scanner in)
	{
		int first = getInt(-21000000, 21000000, in);
		int second = getInt(-21000000, 21000000, in);
		
		return (first+second);
	}

	private static int displayMenu(Scanner in)
	{
		String menu = "Enter 1 - Addition\n" + 
						"Enter 2 - Subtraction\n" + 
						"Enter 3 - Division\n" + 
						"Enter 4 - Multiplication\n" + 
						"Enter 5 - Average";
		System.out.println(menu);
				
		return getInt(1, 5, in);
	}
	
	private static Integer getInt(int min, int max, Scanner in)
	{
		if(min > max)
			return null;	
		do
		{
			System.out.print("Please enter a valid integer value (" + min + "-" + max + "): ");
			if(in.hasNextInt())
			{
				int input = in.nextInt();
				if(input >= min && input <= max)
				{
					return input;
				}
				else
				{
					System.out.println("Error! Number out of range!");
				}
			}
			else
			{
				System.out.println("Error! Not a valid integer number!");
				in.next(); //Capture the input buffer
			}
		}while(true);
	}

}
