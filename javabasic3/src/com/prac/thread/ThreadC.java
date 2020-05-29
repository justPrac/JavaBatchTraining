package com.prac.thread;

public class ThreadC implements Runnable {

	@Override
	public void run() {
		for(int i=0 ; i< 1000 ; i++){
			
			System.out.println("Current thread name is " + Thread.currentThread().getName() + " i = " + i );
		}
	}

}
