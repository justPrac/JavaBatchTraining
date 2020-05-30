package com.java.markupInterface;

import com.java.model.Rectangle;

public class CalculateOperation
{
	public double calculateAreaForShape(Object o) throws CalculateAreaNotSupported
	{
		if(! (o instanceof IShape)) throw new CalculateAreaNotSupported();
		else 
		{
			if(o instanceof Rectangle)
			{
				Rectangle r = (Rectangle)o;
				return r.calcArea();
			}
			return 0;
		}
	}

}
