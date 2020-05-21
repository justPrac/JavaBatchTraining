package com.prac.core.java.geo;

public class Square extends Shape{

	
	
	public boolean isSquare(){
			System.out.println("Square: isSquare() ");
		return true;
	}
	
	
	
	public void calArea(){
		if(isSquare()){
		System.out.println("Area of the square is ");
		
		}else{
			System.out.println("Not a sqaure");
		}
	}



	@Override
	public void calShapeArea() {
	   calArea();
	}
	
}
