package com.java.model;

import com.java.markupInterface.IShape;

public class Rectangle implements IShape
{
	private double length, breadth;
	
	public Rectangle()
	{
		this(20, 10);
	}

	public Rectangle(double length, double breadth)
	{
		this.breadth = breadth;
		this.length = length;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getBreadth()
	{
		return breadth;
	}

	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}
	
	public double calcArea()
	{
		return (this.length*this.breadth);
	}
	
	@Override
	public String toString()
	{
		String rec = "[Length: " + this.length + ", Breadth: " + this.breadth + "]";
		return rec;
	}
}
