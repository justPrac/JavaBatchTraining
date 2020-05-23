package com.prac.core.string;

import com.prac.core.java.geo.Rectangle;

public class StringManupulation {
	
	
	public static void main(String ary[]){
		
		String str = new String("Java");
		String str1 = new String("Java");
		
		System.out.println("String is " + str);
		if(str.equals("Java")){
			System.out.println("Equal");
		}else{
			System.out.println("NOt equal");
		}
		
		if(str.equals(str1)){
			System.out.println("Equal -->");
		}else{
			System.out.println("NOt equal -->");
		}
		
		
		if(str == str1){
			System.out.println("Equal rferences");
		}else{
			System.out.println("NOt equal RF -->");
		}
		
		Rectangle r1 = new Rectangle(100,100);
		Rectangle r2 = new Rectangle(100,100);
		
		if(r1.equals(r2)){
			System.out.println("Rec equal");
		}else{
			System.out.println("Not rec equal");
		}
		
		
		
		
	String s1 = "Test".intern();
	String s2 = "Test";
	String s3 = new String("Test1").intern();
	String s4 = "Test1";
	
	
	if(s4 == s3){
		System.out.println("Sptring pool got the same value");
	}else{
		
		System.out.println("NOt same");
	}
	
	
	
	System.out.println("Rectangle is " + r1);
	System.out.println("String value is " + s1.toString());
	}
	
	
	

}
