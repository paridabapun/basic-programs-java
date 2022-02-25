package com.hsbc.methodinjava;

//wap to pass object to method
class Employee{
	int id;
	Employee(int id){
		this.id=id;
	}
}
class Check{
	void swap(Employee ob1,Employee ob2)
	{
		Employee temp;
		temp=ob1;
		ob1=ob2;
		ob2=temp;
		//System.out.println(ob1.id+"\t"+ob2.id);
	}
}

public class ObjectPasstoMethod {

	
	public static void main(String[] args) {
	
		Employee ob1=new Employee(10);
		Employee ob2=new Employee(20);
		Check ob=new Check();
		System.out.println(ob1.id+"\t"+ob2.id);//before swapping...
		ob.swap(ob1, ob2);
		System.out.println(ob1.id+"\t"+ob2.id);//after swapping...
	}

}
