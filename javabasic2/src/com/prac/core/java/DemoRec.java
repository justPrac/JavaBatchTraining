package com.prac.core.java;

import com.prac.core.java.geo.Rectangle;

public class DemoRec 
{
		
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(12, 54);
		Rectangle r2 = new Rectangle(20, 49);
		Rectangle r3 = new Rectangle(20, 49);
		Rectangle r4 = r1;
		
		//OVERRIDEN EQUALS() TEST
		System.out.println("r2==r3 => " + (r2==r3));
		System.out.println("r1==r4 => " + (r1==r4));
		System.out.println("r1.equals(r2) => " + (r1.equals(r2)));
		System.out.println("r2.equals(r3) => " + (r2.equals(r3)));
		System.out.println("r1.equals(r4) => " + (r1.equals(r4)));
		
		//OVERRIDEN TOSTRING()
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
