package com.hsbc.exception;
class Edemo4 
{
	void fun1() throws ArithmeticException{
	System.out.println("fun1() executed....");
	}
	void fun2() throws ClassNotFoundException{
	System.out.println("fun2() executed....");
	}
	void fun3(){
	System.out.println("fun3() executed.....");
	}
	void fun4()throws Exception{
	System.out.println("fun4() executed.....");
	}
	public static void main(String[] args) 
	{
		Edemo4 e1=new Edemo4();
		e1.fun1();
		try{
			e1.fun2();
			e1.fun4();
		}
		catch(Exception e){
		System.out.println(e);
		}
		e1.fun3();
		
	}
}
