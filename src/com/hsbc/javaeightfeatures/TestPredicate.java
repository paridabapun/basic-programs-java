package com.hsbc.javaeightfeatures;

import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate {


    public static void m2(Predicate<Integer> integerPredicate, int[] x) {
        for (int x1 : x) {

            if (integerPredicate.test(x1)) {
                System.out.println(x1);
            }
        }

    }


    public static void main(String[] args) {

        Predicate<Integer> integerPredicate = I -> I > 10;

        System.out.println(integerPredicate.test(100));
        System.out.println(integerPredicate.test(5));
//        System.out.println(integerPredicate.test("Bapun"));

        Predicate<String> stringPredicate = (s) -> s.length() > 5;
        System.out.println(stringPredicate.test("abcdfg"));
        System.out.println(stringPredicate.test("adfg"));

        Predicate<Collection> collectionPredicate = c -> c.isEmpty();
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        System.out.println(collectionPredicate.test(arrayList));
        ArrayList arrayList1 = new ArrayList();
        System.out.println(collectionPredicate.test(arrayList1));


//        JOINING TWO PREDICATE


        int[] x = {1, 3, 4, 5, 6, 78, 65, 3};
        Predicate<Integer> integerPredicate1 = i -> i > 10;
        Predicate<Integer> integerPredicate2 = i -> i % 2 == 0;
        System.out.println("The numbers greater than 10 are ");
        m2(integerPredicate1, x);
        System.out.println("The even numbers are  ");
        m2(integerPredicate2, x);
        System.out.println("The numbers not greater than 10 are ");
        m2(integerPredicate1.negate(), x);
        System.out.println("The numbers  greater than 10 are and even ");
        m2(integerPredicate1.and(integerPredicate2), x);
        System.out.println("The numbers  greater than 10 OR  even ");
        m2(integerPredicate1.or(integerPredicate2), x);


//        STRINGS START WITH K

        String s[] = {"Katrina", "Liza", "Bapun ", "Kalpana", "Megha", "Lion"};

        Predicate<String> namesStartWithK = s1 -> s1.charAt(0) == 'K';


        for (String s1 : s) {
            if (namesStartWithK.test(s1)){

            }
        }
        for (String s1 : s) {
            if (namesStartWithK.test(s1)){

            }
        }


        for (String s1 : s) {
            if (namesStartWithK.test(s1)) {
                System.out.println(s1);
            }
        }


//        REMOVE NULL and EMPTY VALUES FROM ARRAYLIST

        String s3[] = {"Katrina", "", "Bapun ", "", null, "Megha", "Lion"};

        Predicate<String> stringPredicate1 = sp -> sp != null && s.length != 0;

        ArrayList<String> strings = new ArrayList<>();

        for (String s1 : s3) {
            if (stringPredicate1.test(s1)) {
                strings.add(s1);
            }

        }

        System.out.println(strings);


    }
}

