package com.hsbc.operator;

public class Bitwise {

	/*
	 x      y	(x&y)	(x|y)		(x^y)	~(x^y)
	 
	 0      0		0		0			0		1
	 0      1		0		1			1		0
	 1		0		0		1			1		0
	 1		1		1		1			0		1
	*/
	
	public static void main(String[] args) {
		
		
		int x=55,y=12;
		int a=11;
		int b=8;
		int m=12;
		int n=-11;
	
		System.out.println("x&y= "+(x&y));
		System.out.println("x|y= "+(x|y));
		System.out.println("x^y= "+(x^y));
		System.out.println("~y= "+(~y));
		System.out.println("~x= "+(~x));
		System.out.println("~a= "+(~a));
		System.out.println("~b= "+(~b));
		System.out.println("~a= "+(~a));
		// when +ve no is right shifted it is filled by 0 & for -ve no it is filled by 1
		System.out.println("value of m>>2= "+(m>>2));
		System.out.println("value of m>>3= "+(m>>3));
		System.out.println("value of n>>3= "+(n>>3));
		/*First represent -11 to corresponding 2's form that is nothing
		 * but the representation of negetive no... then make the operation 
		 * after that make 2's of that no get the original no*/
		System.out.println("value of m>>63= "+(m>>63));
		/*Here 12 is shifted to the right by 63 bits Since 12 is a positive no all the 
		 * bits are padded with 0 hence output is o*/
		System.out.println("value of m<<63= "+(m<<63));
		System.out.println("value of m>>-63= "+(m>>-63));
		//here 63 will divided by 32 after getting the reminder adding by 32 then what ever the result getting thats shifted(32+(-31)=1  so(m>>1)
		System.out.println("value of m>>1= "+(m>>1));
		System.out.println("value of m<<2= "+(m<<2));//in case of left shift operation the bit are padded or filled with 0 irrespective of the polarity of the operand whether it is -ve or + ve
	System.out.println("value of m<<3= "+(m<<3));
	System.out.println("value of n>>>4= "+(n>>>4));
	
	System.out.println("Lets begin all the operation belongs to left shift");
	
	System.out.println("value of m>>1= "+(m>>1));
	System.out.println("value of m>>2= "+(m>>2));
	System.out.println("value of m>>3= "+(m>>3));
	System.out.println("value of m>>4= "+(m>>4));
	System.out.println("value of m>>5= "+(m>>5));
	
	System.out.println("value of n>>1= "+(n>>1));
	System.out.println("value of n>>2= "+(n>>2));
	System.out.println("value of n>>3= "+(n>>3));
	System.out.println("value of n>>4= "+(n>>4));
	System.out.println("value of n>>5= "+(n>>5));
	
	//for m<<n=m * (2)^n
	System.out.println("value of m<<1= "+(m<<1));
	System.out.println("value of m<<2= "+(m<<2));
	System.out.println("value of m<<3= "+(m<<3));
	System.out.println("value of m<<4= "+(m<<4));
	System.out.println("value of m<<5= "+(m<<5));
	
	System.out.println("value of n<<1= "+(n<<1));
	System.out.println("value of n<<2= "+(n<<2));
	System.out.println("value of n<<3= "+(n<<3));
	System.out.println("value of n<<4= "+(n<<4));
	System.out.println("value of n<<5= "+(n<<5));
	System.out.println("Special cases observe");
	System.out.println("value of 1<<19= "+(1<<19));
	System.out.println("value of 1<<19= "+(1<<15));
	System.out.println("value of 1<<33= "+(1<<35));
	
	
	if(++x>55 & y<12){
		x++;
	}
	else{
		y++;
		
	}
	System.out.println(x+"    "+y);
	if(++x>55 & y<12){
		x++;
	}
	else{
		y++;
		
	}
	System.out.println(x+"    "+y);
	int num=-5;
	System.out.println(num>>-128);
	System.out.println(num>>>3);

	System.out.println(num>>3);
	
	}
	}
	


