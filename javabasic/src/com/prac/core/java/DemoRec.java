package com.prac.core.java;

import com.prac.core.java.geo.Rectangle;

public class DemoRec {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = Rectangle.myStatic;
		System.out.println("mystatic " + temp);
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.myStatic = 100;
		
		
		System.out.println(Rectangle.myStatic);
		Rectangle.change();
		
		
		
		System.out.println("======Overloading example==========");
		Rectangle tempR = new Rectangle(100, 200);
		tempR.calArea();
		
		
		Rectangle tempR1 = new Rectangle("Rectangle overload");
		tempR1.calArea();
		
		Rectangle tempR2 = new Rectangle(2);
		tempR2.calArea();
		
	}

}
