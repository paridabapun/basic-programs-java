package com.hsbc.oops;
class Odemo                                                                                                                                                                                                                                                                                                                                            
{
	public static void main(String[] args) 
	{
	A ob=new A();
	A ob1=new A();
	
	
	System.out.println("The value of ob "+ob);
	System.out.println("The value of ob1 "+ob1);
	
	if(ob1==ob){
		System.out.println("Both are same");
	}
	else 
		{
	System.out.println("Not samer both are");
	}

	
		System.out.println("The value of ob "+ob.i);
	System.out.println("The value of ob1 "+ob1.j);

	if(ob.i==ob.j){
	System.out.println("Both are Same ");

	}
	else {
	System.out.println("Both are different");	}
	
	}
}
