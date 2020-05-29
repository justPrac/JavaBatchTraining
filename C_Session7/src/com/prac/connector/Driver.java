package com.prac.connector;

import java.util.HashSet;
import java.util.Set;

public class Driver
{
	public static void main(String[] args)
	{
		Set<Connector> conns = new HashSet<Connector>();
		conns.add(new MsSQLConnection());
		conns.add(new OracleSQLConnection());
		
		for(Connector c : conns)
		{
			c.display();
			c.fireQuery();
		}
	}

}
