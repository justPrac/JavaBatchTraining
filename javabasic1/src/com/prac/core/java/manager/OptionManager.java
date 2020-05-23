package com.prac.core.java.manager;

import java.util.Scanner;

import com.prac.core.java.geo.Rectangle;

public class OptionManager {
	
	public static int counts; 
	
	public static Rectangle createReactangle(){
		System.out.println("Enter the Length");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		System.out.println("Enter the Bredth");
		Scanner sc1 = new Scanner(System.in);
		int bred = sc1.nextInt();
		
		Rectangle rec = new Rectangle();
		rec.setBredth(bred);
		rec.setLength(len);
		counts++;
		return rec;
		
	}
	
	public static void showRectangleDim(Rectangle rec){
		System.out.println("Length is " + rec.getLength());
		System.out.println("Bredth is " + rec.getBredth());
		
	}

}
