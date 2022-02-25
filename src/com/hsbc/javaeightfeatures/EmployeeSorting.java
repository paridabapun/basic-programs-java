package com.hsbc.javaeightfeatures;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSorting {


    public static void main(String[] args) {


        Employee employee = new Employee(323, "Bhagabata");
        Employee employee1 = new Employee(4, "Reena");

        Employee employee2 = new Employee(535, "Suvam");
        Employee employee3 = new Employee(535, "Rabindra");
        Employee employee4 = new Employee(6465, "Bhabagrahi");
        Employee employee5 = new Employee(764, "Sachin");
        Employee employee6 = new Employee(234, "ABS");
        Employee employee7 = new Employee(987, "Liza");
        Employee employee8 = new Employee(22342, "Prabhat");
        Employee employee9 = new Employee(452, "Ashmi");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);

        Collections.sort(employees, (o1, o2) -> (o1.getEid() > o2.getEid()) ? -1 : (o1.getEid() < o2.getEid()) ? 1 : 0);
        System.out.println(employees);
    }
}
