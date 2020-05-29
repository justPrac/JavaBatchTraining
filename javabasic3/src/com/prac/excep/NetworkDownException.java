package com.prac.excep;

public class NetworkDownException extends Exception{

	public NetworkDownException(String message){
		super(message);
	}
	
	public NetworkDownException(){
		super("Network is dropping the packet");
	}
	
	
	
}
