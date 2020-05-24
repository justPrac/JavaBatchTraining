package com.java.loops;

import java.util.Scanner;

public class _5_LongDigits
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		
		if(in.hasNextLong())
		{
			printLengthNSum(in.nextLong());
		}
		else
		{
			System.out.println("Invalid input!");
		}
		
		in.close();
	}

	private static void printLengthNSum(long l)
	{
		long sum = 0;
		int digitCount = 1;
		
		while(l >= 10)
		{
			sum += (l%10);
			l = l/10;
			digitCount++;
		}
		sum += l;
		System.out.println("The #digits: " + digitCount + ", and the sum: " + sum);
	}

}
