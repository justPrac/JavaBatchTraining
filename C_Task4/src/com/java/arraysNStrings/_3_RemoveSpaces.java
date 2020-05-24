package com.java.arraysNStrings;

public class _3_RemoveSpaces
{

	public static void main(String[] args)
	{
		String str = "Hello! This Is A String With S p a c e s...!";
		System.out.println("Original String: " + str);
		System.out.println("Processed String: " + removeSpaces(str));
	}
	
	private static String removeSpaces(String str)
	{
		return (str.replaceAll(" ", ""));
	}

}
