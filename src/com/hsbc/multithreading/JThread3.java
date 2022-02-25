package com.hsbc.multithreading;

public class JThread3 extends Thread {
JThread1 t1;
JThread3(JThread1 t1){
	this.t1=t1;
}
public void run() {
System.out.println("Begining of t3");
for(int i=200;i<=250;i++){
	System.out.println("t3  :"+i);
	if(i==215){
		try{
			t1.join();
		}
catch(Exception e){
	e.printStackTrace();
	System.out.println("Sum of 50 number is "+t1.sum);
	
	
}
		
	}
	
}
System.out.println("");
}
}
