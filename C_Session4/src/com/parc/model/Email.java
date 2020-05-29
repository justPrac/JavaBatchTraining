package com.parc.model;

public class Email
{
	private String subject;
	private String body;
	private String senderEmail;
	private String receiverEmail;
	
	private static Email _instance;
	private static int objCount;
	
	public Email getIEmailInstance()
	{
		synchronized (_instance)
		{
			if(_instance == null)
			_instance = new Email();
		}
		return _instance;
	}
	
	private Email()
	{
		objCount++;
		//all fields are null by default
		//use setters to set values
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	
	public String getBody()
	{
		return body;
	}
	
	public void setBody(String body)
	{
		this.body = body;
	}
	
	public String getSenderEmail()
	{
		return senderEmail;
	}
	
	public void setSenderEmail(String senderEmail)
	{
		this.senderEmail = senderEmail;
	}
	
	public String getReceiverEmail()
	{
		return receiverEmail;
	}
	
	public void setReceiverEmail(String receiverEmail)
	{
		this.receiverEmail = receiverEmail;
	}
	
   public static int getObjCount()
	{
		return objCount;
	}
	
	@Override
	public String toString()
	{
		String email = "[Sender: " + this.senderEmail + "\nReceiver: " + this.receiverEmail +
				"\nSubject: " + this.subject + "\nBody: " + this.body + "]";
		return email;
	}
	
}
