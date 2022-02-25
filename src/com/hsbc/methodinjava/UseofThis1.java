package com.hsbc.methodinjava;

public class UseofThis1 {
	private int x;
UseofThis1() {
	this(50);
	this.acess();
}
UseofThis1(int x){
	this.x=x;
}
void acess(){
	System.out.println("value of x is ="+x);
}
	

	
	public static void main(String[] args) {
		UseofThis1 ut=new UseofThis1();
	

	}

}
