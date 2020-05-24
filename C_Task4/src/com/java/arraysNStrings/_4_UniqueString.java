package com.java.arraysNStrings;

public class _4_UniqueString
{
	public static void main(String[] args)
	{
		String word = "heymaM";
		System.out.println("Is the Word '" + word + "' unique?: " + uniqueChars(word));
		
		String str = "Be Happy and Stay Motivated";
		System.out.println("Original String: " + str);
		System.out.println("Processed String: " + lineReverse(str));
	}
	
	private static boolean uniqueChars(String word)
	{
		word = word.toLowerCase();
		
		//default value --> false;
		boolean [] arr = new boolean[26];
		
		for(int i = 0; i < word.length(); i++)
		{
			char c = word.charAt(i);
			if(c >= 97 && c <= 122)
			{
				if(arr[c - 97] == false) 
					arr[c - 97] = true;
				else 
					return false;
			}
		}
		return true;
	}

	private static String lineReverse(String line)
	{
		String rev = "";
		
		for(String s : line.split(" "))
		{
			rev += wordReverse(s) + " ";
		}
		
		if(rev.length() > 0) rev = rev.substring(0, rev.length()-1);
		
		return rev;
	}
	
	private static String wordReverse(String word)
	{
		String rev = "";
		for(int i = word.length()-1; i >= 0; i--)
		{
			rev += word.charAt(i);
		}
		return rev;
	}
	
}
