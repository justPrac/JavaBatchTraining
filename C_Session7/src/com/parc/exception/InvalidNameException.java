package com.parc.exception;

public class InvalidNameException extends Exception
{
	public InvalidNameException()
	{
		super("Error! Name passed is equal to 'Test'");
	}
}
