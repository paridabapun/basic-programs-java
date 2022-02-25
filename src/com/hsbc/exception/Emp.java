package com.hsbc.exception;
public class Emp {
public float getPension(int age,float basicSalary){
	float pen=0;
	pen=(age*basicSalary)/100;
	return pen;
}

}
