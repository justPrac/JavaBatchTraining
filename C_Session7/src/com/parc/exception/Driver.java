package com.parc.exception;

public class Driver
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("hello: " + validation("hello"));
			System.out.println("Test: " + validation("Test"));
			
		} catch (InvalidNameException e)
		{
			e.printStackTrace();
		}
	}

	public static boolean validation(String name) throws InvalidNameException
	{
		if(name != null && name.length() > 0)
		{
			if(name.equalsIgnoreCase("test"))
				throw new InvalidNameException();
			
			return true;
		}
		return false;
	}
}
