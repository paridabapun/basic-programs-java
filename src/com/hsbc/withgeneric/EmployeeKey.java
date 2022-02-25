package com.hsbc.withgeneric;

public class EmployeeKey {
	@Override
	public int hashCode() {
		return eid;
	}

	@Override
	public boolean equals(Object obj) {
		EmployeeKey em = (EmployeeKey) obj;
		if (this.ename.equals(em.ename)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "EmployeeKey [eid=" + eid + ", ename=" + ename + "]";
	}

	int eid;
	String ename;

	public EmployeeKey(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

}
