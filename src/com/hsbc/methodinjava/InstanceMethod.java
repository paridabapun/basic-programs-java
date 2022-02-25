package com.hsbc.methodinjava;

public class InstanceMethod {
	int id;
String name;
public void setId(int id){
	this.id=id;
}
public void setName(String name){
	this.name=name;
}
public int getId(){
	return id;
}
	
public String getName(){
	return name;
}
	public static void main(String[] args) {
		
		InstanceMethod im=new InstanceMethod();
		im.setId(1);
		im.setName("Bapun");
	System.out.println("The id id "+im.getId());
	System.out.println("The name of the person is "+im.getName());
	
	}

}
