package com.hsbc.multithreading;

public class ThreadA extends Thread{

	public void start() {
	System.out.println("Start method of ThreadA");
	}
	public void run() 
	{
	System.out.println("run() method of runnable interface");
	}
	/*public void start(){
		System.out.println("start method of ThreadA");
	}*/
	void fun1()
	{
		System.out.println("Fun1 executed..");
	}
	void  fun2(){
		System.out.println("Fun2 Executed.....");
	}
	void fun3(){
		System.out.println("Fun3 executed.... ");
	}
public static void main(String[] args) {
	Thread t1=new Thread();

	t1.start();
ThreadA ta=new ThreadA();

ta.fun1();
ta.fun2();
ta.fun3();
ta.start();
//ta.start();

}
}
