package com.java.arraysNStrings;

public class _6_SwapChars
{

	public static void main(String[] args)
	{
		String s1 = "heLLo WOrLd";
		System.out.println("Original String: " + s1);
		System.out.println("Processed String: " + changeCase(s1));
	}
	
	private static String changeCase(String str)
	{
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			newStr += changeCharCase(str.charAt(i));
		}
		
		return newStr;
	}
	
	private static char changeCharCase(char c)
	{
		if(c >= 'A' && c <= 'Z') c += 'a' - 'A';
		else if(c >= 'a' && c <= 'z') c -= 'a' - 'A';
		
		return c;
	}

}
