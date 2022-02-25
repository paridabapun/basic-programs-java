package com.hsbc.multithreading;

//CREATING A THREAD BY IMPLEMENTING RUNNABLE INTERFACE
public class MultithreadingDemo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Current Thread " + Thread.currentThread());

	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			MultithreadingDemo target = new MultithreadingDemo();
			Thread thread = new Thread(target);
			thread.start();
		}
	}

}
