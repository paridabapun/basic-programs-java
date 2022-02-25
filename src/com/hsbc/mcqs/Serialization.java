package com.hsbc.mcqs;

import java.io.*;

public class Serialization {

    public static void main(String[] args) throws IOException {
        Address address = new Address();
        address.setAddress1("Pune");
        Employee employee = new Employee(1, "Bhagbata", address);
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream inputStream = null;
        try {

            // SERIALIZATION
            FileOutputStream fileOutputStream = new FileOutputStream("employedetails.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            System.out.println("Done");

            // DE-SERIALIZATION
            FileInputStream fileInputStream = new FileInputStream("employedetails.txt");
            inputStream = new ObjectInputStream(fileInputStream);
            Employee redEmployee = (Employee) inputStream.readObject();

            System.out.println("Done");
            System.out.println(redEmployee.getEid() + "" + redEmployee.getEname() + "" + redEmployee.getAddress());

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException ie) {
            ie.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }

    }
}