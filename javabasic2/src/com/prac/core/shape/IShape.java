package com.prac.core.shape;

public interface IShape {
	
	public void areaCalucation();

	public default void display(){
		System.out.println("Ishape: display");
	}
}
