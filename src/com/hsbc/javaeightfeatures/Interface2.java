package com.hsbc.javaeightfeatures;

@FunctionalInterface
public interface Interface2 {

    default void m2() {
        System.out.println("m2()");
    }

    default void M4() {
        System.out.println("m4()");
    }

    public void m3();
}
