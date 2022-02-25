package com.hsbc.multithreading;
public class SleepDemo2 extends Thread {
public void run() {
System.out.println("run() started..");
for(int i=0;i<=50;i++){
	System.out.println("Thread1 "+i);
}
System.out.println("End of run() ...");
}
public static void main(String[] args) throws InterruptedException {
	SleepDemo2 s2=new SleepDemo2();
	s2.start();
	Thread.sleep(600);
	for(int i=100;i<=250;i++){
		System.out.println("Main "+i);
	}
	System.out.println("Main Ended");
}
}
