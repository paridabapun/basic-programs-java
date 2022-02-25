package com.hsbc.designpattern.singletone;

public class Abc3 {


    static Abc3 abc;

    //LAZY Loading of object
    public static synchronized Abc3 getInstance() {
        if (null == abc) {
            synchronized (Abc3.class) {

                    return abc = new Abc3();
            }
        } else {
            return abc;
        }
    }

    //DONT ALLOW USER TO CREATE OBJ USING DEFAULT CONSTRUCTOR
    private Abc3() {
        System.out.println("Instance Created.... ABC2");

    }

}

