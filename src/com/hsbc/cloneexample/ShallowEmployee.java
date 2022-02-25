package com.hsbc.cloneexample;


public class ShallowEmployee implements Cloneable {

    private  int employee_id;
    private String employee_name;
    private ShallowAddress shallowAddress;

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setShallowAddress(ShallowAddress shallowAddress) {
        this.shallowAddress = shallowAddress;
    }

    public int getEmployee_id() {
        return employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public ShallowAddress getShallowAddress() {
        return shallowAddress;
    }

    public ShallowEmployee(int employee_id, String employee_name, ShallowAddress shallowAddress) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.shallowAddress = shallowAddress;
    }

    public ShallowEmployee() {
        System.out.println("Default constructor executed of employee");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "employee_id =" + employee_id + " employee_name =" + employee_name + " shallowAddress =" + shallowAddress;
    }
}



