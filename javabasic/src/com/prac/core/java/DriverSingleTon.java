package com.prac.core.java;

public class DriverSingleTon {

	public static void main(String[] args) {
	
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		
		SingleTon.displayOBjectCount();
		
		if(s1 == s2){
			System.out.println("Same object");
		}else{
			System.out.println("Not Equal");
		}

	}

}
