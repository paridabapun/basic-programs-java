package com.hsbc.multithreading;

public class MainThreadControl extends Thread {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("Current Thread " + thread.getName() + "" + thread.getId() + "" + "Priority---"
				+ thread.getPriority() + "" + thread.getState());
		thread.setPriority(MAX_PRIORITY);
		System.out.println("Main thread new priority: " + thread.getPriority());

		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread execution with priority " + thread.getPriority());
		}

		ChildThreadForMain childThreadForMain = new ChildThreadForMain();
		childThreadForMain.start();

		try {
			System.out.println("Entering into Deadlock");
			thread.join();
			System.out.println("This line will never executed");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
