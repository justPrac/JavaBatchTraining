package com.java.basics;

import java.util.Scanner;

public class PrintUserInput
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter any input: ");
		String input = in.nextLine();
		
		System.out.println("Your input is as follows..");
		System.out.println(input);
	}

}
