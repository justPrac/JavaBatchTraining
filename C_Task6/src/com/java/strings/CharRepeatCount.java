package com.java.strings;


public class CharRepeatCount
{
	public static void main(String[] args)
	{
		String str1 = "indivisibility";
		System.out.println(str1 + ": " + charRepeatCount(str1));
		
		
		String str2 = "aA11";
		System.out.println(str2 + ": " + charRepeatCount(str2));
		
		String str3 = "aA012345678901234567890123456789";
		System.out.println(str3 + ": " + charRepeatCount(str3));
	}
	
	private static int charRepeatCount(String str)
	{
		str = str.toLowerCase();
		int count = 0;
		int[] arr = new int[36];
		
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z')
			{
				int loc = c - 'a';
				if(arr[loc] == 1) 
					count++;
				
				arr[loc]++;
			}
			else if(c >= '0' && c <= '9') 
			{
				int loc = 26 + c - '0';
				if(arr[loc] == 1) 
					count++;
				
				arr[loc]++;
			}
		}
		
		return count;
	}

}
