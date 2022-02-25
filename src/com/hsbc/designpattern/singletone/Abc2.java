package com.hsbc.designpattern.singletone;

public class Abc2 {


    static Abc2 abc;

    //LAZY Loading of object
    public static synchronized Abc2 getInstance() {
        if (null == abc) {
            return abc = new Abc2();
        } else {
            return abc;
        }
    }

    //DONT ALLOW USER TO CREATE OBJ USING DEFAULT CONSTRUCTOR
    private Abc2() {
        System.out.println("Instance Created.... ABC2");

    }

}

