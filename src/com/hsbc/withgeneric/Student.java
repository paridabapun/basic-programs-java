package com.hsbc.withgeneric;
public class Student {


private int sid;
private String sname;
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}
public Student(int sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;

}
@Override
public int hashCode() {
	return sid;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (sid != other.sid)
		return false;
	if (sname == null) {
		if (other.sname != null)
			return false;
	} else if (!sname.equals(other.sname))
		return false;
	return true;
}


}
