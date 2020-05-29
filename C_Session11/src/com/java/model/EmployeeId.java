package com.java.model;

public class EmployeeId
{
	private int id;
	
	public EmployeeId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Override
	public int hashCode()
	{
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		
		if(obj instanceof EmployeeId)
		{
			EmployeeId eId = (EmployeeId) obj;
			return eId.id == this.id;
		}
		return false;
	}
}
