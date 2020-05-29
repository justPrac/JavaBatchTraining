package com.parc.driver;

import com.parc.manager.AreaCalculatorManager;
import com.parc.model.Rectangle;

public class Driver
{
	public static void main(String[] args)
	{
		Rectangle[] recs = new Rectangle[4];
		
		recs[0] = new Rectangle();
		recs[1] = new Rectangle(3, 5);
		recs[2] = new Rectangle(0, 0);
		recs[3] = new Rectangle();
		
		AreaCalculatorManager obj = new AreaCalculatorManager();
		obj.printAreaofObjects(recs);
	}

}
