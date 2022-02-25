package com.hsbc.multithreading;

public class JThread2 extends Thread {
	public void run(){
		System.out.println("Start of Thread 2");
		for(int i=100;i<=150;i++){
System.out.println("T2  :"+i);
}
System.out.println("End of Thread 2");
		}
	}
