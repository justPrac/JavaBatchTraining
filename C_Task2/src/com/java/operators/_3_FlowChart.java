package com.java.operators;

public class _3_FlowChart
{

	public static void main(String[] args)
	{
		int a = 10, b = 20, c = 30;
		double avg = (a+b+c)/3;
		System.out.println("avg = " + avg);
		
		if(avg > a && avg > b && avg > c)
		{
			System.out.println("avg is higher than a, b, c.");
		}
		else if(avg > a && avg > b)
		{
			//Seems to be provided a wrong instruction here
			System.out.println("avg is higher than a, b, c.");
		}
		else if(avg > a && avg > c)
		{
			System.out.println("avg is higher than a, c.");
		}
		else if(avg > b && avg > c)
		{
			System.out.println("avg is higher than b, c.");
		}
		else if(avg > a)
		{
			System.out.println("avg is just higher than a.");
		}
		else if(avg > b)
		{
			System.out.println("avg is just higher than b.");
		}
		else if(avg > c)
		{
			System.out.println("avg is just higher than c.");
		}
	}

}
