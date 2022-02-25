
package com.hsbc.mcqs;

import java.util.ArrayList;
import java.util.List;

class MCQ19{

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();

        list.add(30);
        list.add(13);list.add(21);list.add(2);list.add(11);
        System.out.println(list);
        list.removeIf(e -> e%2 ==0);
        System.out.println(list);




    }

}