package com.hsbc.praveen;
import java.util.Scanner;


public class SwitchCaseDay {
public static void main(String args[]) {
System.out.println("Enter the day of the week between Sunday to saturday(1-7)");
Scanner sc=new Scanner(System.in);
int day=sc.nextInt();
switch (day){
case 1:System.out.println("This is Sunday");
	
	break;
case 2:System.out.println("This is Monday");
break;
case 3:System.out.println("This is tues day");
break;
case 4:System.out.println("This is WednessDay");
break;
case 5: System.out.println("This is Thurs DAy");
break;
case 6:System.out.println("Rhis is FriDay");
break;
case 7:System.out.println("this is Saturday");
default:
	break;
}
}
}
