package com.java.arraysNStrings;

public class _4_UniqueString
{
	public static void main(String[] args)
	{
		String word = "heymaM";
		System.out.println("Is the Word '" + word + "' unique?: " + uniqueChars(word));
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

}
