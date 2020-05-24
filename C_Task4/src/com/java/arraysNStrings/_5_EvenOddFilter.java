package com.java.arraysNStrings;

import java.util.ArrayList;
import java.util.List;

public class _5_EvenOddFilter
{
	private static final int EVENS = 0, ODDS = 1;

	public static void main(String[] args)
	{
		int [] evens = {1,3,5,7,9,10,11};
		int [] odds = {2,4,3,6,7,10};
		
		ArrayList<Integer>[] filteredArr = evenOddFilterArrays(odds);
		
		if(filteredArr[EVENS].size() > filteredArr[ODDS].size())
		{
			//Less Odds
			System.out.println("Odds filtered from the list of Evens are: " + filteredArr[ODDS]);
		}
		else
		{
			//Less Evens
			System.out.println("Evens filtered from the list of Odds are: " + filteredArr[EVENS]);
		}
		

	}

	private static ArrayList<Integer>[] evenOddFilterArrays(int[] arr)
	{
		ArrayList<Integer> evens = new ArrayList<Integer>(), 
						  odds = new ArrayList<Integer>();
		
		ArrayList<Integer>[] finalArry = new ArrayList[2];
		finalArry[EVENS] = evens;
		finalArry[ODDS] = odds;
		
		for(int n : arr)
		{
			if(n%2 == 0) evens.add(n);
			else odds.add(n);
		}
		
		return finalArry;
	}
}
