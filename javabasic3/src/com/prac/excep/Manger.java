package com.prac.excep;

import java.io.IOException;

import com.prac.core.java.geo.Rectangle;
import com.prac.core.java.geo.Shape;

public class Manger {

	
	
	public void calShapeOfType(Rectangle []rec) throws IOException{
		
		System.out.println("Before calculting the shape area");
		try{
			rec[0].calShapeArea();
			System.out.println("Finished---->");
			return;
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ArrayIndex exception came");
			throw new IOException();
		}catch (NullPointerException ex) {
			System.out.println("Nullpointer exception");
		}catch (Exception e) {
			System.out.println("General exception");
			
		}finally {
			System.out.println("Finally exeuted");
		}
		System.out.println("Shape area calculated");
	}
}
