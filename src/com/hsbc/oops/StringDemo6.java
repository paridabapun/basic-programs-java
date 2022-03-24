package com.hsbc.oops;
class StringDemo6 
{
	public static void main(String[] args) 
	{
		String s1="example";
		System.out.println(s1.length());
		int x=s1.length();
		System.out.println("size  :"+x);
		String s2="   12  3 ";
		String s3=s2.trim();
				System.out.println("The bvalue of"+s3);
						System.out.println("****"+s2+"****");
						System.out.println("****"+s3+"****");
						boolean flag=s2.equals(s3);
						System.out.println(flag);
						boolean flag1=s3.contentEquals("12  3");
						System.out.println(flag1);
						String s4="abcd";
						String s5="Abcd";
if(s4.equalsIgnoreCase(s5)){
System.out.println("s4 & s5 both are same");
}
else{
	System.out.println("s4 & s5 both are different");
}


	}
}
