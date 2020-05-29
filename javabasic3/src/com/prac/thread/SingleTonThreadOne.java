package com.prac.thread;

import com.prac.core.java.SingleTon;

public class SingleTonThreadOne implements Runnable{

	@Override
	public void run() {
	SingleTon s1 = SingleTon.getInstance();
		
	}

}
