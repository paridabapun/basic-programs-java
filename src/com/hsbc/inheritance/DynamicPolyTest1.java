package com.hsbc.inheritance;
  
class DynamicPolyTest1 
{

	public static void main(String[] args) 
	{
		int i=Integer.parseInt(args[0]);
		int x=Integer.parseInt(args[1]);
		P p1=null;
		if(i>0 && i<=10)
			p1=new P();
		if(i>10 && i<=20)
			p1=new Q();
		if(i>20)
			p1=new R();
		p1.funP(x);

}
}
