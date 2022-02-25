package com.hsbc.basiclogic;
//Wap to check a no is binary or not.
import java.io.*;


public class BinaryCheck {

	
	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number to check");
		int bno=Integer.parseInt(br.readLine());
		int t,r=0,c=0;
		t=bno;
		while(bno>0){
			if(bno%10==0 || bno%10==1)
				c++;
			r++;
			bno=bno/10;
		}
if(r==c){
	System.out.println(t+" s a binary no ");
		}
else{
	System.out.println(t+" not a binary no...");
}
		
		

	}

}
