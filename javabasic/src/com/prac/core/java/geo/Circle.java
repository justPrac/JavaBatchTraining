package com.prac.core.java.geo;

public class Circle extends Shape
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

	@Override
	public void calShapeArea()
	{
		System.out.println("Area of the Circle is " + (Math.PI * Math.pow(this.radius, 2)));
		
	}
	
	
}
