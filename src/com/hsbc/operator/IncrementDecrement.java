package com.hsbc.operator;

public class IncrementDecrement {
	/*When the processor find the expression it would be 
	evaluting the expression from the R.H.S of the computer 
	OR L.H.S of the Programmer always the prefix(increment/decrement) operator 
	would be given the highest priority than the others */

	public static void main(String[] args) {/*
		int x=2,y;
		y=++x;
		x=y--;
		y=--x;
		x=y++;
		System.out.println(x);
		System.out.println(y);*/

	/*int a=3,b,c,d,e,f;
	b=++a;
	c=b--;
	d=a--;
	e=b++;
	f=--d;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
*/
		/*int x=3,y,z,w,p;
		p=x++;
		y=--x;
		z=p--;
	w=++x;
	p=--z;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(w);
	System.out.println(p);*/
		/*int x=10,y;
		y=++x+x--;
		x=y+++y++;
		System.out.println(x);
		System.out.println(y);
	*/
		/*int x=3,y;
		y=x-- + ++x;
		x=--y+y++;
		System.out.println(x);
		System.out.println(y);
	*/
	/*int x=10,y;
	y=++x+x--;
	System.out.println(x);
	System.out.println(y);
	*/
	/*int x=10,y;
	y=--x+--x;
	System.out.println(x);
	System.out.println(y);
	*/
		/*int x=10,y;
		y=++x+ ++x;
		System.out.println(x);
		System.out.println(y);	
	*/
		
		/*int x=10,y;
		y=x++ +x--;
		System.out.println(x);
		System.out.println(y);
		*/
		/*int x=10,y;
		y=x++ - x--;
		x=--x;
		System.out.println(x);
		System.out.println(y);
*/
		/*int x=2,y;
		y=++x+x--;
		x=y+++y++;
		System.out.println(x);
		System.out.println(y);
		*/
		/*int x=5,y;
		y=(x++)+(x++)+(--x)+(x--)+(++x);
		System.out.println(x);
		System.out.println(y);
		*/
		int x=5,y=6;
		//x=(++x)+(++y)-(x++)+(y++);
		y=(x++)-(--y)-(--x)+(y++)-(++y);
		//System.out.println(x);
		System.out.println(y);
	}		
}
		
