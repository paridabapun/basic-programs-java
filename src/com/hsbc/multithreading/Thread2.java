package com.hsbc.multithreading;
public class Thread2 extends Thread {

	public void run() {
	System.out.println("start of run() of Thread2");
	for(int i=100;i<=150;i++){
		System.out.println("Thread2 ="+i);
	}
	System.out.println("End of run() of Thread2");
	
	}
}