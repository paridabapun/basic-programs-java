package com.hsbc.javaeightfeatures;

import java.util.Scanner;
import java.util.function.Predicate;

public class User {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public static void main(String[] args) {


        Predicate<User> userPredicate = user -> user.username.equals("Bapun") && user.password.equals("Liza");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USer Name");

        String username = sc.next();
        System.out.println("Enter Password");

        String password = sc.next();

        User user = new User(username, password);
        if (userPredicate.test(user)) {
            System.out.println("Valid credential");
        } else {
            System.out.println("InValid credential");
        }

    }

}
