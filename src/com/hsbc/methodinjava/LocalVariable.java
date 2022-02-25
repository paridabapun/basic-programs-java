package com.hsbc.methodinjava;

//wap to acess the local varible afrom the method acesss//but not possible to acess the local variable
class Local {
	private int x;
	void modify(int a){
	x=a;
		}
void acess(){
	System.out.println("x ="+x);
	//System.out.println("a ="+a);
}
}
	class LocalVariable{
		
	
	public static void main(String[] args) {
		Local l1=new Local();
		l1.modify(4);
		l1.acess();
		
	

	}

}
