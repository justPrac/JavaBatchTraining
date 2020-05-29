package com.prac.excep;

import java.io.IOException;

import com.prac.core.java.geo.Rectangle;

public class ArrayIndexException {

	public static void main(String[] args)  {
		
		Rectangle [] rec = new Rectangle[3];
		
		for (int i = 0; i < rec.length; i++) {
			rec[i] = new Rectangle(10, 20);
		}
		Manger mg = new Manger();
		try{
			mg.calShapeOfType(rec);
		}catch(Exception ex){
			System.out.println("Failure happened");
		}
		System.out.println("The program terminates");

	}

}
