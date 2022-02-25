package com.hsbc.javaeightfeatures;

public class Employee {

    private Integer eid;

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }

    private String ename;

    public Employee(Integer eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }



    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
