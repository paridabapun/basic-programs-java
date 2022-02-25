package com.hsbc.multithreading;
class Mythread extends Thread{
	public void run(){
		task1();
	task2();
		task3();
	}
public void task1(){
	System.out.println("this is task 1");
}
public void task2(){
	System.out.println("This is task 2");
}
public void task3(){
	System.out.println("This is task 3");
}
	
}
public class SingleThread {

	
	public static void main(String[] args) {
	Mythread ob=new Mythread();
	Thread t=new Thread(ob);
	t.start();

	}

}
