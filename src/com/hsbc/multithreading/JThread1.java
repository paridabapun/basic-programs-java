package com.hsbc.multithreading;

public class JThread1 extends Thread {
	int sum;
	public void run(){
		System.out.println("Start of Thread 1");
		for(int i=0;i<=50;i++){
			sum=sum+i;
			System.out.println("T1  :"+i);
		}
		System.out.println("End of Thread 1");
		
	}

}
