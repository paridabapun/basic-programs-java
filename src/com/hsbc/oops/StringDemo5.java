package com.hsbc.oops;
class  StringDemo5
{
	public static void main(String[] args) 
	{
		String sql1="insert into emp values(100,'Bapun',100000);";
		System.out.println(sql1);
		int idno=101;
		String name="Bhagabata";
		float salary=20000;
		String sql2="insert into emp values("+idno+",'"+name+"',"+salary+");";
System.out.println(sql2);
System.out.println(sql1.length());
System.out.println(sql2.length());
if(sql1.length()==sql2.length())
	System.out.println("Both String are same of length");
		else
	System.out.println("Both String are different length");
		System.out.println(sql1.equals(sql2));

	}
}
