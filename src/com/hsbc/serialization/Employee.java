package com.hsbc.serialization;
import java.io.EOFException;
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class Employee implements Externalizable {
int eid;
String ename;
public Employee() {
System.out.println("0 arg const. executed..");
}

public Employee(int eid, String ename) {
	this.eid = eid;
	this.ename = ename;
}

@Override
	public void readExternal(ObjectInput in) throws IOException,
ClassNotFoundException {
int id=in.readInt();
String name=(String)in.readObject();
System.out.println("id:    "+ id+" Name :  "+name);
	
	}

@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(eid);
		out.writeObject(ename);
	}
public static void main(String[] args) throws IOException, ClassNotFoundException{
Employee em=new Employee(1, "bapun");
	FileOutputStream fos=new FileOutputStream("E:/Bapun docs/fileextr.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(em);
oos.flush();
oos.close();
System.out.println("Serialize");
FileInputStream fis=new FileInputStream("E:/Bapun docs/fileextr.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
ois.readObject();
System.out.println("Deserialize");
//System.out.println(e2);
}
}