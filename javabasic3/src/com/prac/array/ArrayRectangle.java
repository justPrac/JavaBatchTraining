package com.prac.array;

import com.prac.core.java.geo.Rectangle;

public class ArrayRectangle {

	public static void main(String[] args) {
	
		
		Rectangle [] recArray = new Rectangle[10];
		
		for (int i = 0; i < recArray.length; i++) {
			recArray[i] = new Rectangle(10,10);
		}
		
		for(int i = 0 ; i< recArray.length; i++){
			
			System.out.println("Area caluclate is ");
			System.out.println(" recArray [ " + i + " ] Area = ");
			recArray[i].calArea() ;
		}
		
		
		
	}

}
