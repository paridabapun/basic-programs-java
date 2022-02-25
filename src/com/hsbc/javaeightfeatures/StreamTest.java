package com.hsbc.javaeightfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<Integer> stringList = new ArrayList<>();
        List<Integer> stringList1 = new ArrayList<>();

        stringList.add(10);
        stringList.add(11);
        stringList.add(12);
        stringList.add(13);
        stringList.add(14);

        for (int s : stringList) {

            if (s % 2 == 0) {
                stringList1.add(s);
            }
        }
        System.out.println(stringList1);

        List<Integer> integers = stringList.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println("Using Stream " + integers);


        ArrayList<String> strings = new ArrayList<>();

        strings.add("Bhagabata");
        strings.add("Papun");
        strings.add("Madhumita");
        strings.add("Ashmi");

        System.out.println(strings);

        System.out.println(strings.stream().filter(s -> s.length() >= 9).collect(Collectors.toList()));
        System.out.println(strings.stream().map(s -> s.toUpperCase(Locale.ROOT)).collect(Collectors.toList()));

        System.out.println(strings.stream().count());


        List<Integer> arysorting = new ArrayList<>();

        arysorting.add(10);
        arysorting.add(11);
        arysorting.add(12);
        arysorting.add(13);
        arysorting.add(14);
        arysorting.add(9);
        arysorting.add(8);
        arysorting.add(7);

        System.out.println(arysorting.stream().sorted().collect(Collectors.toList()));
        System.out.println(arysorting.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList()));
        arysorting.stream().forEach(s -> System.out.println(s));
        arysorting.stream().forEach(System.out :: println);


    }
}
