package com.prac.core.java;

import java.util.Scanner;

import com.prac.core.java.geo.Rectangle;
import com.prac.core.java.manager.OptionManager;

public class DriverClass {
	
	
	public static void main(String[] args) {
		
		OptionManager optMng = new OptionManager();
		System.out.println("1. Create Rectangle Object");
		System.out.println("2. Display Rectangle data");
		System.out.println("0. Exit");
		
		
		System.out.println("Enter your option");
		Scanner optionScanner = new Scanner(System.in);
		String option = optionScanner.nextLine();
		
		switch(option){
		
		case "1": System.out.println("Option 1 selected"); 
					Rectangle rec = optMng.createReactangle();
					OptionManager.showRectangleDim(rec);
		 		  break;
		case "2": System.out.println("Option 2 selected"); 
					Rectangle r1 = new Rectangle();
					OptionManager.showRectangleDim(r1);
					break;
		}
		
		System.out.println("Number of objects created : - " + OptionManager.counts);
		
		
		
	}

}
