package com.hsbc.withoutgeneric;
import java.util.Comparator;


public class MyComparatorString implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
int i1=s1.length();
int i2=s2.length();
if(i1<i2){
	return -1;
	
}
else if(i1>i2){
	return +1;
}
else{
	return s1.compareTo(s2);
}
	
	}

}
