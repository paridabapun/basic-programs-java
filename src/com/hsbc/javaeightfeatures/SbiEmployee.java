package com.hsbc.javaeightfeatures;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SbiEmployee {

    private String name;
    private double salary;
    private String designation;
    private String location;

    public SbiEmployee(String name, double salary, String designation, String location) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    @Override
    public String toString() {

        return String.format("(%s,%.2f ,%s,%s)\n", name, salary, designation, location);

    }


    public static void display(Predicate<SbiEmployee> sbiEmployeePredicate, ArrayList<SbiEmployee> sbiEmployees) {


        for (SbiEmployee sbiEmployee : sbiEmployees) {

            if (sbiEmployeePredicate.test(sbiEmployee)) {
                System.out.println(sbiEmployee);
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<SbiEmployee> sbiEmployees = new ArrayList<>();

        SbiEmployee sbiEmployee = new SbiEmployee("Bhagabata", 10000, "SSE", "Pune");
        SbiEmployee sbiEmployee1 = new SbiEmployee("Bapun", 40000, "Software Engineer", "Hyderabad");
        SbiEmployee sbiEmployee2 = new SbiEmployee("Sipun", 47000, "Associates", "Pune");
        SbiEmployee sbiEmployee3 = new SbiEmployee("Liza", 16000, "SSE", "Mumbai");
        SbiEmployee sbiEmployee4 = new SbiEmployee("Tutun", 17000, "Manager", "Hyderabad");
        SbiEmployee sbiEmployee5 = new SbiEmployee("Dasree", 19000, "Manager", "Mumbai");
        SbiEmployee sbiEmployee6 = new SbiEmployee("Nirakar", 20000, "Software Engineer", "Pune");
        SbiEmployee sbiEmployee7 = new SbiEmployee("KArtik", 90000, "SSE", "Mumbai");
        SbiEmployee sbiEmployee9 = new SbiEmployee("Jaga", 2000, "SSE", "Mumbai");
        sbiEmployees.add(sbiEmployee);
        sbiEmployees.add(sbiEmployee1);
        sbiEmployees.add(sbiEmployee2);
        sbiEmployees.add(sbiEmployee3);
        sbiEmployees.add(sbiEmployee4);
        sbiEmployees.add(sbiEmployee5);
        sbiEmployees.add(sbiEmployee6);
        sbiEmployees.add(sbiEmployee7);
        sbiEmployees.add(sbiEmployee9);
        System.out.println(sbiEmployees);


        System.out.println("=================================================================================");
        System.out.println("Empoyees more than 50000 Salary");
        Predicate<SbiEmployee> sbiEmployeePredicate = employee -> employee.salary >= 50000;

        display(sbiEmployeePredicate, sbiEmployees);

        System.out.println("=================================================================================");
        Predicate<SbiEmployee> sbiEmployeePredicate1 = employee -> employee.designation.equalsIgnoreCase("SSE");
        System.out.println("Empoyees Designation SSE");
        display(sbiEmployeePredicate1, sbiEmployees);

        System.out.println("=================================================================================");
        Predicate<SbiEmployee> sbiEmployeePredicate2 = employee -> employee.location.equalsIgnoreCase("Pune");
        System.out.println("Empoyees location  pune");
        display(sbiEmployeePredicate2, sbiEmployees);

        System.out.println("=================================================================================");
        Predicate<SbiEmployee> sbiEmployeePredicate3 = employee -> employee.salary < 20000;
        System.out.println("Empoyees Salary less than 20000");
        display(sbiEmployeePredicate3, sbiEmployees);

        System.out.println("=================================================================================");
        Predicate<SbiEmployee> sbiEmployeePredicate4 = employee -> employee.salary < 20000;
        System.out.println("All SSE Empoyees  from Pune");
        display(sbiEmployeePredicate1.and(sbiEmployeePredicate2), sbiEmployees);

//        USING FUNCTION

        Function<ArrayList<SbiEmployee>, Double> arrayListDoubleFunction = l1 -> {

            double totalSalary = 0;

            for (SbiEmployee sbiEmployee8 : l1) {
                totalSalary = totalSalary + sbiEmployee8.salary;
            }
            return totalSalary;
        };
        System.out.println("The total salary of this month " + arrayListDoubleFunction.apply(sbiEmployees));


        System.out.println("Employee salary before increment " + sbiEmployees);


        Predicate<SbiEmployee> sbiEmployeePredicate5 = e -> e.salary < 5000;

        Function<SbiEmployee, SbiEmployee> sbiEmployeeSbiEmployeeFunction = e -> {
            e.salary = e.salary + 800;
            return e;
        };


        ArrayList<SbiEmployee> sbiEmployees1 = new ArrayList<>();

        for (SbiEmployee sbiEmployee8 : sbiEmployees) {


            if (sbiEmployeePredicate5.test(sbiEmployee8)) {
                sbiEmployeeSbiEmployeeFunction.apply(sbiEmployee8);
                sbiEmployees1.add(sbiEmployee8);


            }
        }

        System.out.println("After increment the salary is " + sbiEmployees1);


    }
}
