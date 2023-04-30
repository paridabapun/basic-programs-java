package com.hsbc.mcqs;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1234L;
    Address address;
    private int eid;
    private String ename;

    Employee(int eid, String ename, Address address) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        //Resticting address to shallow clonning
        employee.address = (Address) address.clone();
        return employee;
    }

    @Override
    public int hashCode() {
        return eid;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
    }

}
