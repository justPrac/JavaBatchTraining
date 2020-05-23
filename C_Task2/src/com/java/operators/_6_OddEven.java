package com.java.operators;

import java.util.Scanner;

public class _6_OddEven
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int num = getInt(-21000000, 21000000, in);
		
		if(num%2 != 0)
		{
			System.out.println("NEW");
		}
		else
		{
			if(num > 1 && num < 5) System.out.println("OLD");
			else if(num >= 6 && num <= 30) System.out.println("NEW");
			else System.out.println("OLD");
		}
		
		in.close();
	}
	
	private static Integer getInt(int min, int max, Scanner in)
	{
		if(min > max)
			return null;
		
		do
		{
			System.out.print("Please enter an integer number (" + min + "-" + max + "): ");
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
