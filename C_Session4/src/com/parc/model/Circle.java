package com.parc.model;

public class Circle
{
	private int radius;
	
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

	public double calArea()
	{
		return (Math.PI * Math.pow(this.radius, 2));
		
	}
	
	
}
