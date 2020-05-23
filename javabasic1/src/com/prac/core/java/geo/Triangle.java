package com.prac.core.java.geo;

public class Triangle extends Shape
{
	private int height;
	private int base;
	
	public Triangle(int height, int base)
	{
		this.height = height;
		this.base = base;
	}
	
	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getBase()
	{
		return base;
	}

	public void setBase(int base)
	{
		this.base = base;
	}

	@Override
	public void calShapeArea()
	{
		System.out.println("Area of the Triangle is " + (0.5 * this.base * this.height));
		
	}

}
