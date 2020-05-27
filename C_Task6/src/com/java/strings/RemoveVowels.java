package com.java.strings;

public class RemoveVowels
{
	public static void main(String[] args)
	{
		String s1 = "Hey Mama!";
		System.out.println(s1 + ": " + removeVowels(s1));
		
		s1 = "The quick brown fox jumps over the lazy dog";
		System.out.println(s1 + ": " + removeVowels(s1));
	}
	
	public static String removeVowels(String str)
	{
		String finalStr = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(!isVowel(c)) finalStr += c;
				
		}
		
		return finalStr;
	}

	private static boolean isVowel(char c)
	{
		return(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' ||
			c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U');
	}

}
