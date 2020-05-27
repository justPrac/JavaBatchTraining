package com.java.strings;

public class DnaStrand
{

	public static void main(String[] args)
	{
		String str1 = "ATTGC";
		System.out.println(str1 + ": " + DnaStrand.makeComplement(str1));
		
		String str2 = "GTAT";
		System.out.println(str2 + ": " + DnaStrand.makeComplement(str2));
	}

	public static String makeComplement(String str)
	{
		String complimentStr = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			char c = getCompliment(str.charAt(i));
			if(c != 0)
			{
				complimentStr += c;
			}
		}
		
		return complimentStr;
	}
	
	private static char getCompliment(char c)
	{
		switch(c)
		{
			case 'a': case 'A': return 'T';
			case 't': case 'T': return 'A';
			case 'g': case 'G': return 'C';
			case 'c': case 'C': return 'G';
			default: return 0;
		}
		
	}
}
