package com.hsbc.interviewcoddingquestion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance2 {


    static void frequencCheck(String s) {


        char[] chars = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < chars.length; i++) {

            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);

            } else {
                map.put(chars[i], 1);
            }


        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {

        frequencCheck("testcode");
    }

}
