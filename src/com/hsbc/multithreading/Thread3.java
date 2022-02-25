package com.hsbc.multithreading;
public class Thread3 extends Thread {

	public void run() {
	System.out.println("start of run() of Thread3");
	for(int i=200;i<=250;i++){
		System.out.println("Thread3 ="+i);
	}
	System.out.println("End of run() of Thread3");
	
	}
}