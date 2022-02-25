package com.hsbc.designpattern.singletone;

public class Abc1 {

    static Abc1 abc;

//LAZY Loading of object
    public static Abc1 getInstance() {
//        It will fail in multithreaded env.
        if (null == abc) {
            abc = new Abc1();
        }
        return abc;
    }

    //DONT ALLOW USER TO CREATE OBJ USING DEFAULT CONSTRUCTOR
    private Abc1() {
        System.out.println("Instance Created....");

    }

}
