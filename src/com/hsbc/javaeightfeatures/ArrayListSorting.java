package com.hsbc.javaeightfeatures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(2);
        integers.add(1);
        integers.add(9);
        integers.add(4);
        integers.add(7);
        integers.add(2);
        integers.add(11);
        integers.add(0);
        integers.add(5);
        integers.add(3);
        integers.add(8);

        System.out.println(integers);
//SORTING USING COLLECTION SORT METHOD
//        Collections.sort(integers);
        System.out.println(integers);

//        Collections.sort(integers, new MyArrayListComparator());
//        System.out.println(integers);


//Using LAMDA EXPRESSION
        Collections.sort(integers, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? +1 : 0);
        System.out.println(integers);

    }
}
