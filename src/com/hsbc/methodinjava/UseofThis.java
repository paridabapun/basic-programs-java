package com.hsbc.methodinjava;

class UseofThis {
	 int b,a;
	 void setData(int a,int b){
		 this.a=a;//local variable getting priority over other
		 this.b=b;
	System.out.println("a  ="+a);
	System.out.println("b  ="+b);
	
	 }
	 void display(){
		 System.out.println("a  ="+a);
		 System.out.println("b  ="+b);
	 }
	 

	
	public static void main(String[] args) {
		UseofThis ut=new UseofThis();
		ut.setData(5, 4);
	ut.display();
		
	}

}
