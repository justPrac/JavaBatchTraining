package com.prac.connector;

public class MsSQLConnection extends Connector
{
	public MsSQLConnection(){}
	
	@Override
	public boolean openConnection()
	{
		System.out.println("MsSQLConnection -> openConnection()");
		return false;
	}

	@Override
	public boolean closeConnection()
	{
		System.out.println("MsSQLConnection -> closeConnection()");
		return false;
	}

	@Override
	public boolean fireQuery()
	{
		System.out.println("MsSQLConnection -> fireQuery()");
		return false;
	}
	
}
