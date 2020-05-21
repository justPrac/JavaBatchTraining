package com.prac.core.java;

import com.prac.core.java.geo.RecManager;
import com.prac.core.java.geo.Rectangle;
import com.prac.core.java.geo.ShapeManager;
import com.prac.core.java.geo.Square;

public class InheritanceDriver {

	public static void main(String arg[]){
		Square s = new Square();
		s.calArea();
		
		ShapeManager sm = new ShapeManager();
		
		sm.calShapeArea(s);
	}
	
	

}
