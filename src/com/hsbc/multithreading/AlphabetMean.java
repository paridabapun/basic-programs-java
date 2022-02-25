package com.hsbc.multithreading;
class AlphabetMean
{
	public void m1(){
	char ab[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	for(int i=0;i<ab.length;i++){
	if (ab[i]==ab[0])
	{
		System.out.println("APPLE");
	}
	
	if  (ab[i]==ab[1])	{
		                System.out.println("BALL");
						}

	if  (ab[i]==ab[2])	{
		System.out.println("CAT");
	                    }
	if  (ab[i]==ab[2]){
		System.out.println("CAT");
	}
	}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}