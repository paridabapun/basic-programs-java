package com.hsbc.serialization;
// If Super class is not Serializable but subclass is
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class B extends A implements Serializable {
@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + "]";
	}


int id;
String name;








public B(int x, int y,int id,String name) {
	super(x, y);
this.id=id;
this.name=name;
}





public B(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}





public static void main(String[] args)throws Exception {
	B em=new B(1, 2, 110, "bapun");
	FileOutputStream fos=new FileOutputStream("E:/Bapun docs/fileextr.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(em);
oos.flush();
oos.close();
System.out.println("Serialize");
FileInputStream fis=new FileInputStream("E:/Bapun docs/fileextr.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
B b3=(B)ois.readObject();

System.out.println("Deserialize");
System.out.println(b3.x);
System.out.println(b3);
}
}

