package com.hsbc.multithreading;
class Mythread1 extends Thread{
	String str;
	Mythread1(String str){
		this.str=str;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(str+ " : "+i);
			try{
				Thread.sleep(200);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}//end of for loop
	}//end of run
}

public class TwoThread {

	
	public static void main(String[] args) {
	Mythread1 m1=new Mythread1("CUT THE TICKET");
	Mythread1 m2=new Mythread1("BOOK THE SEAT");
	Thread t=new Thread(m1);
	Thread t1=new Thread(m2);
	t.start();
	t1.start();
	t1.start();
	}

}
