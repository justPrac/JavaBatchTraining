package com.java.operators;

import java.util.Scanner;

public class _4_Loop
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		
		do
		{
			System.out.print("Please enter a number: ");
			if(in.hasNextInt())
			{
				num = in.nextInt();
				if(num >= 0)
					System.out.println("Good Going");
				else
				{
					System.out.println("It's Over");
					break;
				}
			}
			else
			{
				System.out.println("Not a valid number! Try Again");
				in.next();
			}
			
		}while(num >= 0);
				
		in.close();
	}
}
