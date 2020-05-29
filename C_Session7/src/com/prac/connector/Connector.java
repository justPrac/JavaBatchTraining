package com.prac.connector;

public abstract class Connector
{
	public abstract boolean openConnection();
	
	public abstract boolean closeConnection();
	
	public abstract boolean fireQuery();
	
	public void display()
	{
		System.out.println("Connector -> display()");
	}
	
	public void loadedDBConnection()
	{
		System.out.println("Connector -> loadedDBConnection()");
	}
}
