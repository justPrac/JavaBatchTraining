package com.java.operators;

import java.util.Scanner;

public class _8_CharacterEvaluation
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a character(extra characters entered will be ignored): ");
		if(in.hasNext())
		{
			char c = in.next().toLowerCase().charAt(0);
			
			if(c == 'r' || c == 'a' || c == 'n' || c == 'd' || c == 'o' || c == 'm')
				System.out.println("FOUND");
			
			else System.out.println("NOT FOUND");
		}
		
		in.close();
	}

}
