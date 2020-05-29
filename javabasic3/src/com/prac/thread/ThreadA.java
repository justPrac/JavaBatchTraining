package com.prac.thread;

public class ThreadA extends Thread{

	@Override
	public void run(){
		for(int i=0 ; i< 2000; i++){
			
			System.out.println("Current thread name is " + Thread.currentThread().getName() + " i = " + i );
		}
	}
	
}
