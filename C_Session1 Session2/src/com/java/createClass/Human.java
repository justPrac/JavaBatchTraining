package com.java.createClass;

public class Human
{
	private String name;
	private String address; 
	private String dob;
	
	public Human(String name, String address, String dob)
	{
		this.address = address;
		this.dob = dob;
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getDob()
	{
		return dob;
	}

	public void setDob(String dob)
	{
		this.dob = dob;
	}
	
	@Override
	public String toString()
	{
		String human = "[Name: " + this.name + "\nAddress: " + this.address + 
				"\nDate of Birth: " + this.dob + "]";
		return human;
	}
}
