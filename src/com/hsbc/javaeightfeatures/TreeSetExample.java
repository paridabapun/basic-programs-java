package com.hsbc.javaeightfeatures;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {


        TreeSet<Integer> integers = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
//        TreeSet<Integer> integers = new TreeSet<Integer>();
        integers.add(2);
        integers.add(1);
        integers.add(9);
        integers.add(4);
        integers.add(7);
        integers.add(2);

        System.out.println(integers);
    }
}
