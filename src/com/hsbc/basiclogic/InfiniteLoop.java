package com.hsbc.basiclogic;

//wap to display 1 to 10 using for loop
public class InfiniteLoop {


	public static void main(String[] args) {
		int x=1;
		for(;;)
		{
			System.out.println(x);
			x++;
			if(x>10)break;
		}
	}

}
