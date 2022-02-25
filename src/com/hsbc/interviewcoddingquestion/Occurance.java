package com.hsbc.interviewcoddingquestion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {

    public static void frequencyCheck(String s) {


        String arr[] = s.split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);

            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        frequencyCheck(" reasons why I love you.");
    }
}
