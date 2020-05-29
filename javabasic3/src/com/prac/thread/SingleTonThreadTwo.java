package com.prac.thread;

import com.prac.core.java.SingleTon;

public class SingleTonThreadTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread ");
		SingleTon s1 = SingleTon.getInstance();
		
	}

}
