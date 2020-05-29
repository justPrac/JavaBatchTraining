package com.prac.core.java.geo;

public /*final*/ class Circle extends Shape {
	
	private final float pi = 3.14f;
	
	private int radius;
	
	
	public Circle(int r){
		this.radius = r;
	}


	@Override
	public void calShapeArea() {
		System.out.println("Area of the circle is " + pi*radius*radius);
	}
	

	
	public final void displayCircle(){
		System.out.println("Circle: Display");
	}
	

}
