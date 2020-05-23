package com.java.loops;

import java.util.Scanner;

public class _1_MultiplicationTable
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number you want the table for: ");
		
		if(in.hasNextInt())
			printTable(in.nextInt());
		else
			System.out.println("Invalid number entered!");
		
		in.close();
	}

	private static void printTable(int n)
	{
		for(int i = 1; i < 11; i++)
		{
			System.out.println(n + " X " + i + " = " + (n*i));
		}
	}

}
