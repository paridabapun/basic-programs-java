package com.hsbc.multithreading;

public class ChildThreadForMain  extends Thread{
	
	static Thread thread;
	public void run() {
		thread=Thread.currentThread();
		thread.setPriority(MAX_PRIORITY);
		for(int i=0;i<30;i++) {
			System.out.println("Child Thread under execution with priority"+thread.getPriority());
			
		}
	}

}
