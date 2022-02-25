package com.hsbc.withgeneric;
//Working on HashMap   
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapImplHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		System.out.println(hm);
		int n=hm.size();
		System.out.println(n);
		hm.put(1, "rice");
		hm.put(2, "wheat");
		hm.put(3, "corn");
		hm.put(4, "dal");
		hm.put(5, "meat");
	System.out.println(hm);
/*	System.out.println(h1.size());
	System.out.println(h1.hashCode());
	System.out.println(h1.get(3));
*/	
	Set<Integer> s1=hm.keySet();
	System.out.println(s1);
	Collection<String> c=hm.values();
	System.out.println(c);
Set<Map.Entry<Integer, String>> s2=hm.entrySet();
	System.out.println(s2);
	System.out.println("Using Iterator .........");
Iterator<Entry<Integer, String>> it=s2.iterator();	
while (it.hasNext()) {
	Map.Entry<Integer, String> e1 = it.next();
	System.out.println("key== "+e1.getKey()+"\t"+"Values == " +e1.getValue());
	if(e1.getKey().equals(2)){
		e1.setValue("XXXX");
	}
} 
System.out.println("using reference....");
System.out.println(hm);
System.out.println("Using for loop");
for(Map.Entry m1:hm.entrySet()){
	System.out.println(m1.getKey()+" === "+m1.getValue());
	
}
}
}
