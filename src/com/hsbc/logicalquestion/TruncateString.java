package com.hsbc.logicalquestion;

import java.util.Arrays;

public class TruncateString {


    /*
     * Method use to truncate a specific string to certain length
     * */
    public static String truncateString(String name) {

        if (null != name &&  name.length() > 42) {

            name = name.substring(0, 42);


        }
        return name;
    }

    public static void main(String[] args) {

        String name = "i want to trim a string having to a certain length ie 42";
        System.out.println("Original String " + name);

        String truncateName = truncateString(name);

        System.out.println("Truncate String " + truncateName);

        String name1 = "";
        name1 = name1.length() > 22 ? name1.substring(0, 22) : name1;
        System.out.println(name1);

    }
}
