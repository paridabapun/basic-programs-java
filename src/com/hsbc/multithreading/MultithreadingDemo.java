package com.hsbc.multithreading;


//CREATING A THREAD BY EXTENDING THREAD CLASS
public class MultithreadingDemo extends Thread {

	@Override
	public void run() {
		System.out.println("Current Thread "+Thread.currentThread());

	}

	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i < n; i++) {
			MultithreadingDemo demo = new MultithreadingDemo();
			demo.start();

		}

	}

}
