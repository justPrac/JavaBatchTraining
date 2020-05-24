package com.java.arraysNStrings;

public class _6_SwapChars
{

	public static void main(String[] args)
	{
		System.out.println(changeCharCase('a'));
		System.out.println(changeCharCase('Z'));
		System.out.println(changeCharCase('A'));
		System.out.println(changeCharCase('z'));
	}
	
	private static char changeCharCase(char c)
	{
		if(c >= 'A' && c <= 'Z') c += 'a' - 'A';
		else if(c >= 'a' && c <= 'z') c -= 'a' - 'A';
		
		return c;
	}

}
