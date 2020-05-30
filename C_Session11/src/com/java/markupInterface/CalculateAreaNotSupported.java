package com.java.markupInterface;

public class CalculateAreaNotSupported extends Exception
{
	public CalculateAreaNotSupported()
	{
		super("Error! Area of the object passed cannot be calculated!");
	}
}
