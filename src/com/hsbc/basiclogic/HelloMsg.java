package com.hsbc.basiclogic;//wap to display a message hello n times
import java.io.*;
public class HelloMsg {

	public static void main(String[] args)throws Exception {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter how many times to print");
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++){
	System.out.println("Hello Java");
}
	}

}
