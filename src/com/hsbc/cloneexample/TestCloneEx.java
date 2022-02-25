package com.hsbc.cloneexample;

public class TestCloneEx {

    public static void main(String[] args) {

        try {
            ShallowAddress shallowAddress = new ShallowAddress(1, "Rajaloka");

            ShallowEmployee shallowEmployee = new ShallowEmployee(1, "Bhagabata", shallowAddress);

            ShallowEmployee cloneShallowEmployee = (ShallowEmployee) shallowEmployee.clone();
            System.out.println("After only clone the object");

            System.out.println(shallowEmployee);
            System.out.println(cloneShallowEmployee);

            //CHANGES IN CLONED OBJECT REFLECTS IN ORIGINAL OBJECT
            shallowAddress.setAddress_id(201);
            shallowAddress.setAddress_details("PUNE");
            cloneShallowEmployee.setShallowAddress(shallowAddress);
            cloneShallowEmployee.setEmployee_id(201);
            cloneShallowEmployee.setEmployee_name("Prashant Kumar");

            System.out.println("After changes in cloned object ");

            System.out.println(cloneShallowEmployee);
            System.out.println(shallowEmployee);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
