package com.prac.core.java;

import com.prac.core.java.geo.Rectangle;
import com.prac.core.java.geo.Shape;
import com.prac.core.java.geo.Square;

public class MyAbstract {

	public static void main(String[] args) {
	  
	  //implicit casting
	  Shape s = new Square();
	  ((Square)s).calArea();
	  s.displayShape();
	  
	  
	  //explicit casting
	  System.out.println(((Square)s).isSquare());	  
	}

}
