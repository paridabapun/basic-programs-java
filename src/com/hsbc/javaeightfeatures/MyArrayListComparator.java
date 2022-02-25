package com.hsbc.javaeightfeatures;

import java.util.Comparator;

public class MyArrayListComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {

        //USING IF ELSE
        /*if (o1 > o2) {
            return -1;
        } else if (o1 < 02) {
            return +1;
        } else {
            return 0;
        }*/
//       USING TERNERY OPERATOR
        return (o1 > o2) ? -1 : (o1 < o2) ? +1 : 0;

    }
}
