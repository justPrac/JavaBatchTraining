package com.prac.core.java.geo;

public class ShapeManager {
	
	public void calShapeArea(Shape shape){
		shape.calShapeArea();
		
		if(shape instanceof Rectangle)
		((Rectangle)shape).display();
		
	}

}
