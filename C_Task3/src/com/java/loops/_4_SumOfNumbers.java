package com.java.loops;

import java.util.Scanner;

public class _4_SumOfNumbers
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		
		if(in.hasNextInt())
		{
			printSum(in.nextInt());
		}
		else
		{
			System.out.println("Invalid input!");
		}
		
		in.close();
	}

	private static void printSum(int n)
	{
		
		/*
		 * int sum = n*(n+1)/2;
		 */
		
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println("The sum of all the numbers from 1 to " + n + " is: " + sum);
	}

}
