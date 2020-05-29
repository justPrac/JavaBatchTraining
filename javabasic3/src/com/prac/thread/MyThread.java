package com.prac.thread;

public class MyThread {

	public static void main(String[] args) {
		
		System.out.println("Current thread " + Thread.currentThread().getName() + " started");
		
		ThreadA _threadA = new ThreadA();
		_threadA.setName("-ThreadA-");
		_threadA.start();
		
		ThreadB _threadB = new ThreadB();
		_threadB.setName("-ThreadB-");
		_threadB.start();
		
		Runnable _run = new ThreadC();
		Thread _threadC = new Thread(_run, "-ThreadC-");
		_threadC.start();
		
		try
		{
			_threadA.join();
			_threadB.join();
			_threadC.join();
			
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println("Completed");

	}

}
