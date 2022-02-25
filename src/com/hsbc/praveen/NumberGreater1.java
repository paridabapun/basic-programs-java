package com.hsbc.praveen;
import java.util.Scanner;
public class NumberGreater1 {
public static void main(String args[])throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no to check");
int num=sc.nextInt();
if(num>0){
	System.out.println(num+"  is +ve no");
}
else if(num<0){
	System.out.println(num+" is negetive");
}
else{
	System.out.println("it is Zeroooooo");
}
	
}
}
