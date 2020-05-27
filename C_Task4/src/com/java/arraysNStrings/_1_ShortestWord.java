package com.java.arraysNStrings;

public class _1_ShortestWord
{
	public static void main(String[] args)
	{
		String[] arr = {"one", "three", "hello", "13429"};
		System.out.println("The min length in the String arr is: " + minLength(arr));
	}
	
	private static int minLength(String [] arr)
	{
		int min = 0;
		if(arr.length > 0)
		{
			min = arr[0].length();
			
			for(String s: arr)
			{
				if(min > s.length()) min = s.length();
			}
		}
		return min;
	}

}
