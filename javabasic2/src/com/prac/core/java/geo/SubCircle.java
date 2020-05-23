package com.prac.core.java.geo;

public class SubCircle extends Circle{

	
	public SubCircle(){
		super(12);
	}
	
	
	@Override
	public void calShapeArea() {
		System.out.println("Calling subcircle");
		super.calShapeArea();
	}
	
	
	/*@Override
	public void displayCircle(){
		System.out.println("Circle: Display");
	}*/
	
}
