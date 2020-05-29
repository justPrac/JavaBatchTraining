package com.prac.model;

public class Square extends Rectangle
{
	public Square()
	{
		super(10, 10);
	}
	
	public Square(double side)
	{
		super(side, side);
	}
	
	@Override
	public double calcArea()
	{
		return super.calcArea();
	}
	
	@Override
	public String toString()
	{
		String sq = "[Side: " + super.getLength() + "]";
		return sq;
	}
}
