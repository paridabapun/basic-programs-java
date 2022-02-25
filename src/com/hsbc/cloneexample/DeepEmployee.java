package com.hsbc.cloneexample;


public class DeepEmployee implements Cloneable {

    private  int employee_id;
    private String employee_name;
    private DeepAddress deepAddress;

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }


    public int getEmployee_id() {
        return employee_id;
    }

    public DeepAddress getDeepAddress() {
        return deepAddress;
    }

    public void setDeepAddress(DeepAddress deepAddress) {
        this.deepAddress = deepAddress;
    }

    public String getEmployee_name() {
        return employee_name;
    }


    public DeepEmployee(int employee_id, String employee_name, DeepAddress deepAddress) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.deepAddress = deepAddress;
    }

    public DeepEmployee() {
        System.out.println("Default constructor executed of employee");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        DeepEmployee   deepEmployee=(DeepEmployee) super.clone();
        deepEmployee.deepAddress=(DeepAddress) this.deepAddress.clone();
        return  deepEmployee;
    }

    @Override
    public String toString() {
        return "employee_id =" + employee_id + " employee_name =" + employee_name + " deepAddress =" + deepAddress;
    }
}



