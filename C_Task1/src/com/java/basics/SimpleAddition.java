package com.java.basics;

import java.util.Scanner;

public class SimpleAddition
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int num1 = getInt(1, 10, in);
		int num2 = getInt(1, 10, in);
		
		int z = num1 + num2;
		int results = z + 30;		
		System.out.println("The final result is: " + results);
		
		in.close();
	}

	private static int getInt(int min, int max, Scanner in)
	{
		do
		{
			System.out.print("Please enter a number (" + min + "-" + max + "): ");
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
				System.out.println("Error! Not a number!");
				in.next(); //Capture the input buffer
			}
		}while(true);
	}

}
