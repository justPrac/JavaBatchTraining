package com.parc.model;

public class Email
{
	private String subject;
	private String body;
	private String senderEmail;
	private String receiverEmail;
	
	
	public Email(String senderEmail, String receiverEmail, String sub, String body)
	{
		this.body = body;
		this.receiverEmail = receiverEmail;
		this.senderEmail = senderEmail;
		this.subject = sub;
	}
	
	public Email(String senderEmail, String receiverEmail, String body)
	{
		this(senderEmail, receiverEmail, "", body);
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
	
	@Override
	public String toString()
	{
		String email = "[Sender: " + this.senderEmail + "\nReceiver: " + this.receiverEmail +
				"\nSubject: " + this.subject + "\nBody: " + this.body + "]";
		return email;
	}
	
}
