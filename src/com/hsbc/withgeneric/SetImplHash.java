package com.hsbc.withgeneric;
//WAP to sort the elements of Hashset 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;


public class SetImplHash {
public static void main(String[] args) {
	HashSet<String> h=new HashSet<String>();
	h.add("B");
	h.add("B");
	h.add("C");
	h.add("Z");
	h.add("R");
//	h.add("null");

System.out.println(h);
//Collections.sort(h);
ArrayList<String> a1=new ArrayList<String>(h);
System.out.println(a1);
Collections.sort(a1);
System.out.println("natural sorting order "+a1);
Collections.sort(a1, new Comparator<String>() {

	@Override
	public int compare(String arg0, String arg1) {
		return -arg0.compareTo(arg1);
	}
	
});
System.out.println("Custom sorting order"+a1);
}

}
