package com.prac.core.shape;

public class ShapeDriver {

	public static void main(String[] args) {
		
		IGeometry geo = new ShapeImpl();
		
		geo.displaySize();
	
		IShape s = (ShapeImpl)geo;
		s.areaCalucation();
		
		s = new GeoImpl();
		
		s.areaCalucation();
		
		
		ShapeManager sm = new ShapeManager();
		sm.calShape(new ShapeImpl());
		
	}
	
	
	

}
