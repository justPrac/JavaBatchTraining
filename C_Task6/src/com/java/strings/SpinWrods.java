package com.java.strings;

public class SpinWrods
{
	public static void main(String[] args)
	{
		String s1 = "Hey fellow warriors";
		System.out.println(s1 + ": " + spinWords(s1));
		
		String s2 = "This is a test";
		System.out.println(s2 + ": " + spinWords(s2));
		
		String s3 = "This is another test";
		System.out.println(s3 + ": " + spinWords(s3));
	}
	
	public static String spinWords(String str)
	{
		String finalStr = "";
		
		for(String s : str.split(" "))
		{
			if(s.length() > 4) finalStr += " " + spinOneWord(s);
			else finalStr += " " + s;
		}
		
		return finalStr;
	}
	
	private static String spinOneWord(String word)
	{
		String finalWord = "";
		
		for(int i = word.length()-1; i >= 0; i--)
		{
			finalWord += word.charAt(i);
		}
		
		return finalWord;
	}

}
