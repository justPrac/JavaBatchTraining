package com.prac.core.java;

public class SingletonBlock
{
	private static int count;
	private static SingletonBlock _instance;
	
	
	static 
	{
		_instance = new SingletonBlock();
	}
	
	private SingletonBlock()
	{
		System.out.println("Constructor called Object created");
		count++;
	}
	
	public static SingletonBlock getInstance()
	{
		return _instance;
	}
	
	
	public static void displayOBjectCount()
	{
		System.out.println("Object created count " + count);
	}
}
