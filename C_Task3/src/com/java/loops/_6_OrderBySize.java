package com.java.loops;

import java.util.Scanner;

public class _6_OrderBySize
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int a = getInt(in, "Please enter the first number: ");
		int b = getInt(in, "Please enter the second number: ");
		int c = getInt(in, "Please enter the third number: ");
		
		checkOrderAndPrint(a, b, c);
		
		in.close();
	}
	
	private static void checkOrderAndPrint(int a, int b, int c)
	{
		if(a > b && b > c) System.out.println("DECREASING");
		else if(a < b && b < c) System.out.println("INCREASING");
		else System.out.println("Neither increasing or decreasing order");
	}

	private static int getInt(Scanner in, String msg)
	{
		do
		{
			System.out.print(msg);
			if(in.hasNextInt())
			{
				return (in.nextInt());
			}
			else
			{
				in.next();
				System.out.println("Invalid input! Please try again.");
			}
		}while(true);
	}
}
