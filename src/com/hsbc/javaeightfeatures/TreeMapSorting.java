package com.hsbc.javaeightfeatures;

import java.util.TreeMap;

public class TreeMapSorting {


    public static void main(String[] args) {


        TreeMap<Integer, String> stringStringTreeMap = new TreeMap<>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        stringStringTreeMap.put(11, "Anjali Piusi");
        stringStringTreeMap.put(33, "Bapun");
        stringStringTreeMap.put(55, "Chandini");
        stringStringTreeMap.put(1212, "Deepaka");
        stringStringTreeMap.put(45, "Blank");
        stringStringTreeMap.put(45, "Faltu loko");
        stringStringTreeMap.put(567, "Goutam Mausa");
        stringStringTreeMap.put(7, "Hemanga");
        stringStringTreeMap.put(2, "None");
        stringStringTreeMap.put(3, "Jayashree");
        stringStringTreeMap.put(666, "Khushi");
        stringStringTreeMap.put(789, "Liza");
        stringStringTreeMap.put(54678, "Mama Mausi");
        System.out.println(stringStringTreeMap);
    }
}
