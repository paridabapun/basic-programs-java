package com.hsbc.exception;
public class EmpNewAsser {
	public float getPension(int age,float basicSalary){
		float pen=0;
//		assert(age >100 || age <50);
		pen=(age*basicSalary)/100;
		return pen;
		}
		}



