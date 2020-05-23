package com.prac.core.java;

import java.util.ArrayList;

import com.prac.core.java.geo.Circle;
import com.prac.core.java.geo.Rectangle;
import com.prac.core.java.geo.Shape;
import com.prac.core.java.geo.ShapeManager;
import com.prac.core.java.geo.Square;
import com.prac.core.java.geo.Triangle;

public class InheritanceDriver 
{

	public static void main(String arg[])
	{
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Square(10));
		shapes.add(new Rectangle());
		shapes.add(new Triangle(2, 4));
		shapes.add(new Circle(14));
		
		System.out.println("\nCalculating Area using their own overriden methods!");
		for (Shape shape : shapes)
		{
			shape.calShapeArea();
		}
		
		System.out.println("\nCalculating Area using the ShapeManager class!");
		ShapeManager sm = new ShapeManager();
		for (Shape shape : shapes)
		{
			sm.calShapeArea(shape);
		}
	}
	
	

}
