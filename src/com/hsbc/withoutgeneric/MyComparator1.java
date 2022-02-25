package com.hsbc.withoutgeneric;
import java.util.Comparator;

public class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		// return i1.compareTo(i2);//default natural sorting order
		// return -i1.compareTo(i2);// reverse of default
		return i2.compareTo(i1);// reverse.
		// return 0;
	}
}
