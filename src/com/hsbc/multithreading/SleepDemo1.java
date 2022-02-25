package com.hsbc.multithreading;

public class SleepDemo1 extends Thread {
public void run() {
System.out.println("run() started..");

try {
	Thread.sleep(1600);
} catch (InterruptedException e) {

	e.printStackTrace();
}
catch(Exception e){
	e.printStackTrace();
}
for(int i=0;i<=50;i++){
	System.out.println("Thread1 "+i);
}
System.out.println("End of run() ...");
}
public static void main(String[] args)throws InterruptedException {
	SleepDemo1 s1=new SleepDemo1();
	s1.start();
	for(int i=100;i<=250;i++){
		System.out.println("Main "+i);
	}
	System.out.println("Main Ended");
}
}
