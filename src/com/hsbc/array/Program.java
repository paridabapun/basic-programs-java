package com.hsbc.array;
//wap to pass a string type array to another class
class Program2 {

	public static void main(String[] args) {
		for (String s : args)// here using for each loop ie for(var :collection)

			System.out.println(s);

	}
}

class Program {
	public static void main(String[] args) {
		String name[] = { "Geeta", "bapun", "Meera", "Haris" };
		Program2.main(name);

	}
}
