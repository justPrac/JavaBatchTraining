package com.prac.core.shape;

import com.prac.core.java.geo.Circle;

public class ShapeImpl implements IShape, IGeometry{

	@Override
	public int displaySize() {
		System.out.println("ShapeImpl: displaySize ");
		return 0;
	}

	@Override
	public void areaCalucation() {
		System.out.println("ShapeImpl: areaCalucation");
	}

}
