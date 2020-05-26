package com.java.objects.complex;

public class Driver
{
	public static void main(String[] args)
	{
		ComplexNumbers num1 = new ComplexNumbers(13, 0);
		ComplexNumbers num2 = new ComplexNumbers(45, 1);
		System.out.println("Addition: " + num1.add(num2));
		System.out.println("Substraction: " + num1.substract(num2));
		System.out.println("Multiplication: " + num1.multiply(num2));
	}

}
