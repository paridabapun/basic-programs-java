package com.hsbc.generics;

public class BoundedTypeEx<T extends Number> {
	
	public T getOb() {
		return ob;
	}


	public void setOb(T ob) {
		this.ob = ob;
	}


	T ob;
	
	
	
	
public static void main(String[] args) {
	
	BoundedTypeEx<Integer> bint=new BoundedTypeEx<Integer>();
	bint.setOb(1);
	BoundedTypeEx<Double> bdbl=new BoundedTypeEx<Double>();
	bdbl.setOb(2.4);
//	BoundedTypeEx<String> bstr=new BoundedTypeEx<String>();
	
	
}
}
