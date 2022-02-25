package com.hsbc.multithreading;
 //WAP to display all the alphabet 
class DisplayAllAlphabets 
{
	char alphabet[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
public DisplayAllAlphabets(){
	char ch[]={'L','e','t','s',' ','O','b','s','e','r','v','e',' ','a','l','l',' ','t','h','e',' ','a','l','p','h','a','b','e','t','s',' ','o','f',' ','E','n','g','l','i','s','h'};
for(int i=0;i<ch.length;i++){
	try{Thread.sleep(40);}
	catch(Exception e){
		e.printStackTrace();
	}
	System.out.print(ch[i]);

}
System.out.println();
}
public void displayAlphabet(){
	
	System.out.println();
	System.out.println();
	
for(int i=0;i<alphabet.length;i++){
	
	System.out.print(alphabet[i]+"\t");
	
	

try{
Thread.sleep(430);
}
catch(Exception e){
e.printStackTrace();
}//end of try-catch

}//end of for loop
System.out.println();

System.out.println();
System.out.println("Total 26 ");
System.out.println("******************Completed***********************");
}//end of method

Thread t2=new Thread();

	public static void main(String[] args){ 
	DisplayAllAlphabets da=new DisplayAllAlphabets();
	
	
	da.displayAlphabet();
	
		

	}//main
}//class end
