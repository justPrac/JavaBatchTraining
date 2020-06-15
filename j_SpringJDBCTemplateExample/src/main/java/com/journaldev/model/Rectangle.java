package com.journaldev.model;

public class Rectangle
{
	private int length, breadth, id;
	
	public Rectangle()
	{}
	
	public Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength()
	{
		return length;
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public int getBreadth()
	{
		return breadth;
	}

	public void setBreadth(int breadth)
	{
		this.breadth = breadth;
	}
		
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		String str = "Rec: ID:" + this.id + " [l:" + this.length + ", b:" + this.breadth + "]";
		
		return str;
	}
}
