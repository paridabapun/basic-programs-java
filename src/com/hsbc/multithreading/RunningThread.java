package com.hsbc.multithreading;
public class RunningThread extends Thread implements Runnable {
	public static void main(String[] args) throws Exception {
		Thread t = Thread.currentThread();
		System.out.println("running thred is =" + t);
		System.out.println("its name is =" + t.getName());
		System.out.println("its class name is =" + t.getClass());
		System.out.println("its priority=" + t.getPriority());

		try {
			System.out.println("Wait my friend...................");
			t.sleep(1000);
			System.out.println("Thats look");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getDefaultUncaughtExceptionHandler());
		System.out.println("no of counts =" + t.countStackFrames());
		System.out.println("" + t.getId());
	}
}
