package com.prac.excep;

public class AdminManager {

	public static void main(String[] args) {
	
		boolean success = true;
		NetworkCheck nc = new NetworkCheck();
		try{
		nc.failureCall(1);
		}catch(NetworkDownException ex){
			System.out.println(ex.getMessage());
			success = false;
		}
		System.out.println("Netwrok check success status " + success);

	}

}
