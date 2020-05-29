package com.parc.model;

public class Circle
{
	private int radius;
	private static final double PI = Math.PI;
	
	public Circle(int radius)
	{
		this.radius = radius;
	}

	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	public static double getPi()
	{
		return PI;
	}

	public double calArea()
	{
		return (PI * Math.pow(this.radius, 2));
		
	}
	
	
}
