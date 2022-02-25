package com.hsbc.javaeightfeatures;
@FunctionalInterface
public interface Interface1 {

    public void mi();
    default void m2(){
        System.out.println("m2()");
    }


}
