package com.hsbc.multithreading;

public class SenderThread extends Thread {
    private String message;
	private Sender sender;
	private Thread thread;
	

	public SenderThread(String msg,Sender sender) {

	this.message=msg;
	this.sender=sender;
	}
	
}
