package com.hsbc.designpattern.singletone;

public class Singletone {
	
//	Best WAY  to  to CREATE SINGLETONE CLASS

	private volatile static Singletone instance;

	private Singletone() {

	}

	public static Singletone getInstance() {

		if (instance == null) {
			synchronized (Singletone.class) {

				if (null == instance) {
					instance = new Singletone();
				}
			}
		}
		return instance;
	}

}
