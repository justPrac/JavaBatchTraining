package com.prac.excep;

public class NetworkCheck {
	
	
	public void failureCall(int failure) throws NetworkDownException{
		System.out.println("Failure check ");
		if(failure == 1){
			NetworkDownException nt = new NetworkDownException("Packet getting dropped");
			throw nt;		
		}
	}

}
