package com.hsbc.multithreading;

public class StateOfThread implements Runnable {

	static Thread thread;
	static StateOfThread stateOfThread;

	public void run() {

		try {
//			TIMED-WAITING STATE
			Thread.sleep(100);
			System.out.println("Current Thread State " + thread.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("run execution completed.");
	
	}
	

	public static void main(String[] args) {

		stateOfThread = new StateOfThread();
		thread = new Thread(stateOfThread);
		System.out.println("Current Thread State " + thread.getState());
		thread.start();
		System.out.println("Current Thread State " + thread.getState());
	}
}
