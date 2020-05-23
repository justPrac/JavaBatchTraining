package com.java.operators;

import java.util.Scanner;

public class _7_FloatNumber
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a float value: ");
		if(in.hasNextFloat())
		{
			float num = in.nextFloat();
			String msg = "";
			
			if(num == 0) msg = "Zero";
			else 
			{
				if(num > 0) 
					msg = "Positive";
				else 
					msg = "Negative";
				
				if(Math.abs(num) < 1) msg += " small";
				else if(Math.abs(num) > 1000000) msg += " large";
			}
			System.out.println(msg);
		}
		else
		{
			System.out.println("Invalid float value entered!");
		}
		
		in.close();
	}

}
