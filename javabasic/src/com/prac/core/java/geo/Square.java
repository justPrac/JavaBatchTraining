package com.prac.core.java.geo;

public class Square extends Shape{

	private int side;
	
	public Square()
	{
		this.side = 10;
	}
	
	public Square(int side)
	{
		this.side = side;
	}
	
	public boolean isSquare(){
			System.out.println("Square: isSquare() ");
		return true;
	}
	
	
	
	public void calArea(){
		if(isSquare()){
		System.out.println("Area of the square is " + this.side * this.side);
		
		}else{
			System.out.println("Not a sqaure");
		}
	}



	@Override
	public void calShapeArea() {
	   calArea();
	}
	
}
