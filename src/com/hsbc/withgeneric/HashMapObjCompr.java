package com.hsbc.withgeneric;
import java.util.*;
import java.util.Map.Entry;


public class HashMapObjCompr {
public static void main(String[] args) {
HashMap<Integer,String> h1=new HashMap<Integer,String>();
h1.put(21, "bapun");
h1.put(2, "hari2");
h1.put(3, "hari1");
//Collections.sort(h1);
Set<Map.Entry<Integer, String>> s1=h1.entrySet();
List<Map.Entry<Integer,String>> list=new ArrayList<Map.Entry<Integer,String>>(s1);
Collections.sort(list,
		new Comparator<Map.Entry<Integer,String>>() {
		@Override
		public int compare(Entry<Integer, String> e1,
				Entry<Integer, String> e2) {
			if(e1.getKey()>e2.getKey()){
				return -1;
			}else if(e1.getKey()<e2.getKey()){
				return 1;
			}else{
			return 0;
			}
//			return e1.getValue().compareTo(e2.getValue());
		}
		});
Map<Integer,String> h2=new LinkedHashMap<Integer, String>();
for(Map.Entry<Integer,String> m: list){
	h2.put(m.getKey(), m.getValue());
}

int x[]={1,3,54,23,33,45};
for(int a:x){
	System.out.println(a);
}



System.out.println(h2);
}

}
