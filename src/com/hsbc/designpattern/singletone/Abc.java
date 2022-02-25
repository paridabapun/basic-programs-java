package com.hsbc.designpattern.singletone;

public class Abc {

    static Abc abc = new Abc();
    //DRAWBACK : Eagarly instance created ....
//    Wastage of memory if not getting used.

//    to fix go to Abc1 class(To load lazily)

    public static Abc getInstance() {
        return abc;
    }

    //DONT ALLOW USER TO CREATE OBJ USING DEFAULT CONSTRUCTOR
    private Abc() {

    }
// IF YOU FOLLOW THEASE steps it will restrict creation of multiple obj.

}
