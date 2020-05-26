package com.java.objects.complex;

public class ComplexNumbers
{
	private double realNum;
	private double complexCoef;
	
	public ComplexNumbers(double realNum, double complexCoef)
	{
		this.complexCoef = complexCoef;
		this.realNum = realNum;
	}
	
	public double getRealNum()
	{
		return realNum;
	}
	
	public double getComplexCoef()
	{
		return complexCoef;
	}
	
	public void setRealNum(double realNum)
	{
		this.realNum = realNum;
	}
	
	public void setComplexCoef(double complexCoef)
	{
		this.complexCoef = complexCoef;
	}
	
	@Override
	public String toString()
	{
		String s = this.realNum + "";
		
		if(this.complexCoef > 0)
		{
			s += "+" + this.complexCoef + "i";
		}
		else if(this.complexCoef < 0)
		{
			s += this.complexCoef + "i";
		}
		
		return s;
	}

	public ComplexNumbers add(ComplexNumbers n)
	{		
		return (new ComplexNumbers(this.realNum + n.realNum, this.complexCoef + n.complexCoef));
	}
	
	public ComplexNumbers substract(ComplexNumbers n)
	{		
		return (new ComplexNumbers(this.realNum - n.realNum, this.complexCoef - n.complexCoef));
	}
	
	public ComplexNumbers multiply(ComplexNumbers n)
	{		
		double part1 = this.realNum*n.realNum - this.complexCoef*n.complexCoef;
		double part2 = this.realNum*n.complexCoef + this.complexCoef*n.realNum;
		return (new ComplexNumbers(part1, part2));
	}
	
}
