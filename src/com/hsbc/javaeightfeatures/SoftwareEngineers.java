package com.hsbc.javaeightfeatures;

import java.util.function.Predicate;

public class SoftwareEngineers {


    String name;
    int age;
    boolean ishavingGF;

    public SoftwareEngineers(String name, int age, boolean ishavingGF) {
        this.name = name;
        this.age = age;
        this.ishavingGF = ishavingGF;
    }

    @Override
    public String toString() {
        return "SoftwareEngineers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ishavingGF=" + ishavingGF +
                '}';
    }

    public static void main(String[] args) {

        SoftwareEngineers[] softwareEngineers = {new SoftwareEngineers("Bapun", 20, true),
                new SoftwareEngineers("Bapun", 20, true),
                new SoftwareEngineers("Bapun", 20, false),
                new SoftwareEngineers("Bapun", 20, false),
                new SoftwareEngineers("Bapun", 20, true),
                new SoftwareEngineers("Bapun", 20, false),};

        Predicate<SoftwareEngineers>  softwareEngineersPredicate = sc -> sc.age >= 18 && sc.ishavingGF ==true;

        for(SoftwareEngineers  softwareEngineers1: softwareEngineers){


            if(softwareEngineersPredicate.test(softwareEngineers1)){
                System.out.println(softwareEngineers1);
            }


        }

    }

}
