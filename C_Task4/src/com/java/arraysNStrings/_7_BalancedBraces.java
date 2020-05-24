package com.java.arraysNStrings;

public class _7_BalancedBraces
{
	public static void main(String[] args)
	{
		String str1 = "({{)}}";
		System.out.println("The String: " + str1 + " has balanced braces?: " + checkBraceBalancing(str1));
		
		String str2 = "{{([)]}}";
		System.out.println("The String: " + str2 + " has balanced braces?: " + checkBraceBalancing(str2));
		
		String str3 = "[})(";
		System.out.println("The String: " + str3 + " has balanced braces?: " + checkBraceBalancing(str3));
	}

	private static boolean checkBraceBalancing(String str)
	{
		final int CURLY = 0, ROUND = 1, SQUARE = 2;
		int[] count = new int[3];
		
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			
			switch(c)
			{
				case '{': count[CURLY]++; break;
				case '}': count[CURLY]--; break;
				case '[': count[SQUARE]++; break;
				case ']': count[SQUARE]--; break;
				case '(': count[ROUND]++; break;
				case ')': count[ROUND]--; break;
			}
		}
		
		for(int n : count)
		{
			if(n != 0) return false;
		}
		
		return true;
	}
}
