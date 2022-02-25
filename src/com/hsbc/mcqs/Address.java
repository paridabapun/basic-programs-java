package com.hsbc.mcqs;

import java.io.Serializable;

public class Address implements Cloneable, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String address1;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Override
    public String toString() {
        return "Address [address1=" + address1 + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
