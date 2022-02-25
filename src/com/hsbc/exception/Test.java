
package com.hsbc.exception;
import java.io.IOException;
public class Test {
	public float getPension(int age,float basicSalary){
		float pen=0;
		if(age >100 || age <50){
			throw new ArithmeticException();
//			throw new IOException();
		}
		else {
		pen=(age*basicSalary)/100;
		return pen;
		}
		
		
		}
public static void main(String[] args) {
	Test t1=new Test();

	t1.getPension(12, 2345);
}

}
