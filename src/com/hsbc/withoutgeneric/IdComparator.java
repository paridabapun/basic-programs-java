package com.hsbc.withoutgeneric;
import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.sid > o2.sid) {
			return 1;
		}
		else if(o1.sid < o2.sid) {
			return -1;
		}
		return 0;
	}

}
