package com.hsbc.operator;

class Exercise {

	
	public static void main(String[] args) {
	

		int x=127,y=128;
		//x=x<<(++y) + y++;
		//x=++x<<3+x++>>5;
		//x=128<<131>>5;
		//x=x++>>5;
		//x=x<<(++y) +y++;
		//x=(x&3)|y;
		//x=(++x|3)&y;
	//x=(x^y)|y;
		//x=x^(~y);
		//x=(x&3)|(y>>3);
		x=(x&(x>>>3))&y;
System.out.println(x);

}
}