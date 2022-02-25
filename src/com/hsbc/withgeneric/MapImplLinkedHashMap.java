package com.hsbc.withgeneric;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapImplLinkedHashMap {
public static void main(String[] args) {
		   
		  LinkedHashMap<Integer, String> lhs=new LinkedHashMap<Integer,String>();  
System.out.println(lhs);	
lhs.put(0, "TCS");
lhs.put(1, "microsoft");
lhs.put(2, "ibm");
lhs.put(3, "sap");
lhs.put(4, "symantec");
lhs.put(5, "ca");
System.out.println(lhs);

Set<Entry<Integer,String>> s1=lhs.entrySet();
Iterator<Map.Entry<Integer, String>> it=s1.iterator();
while (it.hasNext()) {
	Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>)it.next();
	System.out.println("key :"+entry.getKey()+"\t"+"value :"+entry.getValue());
	
}
for(Map.Entry entry: lhs.entrySet()){
	System.out.println("key :"+entry.getKey()+"\t"+"value :"+entry.getValue());
}
}

		 }  
