package com.java.basics;

import java.util.Scanner;

public class SwapNumbers
{
	public static void main(String[] args)
	{
		System.out.println("<-- Swapping using a Third Variable! -->");
		swapWithVariable();
		
		System.out.println("\n<-- Swapping without using a Third Variable! -->");
		swapWithoutVariable();
	}
	
	public static void swapWithVariable()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter x: "); 
		int x = in.nextInt();
		
		System.out.print("Please enter y: "); 
		int y = in.nextInt();
		
		//Swapping
		int result = x;
		x = y; y = result;
		
		System.out.println("**Values After Swapping**");
		System.out.println("The value of x: " + x);
		System.out.println("The value of y: " + y);
		
		in.close();
	}
	
	public static void swapWithoutVariable()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter x: "); 
		int x = in.nextInt();
		
		System.out.print("Please enter y: "); 
		int y = in.nextInt();
		
		//Swapping
		x = x+y;
		y = x-y; 
		x = x-y;
		
		System.out.println("**Values After Swapping**");
		System.out.println("The value of x: " + x);
		System.out.println("The value of y: " + y);
		
		in.close();
	}
}
