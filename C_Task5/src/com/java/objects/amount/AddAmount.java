package com.java.objects.amount;

public class AddAmount
{
	private static double amount = 50;
	private static int transactions;

	public AddAmount()
	{
		this(0);
	}
	
	public AddAmount(double a)
	{
		if(a >= 0)
		{
			amount += a;
			transactions++;
		}
	}
	
	public static void display()
	{
		String msg = "[Balance: " + amount + ", Transactions: " + transactions + "]";
		System.out.println(msg);
	}
	
}
