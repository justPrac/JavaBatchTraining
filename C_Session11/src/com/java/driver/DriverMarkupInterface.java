package com.java.driver;

import com.java.markupInterface.CalculateAreaNotSupported;
import com.java.markupInterface.CalculateOperation;
import com.java.model.Circle;
import com.java.model.Rectangle;

public class DriverMarkupInterface
{

	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(3, 5);
		Circle c1 = new Circle(5);
		
		CalculateOperation cal = new CalculateOperation();
		try
		{
			System.out.println("Area for Rectangle: " + cal.calculateAreaForShape(r1));
			System.out.println("Area for Circle: " + cal.calculateAreaForShape(c1));
		}
		catch (CalculateAreaNotSupported e) 
		{
			e.printStackTrace();
		}
	}

}
