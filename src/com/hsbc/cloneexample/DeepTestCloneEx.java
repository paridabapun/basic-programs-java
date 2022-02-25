package com.hsbc.cloneexample;

public class DeepTestCloneEx {

    public static void main(String[] args) {

        try {
            DeepAddress deepAddress = new DeepAddress(1, "Rajaloka");

            DeepEmployee deepEmployee = new DeepEmployee(1, "Bhagabata", deepAddress);

            DeepEmployee cloneDeepEmployee = (DeepEmployee) deepEmployee.clone();
            System.out.println("After only clone the object");

            System.out.println("Original Employee Object "+"\n "+deepEmployee);
            System.out.println("Clone Employee Object "+"\n "+cloneDeepEmployee);

            //CHANGES IN CLONED OBJECT REFLECTS IN ORIGINAL OBJECT
            deepAddress.setAddress_id(201);
            deepAddress.setAddress_details("PUNE");
            cloneDeepEmployee.setEmployee_id(201);
            cloneDeepEmployee.setEmployee_name("Prashant Kumar");
            cloneDeepEmployee.setDeepAddress(deepAddress);

            System.out.println("After changes in cloned object ");

            System.out.println("Clone Employee Object "+"\n "+cloneDeepEmployee);
            System.out.println("Original Employee Object "+"\n "+deepEmployee);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
