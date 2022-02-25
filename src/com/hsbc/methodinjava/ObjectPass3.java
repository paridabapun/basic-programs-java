package com.hsbc.methodinjava;

//wap to pass object to method and perform swap
class Employee1{
	int id1,id2;
	Employee1(int id1,int id2){
		this.id1=id1;
		this.id2=id2;
	}
}
class Check1{
	void swap(Employee1 ob)
	{
		int temp;
		temp=ob.id1;
		ob.id1=ob.id2;
		ob.id2=temp;
		//System.out.println(ob1.id+"\t"+ob2.id);
	}
}

public class ObjectPass3 {

	
	public static void main(String[] args) {
	
		Employee1 ob1=new Employee1(10, 20);
		Check1 obj=new Check1();
		
		
		
		
		System.out.println(ob1.id1+"\t"+ob1.id2);//before swapping...
	obj.swap(ob1);
		System.out.println(ob1.id1+"\t"+ob1.id2);//after swapping...
	}

}
