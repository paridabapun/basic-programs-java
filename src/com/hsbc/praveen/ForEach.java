package com.hsbc.praveen;

public class ForEach {
	public static void main(String args[]) {
		int a[]={10,20,30,45,12};

		for(int i=0;i<a.length;i++){
			System.out.print("\t"+a[i]);
			
		}
		System.out.println();
		for(int j:a){
			System.out.print("\t"+j);
		}
	}

}
