package com.prac.thread;

public class SingleTonDriver {

	public static void main(String[] args) {
	
		Thread t1 = new Thread(new SingleTonThreadOne(), "Thread1");
		t1.start();
		
		Thread t2 = new Thread(new SingleTonThreadTwo(), "Thread2");
		t2.start();
		
		
	}

}
