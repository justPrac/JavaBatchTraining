package com.parc.manager;

import com.parc.model.Rectangle;

public class AreaCalculatorManager
{
	public void printAreaofObjects(Rectangle objects[])
	{
		for(Rectangle rec : objects)
		{
			System.out.println("R: " + rec + " Area: " + rec.calcArea());
		}
	}
}
