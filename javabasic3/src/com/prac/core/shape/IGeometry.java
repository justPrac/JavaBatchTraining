package com.prac.core.shape;

public interface IGeometry {
	
	public int displaySize();
	
	public default void geoShape(){
		System.out.println("IGeometry: geoShape");
	}

}
