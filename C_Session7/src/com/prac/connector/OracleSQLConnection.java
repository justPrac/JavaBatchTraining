package com.prac.connector;

public class OracleSQLConnection extends Connector
{
	public OracleSQLConnection(){}

	@Override
	public boolean openConnection()
	{
		System.out.println("OracleSQLConnection -> openConnection()");
		return false;
	}

	@Override
	public boolean closeConnection()
	{
		System.out.println("OracleSQLConnection -> closeConnection()");
		return false;
	}

	@Override
	public boolean fireQuery()
	{
		System.out.println("OracleSQLConnection -> fireQuery()");
		return false;
	}
	
}
