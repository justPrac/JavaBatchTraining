package com.java.operators;

import java.util.Scanner;

public class _1_Division
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int num = getInt(-21000000, 21000000, in);
		String s = " ";
		
		if(num % 3 == 0)
			s = "Consultadd ";
		if(num % 5 == 0)
			s += "JAVA Training ";
			
		System.out.println(s.substring(0, s.length()-1));
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
