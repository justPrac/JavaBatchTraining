package com.prac.core.java;

public class DriverSingletonBlock
{
	public static void main(String[] args)
	{
		SingletonBlock s1 = SingletonBlock.getInstance();
		SingletonBlock s2 = SingletonBlock.getInstance();
		
		SingletonBlock.displayOBjectCount();
		
		if(s1 == s2){
			System.out.println("Same object");
		}else{
			System.out.println("Not Equal");
		}
	}
}
