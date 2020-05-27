package com.java.objects.rectangle;

import java.util.LinkedList;
import java.util.List;

public class Driver
{

	public static void main(String[] args)
	{
		List<Rectangle> rectangles = new LinkedList<Rectangle>();
		rectangles.add(new Rectangle());
		rectangles.add(new Rectangle(10));
		rectangles.add(new Rectangle(20, 30));
		
		
		for(Rectangle r : rectangles)
		{
			System.out.println("Area for R: " + r + " is: " + r.calArea());
		}
	}

}
