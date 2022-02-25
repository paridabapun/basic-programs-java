package com.hsbc.serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Example1 {
public static void main(String[] args) throws Exception {
FileOutputStream fos=new FileOutputStream("E:/Bapun docs/CompleteJava/file.txt");
//FileOutputStream fos=new FileOutputStream("file.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
Student s1=new Student("1", "Bapun", "Rajaloka");
	oos.writeObject(s1);
	System.out.println("Object state written to byte stram ");
FileInputStream fis=new FileInputStream("E:/Bapun docs/CompleteJava/file.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Student s2=(Student)ois.readObject();
System.out.println(s2);
}
}
