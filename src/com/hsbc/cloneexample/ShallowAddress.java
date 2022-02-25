package com.hsbc.cloneexample;

public class ShallowAddress implements Cloneable {
    private int address_id;
    private String address_details;

    public ShallowAddress(int address_id, String address_details) {
        this.address_id = address_id;
        this.address_details = address_details;
    }

    @Override

    public String toString() {
        return "ShallowAddress ID " + address_id + " " + "ShallowAddress Details " + address_details;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress_details() {
        return address_details;
    }

    public void setAddress_details(String address_details) {
        this.address_details = address_details;
    }
}

