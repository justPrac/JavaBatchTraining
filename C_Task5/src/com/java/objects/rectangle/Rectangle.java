package com.java.objects.rectangle;

public class Rectangle
{
	private double length, breadth;

	public Rectangle()
	{
		this.length = 0;
		this.breadth = 0;
	}
	
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle(double side)
	{
		this.breadth = side;
		this.length = side;
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
	
	public double calArea()
	{
		return (this.length*this.breadth);
	}
	
	@Override
	public String toString()
	{
		return "[l: " + this.length + ", b: " + this.breadth + "]";
	}
	
}
