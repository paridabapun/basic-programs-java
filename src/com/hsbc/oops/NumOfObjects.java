package com.hsbc.oops;
public class NumOfObjects {

    static int count;
    {
        count++;
    }
    public static void main(String[] args)
    {
        System.out.println("no1:" + count);//1

        System.out.println("no2:"+ count); //2
		 System.out.println("Total objects before the for loop:"+count);
       for (int i=0; i<910;i++)
        {
        }
        System.out.println("Total objects:"+count);// 12 
  
	}
}