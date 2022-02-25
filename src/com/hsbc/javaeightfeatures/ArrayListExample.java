package com.hsbc.javaeightfeatures;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Liza");
        strings.add("Reena");
        strings.add("Dhiren");
        strings.add("Silu");
        strings.add("Chandan");
        strings.add("Bapun");
        strings.add("Reena");
        strings.add("Dhiren");

        System.out.println("ArrayLIST " + strings);

        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("Liza");
        stringHashSet.add("Reena");
        stringHashSet.add("Dhiren");
        stringHashSet.add("Silu");
        stringHashSet.add("Chandan");
        stringHashSet.add("Bapun");
        stringHashSet.add("Reena");
        stringHashSet.add("Dhiren");

        System.out.println("Hashset"+stringHashSet);


    }
}
