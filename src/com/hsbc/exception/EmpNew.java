package com.hsbc.exception;
public class EmpNew {
	public float getPension(int age,float basicSalary)throws InvalidAgeException{
		float pen=0;
		if(age >100 || age <50){
			throw new InvalidAgeException();
		}
		else {
			
		
		pen=(age*basicSalary)/100;
		return pen;
		}
		}


}
