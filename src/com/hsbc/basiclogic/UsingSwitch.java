package com.hsbc.basiclogic;

public class UsingSwitch {

	
	public static void main(String[] args) {
		char color='y';
		//String color="y";//Invalid String cannot be used with switch
		switch (color) {
		case 'r' :System.out.println("Red");
		case 'g' :System.out.println("Green");
		break;
		case 'w' :System.out.println("White");
		break;
		case 'y' :System.out.println("Yellow");
		break;
		default:System.out.println("No colour found");
		
		
		
		

	}

}
}
