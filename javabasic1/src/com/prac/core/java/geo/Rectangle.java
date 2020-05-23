package com.prac.core.java.geo;

public class Rectangle extends Shape{
	
	private int length;
	private int bredth;
	
	public static int myStatic;
	protected int prem;
	
	int check;
	
	
    //instance level
	{
	 System.out.println("instance level block");
	 length = 111;
	 bredth = 10;
	 System.out.println("Object initialized");
	}
	
	//class level
	static{
		System.out.println("static block called");
		myStatic = 1;
	}
	
	public Rectangle(){
		System.out.println("Default constructor");
		length = 10;
		bredth = 2;
	}
	//overloading
	public Rectangle(int len, int bred){
		this.length = len;
		this.bredth = bred;
		System.out.println("Constructor called parametric");
	}
	
	public Rectangle(String message){
     this(12,14);
	 System.out.println("constructor : Rectangle with message" + message);
	
	}

	public Rectangle(int len){
		System.out.println("Rectangle with only length");
		 this.length = len;
		 this.bredth = 10;
	}
	
	public void calArea(){
		System.out.println("Area of the rectangle is " + length * bredth);
	}
	
	public void setLength(int length){
		this.length = length;
	}
	
	public void setBredth(int bredth){
		this.bredth = bredth;
	}
	
	public int getLength(){
		return this.length;
	}
	
	public int getBredth(){
		return this.bredth;
	}
	
	public static void change(){
		System.out.println("Static change called");
		
	}
	
	protected void myProtected(){
		System.out.println("Protected myProtected called");
	}

	
	void display(){
		System.out.println("Display");
	}
	
	@Override
	public void calShapeArea() {
		calArea();
	}
}
