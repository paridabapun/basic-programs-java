package com.hsbc.multithreading;

public class SleepDemo3 {
public static void main(String[] args) {
	boolean flag=true;
	int x=4;
while(flag){
	 x=x*45;
	 
System.out.println("x = "+x);
try {
	Thread.sleep(600);
} catch (InterruptedException e) {
	e.printStackTrace();
}
}
}
}
