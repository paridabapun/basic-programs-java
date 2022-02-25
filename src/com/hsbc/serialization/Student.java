package com.hsbc.serialization;
import java.io.Serializable;


public class Student implements Serializable {
@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}
String id;
String name;
String address;
public Student(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

}
