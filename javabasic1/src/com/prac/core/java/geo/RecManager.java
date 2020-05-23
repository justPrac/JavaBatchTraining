package com.prac.core.java.geo;

public class RecManager {
	
	Rectangle rec;
	public void setShape(Rectangle rec){
		this.rec = rec;
	}
	
	
	public void display(){
		rec.myProtected();
		int p = rec.prem;
		
		rec.display();
		int c = rec.check;
	}

}
