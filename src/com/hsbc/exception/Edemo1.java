package com.hsbc.exception;
class Edemo1 
{
	public static void main(String[] args) 
	{
		
		/*int x=i/j;
		
		System.out.println("x  : "+x);
System.out.println("i  : "+i);
System.out.println("j  : "+j);
System.out.println("End of main()");
*/
int i = 0;
int j = 0;

try{
	 i=Integer.parseInt(args[0]);
	 j=Integer.parseInt(args[1]);
	int x=i/j;
	x=x+1;
	System.out.println("x :"+x);
	}
	
catch(ArithmeticException ae){
	System.out.println(ae);

}
catch(NumberFormatException nfe){
	System.out.println(nfe);

}
System.out.println("i  : "+i);
System.out.println("j  : "+j);
}
}
