package com.prac.core.java;

import com.prac.core.java.geo.Circle;
import com.prac.core.java.geo.Shape;
import com.prac.core.java.geo.SubCircle;

public class myMainDriver {

	public static void main(String[] args) {
		Shape s = new Circle(123);
		s.calShapeArea();
		
		
		s = new SubCircle();
		s.calShapeArea();
	}

}
