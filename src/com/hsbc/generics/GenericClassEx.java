package com.hsbc.generics;

import java.util.ArrayList;

public class GenericClassEx<T> {
	T t;
	public T gett() {
		return t;
	}

	public void sett(T t) {
		this.t = t;
	}

	
	public static void main(String[] args) {
		GenericClassEx<Integer> iclass=new GenericClassEx<Integer>();
		GenericClassEx<ArrayList<Student>> all=new GenericClassEx<ArrayList<Student>>();
		ArrayList<Student> myStudent=all.gett();
//		System.out.println(myStudent.);
		
		
		
		
		iclass.sett(12);
		iclass.sett(34);
		System.out.println(iclass.gett());
	}

}
