package com.hsbc.withoutgeneric;
public class Student implements Comparable<Student> {

	public int sid;
	public String sname;

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + "";
	}

	@Override
	public int compareTo(Student o) {

		if (this.sid > o.sid) {
			return 1;
		} else if (this.sid < o.sid) {
			return -1;
		}
		return 0;
	}

}
