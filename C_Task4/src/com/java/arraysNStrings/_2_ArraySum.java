package com.java.arraysNStrings;

public class _2_ArraySum
{

	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5,6};
		
		System.out.println("The sum(excluding min and max): " + arraySum(arr));
	}
	
	private static int arraySum(int [] arr)
	{
		int sum = 0;
		
		if(arr.length > 0)
		{
			int max = arr[0], min = arr[0];
			for(int n : arr)
			{
				sum += n;
				if(max < n) max = n;
				if(min > n) min = n;
			}
			sum -= (min+max); 
		}
		return sum;
	}

}
