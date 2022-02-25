package com.hsbc.withgeneric;
import java.util.HashMap;


public class CustomObjectHashMap {
public static void main(String[] args) {
	HashMap<EmployeeKey, Integer> hm=new HashMap<EmployeeKey, Integer>();
	hm.put(new EmployeeKey(1, "Bapun"), 5000);
	hm.put(new EmployeeKey(2, "Raja"), 6000);
	hm.put(new EmployeeKey(3, "Temper"), 15000);
	hm.put(new EmployeeKey(4, "Rambiraja"), 16000);
	hm.put(new EmployeeKey(6, "Bapun"), 35000);
	hm.put(new EmployeeKey(6, "Bapun"), 46000);
System.out.println(hm);
}
}
