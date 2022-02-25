package com.hsbc.multithreading;
public class Thread1 extends Thread {

	public void run() {
		System.out.println("start of run() of Thread1");
		for (int i = 0; i <= 50; i++) {
			System.out.println("Thread1 =" + i);
		}
		System.out.println("End of run() of Thread1");

	}
	/*
	 * public static void main(String[] args) { Thread1 t1=new Thread1();
	 * 
	 * t1.start(); // t1.setPriority(4); for(int i=0;i<=200;i++){
	 * System.out.println("main Thread "+i); }
	 * System.out.println("main exection completed...."); }
	 */

}
