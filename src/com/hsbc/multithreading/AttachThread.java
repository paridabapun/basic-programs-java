package com.hsbc.multithreading;
import java.io.*;
class Demo extends Thread{
boolean stop=false;
	public void run(){
		for(int i=1;i<1000000000;i++)
		
		{
			System.out.println(i);
			if(stop)return;
		}
	}}

	public class AttachThread {
	public static void main(String[] args)throws IOException {
		
		Demo ob=new Demo();
		Thread t=new Thread(ob);
		t.start();
		//System.out.println(t.getName());
		System.in.read();
	ob.stop=true;	

	}

	}
