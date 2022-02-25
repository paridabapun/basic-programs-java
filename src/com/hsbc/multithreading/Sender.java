package com.hsbc.multithreading;

public class Sender {
	public void send(String msg) {

		System.out.println("Sending messsage---  " + msg);
		try {
			Thread.sleep(120);
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}

	}

}
