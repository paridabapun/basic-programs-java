package com.hsbc.basiclogic;

class ExampleArr
{
	public static void main(String[] args) 
	{
		int arr1[]={1,3,2,4,5};
		int arr2[]={1,3,2,4,5};
		for(int i=0;i<arr1.length;i++){
		
		for(int j=0;j<arr2.length;j++){
		
		if(arr1[i]==arr2[j]){
		System.out.println(arr1[i]);
		}
		else{
		System.out.print("");
		}
		}
		}
	}
}
